package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$livingBgPaint$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import android.graphics.Paint;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.graphics.Paint$Style;

public final class RoundIconTagSpan$livingBgPaint$2 extends Lambda implements a	// class@001a1a
{
    public static final RoundIconTagSpan$livingBgPaint$2 INSTANCE;

    static {
       RoundIconTagSpan$livingBgPaint$2.INSTANCE = new RoundIconTagSpan$livingBgPaint$2();
    }
    public void RoundIconTagSpan$livingBgPaint$2(){
       super(0);
    }
    public final Paint invoke(){
       Paint obj = PatchProxy.apply(null, this, RoundIconTagSpan$livingBgPaint$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Paint();
       obj.setColor(a1.a(R.color.arg_RES_7f061b29));
       obj.setAntiAlias(true);
       obj.setStyle(Paint$Style.FILL);
       return obj;
    }
    public Object invoke(){
       return this.invoke();
    }
}
