package com.yxcorp.gifshow.growth.framework.GrowthLoginRouterActivity$a;
import n3d.a;
import com.yxcorp.gifshow.growth.framework.GrowthLoginRouterActivity;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;

public final class GrowthLoginRouterActivity$a implements a	// class@001378
{
    public final GrowthLoginRouterActivity b;
    public final Ref$ObjectRef c;

    public void GrowthLoginRouterActivity$a(GrowthLoginRouterActivity p0,Ref$ObjectRef p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(GrowthLoginRouterActivity$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, GrowthLoginRouterActivity$a.class, "1")) {
          return;
       }
       QCurrentUser qCurrentUser = QCurrentUser.me();
       a.o(qCurrentUser, "QCurrentUser.me\(\)");
       if (qCurrentUser.isLogined()) {
          this.b.u3(this.c.element);
       }
       this.b.finish();
       return;
    }
}
