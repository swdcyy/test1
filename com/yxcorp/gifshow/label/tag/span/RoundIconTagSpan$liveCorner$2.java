package com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan$liveCorner$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.label.tag.span.RoundIconTagSpan;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;

public final class RoundIconTagSpan$liveCorner$2 extends Lambda implements a	// class@001a16
{
    public final RoundIconTagSpan this$0;

    public void RoundIconTagSpan$liveCorner$2(RoundIconTagSpan p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       Object obj = PatchProxy.apply(null, this, RoundIconTagSpan$liveCorner$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)this.this$0.c(2);
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
