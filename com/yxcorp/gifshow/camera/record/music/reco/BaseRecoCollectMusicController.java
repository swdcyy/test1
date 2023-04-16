package com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$mutuallyExclusiveBubble$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import oc9.t;
import oc9.s;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.base.d;
import android.content.Intent;
import com.kuaishou.android.model.music.Music;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.kuaishou.android.model.music.MusicType;
import lnc.a7;
import vf9.s;
import java.util.Set;
import com.kwai.robust.PatchProxyResult;
import zb9.j;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.Iterator;
import crd.b;
import ssb.g;
import ssb.h;
import brd.t;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$d;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$e;
import erd.g;
import aj9.b;
import com.yxcorp.gifshow.camerasdk.q;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt___CollectionsKt;
import gi9.a;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$b;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$onCreate$2;
import ag9.d;
import msd.l;
import com.yxcorp.gifshow.camera.record.music.reco.BaseRecoCollectMusicController$onCreate$3;
import eoc.f;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;

public abstract class BaseRecoCollectMusicController extends d0	// class@000e94
{
    public c o;
    public boolean p;
    public Intent q;
    public ArrayList r;
    public final int s;
    public boolean t;
    public boolean u;
    public Music v;
    public final p w;
    public static final BaseRecoCollectMusicController$a x;

    static {
       BaseRecoCollectMusicController.x = new BaseRecoCollectMusicController$a(null);
    }
    public void BaseRecoCollectMusicController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.r = new ArrayList();
       this.s = PostExperimentUtils.w0();
       this.w = s.c(BaseRecoCollectMusicController$mutuallyExclusiveBubble$2.INSTANCE);
    }
    public void E1(boolean p0){
       BaseRecoCollectMusicController uBaseRecoCol = BaseRecoCollectMusicController.class;
       if (PatchProxy.isSupport(uBaseRecoCol) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uBaseRecoCol, "5")) {
          return;
       }
       s.e(this, p0);
       this.t = p0;
       if (p0 && (this.u != null && this.v != null)) {
          this.b2(new BaseRecoCollectMusicController$c(this));
       }
    label_002c :
       return;
    }
    public final void g2(Intent p0,Music p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BaseRecoCollectMusicController.class, "11")) {
          return;
       }
       a.p(p0, "intent");
       a.p(p1, "music");
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "applyMusic : "+p1.getId(), objArray);
       a7.c(0, p1.mType);
       s os = new s(this.q, false, false, false, false);
       this.d.m(p1);
       return;
    }
    public abstract String h2();
    public final Set i2(){
       Object obj = PatchProxy.apply(null, this, BaseRecoCollectMusicController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public final int k2(){
       return this.s;
    }
    public void l2(j p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "8")) {
          return;
       }
       a.p(p0, "assistantChangeEvent");
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "handleAssistantModeChangeEvent : "+p0.a(), objArray);
       return;
    }
    public void m2(PanelShowEvent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "7")) {
          return;
       }
       a.p(p0, "panelShowEvent");
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "handlePanelShowEvent : "+p0.a, objArray);
       this.p = p0.a;
       return;
    }
    public final void n2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "14")) {
          return;
       }
       a.p(p0, "music");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = this.h2();
       i3 oi3 = i3.f();
       oi3.d("music_id", p0.getId());
       uElementPack.params = oi3.e();
       u1.L("", this.e, 1, uElementPack, null);
       return;
    }
    public final void o2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "13")) {
          return;
       }
       a.p(p0, "music");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.action2 = this.h2();
       i3 oi3 = i3.f();
       oi3.d("music_id", p0.getId());
       uElementPack.params = oi3.e();
       u1.C0("", this.e, 7, uElementPack, null);
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BaseRecoCollectMusicController.class, "12")) {
          return;
       }
       super.onDestroy();
       Iterator iterator = this.r.iterator();
       while (iterator.hasNext()) {
          iterator.next().dispose();
       }
       this.r.clear();
       return;
    }
    public final void p2(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "10")) {
          return;
       }
       a.p(p0, "music");
       h.a().b(p0.getId(), p0.mType.mValue).subscribe(BaseRecoCollectMusicController$d.b, BaseRecoCollectMusicController$e.b);
       return;
    }
    public abstract void r2(Music p0,Intent p1);
    public final void s2(Music p0){
       Object[] objArray;
       Object[] objArray1;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "9")) {
          return;
       }
       int i = 0;
       if (this.t == null) {
          objArray = new Object[i];
          a.D().w("RecoCollectMusicController", "not get permission", objArray);
          this.u = true;
          return;
       }else if(this.q == null){
          objArray = new Object[i];
          a.D().w("RecoCollectMusicController", "musicIntent is null", objArray);
          return;
       }else if(!this.f2()){
          objArray = new Object[i];
          a.D().w("RecoCollectMusicController", "is not video mode", objArray);
          return;
       }else if(!this.h.B()){
          d th = this.h;
          a.o(th, "mCameraHelper");
          if (!th.isRecording()) {
             if (this.p != null) {
                objArray = new Object[i];
                a.D().w("RecoCollectMusicController", "panel is showing", objArray);
                return;
             }else if(this.d.d(p0.j.a()).c()){
                objArray = new Object[i];
                a.D().w("RecoCollectMusicController", "isAssistantMode", objArray);
                return;
             }else {
                Set set = this.i2();
                BaseRecoCollectMusicController to = this.o;
                String str = "recordBubbleManager";
                if (to == null) {
                   a.S(str);
                }
                a uoa = to.h();
                c uoc = null;
                c uoc1 = (uoa != null)? uoa.d(): uoc;
                if (CollectionsKt___CollectionsKt.H1(set, uoc1)) {
                   a uoa1 = a.D();
                   StringBuilder str1 = "has show bubble ";
                   to = this.o;
                   if (to == null) {
                      a.S(str);
                   }
                   uoa = to.h();
                   if (uoa != null) {
                      uoc = uoa.d();
                   }
                   objArray1 = new Object[i];
                   uoa1.w("RecoCollectMusicController", str1+uoc, objArray1);
                   return;
                }else {
                   objArray1 = new Object[i];
                   a.D().w("RecoCollectMusicController", "try show recommend music : "+p0.getId(), objArray1);
                   BaseRecoCollectMusicController tq = this.q;
                   a.m(tq);
                   this.r2(p0, tq);
                   return;
                }
             }
          }
       }
       objArray = new Object[i];
       a.D().w("RecoCollectMusicController", "has start record", objArray);
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseRecoCollectMusicController.class, "4")) {
          return;
       }
       super.w1(p0);
       Object[] objArray = new Object[0];
       a.D().w("RecoCollectMusicController", "style : "+this.s, objArray);
       this.d.l(a.class, new BaseRecoCollectMusicController$b(this));
       this.d.l(j.class, new d(new BaseRecoCollectMusicController$onCreate$2(this)));
       this.r.add(f.a(PanelShowEvent.class, new d(new BaseRecoCollectMusicController$onCreate$3(this))));
       d td = this.d;
       a.o(td, "mCallerContext");
       w ow = td.b();
       a.o(ow, "mCallerContext.controllerManager");
       c uoc = ow.V7();
       a.o(uoc, "mCallerContext.controlle¡­nager.recordBubbleManager");
       this.o = uoc;
       return;
    }
}
