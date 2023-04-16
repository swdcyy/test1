package go2.k;
import android.content.ComponentCallbacks2;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView$a;
import android.content.Context;
import co2.f2;
import com.kuaishou.live.core.voiceparty.core.shared.a;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerView;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import go2.k$a;
import android.widget.FrameLayout;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.io.IOException;
import lnc.i3;
import java.lang.Number;
import k2b.u1;
import android.content.ComponentCallbacks;
import hp2.s;
import java.lang.Boolean;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$VoicePartyCommonInfo;
import yx2.s;
import com.kuaishou.live.core.voiceparty.model.VoicePartyBackground;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$DynamicBackground;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import qrd.l1;
import ho2.m$e;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Collection;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import ho2.m$d;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Map;
import trd.t0;
import ho2.m$b;
import ho2.m$c;
import ho2.m;
import android.content.res.Configuration;
import com.kuaishou.live.core.voiceparty.background.LiveMultiLayerViewController;
import java.util.Objects;

public final class k implements ComponentCallbacks2, LiveMultiLayerView$a	// class@002b63
{
    public boolean b;
    public boolean c;
    public boolean d;
    public final k$a e;
    public final boolean f;
    public final Context g;
    public final f2 h;
    public final a i;
    public LiveMultiLayerView j;

    public void k(boolean p0,Context p1,f2 p2,a p3,LiveMultiLayerView p4){
       a.p(p1, "context");
       a.p(p2, "voicePartyContext");
       a.p(p3, "voicePartyManager");
       a.p(p4, "bgMultiLayerView");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.e = new k$a(this);
       k tj = this.j;
       p1 = tj.getContext();
       a.o(p1, "bgMultiLayerView.context");
       tj.setPlaceHolderImg(p1.getResources().getDrawable(R.drawable.arg_RES_7f08151d));
       this.i();
    }
    public void a(int p0,Throwable p1){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, k.class, "14")) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.OTHER, "onDynamicViewStateChange", "state", Integer.valueOf(p0));
       if (this.d != null) {
          this.j.a();
       }
       if (!PatchProxy.isSupport(k.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, k.class, "15")) {
          int i = 5;
          int i1 = 4;
          int i2 = 2;
          int i3 = 0;
          if (p0 != 1) {
             if (p0 != i2) {
                if (p0 != 3) {
                   if (p0 == i1) {
                   label_006c :
                      String message = (p1 != null)? p1.getMessage(): null;
                      i3 oi3 = i3.f();
                      oi3.c("type", Integer.valueOf(i2));
                      oi3.c("reason", Integer.valueOf(i));
                      oi3.d("sub_reason", message);
                      oi3.c("is_anchor", Integer.valueOf(this.f));
                      k th = this.h;
                      if (th == null || th.g != 1) {
                         i3 = 1;
                      }
                      oi3.c("mic_seat", Integer.valueOf(i3));
                      u1.R("LIVE_CHAT_ROOM_DYNAMIC_BG_INFO", oi3.e(), 3);
                   }
                }else if(p1 instanceof IOException){
                   i = 4;
                   goto label_006c ;
                }else {
                   i = 3;
                   goto label_006c ;
                }
             }else if(this.c != null){
                i = 1;
                goto label_006c ;
             }else if(this.b != null){
                i = 2;
                goto label_006c ;
             }
             i = 6;
             goto label_006c ;
          }else {
             i = 0;
             i2 = 1;
             goto label_006c ;
          }
       }
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "2")) {
          return;
       }
       this.g.unregisterComponentCallbacks(this);
       this.b = false;
       this.j.setViewStateChangeListener(objArray);
       this.i.l(this.e);
       b.Z(LiveVoicePartyLogTag.OTHER, "destroy");
       return;
    }
    public final void c(boolean p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, k.class, "11")) {
          return;
       }
       b.c0(LiveVoicePartyLogTag.OTHER, "enableBgAnimation", "isEnable", Boolean.valueOf(p0));
       if (p0) {
          this.j.d();
       }else {
          this.j.c();
       }
       return;
    }
    public final View d(){
       return this.j;
    }
    public final Drawable e(){
       Object obj = PatchProxy.apply(null, this, k.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getBgViewDrawable();
    }
    public final void f(Drawable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "12")) {
          return;
       }
       this.d = true;
       k tj = this.j;
       tj.a();
       tj.setForegroundImg(null);
       tj.setForegroundImg(p0);
       tj.invalidate();
       return;
    }
    public final void g(LiveStreamMessages$VoicePartyCommonInfo p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "13")) {
          return;
       }
       this.d = false;
       this.i();
       if (p0 != null) {
          this.k(p0);
       }
       return;
    }
    public final void h(boolean p0){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, k.class, "4")) {
          return;
       }
       k tj = this.j;
       int i = (p0)? 0: 8;
       tj.setVisibility(i);
       if (!p0) {
          tj.a();
       }
       return;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       k tj = this.j;
       Context context = tj.getContext();
       a.o(context, "bgMultiLayerView.context");
       tj.setForegroundImg(context.getResources().getDrawable(R.color.arg_RES_7f061c14));
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       boolean b = s.a();
       this.c = b;
       k tj = this.j;
       tj.setDynamicEnable((b ^ 0x01));
       tj.setViewStateChangeListener(this);
       this.g.registerComponentCallbacks(this);
       this.d = false;
       this.i.a(this.e);
       b.c0(LiveVoicePartyLogTag.OTHER, "start", "isDynamicBgLowDevices", Boolean.valueOf(this.c));
       return;
    }
    public final void k(LiveStreamMessages$VoicePartyCommonInfo p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "5")) {
          return;
       }
       a.p(p0, "commonInfo");
       b.c0(LiveVoicePartyLogTag.OTHER, "updateBgFromCommonInfo", "isLowMemory", Boolean.valueOf(this.b));
       VoicePartyBackground voicePartyBa = new VoicePartyBackground();
       LiveStreamMessages$VoicePartyCommonInfo dynamicBackg = p0.dynamicBackground;
       LiveStreamMessages$DynamicBackground dynamicBackg1 = (dynamicBackg != null)? dynamicBackg.dynamicBackgroundResUrl: null;
       voicePartyBa.mUrlList = ArraysKt___ArraysKt.uy(e0.i(dynamicBackg1));
       dynamicBackg = p0.dynamicBackground;
       LiveStreamMessages$DynamicBackground md5 = (dynamicBackg != null)? dynamicBackg.md5: null;
       voicePartyBa.mDynamicBackgroundResMd5 = md5;
       dynamicBackg1 = (dynamicBackg != null)? dynamicBackg.dynamicBackgroundResType: 0;
       voicePartyBa.mDynamicBackgroundResType = dynamicBackg1;
       voicePartyBa.mThumbnailList = ArraysKt___ArraysKt.uy(e0.i(p0.backgroundPicUrl));
       voicePartyBa.mBackgroundImage = null;
       this.l(voicePartyBa);
       return;
    }
    public final void l(VoicePartyBackground p0){
       int i;
       m$e uoe;
       VoicePartyBackground mUrlList;
       Iterator iterator;
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, k.class, "6")) {
          return;
       }
       a.p(obj1, "background");
       if (obj.d != null) {
          return;
       }
       Integer integer = Integer.valueOf(obj1.mDynamicBackgroundResType);
       String obj2 = PatchProxy.applyOneRefs(integer, obj, k.class, "7");
       String str = 1;
       boolean b = false;
       if (obj2 != PatchProxyResult.class) {
          i = obj2.intValue();
       }else {
          obj2 = 3;
          if (integer != null && integer.intValue() == obj2) {
             i = 1;
          }else if(integer == null){
             integer.intValue();
          }
          i = null;
       }
       int i1 = i;
       b.d0(LiveVoicePartyLogTag.OTHER, "updateBgFromVoicePartyBackground", "resType", Integer.valueOf(i1), "isLowMemory", Boolean.valueOf(obj.b));
       if (obj.b != null) {
          obj.j.setDynamicEnable(b);
       }
       int i2 = 10;
       if (obj1.mBackgroundImage != null) {
          VoicePartyBackground mBackgroundI = obj1.mBackgroundImage;
          a.o(mBackgroundI, "background.mBackgroundImage");
          uoe = new m$e(mBackgroundI);
       }else {
          mUrlList = obj1.mThumbnailList;
          if (mUrlList == null || mUrlList.isEmpty()) {
             b = true;
          }
          if (!b) {
             mUrlList = obj1.mThumbnailList;
             a.o(mUrlList, "background.mThumbnailList");
             ArrayList uArrayList1 = new ArrayList(u.Y(mUrlList, i2));
             iterator = mUrlList.iterator();
             while (iterator.hasNext()) {
                CDNUrl uCDNUrl1 = iterator.next();
                a.o(uCDNUrl1, "it");
                uArrayList1.add(uCDNUrl1.getUrl());
             }
             uoe = new m$d(uArrayList1);
          }else {
             uoe = new m$d(CollectionsKt__CollectionsKt.E());
          }
       }
       m$e uoe1 = uoe;
       if (i1 == str) {
          mUrlList = obj1.mUrlList;
          a.o(mUrlList, "background.mUrlList");
          ArrayList uArrayList = new ArrayList(u.Y(mUrlList, i2));
          iterator = mUrlList.iterator();
          while (iterator.hasNext()) {
             CDNUrl uCDNUrl = iterator.next();
             a.o(uCDNUrl, "it");
             uArrayList.add(uCDNUrl.getUrl());
          }
          m$b uob = new m$b(uArrayList, obj1.mDynamicBackgroundResMd5, i1, t0.z(), uoe1);
          uoe1 = obj1;
       }
       obj.j.e(uoe1);
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "17")) {
          return;
       }
       a.p(p0, "newConfig");
       return;
    }
    public void onLowMemory(){
    }
    public void onTrimMemory(int p0){
       boolean b;
       LiveMultiLayerViewController liveMultiLay = LiveMultiLayerViewController.class;
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, k.class, "16")) {
          return;
       }
       LiveVoicePartyLogTag oTHER = LiveVoicePartyLogTag.OTHER;
       b.c0(oTHER, "bg onTrimMemory", "level", Integer.valueOf(p0));
       if (this.b == null && p0 >= 15) {
          b = true;
          this.b = b;
          k tj = this.j;
          if (!tj.getVisibility()) {
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             LiveMultiLayerView obj = PatchProxy.apply(null, tj, LiveMultiLayerView.class, "6");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else {
                obj = tj.b;
                if (obj == null) {
                   a.S("viewController");
                }
                Objects.requireNonNull(obj);
                Object obj1 = PatchProxy.apply(null, obj, liveMultiLay, "7");
                if (obj1 != patchProxyRe) {
                   b = obj1.booleanValue();
                }else {
                   LiveMultiLayerViewController c = obj.c;
                   if (c == null || c.getVisibility()) {
                      b = false;
                   }
                }
             }
             if (b) {
                b.Z(oTHER, "fallback to staticPic");
                tj.setDynamicEnable(false);
                if (!PatchProxy.applyVoid(null, tj, LiveMultiLayerView.class, "7")) {
                   LiveMultiLayerView b1 = tj.b;
                   if (b1 == null) {
                      a.S("viewController");
                   }
                   Objects.requireNonNull(b1);
                   if (!PatchProxy.applyVoid(null, b1, liveMultiLay, "5")) {
                      b1.g();
                   }
                }
             }
          }
       }
    label_009e :
       return;
    }
}
