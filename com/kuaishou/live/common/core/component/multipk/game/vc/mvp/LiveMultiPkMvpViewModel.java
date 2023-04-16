package com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel;
import yh3.a;
import zs1.b;
import ft1.b;
import ps1.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel$opponentUserId$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel$b;
import com.kuaishou.live.common.core.component.multipk.game.vc.mvp.LiveMultiPkMvpViewModel$a;
import androidx.lifecycle.Observer;
import bt1.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.lifecycle.ViewModel;
import nt1.a;
import nt1.a$a;
import st1.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import du1.d;
import k2b.e0;
import et1.e;
import java.lang.Boolean;
import et1.b;
import java.lang.Runnable;
import java.util.concurrent.Future;
import pu1.g;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class LiveMultiPkMvpViewModel extends a	// class@001639
{
    public final LiveData a;
    public final LiveData b;
    public final p c;
    public final Observer d;
    public final LiveMultiPkMvpViewModel$a e;
    public final b f;
    public final b g;
    public final e h;

    public void LiveMultiPkMvpViewModel(b p0,b p1,e p2){
       a.p(p0, "coreModel");
       a.p(p1, "gameModel");
       a.p(p2, "pkDelegate");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       MutableLiveData mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.a = mutableLiveD;
       mutableLiveD = new MutableLiveData();
       this.o0(mutableLiveD);
       this.b = mutableLiveD;
       this.c = s.c(new LiveMultiPkMvpViewModel$opponentUserId$2(this));
       LiveMultiPkMvpViewModel$b uob = new LiveMultiPkMvpViewModel$b(this);
       this.d = uob;
       LiveMultiPkMvpViewModel$a uoa = new LiveMultiPkMvpViewModel$a(this);
       this.e = uoa;
       p0.l().observeForever(uob);
       p1.i(uoa);
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, LiveMultiPkMvpViewModel.class, "3")) {
          return;
       }
       super.onCleared();
       this.f.l().removeObserver(this.d);
       this.g.t(this.e);
       return;
    }
    public final LiveData u0(){
       return this.b;
    }
    public final LiveData v0(){
       return this.a;
    }
    public void w0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMultiPkMvpViewModel.class, "2")) {
          return;
       }
       a.p(p0, "intent");
       int b = p0.b();
       c uoc = this.f.z();
       ClientContent$LiveStreamPackage liveStreamPa = this.h.a();
       e0 uoe0 = this.h.i();
       if (!PatchProxy.isSupport(e.class) || !PatchProxy.applyVoidFourRefs(Boolean.valueOf(b), uoc, liveStreamPa, uoe0, null, e.class, "3")) {
          a.p(uoc, "logInfo");
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(uoe0, "logPage");
          g.a(new b(b, uoc, liveStreamPa, uoe0));
       }
       if (this.h.e()) {
          QCurrentUser qCurrentUser = QCurrentUser.me();
          a.o(qCurrentUser, "QCurrentUser.me\(\)");
          if (TextUtils.n(p0.a().mId, qCurrentUser.getId())) {
          label_008f :
             return;
          }
       }
       b = (p0.b())? 28: 29;
       this.h.c1(p0.a(), b);
       goto label_008f ;
    }
}
