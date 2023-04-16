package com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService;
import at5.a;
import ot5.a$a;
import ot5.a;
import com.yxcorp.gifshow.autoplay.live.g;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.collection.ArraySet;
import java.lang.Integer;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import fu2.h;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import msd.a;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.kwai.video.waynelive.LivePlayerController;
import android.graphics.Rect;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.StringBuilder;
import android.graphics.Point;
import com.kwai.feature.api.live.service.voiceparty.LiveVoicePartyPlayViewService$ScaleType;
import com.kuaishou.live.core.voiceparty.simpleplay.service.LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1;
import android.view.ViewGroup;
import java.util.Iterator;

public final class LiveVoicePartyPreviewPlayViewServiceImpl implements LiveVoicePartyPlayViewService, a, a$a	// class@001915
{
    public final String a;
    public final ArraySet b;
    public int c;
    public final a d;
    public final g e;
    public final View f;

    public void LiveVoicePartyPreviewPlayViewServiceImpl(a p0,g p1,View p2){
       a.p(p0, "livePreviewPlayViewAdapterService");
       a.p(p1, "livePlayModule");
       a.p(p2, "fragmentRootView");
       super();
       this.d = p0;
       this.e = p1;
       this.f = p2;
       this.a = "LiveVoicePartyPreviewPlayViewServiceImpl";
       this.b = new ArraySet();
       p0.r(this);
       p0.q(null, null);
    }
    public Object a(int p0){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, liveVoicePar, "18");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.a(p0);
    }
    public void b(boolean p0){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "9")) {
          return;
       }
       this.d.n(p0);
       this.d.b(p0);
       return;
    }
    public void c(int p0,Object p1){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, liveVoicePar, "19")) {
          return;
       }
       this.d.c(p0, p1);
       return;
    }
    public void d(){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.applyVoid(null, this, liveVoicePar, "7")) {
          return;
       }
       boolean b = true;
       this.b(b);
       this.i(b);
       this.e.a0();
       if (!PatchProxy.applyVoid(null, this, liveVoicePar, "8")) {
          int i = 0;
          if (h.b(Integer.valueOf(this.c))) {
             liveVoicePar = this.c;
             if (liveVoicePar == 4 || (liveVoicePar == b || (liveVoicePar != 3 && liveVoicePar != 5))) {
                b = false;
             }
          label_003e :
             if (b) {
                liveVoicePar = this.d;
                liveVoicePar.i(h.e(liveVoicePar.g(), 0, 0, 0, 0, 0, 0, 120, null), null);
             }
          }else {
             ViewGroup$MarginLayoutParams marginLayout = h.e(this.d.g(), -1, -1, 0, 0, 0, 0, 120, null);
             Object[] objArray = (!marginLayout instanceof ConstraintLayout$LayoutParams)? null: marginLayout;
             if (objArray != null) {
                objArray.h = i;
                objArray.k = i;
                objArray.d = i;
                objArray.g = i;
             }
             this.d.i(marginLayout, null);
             if (this.d.f()) {
                ViewGroup$LayoutParams layoutParams = this.d.k();
                if (layoutParams != null) {
                   LivePlayerController livePlayerCo = this.e.Q();
                   float videoSizeRat = (livePlayerCo != null)? livePlayerCo.getVideoSizeRatio(): 0;
                   LiveVoicePartyPreviewPlayViewServiceImpl td = this.d;
                   int i1 = (videoSizeRat - (float)i > 0)? (int)((float)this.f.getHeight() * videoSizeRat): this.f.getWidth();
                   td.l(h.e(layoutParams, i1, this.f.getHeight(), 0, 0, 0, 0, 120, null), null);
                }
             }
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "8")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = null;
       if (h.b(Integer.valueOf(this.c))) {
          LiveVoicePartyPreviewPlayViewServiceImpl tc = this.c;
          int i = 1;
          if (tc != 4 && (tc != i && (tc == 3 || tc == 5))) {
             layoutParams = 1;
          }
          if (layoutParams) {
             tc = this.d;
             tc.i(h.e(tc.g(), 0, 0, 0, 0, 0, 0, 120, null), null);
          }
          return;
       }else {
          ViewGroup$MarginLayoutParams marginLayout = h.e(this.d.g(), -1, -1, 0, 0, 0, 0, 120, null);
          Object[] objArray = (!marginLayout instanceof ConstraintLayout$LayoutParams)? null: marginLayout;
          if (objArray != null) {
             objArray.h = layoutParams;
             objArray.k = layoutParams;
             objArray.d = layoutParams;
             objArray.g = layoutParams;
          }
          this.d.i(marginLayout, null);
          if (this.d.f()) {
             ViewGroup$LayoutParams layoutParams1 = this.d.k();
             if (layoutParams1 != null) {
                LivePlayerController livePlayerCo = this.e.Q();
                float videoSizeRat = (livePlayerCo != null)? livePlayerCo.getVideoSizeRatio(): 0;
                LiveVoicePartyPreviewPlayViewServiceImpl td = this.d;
                int i1 = (videoSizeRat - (float)layoutParams > 0)? (int)((float)this.f.getHeight() * videoSizeRat): this.f.getWidth();
                td.l(h.e(layoutParams1, i1, this.f.getHeight(), 0, 0, 0, 0, 120, null), null);
             }
          }
          return;
       }
    }
    public Rect g(Rect p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "rectInWindow");
       obj = new int[2];
       this.f.getLocationInWindow(obj);
       int i = p0.left - obj[0];
       int i1 = p0.top - obj[1];
       return new Rect(i, i1, (p0.width() + i), (p0.height() + i1));
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "12")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "onPlayViewDetach");
       this.q(true);
       this.b.clear();
       return;
    }
    public void i(boolean p0){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "10")) {
          return;
       }
       if (p0) {
          this.d.d(this);
       }else {
          this.d.e(this);
          this.d.s();
       }
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "17")) {
          return;
       }
       b.Z(LiveVoicePartyLogTag.AUDIENCE, this.a+" removeVoicePartyPlayViewInterceptor");
       this.d.s();
       return;
    }
    public void k(Point p0,Rect p1,LiveVoicePartyPlayViewService$ScaleType p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "5")) {
          return;
       }
       a.p(p1, "viewHolderRectInWindow");
       a.p(p2, "scaleType");
       Rect rect = PatchProxy.applyOneRefs(p1, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "6");
       if (rect != PatchProxyResult.class) {
       }else {
          a.p(p1, "rectInWindow");
          int[] ointArray = new int[2];
          this.f.getLocationInWindow(ointArray);
          int i = p1.left - ointArray[0];
          int i1 = p1.top - ointArray[1];
          rect = new Rect(i, i1, (p1.width() + i), (p1.height() + i1));
       }
       this.r(new LiveVoicePartyPreviewPlayViewServiceImpl$setPlayViewLocation$1(this, p0, rect, p2));
       return;
    }
    public boolean l(LivePlayerController p0,int p1,int p2,int p3,int p4,View p5,ViewGroup p6){
       if (PatchProxy.isSupport(LiveVoicePartyPreviewPlayViewServiceImpl.class)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),p5,p6};
          Object obj = PatchProxy.apply(objArray, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "16");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "livePlayerController");
       a.p(p5, "playView");
       a.p(p6, "playViewContainer");
       return 1;
    }
    public void m(){
    }
    public final void n(boolean p0){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "15")) {
          return;
       }
       if (this.d.a(h.e.a()) != null) {
          this.p(null, p0);
       }
       return;
    }
    public void o(){
       if (PatchProxy.applyVoid(null, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "11")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          iterator.next().invoke();
       }
       this.b.clear();
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "onPlayViewAttach");
       return;
    }
    public final void p(Object p0,boolean p1){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, liveVoicePar, "14")) {
          return;
       }
       if (p1) {
          this.d.c(h.e.a(), p0);
       }else {
          this.d.q(Integer.valueOf(h.e.a()), p0);
       }
       return;
    }
    public final void q(boolean p0){
       LiveVoicePartyPreviewPlayViewServiceImpl liveVoicePar = LiveVoicePartyPreviewPlayViewServiceImpl.class;
       if (PatchProxy.isSupport(liveVoicePar) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, liveVoicePar, "13")) {
          return;
       }
       liveVoicePar = this.c;
       b.Z(LiveVoicePartyLogTag.LIVE_PREVIEW, "updatePlayViewTagIfNeed "+liveVoicePar+' '+p0);
       if (liveVoicePar != null) {
          this.p(Integer.valueOf(liveVoicePar), p0);
       }else {
          this.n(p0);
       }
       this.c = 0;
       return;
    }
    public final void r(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveVoicePartyPreviewPlayViewServiceImpl.class, "4")) {
          return;
       }
       if (this.d.f()) {
          p0.invoke();
       }else {
          this.b.add(p0);
       }
       return;
    }
}
