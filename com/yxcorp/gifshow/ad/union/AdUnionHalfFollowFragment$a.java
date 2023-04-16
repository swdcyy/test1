package com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment$a;
import n3d.a;
import com.yxcorp.gifshow.ad.union.AdUnionHalfFollowFragment;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;

public final class AdUnionHalfFollowFragment$a implements a	// class@00185c
{
    public final AdUnionHalfFollowFragment b;

    public void AdUnionHalfFollowFragment$a(AdUnionHalfFollowFragment p0){
       this.b = p0;
       super();
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(AdUnionHalfFollowFragment$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, AdUnionHalfFollowFragment$a.class, "1")) {
          return;
       }
       QCurrentUser mE = QCurrentUser.ME;
       a.o(mE, "QCurrentUser.ME");
       if (mE.isLogined()) {
          this.b.hh();
       }
       return;
    }
}
