package com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$b;
import n3d.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.String;
import qh7.c;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.detail.router.AdLoginDetectionHandler$b$a;
import java.lang.Runnable;
import ekd.k1;
import yh7.a;
import yx.j0;

public final class AdLoginDetectionHandler$b implements a	// class@0016e9
{
    public final GifshowActivity b;
    public final QPhoto c;
    public final String d;
    public final c e;

    public void AdLoginDetectionHandler$b(GifshowActivity p0,QPhoto p1,String p2,c p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AdLoginDetectionHandler$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AdLoginDetectionHandler$b.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          k1.r(new AdLoginDetectionHandler$b$a(this), 0);
          this.e.a(new a(200));
       }else {
          Object[] objArray = new Object[0];
          j0.f("AdLoginDetectionHandler", "user login fail", objArray);
          this.e.a(new a(403));
       }
       return;
    }
}
