package com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel;
import yh3.a;
import com.kwai.framework.model.user.User;
import xa3.a;
import androidx.lifecycle.MutableLiveData;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel$fansGroupLevel$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel$fansGroupMedalType$2;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel$fansGroupStatus$2;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import java.lang.Class;
import brd.t;
import t45.d;
import brd.z;
import com.kuaishou.live.lite.anchorinfo.bottombar.LiveLiteAnchorAvatarBottomBarViewModel$a;
import erd.g;
import crd.b;
import t83.a;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import lnc.b9;
import androidx.lifecycle.LiveData;
import com.kwai.robust.PatchProxyResult;

public final class LiveLiteAnchorAvatarBottomBarViewModel extends a	// class@001e4a
{
    public final MutableLiveData a;
    public final p b;
    public final p c;
    public final p d;
    public b e;
    public final User f;
    public final a g;

    public void LiveLiteAnchorAvatarBottomBarViewModel(User p0,a p1){
       super();
       this.f = p0;
       this.g = p1;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.a = mutableLiveD;
       this.b = s.c(new LiveLiteAnchorAvatarBottomBarViewModel$fansGroupLevel$2(this));
       this.c = s.c(new LiveLiteAnchorAvatarBottomBarViewModel$fansGroupMedalType$2(this));
       this.d = s.c(new LiveLiteAnchorAvatarBottomBarViewModel$fansGroupStatus$2(this));
       if (p0 != null) {
          this.e = RxBus.f.f(n.class).observeOn(d.a).subscribe(new LiveLiteAnchorAvatarBottomBarViewModel$a(p0, this));
          mutableLiveD.setValue(new a(p0.isFollowingOrFollowRequesting(), false));
       }
       return;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveLiteAnchorAvatarBottomBarViewModel.class, "4")) {
          return;
       }
       super.onCleared();
       b9.a(this.e);
       this.e = null;
       return;
    }
    public final LiveData u0(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorAvatarBottomBarViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getValue();
    }
    public final LiveData v0(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorAvatarBottomBarViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public final LiveData w0(){
       Object obj = PatchProxy.apply(null, this, LiveLiteAnchorAvatarBottomBarViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getValue();
    }
    public final LiveData x0(){
       return this.a;
    }
}
