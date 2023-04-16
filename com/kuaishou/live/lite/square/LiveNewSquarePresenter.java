package com.kuaishou.live.lite.square.LiveNewSquarePresenter;
import b93.d;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import java.lang.Object;
import kd3.h;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import md3.i;
import td3.o;
import e93.a;
import e93.b;
import xp5.i;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import com.kuaishou.live.lite.recommendsidebar.LiveLiteRecommendSideBarService;
import eq3.d;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import d93.a;
import d93.b;
import kd3.i;

public class LiveNewSquarePresenter extends d	// class@000b65
{
    public LiveLiteRecommendSideBarService A;
    public final MutableLiveData B;
    public final i C;
    public o v;
    public a w;
    public b x;
    public i y;
    public LiveLiteTempPlayService z;

    public void LiveNewSquarePresenter(){
       super();
       this.B = new MutableLiveData(Boolean.FALSE);
       this.C = new h(this);
    }
    public void F8(){
       boolean b;
       LiveNewSquarePresenter liveNewSquar = LiveNewSquarePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveNewSquar, "4")) {
          return;
       }
       super.F8();
       Object obj = PatchProxy.apply(objArray, this, liveNewSquar, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.w.j0() != null && this.w.j0().mLiveLiteElementsSwitch != null){
          b = this.w.j0().mLiveLiteElementsSwitch.mEnableLiteMoreLive;
       }else {
          b = 1;
       }
       if (b == null) {
          b.Z(LiveLiteLogTag.SQUARE, "isEnableMoreLive is false");
          return;
       }else {
          i oi = new i(this.v, this.w, this.x, this.y, this.z, this.A, this.B);
          this.P8().xg(b);
          return;
       }
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquarePresenter.class, "2")) {
          return;
       }
       this.v = p0.a(o.class);
       this.w = p0.a(a.class);
       this.y = p0.a(i.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquarePresenter.class, "3")) {
          return;
       }
       this.x = p0.a(b.class);
       this.z = p0.a(LiveLiteTempPlayService.class);
       this.A = p0.a(LiveLiteRecommendSideBarService.class);
       return;
    }
    public void Z8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveNewSquarePresenter.class, "1")) {
          return;
       }
       p0.d(i.class, this.C);
       return;
    }
}
