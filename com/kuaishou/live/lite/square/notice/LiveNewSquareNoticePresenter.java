package com.kuaishou.live.lite.square.notice.LiveNewSquareNoticePresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.lite.square.e;
import com.kuaishou.live.lite.square.notice.d;
import td3.o;
import com.kuaishou.live.lite.square.e$a;
import java.util.Objects;
import com.kuaishou.live.lite.square.LiveNewNoticeEntryDataModel;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;
import crd.b;
import lnc.b9;
import c93.b;
import e93.a;
import xp5.i;
import d93.a;
import vb3.n;
import e93.b;
import d93.b;

public class LiveNewSquareNoticePresenter extends d	// class@000b6c
{
    public LiveNewNoticeEntryDataModel A;
    public e B;
    public n v;
    public o w;
    public a x;
    public b y;
    public i z;

    public void LiveNewSquareNoticePresenter(){
       super();
    }
    public void F8(){
       LiveNewSquareNoticePresenter liveNewSquar = LiveNewSquareNoticePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveNewSquar, "4")) {
          return;
       }
       super.F8();
       e uoe = PatchProxy.apply(objArray, this, liveNewSquar, "5");
       if (uoe != PatchProxyResult.class) {
       }else {
          uoe = new e(this.w, new d(this));
       }
       this.B = uoe;
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiveNewSquareNoticePresenter.class, "6")) {
          return;
       }
       LiveNewSquareNoticePresenter tA = this.A;
       if (tA != null) {
          Objects.requireNonNull(tA);
          if (!PatchProxy.applyVoidOneRefs(this, tA, LiveNewNoticeEntryDataModel.class, "1")) {
             this.getLifecycle().removeObserver(tA.g);
             b9.a(tA.e);
             b9.a(tA.d);
          }
       }
       tA = this.B;
       if (tA != null) {
          tA.a();
       }
       return;
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquareNoticePresenter.class, "2")) {
          return;
       }
       this.w = p0.a(o.class);
       this.x = p0.a(a.class);
       this.z = p0.a(i.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquareNoticePresenter.class, "3")) {
          return;
       }
       this.v = p0.a(n.class);
       this.y = p0.a(b.class);
       return;
    }
    public void Z8(b p0){
       PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquareNoticePresenter.class, "1");
    }
}
