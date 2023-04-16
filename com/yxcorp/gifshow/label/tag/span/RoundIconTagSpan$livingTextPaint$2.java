package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingTextPaint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.graphics.Paint$Align;
import android.graphics.Typeface;

public final class RoundIconTagSpan$livingTextPaint$2 extends Lambda implements a	// class@001a1d
{
    public final RoundIconTagSpan this$0;

    public void RoundIconTagSpan$livingTextPaint$2(RoundIconTagSpan p0){
       this.this$0 = p0;
       super(0);
    }
    public final Paint invoke(){
       Paint obj = PatchProxy.apply(null, this, RoundIconTagSpan$livingTextPaint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Paint();
       obj.setTextSize((float)a1.d(R.dimen.arg_RES_7f070f87));
       obj.setColor(a1.a(R.color.arg_RES_7f060788));
       obj.setAntiAlias(true);
       obj.setFakeBoldText(true);
       obj.setTextAlign(Paint$Align.CENTER);
       obj.setTypeface(Typeface.create(this.this$0.c, 0));
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
