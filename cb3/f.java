package cb3.f;
import vb3.k;
import com.kuaishou.live.lite.LiveLiteParam;
import android.view.View;
import android.view.ViewGroup;
import com.kwai.video.waynelive.LivePlayerController;
import mrd.a;
import msd.q;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import wa1.i;
import eb3.d;
import eb3.d$a;
import kotlin.Pair;
import brd.t;
import cb3.f$a;
import erd.g;
import crd.b;
import cb3.f$b;
import android.view.View$OnLayoutChangeListener;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Collection;
import tkd.b;
import tkd.d;
import v33.a;
import com.kwai.feature.api.live.plugin.LiveLiteAdapterPlugin;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import at5.a;
import com.kuaishou.live.lite.debuglog.LiveLiteLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.Rect;
import java.util.Iterator;
import android.graphics.Point;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import com.kuaishou.live.lite.framework.layoutmanager.widget.PlayerViewCropLayout$ScaleType;
import db3.i;
import db3.h;
import lnc.a1;
import nsd.u;

public final class f implements k	// class@0004e4
{
    public final i a;
    public final b b;
    public final View$OnLayoutChangeListener c;
    public final LiveLiteParam d;
    public final View e;
    public final ViewGroup f;
    public final LivePlayerController g;
    public final a h;
    public final q i;

    public void f(LiveLiteParam p0,View p1,ViewGroup p2,LivePlayerController p3,a p4,q p5){
       a.p(p0, "param");
       a.p(p1, "layoutRoot");
       a.p(p2, "playerViewContainer");
       a.p(p3, "playerController");
       a.p(p4, "layoutState");
       a.p(p5, "interceptorInvoker");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.a = new i();
       b uob = d$a.b(d.a, p3, null, 0, 6, null).subscribe(new f$a(this));
       a.o(uob, "VideoSizeObservable.crea¡­      doIntercept\(\)\n    }");
       this.b = uob;
       f$b uob1 = new f$b(this);
       this.c = uob1;
       p1.addOnLayoutChangeListener(uob1);
    }
    public Object a(int p0){
       View obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.f.getChildAt(0);
       Object tag = (obj != null)? obj.getTag(p0): null;
       return tag;
    }
    public void b(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "5")) {
          return;
       }
       uof = this.f;
       int i = (p0)? 0: 8;
       uof.setVisibility(i);
       return;
    }
    public void c(int p0,Object p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "10")) {
          return;
       }
       View childAt = this.f.getChildAt(0);
       if (childAt != null) {
          childAt.setTag(p0, p1);
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       this.b(true);
       this.i(true);
       this.j();
       return;
    }
    public void e(){
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       if (this.a.isEmpty() ^ 0x01) {
          return;
       }
       LiveStreamFeed liveStreamFe = this.d.getLiveStreamFeed();
       a.o(liveStreamFe, "param.liveStreamFeed");
       a uoa = d.a(0x342530d1).getLiveLiteAdapterPlugin().dV(this, liveStreamFe);
       if (uoa != null) {
          this.a.add(uoa);
          b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "VoicePartyPlayViewInterceptor.addPlayViewResizeInterceptor");
          this.h();
       }
       return;
    }
    public Rect g(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, f.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rectInWindow");
       obj = new int[2];
       this.e.getLocationInWindow(obj);
       int i = p0.left - obj[0];
       int i1 = p0.top - obj[1];
       return new Rect(i, i1, (p0.width() + i), (p0.height() + i1));
    }
    public final void h(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, f.class, "11")) {
          return;
       }
       int videoWidth = this.g.getVideoWidth();
       int videoHeight = this.g.getVideoHeight();
       if (videoWidth && videoHeight) {
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (PatchProxy.isSupport(f.class)) {
                Object obj = PatchProxy.applyThreeRefs(uoa, Integer.valueOf(videoWidth), Integer.valueOf(videoHeight), this, f.class, "12");
                if (obj != PatchProxyResult.class) {
                   b = obj.booleanValue();
                label_0071 :
                   if (!b) {
                   }
                }
             }
             b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "VoicePartyPlayViewInterceptor.intercept", "interceptors", this.a);
             b = this.i.invoke(uoa, Integer.valueOf(videoWidth), Integer.valueOf(videoHeight)).booleanValue();
             goto label_0071 ;
          }
       }
       return;
    }
    public void i(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uof, "6")) {
          return;
       }
       b.c0(LiveLiteLogTag.LAYOUT_MANAGER, "setEnablePlayViewAutoFit", "enable", Boolean.valueOf(p0));
       if (!p0) {
          this.j();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, f.class, "8")) {
          return;
       }
       this.a.clear();
       b.Z(LiveLiteLogTag.LAYOUT_MANAGER, "VoicePartyPlayViewInterceptor.removeVoicePartyPlayViewInterceptor");
       return;
    }
    public void k(Point p0,Rect p1,LiveVoicePartyPlayViewService$ScaleType p2){
       PlayerViewCropLayout$ScaleType scaleType;
       Rect rect;
       f uof = this;
       Object obj = p1;
       Object obj1 = p2;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "2")) {
          return;
       }
       a.p(obj, "viewHolderRectInWindow");
       a.p(obj1, "scaleType");
       PlayerViewCropLayout$ScaleType cENTER_CROP = (obj1 == LiveVoicePartyPlayViewService$ScaleType.CenterCrop)? PlayerViewCropLayout$ScaleType.CENTER_CROP: PlayerViewCropLayout$ScaleType.CENTER_INSIDE;
       scaleType = cENTER_CROP;
       if (uof.a.isEmpty()) {
          rect = PatchProxy.applyOneRefs(obj, uof, f.class, "4");
          if (rect != PatchProxyResult.class) {
          }else {
             a.p(obj, "rectInWindow");
             int[] ointArray = new int[2];
             uof.e.getLocationInWindow(ointArray);
             int i5 = obj.left - ointArray[0];
             int i6 = obj.top - ointArray[1];
             rect = new Rect(i5, i6, (p1.width() + i5), (p1.height() + i6));
          }
       }else {
          rect = obj;
       }
       f h = uof.h;
       int i = a1.e((float)h.a());
       int i1 = rect.width();
       int i2 = rect.height();
       Rect rect1 = new Rect(rect.left, rect.top, 0, 0);
       i oi = uof.h.i();
       int i3 = (oi != null)? oi.c(): 0;
       oi = uof.h.i();
       int i4 = (oi != null)? oi.b(): 0;
       super(i, 0, 0, i3, i4, i1, i2, 0, rect1, false, false, false, false, 0, 0, 0, 0, 0, scaleType, 0x3e686, null);
       h.onNext(this);
       return;
    }
}
