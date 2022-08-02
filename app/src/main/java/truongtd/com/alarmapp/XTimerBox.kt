package truongtd.com.alarmapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import truongtd.com.alarmapp.databinding.XTimerBoxBinding

class XTimerBox : LinearLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        context.obtainStyledAttributes(attrs, R.styleable.XTimerBox).let {
            binding.tvLabel.text = it.getString(R.styleable.XTimerBox_label).orEmpty()
            binding.edTime.setText(it.getString(R.styleable.XTimerBox_time).orEmpty())

            it.recycle()
        }
    }

    private val binding = XTimerBoxBinding.inflate(
        LayoutInflater.from(context), this, true
    )
}