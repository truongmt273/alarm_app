package truongtd.com.alarmapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import truongtd.com.alarmapp.databinding.ItemDayOfWeekBinding

class DayOfWeekAdapter :
    ListAdapter<DayOfWeek, DayOfWeekAdapter.DayOfWeekVH>(DayOfWeekDiffCallback) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DayOfWeekVH {
        return DayOfWeekVH(
            ItemDayOfWeekBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: DayOfWeekVH, position: Int) {
        holder.bind(getItem(position))
    }

    class DayOfWeekVH(private val itemDayOfWeekBinding: ItemDayOfWeekBinding) :
        RecyclerView.ViewHolder(itemDayOfWeekBinding.root) {
        fun bind(dayOfWeek: DayOfWeek) {
            itemDayOfWeekBinding.btnDayOfWeek.text = dayOfWeek.name
        }
    }
}

object DayOfWeekDiffCallback : DiffUtil.ItemCallback<DayOfWeek>() {
    override fun areItemsTheSame(oldItem: DayOfWeek, newItem: DayOfWeek): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: DayOfWeek, newItem: DayOfWeek): Boolean {
        return oldItem.id == newItem.id
    }
}