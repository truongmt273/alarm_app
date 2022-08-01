package truongtd.com.alarmapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import truongtd.com.alarmapp.databinding.ViewTimerBoxBinding

class ViewTimerBox : LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        context.obtainStyledAttributes(attrs, R.styleable.ViewTimerBox).let {
            binding.tvLabel.text = it.getString(R.styleable.ViewTimerBox_label).orEmpty()
            binding.edTime.setText(it.getString(R.styleable.ViewTimerBox_time).orEmpty())

            it.recycle()
        }
    }

    private val binding = ViewTimerBoxBinding.inflate(
        LayoutInflater.from(context), this, true
    )
}