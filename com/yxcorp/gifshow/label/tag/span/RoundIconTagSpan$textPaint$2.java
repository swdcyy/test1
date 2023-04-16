package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$textPaint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.graphics.Typeface;
import lnc.a1;

public final class RoundIconTagSpan$textPaint$2 extends Lambda implements a	// class@001a1f
{
    public final RoundIconTagSpan this$0;

    public void RoundIconTagSpan$textPaint$2(RoundIconTagSpan p0){
       this.this$0 = p0;
       super(0);
    }
    public final Paint invoke(){
       Paint obj = PatchProxy.apply(null, this, RoundIconTagSpan$textPaint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Paint();
       obj.setTextSize(this.this$0.y);
       obj.setColor(this.this$0.w);
       obj.setAntiAlias(true);
       obj.setFakeBoldText(this.this$0.z);
       obj.setTypeface(Typeface.create(this.this$0.c, 0));
       if (this.this$0.F != null) {
          obj.setShadowLayer(0x3f800000, 0x3f800000, 0x3f800000, a1.a(R.color.arg_RES_7f061d69));
       }
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
