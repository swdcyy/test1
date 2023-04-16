package com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import at5.a;
import co2.f2;
import android.view.View;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.view.ViewGroup;
import mw1.c;
import com.kuaishou.live.core.voiceparty.p$a;
import ie2.i;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl$b;
import ie2.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import fu2.h;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.graphics.Rect;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.graphics.Point;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1;
import k51.a;
import msd.l;
import com.kuaishou.live.core.voiceparty.playway.shared.service.LiveVoicePartyPlayViewServiceImpl$a;
import android.view.View$OnLayoutChangeListener;
import com.kwai.video.waynelive.LivePlayerController;

public final class LiveVoicePartyPlayViewServiceImpl implements LiveVoicePartyPlayViewService, a	// class@001888
{
    public final String a;
    public boolean b;
    public final b c;
    public final f2 d;
    public final View e;
    public final LivePlayTextureView f;
    public final ViewGroup g;
    public final c h;
    public p$a i;
    public final i j;

    public void LiveVoicePartyPlayViewServiceImpl(f2 p0,View p1,LivePlayTextureView p2,ViewGroup p3,c p4,p$a p5,i p6){
       a.p(p0, "voicePartyContext");
       a.p(p1, "fragmentRootView");
       a.p(p2, "playView");
       a.p(p3, "playViewContainer");
       a.p(p4, "liveAudiencePlayViewService");
       a.p(p5, "voicePartyPlayViewService");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.g = p3;
       this.h = p4;
       this.i = p5;
       this.j = p6;
       this.a = "LiveVoicePartyPlayViewServiceImpl";
       LiveVoicePartyPlayViewServiceImpl$b uob = new LiveVoicePartyPlayViewServiceImpl$b(this);
       this.c = uob;
       if (p6 != null) {
          p6.c(uob);
       }
       return;
    }
    public Object a(int p0){
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveVoicePar, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.f.getTag(p0);
    }
    public void b(boolean p0){
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "11")) {
          return;
       }
       int i = (p0)? 0: 8;
       this.g.setVisibility(i);
       this.f.setVisibility(i);
       return;
    }
    public void c(int p0,Object p1){
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveVoicePar, "16")) {
          return;
       }
       this.f.setTag(p0, p1);
       return;
    }
    public void d(){
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, liveVoicePar, "9")) {
          return;
       }
       this.b(true);
       this.i(true);
       this.h.c(objArray);
       this.h.p();
       if (!PatchProxy.applyVoid(objArray, this, liveVoicePar, "10") && this.b == null) {
          ViewGroup$MarginLayoutParams marginLayout = h.e(this.h().getLayoutParams(), -1, -1, 0, 0, 0, 0, 120, null);
          if (marginLayout instanceof ConstraintLayout$LayoutParams) {
             objArray = marginLayout;
          }
          int i = 0;
          if (objArray != null) {
             objArray.h = i;
             objArray.k = i;
             objArray.d = i;
             objArray.g = i;
          }
          this.h().setLayoutParams(marginLayout);
          float videoSizeRat = this.h.getVideoSizeRatio();
          LiveVoicePartyPlayViewServiceImpl tf = this.f;
          ViewGroup$LayoutParams layoutParams = tf.getLayoutParams();
          int i1 = (videoSizeRat - (float)i > 0)? (int)((float)this.e.getHeight() * videoSizeRat): this.e.getWidth();
          tf.setLayoutParams(h.e(layoutParams, i1, this.e.getHeight(), 0, 0, 0, 0, 120, null));
       }
       return;
    }
    public void e(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveVoicePartyPlayViewServiceImpl.class, "10")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       ViewGroup$MarginLayoutParams marginLayout = h.e(this.h().getLayoutParams(), -1, -1, 0, 0, 0, 0, 120, null);
       if (marginLayout instanceof ConstraintLayout$LayoutParams) {
          objArray = marginLayout;
       }
       int i = 0;
       if (objArray != null) {
          objArray.h = i;
          objArray.k = i;
          objArray.d = i;
          objArray.g = i;
       }
       this.h().setLayoutParams(marginLayout);
       float videoSizeRat = this.h.getVideoSizeRatio();
       LiveVoicePartyPlayViewServiceImpl tf = this.f;
       ViewGroup$LayoutParams layoutParams = tf.getLayoutParams();
       int i1 = (videoSizeRat - (float)i > 0)? (int)((float)this.e.getHeight() * videoSizeRat): this.e.getWidth();
       tf.setLayoutParams(h.e(layoutParams, i1, this.e.getHeight(), 0, 0, 0, 0, 120, null));
       return;
    }
    public Rect g(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyPlayViewServiceImpl.class, "3");
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
    public final ViewGroup h(){
       return this.g;
    }
    public void i(boolean p0){
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "12")) {
          return;
       }
       if (p0) {
          this.h.d(this);
       }else {
          this.h.e(this);
          this.i.a();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPlayViewServiceImpl.class, "14")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, this.a+" removeVoicePartyPlayViewInterceptor");
       this.i.a();
       return;
    }
    public void k(Point p0,Rect p1,LiveVoicePartyPlayViewService$ScaleType p2){
       Object[] this;
       Object obj = this;
       Object obj1 = p0;
       Object obj2 = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       LiveVoicePartyPlayViewServiceImpl liveVoicePar = LiveVoicePartyPlayViewServiceImpl.class;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveVoicePartyPlayViewServiceImpl.class, "2")) {
          return;
       }
       a.p(obj2, "viewHolderRectInWindow");
       a.p(p2, "scaleType");
       Rect rect = PatchProxy.applyOneRefs(obj2, obj, liveVoicePar, "3");
       int i = 0;
       if (rect != patchProxyRe) {
       }else {
          a.p(obj2, "rectInWindow");
          int[] ointArray = new int[2];
          obj.e.getLocationInWindow(ointArray);
          int i1 = obj2.left - ointArray[i];
          int i2 = obj2.top - ointArray[1];
          rect = new Rect(i1, i2, (p1.width() + i1), (p1.height() + i2));
       }
       obj2 = rect;
       Object[] objArray = null;
       LiveVoicePartyPlayViewServiceImpl liveVoicePar1 = PatchProxy.apply(objArray, obj, liveVoicePar, "4");
       if (liveVoicePar1 != patchProxyRe) {
       }else if(obj.g.indexOfChild(obj.f) != -1){
          liveVoicePar1 = obj.f;
       }else {
          this = objArray;
       label_0079 :
          if (this != null) {
             ViewGroup viewGroup = this.h();
             b.Z(LiveVoicePartyLogTag.AUDIENCE, "updateLivePlayViewSize "+obj1+' '+obj2);
             if (obj2.width() > 0 && obj2.height() > 0) {
                ViewGroup$LayoutParams layoutParams = this.getLayoutParams();
                if (!layoutParams instanceof ViewGroup$MarginLayoutParams) {
                   layoutParams = objArray;
                }
                if (layoutParams != null) {
                   ViewGroup$MarginLayoutParams marginLayout = h.d(viewGroup.getLayoutParams(), obj2.width(), obj2.height(), obj2.left, obj2.top, 0, 0);
                   if (marginLayout instanceof ConstraintLayout$LayoutParams) {
                      objArray = marginLayout;
                   }
                   if (objArray != null) {
                      objArray.h = i;
                      objArray.d = i;
                   }
                   viewGroup.setLayoutParams(marginLayout);
                   if (obj1 != null && obj1.x > null) {
                      LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1 osetPlayView = new LiveVoicePartyPlayViewServiceImpl$setPlayViewLocation$$inlined$let$lambda$1(layoutParams, viewGroup, this, this, p0, obj2, p2);
                      if (a.i()) {
                         liveVoicePar.invoke(viewGroup);
                      }else {
                         viewGroup.addOnLayoutChangeListener(new LiveVoicePartyPlayViewServiceImpl$a(liveVoicePar));
                      }
                   }
                }
             }
          }
       label_010c :
          return;
       }
       this = liveVoicePar1;
       goto label_0079 ;
    }
    public boolean l(LivePlayerController p0,int p1,int p2,int p3,int p4,View p5,ViewGroup p6){
       if (PatchProxy.isSupport(LiveVoicePartyPlayViewServiceImpl.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,p6};
          Object obj = PatchProxy.apply(objArray, this, LiveVoicePartyPlayViewServiceImpl.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "livePlayerController");
       a.p(p5, "playView");
       a.p(p6, "playViewContainer");
       return 1;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPlayViewServiceImpl.class, "7")) {
          return;
       }
       h e = h.e;
       if (this.f.getTag(e.a()) != null) {
          this.f.setTag(e.a(), null);
       }
       return;
    }
}
