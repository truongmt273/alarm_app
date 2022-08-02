package truongtd.com.alarmapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import truongtd.com.alarmapp.databinding.XSelectDateButtonBinding
import truongtd.com.alarmapp.helper.roundToOneDecimal

class XSelectDateButton: FrameLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        setWillNotDraw(false)
        context.obtainStyledAttributes(attrs, R.styleable.XSelectDateButton).let {
            binding.tvDayOfWeek.text 
        }
    }

    private val binding = XSelectDateButtonBinding.inflate(
        LayoutInflater.from(context),
        this,
        true
    )

    var text: String
        get() {
            return binding.tvDayOfWeek.text.toString()
        }
        set(value) {
            binding.tvDayOfWeek.text = value
        }

    private var heightLayout = 0
    private var widthLayout = 0

    private val paintSmallCircleFill = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.FILL
        color = Color.WHITE
    }
    private val paintSmallCircleStroke = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        color = Color.GRAY
        strokeWidth = 1F
    }


    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        heightLayout = h
        widthLayout = w
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        val circleX = (widthLayout / 2).toFloat().roundToOneDecimal()
        val circleY = (heightLayout / 2).toFloat().roundToOneDecimal()
        val circleR = 36F

        canvas?.apply {
            drawCircle(
                circleX,
                circleY,
                circleR,
                paintSmallCircleFill
            )
            drawCircle(
                circleX,
                circleY,
                circleR,
                paintSmallCircleStroke
            )
        }
    }
}