package com.kuaishou.tuna_core.button.a;
import erd.g;
import com.kwai.framework.model.tuna.button.FollowUserInfoModel;
import com.kwai.framework.model.tuna.button.TunaButtonModel;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import uz4.b;

public final class a implements g	// class@0010b7
{
    public final FollowUserInfoModel b;
    public final TunaButtonModel c;
    public final int d;

    public void a(FollowUserInfoModel p0,TunaButtonModel p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else {
          p0.mFollowStatus = 1;
          RxBus.f.b(new b(this.c, this.d));
       }
       return;
    }
}
