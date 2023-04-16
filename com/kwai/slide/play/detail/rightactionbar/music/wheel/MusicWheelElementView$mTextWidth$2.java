package com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView$mTextWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.slide.play.detail.rightactionbar.music.wheel.MusicWheelElementView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.widget.TextView;
import java.lang.CharSequence;
import android.graphics.Rect;
import android.text.TextPaint;
import kotlin.jvm.internal.a;
import java.lang.Integer;

public final class MusicWheelElementView$mTextWidth$2 extends Lambda implements a	// class@00186d
{
    public final MusicWheelElementView this$0;

    public void MusicWheelElementView$mTextWidth$2(MusicWheelElementView p0){
       this.this$0 = p0;
       super(0);
    }
    public final int invoke(){
       String obj = PatchProxy.apply(null, this, MusicWheelElementView$mTextWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = MusicWheelElementView.z(this.this$0).getText().toString();
       Rect rect = new Rect();
       TextPaint paint = MusicWheelElementView.z(this.this$0).getPaint();
       a.o(paint, "mSameStyleView.paint");
       paint.getTextBounds(obj, 0, obj.length(), rect);
       return rect.width();
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
