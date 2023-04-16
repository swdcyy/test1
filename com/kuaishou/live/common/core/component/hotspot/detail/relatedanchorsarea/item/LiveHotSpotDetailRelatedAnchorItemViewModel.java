package com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel;
import yh3.a;
import androidx.lifecycle.LiveData;
import un1.k;
import msd.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$a;
import z0.a;
import androidx.lifecycle.Transformations;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$b;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$c;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$d;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$e;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$f;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$liveStreamId$2;
import qrd.p;
import qrd.s;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2;
import fn1.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g$b;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$h;
import com.yxcorp.gifshow.entity.helper.FollowHelper$a;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g$a;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g$c;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$g$d;
import com.kuaishou.live.common.core.component.hotspot.detail.model.LiveHotSpotDetailRelatedAnchorData$AuthorInfo;
import fn1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$logShowEvent$1;
import msd.l;
import com.kuaishou.live.common.core.component.hotspot.detail.relatedanchorsarea.item.LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;

public final class LiveHotSpotDetailRelatedAnchorItemViewModel extends a	// class@00140e
{
    public final LiveData a;
    public final LiveData b;
    public final LiveData c;
    public final LiveData d;
    public final LiveData e;
    public final LiveData f;
    public final p g;
    public final p h;
    public final p i;
    public final b j;
    public final LiveData k;
    public final k l;
    public final a m;
    public final GifshowActivity n;

    public void LiveHotSpotDetailRelatedAnchorItemViewModel(LiveData p0,k p1,a p2,GifshowActivity p3){
       a.p(p0, "dataProvider");
       a.p(p1, "detailMainVCDelegate");
       a.p(p2, "index");
       a.p(p3, "activity");
       super();
       this.k = p0;
       this.l = p1;
       this.m = p2;
       this.n = p3;
       LiveData liveData = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$a());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.a = liveData;
       liveData = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$b());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.b = liveData;
       liveData = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$c());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.c = liveData;
       liveData = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$d());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.d = liveData;
       liveData = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$e());
       a.h(liveData, "Transformations.map\(this\) { transform\(it\) }");
       this.e = liveData;
       p0 = Transformations.map(p0, new LiveHotSpotDetailRelatedAnchorItemViewModel$f());
       a.h(p0, "Transformations.map\(this\) { transform\(it\) }");
       this.f = p0;
       this.g = s.c(new LiveHotSpotDetailRelatedAnchorItemViewModel$liveStreamId$2(this));
       this.h = s.c(new LiveHotSpotDetailRelatedAnchorItemViewModel$userId$2(this));
       this.i = s.c(new LiveHotSpotDetailRelatedAnchorItemViewModel$userInfo$2(this));
       this.j = p1.E0();
    }
    public final String getLiveStreamId(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailRelatedAnchorItemViewModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.getValue();
    }
    public final String getUserId(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailRelatedAnchorItemViewModel.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final UserInfo u0(){
       Object obj = PatchProxy.apply(null, this, LiveHotSpotDetailRelatedAnchorItemViewModel.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public void v0(LiveHotSpotDetailRelatedAnchorItemViewModel$g p0){
       LiveHotSpotDetailRelatedAnchorItemViewModel liveHotSpotD = LiveHotSpotDetailRelatedAnchorItemViewModel.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, liveHotSpotD, "5")) {
          return;
       }
       a.p(p0, "intent");
       if (p0 instanceof LiveHotSpotDetailRelatedAnchorItemViewModel$g$b) {
          this.l.N(this.getUserId(), 238, new LiveHotSpotDetailRelatedAnchorItemViewModel$h(this));
       }else if(p0 instanceof LiveHotSpotDetailRelatedAnchorItemViewModel$g$a){
          p0 = this.d.getValue();
          a.m(p0);
          if (p0.booleanValue()) {
             if (TextUtils.equals(this.getLiveStreamId(), this.l.getLiveStreamId())) {
                this.l.Y1();
                return;
             }else {
                String liveStreamId = this.getLiveStreamId();
                if (!PatchProxy.isSupport(liveHotSpotD) || !PatchProxy.applyVoidTwoRefs(liveStreamId, Integer.valueOf(316), this, liveHotSpotD, "4")) {
                   b.Z(LiveLogTag.LIVE_HOT_SPOT, "startLivePlayActivityWithoutSlide");
                   this.l.I(liveStreamId, 316);
                }
             }
          }else {
             this.z0();
          }
          this.y0();
       }else if(p0 instanceof LiveHotSpotDetailRelatedAnchorItemViewModel$g$c){
          this.z0();
          this.y0();
       }else if(p0 instanceof LiveHotSpotDetailRelatedAnchorItemViewModel$g$d){
          LiveHotSpotDetailRelatedAnchorData$AuthorInfo value = this.k.getValue();
          if (value != null && value.hasReporterLogger == null) {
             if (!PatchProxy.applyVoid(null, this, liveHotSpotD, "7")) {
                a.a.d("LIVE_HOTSPOT_DATAIL_AUTHOR_INVOLVED", this.j, this.l.a(), new LiveHotSpotDetailRelatedAnchorItemViewModel$logShowEvent$1(this));
             }
             value.hasReporterLogger = true;
          }
       }
       return;
    }
    public final LiveData w0(){
       return this.e;
    }
    public final LiveData x0(){
       return this.d;
    }
    public final void y0(){
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailRelatedAnchorItemViewModel.class, "6")) {
          return;
       }
       a.a.b("LIVE_HOTSPOT_DATAIL_AUTHOR_INVOLVED", this.j, this.l.a(), new LiveHotSpotDetailRelatedAnchorItemViewModel$logClickEvent$1(this));
       return;
    }
    public final void z0(){
       UserInfo userInfo;
       if (PatchProxy.applyVoid(null, this, LiveHotSpotDetailRelatedAnchorItemViewModel.class, "8")) {
          return;
       }
       if (this.u0() == null) {
          b.B(LiveLogTag.LIVE_HOT_SPOT, "detailInfo click anchor avatar, userInfo is null!!");
          return;
       }else {
          userInfo = this.u0();
          a.m(userInfo);
          this.l.w2(new UserProfile(userInfo), LiveStreamClickType.LIVE_HOT_SPOT, 0, true, 201);
          return;
       }
    }
}
