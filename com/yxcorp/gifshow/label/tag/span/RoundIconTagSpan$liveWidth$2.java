package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$liveWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import android.graphics.Paint;
import java.util.Objects;
import qrd.p;
import java.lang.Float;

public final class RoundIconTagSpan$liveWidth$2 extends Lambda implements a	// class@001a19
{
    public final RoundIconTagSpan this$0;

    public void RoundIconTagSpan$liveWidth$2(RoundIconTagSpan p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, RoundIconTagSpan$liveWidth$2.class, "1");
       if (obj != patchProxyRe) {
          return obj.floatValue();
       }
       float f = this.this$0.i().measureText(this.this$0.h());
       float f1 = (float)2;
       RoundIconTagSpan$liveWidth$2 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       Number number = PatchProxy.apply(objArray, tthis$0, RoundIconTagSpan.class, "3");
       if (number == patchProxyRe) {
          number = tthis$0.h.getValue();
       }
       return (f + (f1 * number.floatValue()));
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
