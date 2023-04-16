package com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$a;
import y8c.g;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.nearby.common.view.NearbyCommonRvBtn$b;
import ml8.c;

public final class NearbyCommonRvBtn$a extends g	// class@002135
{

    public void NearbyCommonRvBtn$a(){
       super();
    }
    public void Z0(){
    }
    public f h1(ViewGroup p0,int p1){
       NearbyCommonRvBtn$a uoa = NearbyCommonRvBtn$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "parent");
       return new f(a.i(p0, 0x7f0d1092), new NearbyCommonRvBtn$b());
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, NearbyCommonRvBtn$a.class, "2")) {
          return;
       }
       super.Z0();
       return;
    }
}
