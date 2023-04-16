package com.yxcorp.gifshow.share.widget.CardsAdapter$scale$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.share.widget.CardsAdapter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.lang.Float;

public final class CardsAdapter$scale$2 extends Lambda implements a	// class@001cb2
{
    public final CardsAdapter this$0;

    public void CardsAdapter$scale$2(CardsAdapter p0){
       this.this$0 = p0;
       super(0);
    }
    public final float invoke(){
       Object obj = PatchProxy.apply(null, this, CardsAdapter$scale$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.min(0x3f99999a, Math.max(((float)this.this$0.J0() / (float)this.this$0.h), 0x3f400000));
    }
    public Object invoke(){
       return Float.valueOf(this.invoke());
    }
}
