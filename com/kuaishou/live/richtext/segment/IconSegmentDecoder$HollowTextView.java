package com.kuaishou.live.richtext.segment.IconSegmentDecoder$HollowTextView;
import androidx.appcompat.widget.AppCompatTextView;
import android.content.Context;
import android.util.AttributeSet;
import android.text.TextPaint;
import android.widget.TextView;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;

public class IconSegmentDecoder$HollowTextView extends AppCompatTextView	// class@000f71
{

    public void IconSegmentDecoder$HollowTextView(Context p0){
       super(p0, null);
       this.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff$Mode.CLEAR));
    }
}
