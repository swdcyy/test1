package com.yxcorp.gifshow.share.widget.CardsAdapter$itemWidth$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import lnc.a1;
import java.lang.Integer;

public final class CardsAdapter$itemWidth$2 extends Lambda implements a	// class@001cb1
{
    public static final CardsAdapter$itemWidth$2 INSTANCE;

    static {
       CardsAdapter$itemWidth$2.INSTANCE = new CardsAdapter$itemWidth$2();
    }
    public void CardsAdapter$itemWidth$2(){
       super(0);
    }
    public final int invoke(){
       Object obj = PatchProxy.apply(null, this, CardsAdapter$itemWidth$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return (((n.z(a.b()) - (a1.e(18.00f) * 2)) - (a1.e(2.50f) * 4)) / 5);
    }
    public Object invoke(){
       return Integer.valueOf(this.invoke());
    }
}
