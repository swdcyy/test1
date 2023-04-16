package com.kuaishou.live.lite.hourlyrank.LiveLiteHourlyRankPresenter;
import b93.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kuaishou.android.model.feed.LiveStreamFeed$LiveLiteElementsSwitch;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import eq3.d;
import com.kuaishou.live.lite.hourlyrank.c;
import hf3.a;
import com.kuaishou.live.lite.tempplay.LiveLiteTempPlayService;
import td3.o;
import e93.b;
import xp5.i;
import or5.d;
import com.kuaishou.live.viewcontroller.ViewController;
import c93.b;
import v51.a;
import d93.a;

public class LiveLiteHourlyRankPresenter extends d	// class@0009b7
{
    public d A;
    public a v;
    public LiveLiteTempPlayService w;
    public o x;
    public b y;
    public i z;

    public void LiveLiteHourlyRankPresenter(){
       super();
    }
    public void F8(){
       boolean b;
       LiveLiteHourlyRankPresenter liveLiteHour = LiveLiteHourlyRankPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveLiteHour, "3")) {
          return;
       }
       super.F8();
       Object obj = PatchProxy.apply(objArray, this, liveLiteHour, "5");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.A.j0() != null && this.A.j0().mLiveLiteElementsSwitch != null){
          b = this.A.j0().mLiveLiteElementsSwitch.mEnableLiteDistrictRank;
       }else {
          b = 1;
       }
       if (b == null) {
          b.Z(LiveLiteLogTag.HOURLY_RANK, "isEnableHourlyRank is false");
          return;
       }else {
          c uoc = new c(this.v, this.w, this.x, this.y, this.z, this.A);
          this.P8().xg(v8);
          return;
       }
    }
    public void H8(){
       PatchProxy.applyVoid(null, this, LiveLiteHourlyRankPresenter.class, "4");
    }
    public void X8(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHourlyRankPresenter.class, "1")) {
          return;
       }
       this.v = p0.a(a.class).u();
       this.x = p0.a(o.class);
       this.z = p0.a(i.class);
       this.A = p0.a(d.class);
       return;
    }
    public void Y8(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteHourlyRankPresenter.class, "2")) {
          return;
       }
       this.w = p0.a(LiveLiteTempPlayService.class);
       this.y = p0.a(b.class);
       return;
    }
}
