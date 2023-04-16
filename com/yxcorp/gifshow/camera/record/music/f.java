package com.yxcorp.gifshow.camera.record.music.f;
import ui9.b;
import oh9.v;
import oc9.d0;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.camera.record.music.n;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.camera.record.music.f$a;
import com.yxcorp.gifshow.camera.record.base.d;
import qc9.a;
import com.yxcorp.gifshow.camera.record.video.viewbinder.bottom.AbsRecordBottomBarViewBinder;
import vf9.a;
import vf9.b0;
import java.lang.Class;
import com.yxcorp.gifshow.camera.record.base.b$a;
import vf9.a0;
import vf9.k0;
import vf9.c0;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import oc9.b0;
import oc9.a0;
import lnc.f5;
import android.view.View;
import com.yxcorp.utility.n;
import com.kwai.camerasdk.videoCapture.CameraController;
import java.lang.Integer;
import android.widget.ImageView;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import com.kwai.video.westeros.models.EffectResource;
import ui9.a;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import maa.a;
import wba.d;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import com.kuaishou.edit.draft.Asset;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.Asset$ShootInfo$CameraType;
import com.kuaishou.edit.draft.Asset$ShootInfo;
import wba.e;
import java.lang.Enum;
import java.lang.Boolean;
import vf9.y1;
import zb9.k;
import zb9.k$a;
import com.kwai.gifshow.post.api.feature.music.model.MusicRecommendParams;
import ce9.l;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import org.json.JSONObject;
import com.yxcorp.gifshow.util.h0;
import java.util.Collection;
import ekd.q;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Throwable;
import lnc.i1;
import e17.i;
import kuaishou.perf.page.impl.d;
import com.kwai.performance.fluency.page.monitor.PageMonitor;
import hd9.n;
import java.io.File;
import yf9.j;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicRootFragment;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.Workspace$Type;
import android.app.Activity;
import com.kuaishou.edit.draft.Workspace$Source;
import pi9.p;
import oc9.w;
import android.content.Intent;
import ekd.j0;
import com.kuaishou.edit.draft.Workspace$From;
import yf9.h;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.StringBuilder;
import qrc.r$a;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import qrc.k;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraActivity;
import qrc.r;
import qrc.e$a;
import yf9.a;
import msc.s;
import xvc.m;
import tvc.c;
import qrc.s;
import yf9.j$c;
import yf9.i;
import qrc.e;
import com.yxcorp.gifshow.v3.editor.music_v2.MusicFragmentCreator;
import qrc.j$a;
import qrc.j;
import xvc.f;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import com.kuaishou.android.model.music.Music;
import vf9.f0;
import yaa.c;
import com.kuaishou.edit.draft.Music$Type;
import com.kuaishou.edit.draft.Music;
import lnc.w6;
import wba.u;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kuaishou.edit.draft.Music$b;
import com.kuaishou.edit.draft.Music$Source;
import com.kuaishou.edit.draft.TimeRange;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;
import com.kwai.gifshow.post.api.feature.music.model.MusicClipInfo;
import msc.q;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import urc.e;
import urc.f;
import urc.i;
import com.yxcorp.gifshow.plugin.music.SelectSource;
import urc.k;
import com.yxcorp.gifshow.v3.editor.music_v2.action.MusicUnSelectedAction;
import xvc.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.camera.record.widget.CameraRootFrameLayout;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import vf9.w1;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MusicDetailPackage;
import k2b.b2;
import k2b.u1;
import java.lang.Number;
import tkd.b;
import tkd.d;
import om6.r;
import vi9.a;
import xi9.n;
import yf9.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.image.KwaiImageView;
import qxc.b;
import android.widget.TextView;
import vf9.z;
import com.kuaishou.viewbinder.IViewBinder;
import c35.p;
import vf9.e0;
import java.lang.Runnable;
import tg9.b;
import e46.a;
import vf9.d0;
import erd.g;
import crd.b;
import eoc.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import sb9.z;
import okd.b;
import lob.t;
import a46.b;
import n3d.d;
import com.kwai.feature.post.api.music.cloudmusic.RecordSelectMusicData;
import com.kwai.feature.post.api.music.data.MusicSource;
import com.kuaishou.android.model.music.MusicType;
import vf9.r;
import com.kuaishou.edit.draft.Asset$b;
import oh9.u;
import java.lang.RuntimeException;
import android.widget.FrameLayout;
import com.yxcorp.gifshow.camera.record.music.f$b;
import com.yxcorp.gifshow.activity.GifshowActivity;

public class f extends d0 implements b, v	// class@000e75
{
    public KwaiImageView o;
    public View p;
    public View q;
    public boolean r;
    public final CopyOnWriteArrayList s;
    public final n t;
    public j u;
    public final m v;
    public AbsRecordBottomBarViewBinder w;
    public boolean x;
    public boolean y;

    public void f(CameraPageType p0,b p1,n p2){
       super(p0, p1);
       this.r = true;
       this.s = new CopyOnWriteArrayList();
       this.v = new f$a(this);
       this.t = p2;
       d tf = this.f;
       if (tf instanceof a) {
          this.w = tf.zb();
       }
       this.d.n(a.class, new b0(this));
       this.d.n(v.class, new a0(this));
       this.d.n(k0.class, new c0(this));
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, f.class, "6")) {
          return;
       }
       a0.i(this);
       boolean b = true;
       if (!f5.a(this.d)) {
          n.Y(this.p, 4, b);
       }
       f tp = this.p;
       if (tp != null) {
          tp.setClickable(false);
       }
       if (this.h.isFrontCamera()) {
          this.s.add(Integer.valueOf(b));
       }else {
          this.s.add(Integer.valueOf(2));
       }
       return;
    }
    public void P1(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       a0.h(this);
       int i = 0;
       n.Y(this.o, i, i);
       if (!f5.a(this.d)) {
          n.Y(this.p, i, i);
       }
       f to = this.o;
       if (to != null) {
          to.setEnabled(this.r);
       }
       to = this.q;
       if (to != null) {
          to.setEnabled(this.r);
       }
       to = this.p;
       if (to != null) {
          to.setClickable(true);
       }
       this.s.clear();
       return;
    }
    public void S1(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       a.b(this, p0, p1, p2, p3);
    }
    public void W(c p0){
       d a;
       Asset$ShootInfo$CameraType uNKNOWN;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "9")) {
          return;
       }
       a uoa = p0.o0();
       f ts = this.s;
       if (!PatchProxy.applyVoidTwoRefs(uoa, ts, null, d.class, "5")) {
          a.p(ts, "sectionCameraUsageList");
          if (uoa != null) {
             ts.clear();
             Iterator iterator = uoa.z().iterator();
             while (iterator.hasNext()) {
                Asset uAsset = iterator.next();
                a = d.a;
                Objects.requireNonNull(a);
                Asset$ShootInfo$CameraType shootInfo$Ca = PatchProxy.applyOneRefs(uAsset, a, d.class, "7");
                if (shootInfo$Ca != PatchProxyResult.class) {
                }else if(uAsset == null){
                   uNKNOWN = Asset$ShootInfo$CameraType.UNKNOWN;
                }else {
                   Asset$ShootInfo shootInfo = uAsset.getShootInfo();
                   a.o(shootInfo, "asset.shootInfo");
                   uNKNOWN = shootInfo.getCameraType();
                   a.o(uNKNOWN, "asset.shootInfo.cameraType");
                }
                shootInfo$Ca = uNKNOWN;
                int i = e.a[shootInfo$Ca.ordinal()];
                int i1 = 1;
                if (i != i1) {
                   a = 2;
                   if (i != a) {
                      ts.add(Integer.valueOf(-124));
                   }else {
                      ts.add(Integer.valueOf(a));
                   }
                }else {
                   ts.add(Integer.valueOf(i1));
                }
             }
          }
       }
       return;
    }
    public void X0(EffectDescription p0,EffectSlot p1,EffectResource p2,boolean p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Boolean.valueOf(p3), this, f.class, "8")) {
          return;
       }
       boolean b = false;
       boolean b1 = (p0 == null || this.d.d(y1.c).b != null)? true: false;
       this.r = b1;
       if (b1 && !this.d.d(k.l.a()).h()) {
          b = true;
       }
       f to = this.o;
       if (to != null) {
          to.setEnabled(b);
       }
       to = this.q;
       if (to != null) {
          to.setEnabled(b);
       }
       return;
    }
    public MusicRecommendParams g2(){
       f uof = f.class;
       MusicRecommendParams obj = PatchProxy.apply(null, this, uof, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new MusicRecommendParams();
       l a = this.d.d(l.i).a;
       if (a != null) {
          obj.mMagicFaceId = a.mId;
       }
       try{
          if (!PatchProxy.applyVoidOneRefs(obj, this, uof, "16")) {
             JSONObject jSONObject = h0.c(obj.mExtraInfo);
             if (q.f(this.s)) {
                if (!PermissionUtils.a(this.e, "android.permission.CAMERA")) {
                   jSONObject.put("cameraType", -124);
                }else if(this.h.isFrontCamera()){
                   jSONObject.put("cameraType", 1);
                }else {
                   jSONObject.put("cameraType", 2);
                }
             }else {
                jSONObject.put("cameraType", h0.b(this.s));
             }
             obj.mExtraInfo = jSONObject.toString();
          }
       }catch(org.json.JSONException e0){
          i1.c(e0);
       }
       return obj;
    }
    public void h(EffectDescription p0,EffectSlot p1){
       a.a(this, p0, p1);
    }
    public void h2(){
       n i;
       f0 obj1;
       ClientContent$ContentPackage uContentPack;
       Music music;
       int i3;
       Object[] obj2;
       boolean b;
       Object obj = this;
       Object[] objArray = null;
       String str = "11";
       if (PatchProxy.applyVoid(objArray, obj, f.class, str)) {
          return;
       }
       k ok = obj.d.d(k.l.a());
       if (ok.g() && !ok.e()) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100235);
          return;
       }else {
          d.d("postMusicPageMonitor").n();
          d.d("postMusicPageMonitor").g("clickToLoadData");
          d uod = d.d("postMusicPageMonitor");
          StringBuilder str1 = (obj.y != null)? "warm": "cold";
          uod.l(str1);
          PageMonitor.INSTANCE.onInit("com.yxcorp.gifshow.music.cloudmusic.MusicFragment");
          n on = obj.d.d(n.j);
          f t = obj.t;
          n e = t.E;
          if (e != null) {
             i = t.I;
             if (i != null) {
                str1 = i.getAbsolutePath();
             label_0075 :
                n a = on.a;
                int i1 = 0;
                if (a == null) {
                   f u = obj.u;
                   if (u != null) {
                      Objects.requireNonNull(u);
                      PatchProxyResult patchProxyRe = PatchProxyResult.class;
                      j oj = j.class;
                      if (!PatchProxy.applyVoid(objArray, u, oj, "4")) {
                         String str3 = "RecordMusicPanelHandler";
                         if (u.h != null) {
                            Object[] objArray1 = new Object[i1];
                            a.D().w(str3, "panel is showing .", objArray1);
                         }else if(u.c == null){
                            MusicRootFragment musicRootFra = PatchProxy.apply(objArray, u, oj, "5");
                            if (musicRootFra != patchProxyRe) {
                            }else {
                               obj2 = new Object[i1];
                               a.D().w(str3, "createMusicRootFragment", obj2);
                               VideoContext videoContext = new VideoContext();
                               c uoc1 = DraftFileManager.E().g(Workspace$Type.VIDEO, p.a(u.a), u.b.b().getTaskId(), videoContext, Workspace$From.forNumber(j0.b(u.a.getIntent(), "camera_page_from", i1)));
                               h oh = new h(u, videoContext, uoc1);
                               j obj3 = PatchProxy.apply(objArray, u, oj, "12");
                               if (obj3 != patchProxyRe) {
                                  b = obj3.booleanValue();
                               }else {
                                  l a1 = u.b.d(l.i).a;
                                  b = (a1 != null && a1.mHasMusic != null)? true: false;
                               }
                               Object[] objArray4 = new Object[i1];
                               a.D().w(str3, "has magic music : "+b, objArray4);
                               r$a uoa1 = new r$a().a(u.a).d(oh);
                               uoa1.g(i1);
                               uoa1.j(i1);
                               uoa1.l(i1);
                               uoa1.f(i1);
                               uoa1.k(i1);
                               uoa1.e(i1);
                               uoa1.i(i1);
                               uoa1.m((b ^ true));
                               uoa1 = uoa1.n(u.k);
                               uoa1.h(true);
                               obj3 = PatchProxy.apply(null, u, oj, "6");
                               if (obj3 != patchProxyRe) {
                               }else {
                                  obj3 = u.a;
                                  if (obj3 instanceof CameraActivity) {
                                     e0 uoe0 = obj3.W0();
                                  }
                               }
                               e$a uoa2 = new e$a().c(new a(uoc1, s.a));
                               uoa2.e(u.j);
                               uoa2.b(u.e.a());
                               uoa2.d(true);
                               uoa2.f = new i(u);
                               uoa2.g = i1;
                               MusicFragmentCreator musicFragmen = new MusicFragmentCreator(null, new j$a().c(uoa1.c(obj3).b()).b(uoa2.a()).a());
                               u.g = musicFragmen;
                               musicRootFra = musicFragmen.b();
                               musicRootFra.uh(oh, "");
                               obj2 = new Object[i1];
                               a.D().w(str3, "createMusicRootFragment end", obj2);
                            }
                            u.c = musicRootFra;
                            objArray = null;
                         }
                         obj1 = PatchProxy.apply(objArray, u, oj, str);
                         if (obj1 != patchProxyRe) {
                         }else {
                            obj1 = u.b.d(f0.k).b;
                         }
                         a uoa = a.D();
                         str1 = "current music : ";
                         music = (obj1 == null)? obj1: obj1.mId;
                         Object[] objArray2 = new Object[i1];
                         uoa.w(str3, str1+music, objArray2);
                         j c = u.c;
                         Objects.requireNonNull(c);
                         if (!PatchProxy.applyVoidOneRefs(obj1, c, MusicRootFragment.class, "35")) {
                            EditorDelegate uEditorDeleg = c.kh();
                            a.o(uEditorDeleg, "editorDelegate");
                            c uoc = uEditorDeleg.N();
                            a.o(uoc, "workspaceDraft");
                            uoc = uoc.J0();
                            if (uoc != null) {
                               a.o(uoc, "workspaceDraft.musicDraft ?: return");
                               Music$Type oNLINE = Music$Type.ONLINE;
                               music = w6.c(uoc);
                               obj2 = PatchProxy.applyTwoRefs(obj1, music, c, MusicRootFragment.class, "36");
                               if (obj2 != patchProxyRe) {
                                  i3 = obj2.booleanValue();
                               }else if(obj1 == null && music == null){
                                  i3 = false;
                               }else if(obj1 != null && music != null){
                                  i3 = a.g(obj1.getId(), u.a.f(music)) ^ true;
                               }else {
                                  i3 = 1;
                               }
                               if (i3) {
                                  if (!uoc.D()) {
                                     uoc.c0();
                                  }
                                  if (obj1 != null) {
                                     u.k(i1, uoc);
                                     GeneratedMessageLite$Builder uBuilder = uoc.b();
                                     a.o(uBuilder, "musicDraft.append\(\)");
                                     u.n(obj1, uBuilder, uoc, oNLINE, null, null, null, null, null, null, false, 2032, null);
                                  }else {
                                     i oi = c.Eh().o0().s().i();
                                     if (oi != null) {
                                        SelectSource selectSource = oi.h();
                                        if (selectSource != null) {
                                           c.Eh().t0(new MusicUnSelectedAction(c.Eh().o0().v().d(), selectSource));
                                        }
                                     }
                                  }
                                  if (uoc.D()) {
                                     uoc.g(i1);
                                  }
                               }
                            }
                         }
                      label_02f0 :
                         u.h = true;
                         RxBus.f.b(new PanelShowEvent(u.e.A(), PanelShowEvent$PanelType.MUSIC, u.a, true));
                         int i2 = 0x7f01010d;
                         i3 = 0x7f010105;
                         if (u.c.isAdded()) {
                            e uoe = u.a.getSupportFragmentManager().beginTransaction();
                            uoe.y(i3, i2);
                            uoe.E(u.c).o();
                         }else {
                            Fragment uFragment = u.a.getSupportFragmentManager().findFragmentByTag("record_music_panel");
                            e uoe1 = u.a.getSupportFragmentManager().beginTransaction();
                            if (uFragment != null) {
                               uoe1.u(uFragment);
                            }
                            uoe1.y(i3, i2);
                            uoe1.g(R.id.music_panel_container, u.c, "record_music_panel");
                            uoe1.o();
                         }
                         c = u.d;
                         if (c != null) {
                            c.setEnableInterceptEvent(i1);
                         }
                         Object[] objArray3 = new Object[i1];
                         a.D().w(str3, "showPanel", objArray3);
                         c = u.f;
                         if (c != null) {
                            c.setVisibility(i1);
                         }
                         u.b.b().V7().c();
                      }
                   }else if(a != null && (on.g != null && !TextUtils.x(on.b))){
                      f o = obj.o;
                      if (o != null && o.isSelected()) {
                         i = on.b;
                         e = on.g;
                         i1 = true;
                      }
                   }
                   obj.k2(a, i1, e, i);
                }else {
                   goto label_037b ;
                }
                CameraLogger.n(7, 1, "camera_music", CameraLogger.b(ok.d(), ok.a(), ok.c(), ok.b(), ok.f(), ok.i()), "none", obj.e);
                obj1 = null;
                if (!PatchProxy.applyVoidOneRefs(e, obj1, w1.class, "1")) {
                   String str2 = (e == null)? "music": "music_cover";
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.name = str2;
                   uElementPack.type = 1;
                   uElementPack.status = 1;
                   uElementPack.action = 969;
                   if (e != null) {
                      uContentPack = new ClientContent$ContentPackage();
                      uContentPack.musicDetailPackage = b2.a(e);
                   }else {
                      uContentPack = obj1;
                   }
                   u1.u(true, uElementPack, uContentPack);
                }
                obj.y = true;
                return;
             }
          }
          Object[] objArray5 = objArray;
          goto label_0075 ;
       }
    }
    public int i2(boolean p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uof, "13");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int recordDurati = this.d.b().getRecordDuration();
       if (p0) {
          return recordDurati;
       }else {
          int i = d.a(-831446984).uK(this.n);
          d tg = this.g;
          int i1 = (tg == null)? 0: tg.getVideoLength().a();
          if (i1 && (recordDurati == i1 && i1 != i)) {
             return i1;
          }else {
             return i;
          }
       }
    }
    public void k(View p0){
       View view;
       j f;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "2")) {
          return;
       }
       super.k(p0);
       f tu = this.u;
       Object[] objArray = null;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, j.class, "1")) {
             tu.f = tu.a.findViewById(0x7f0a0642);
             tu.d = tu.a.findViewById(0x7f0a369f);
             f = tu.f;
             if (f != null) {
                f.setOnClickListener(new c(tu));
             }
          }
       }
       tu = this.w;
       Object[] objArray1 = (tu == null)? objArray: tu.H();
       this.o = b.a(objArray1, p0, 0x7f0a05db);
       tu = this.w;
       objArray1 = (tu == null)? objArray: tu.G();
       this.p = b.a(objArray1, p0, 0x7f0a05de);
       tu = this.w;
       if (tu != null) {
          objArray = tu.J();
       }
       this.q = b.a(objArray, p0, 0x7f0a2c9c);
       p.a(this.w, this.p, new z(this));
       int i = 0;
       if (!f5.a(this.d)) {
          n.Y(this.p, i, i);
       }
       f tq = this.q;
       if (tq != null) {
          tq.setEnabled(this.r);
       }
       tq = this.o;
       if (tq != null) {
          tq.setVisibility(i);
          this.o.setEnabled(this.r);
          this.b2(new e0(this));
          this.d.j().addView(this.o);
       }
       this.Y1(f.a(a.class, new d0(this)));
       return;
    }
    public void k2(boolean p0,boolean p1,Music p2,String p3){
       boolean b1;
       boolean b3;
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), p2, p3, this, f.class, "14")) {
          return;
       }
       String taskId = this.d.b().getTaskId();
       boolean b = true;
       int i = 0;
       if (PostExperimentUtils.v()) {
          z oz = this.d.d(z.c);
          if (oz.a != null && oz.b != null) {
             b1 = true;
          label_0045 :
             t ot = b.a(-1033494876).V(this.e, i, this.i2(p0), d.a(0x500192b6)).b(b).n(p0).a(taskId).o(b).l(p0).s(this.g2());
             d te = this.e;
             boolean b2 = (te instanceof CameraActivity && !j0.a(te.getIntent(), "panel_disabled", i))? true: false;
             ot = ot.f0(b2).q(b1).K(553);
             if (this.x != null) {
                ot.u(-4);
             }
             RecordSelectMusicData recordSelect = new RecordSelectMusicData();
             if (p2 != null) {
                recordSelect.mMusic = p2;
                MusicSource rECORD = (p1)? MusicSource.RECORD: this.t.L;
                recordSelect.mMusicSource = rECORD;
                recordSelect.mRecordMode = this.n;
                long l = (p1)? 0: this.t.T;
                recordSelect.mMusicStartMills = l;
                if (!p1) {
                   n e = this.t.E;
                   e = (e != null && e.mType != MusicType.LIP)? 1: 0;
                   if (e) {
                      b3 = true;
                   label_00e3 :
                      recordSelect.mEnableClip = b3;
                      recordSelect.mMusicPath = p3;
                      if (!p1 && this.t.K == null) {
                         b = false;
                      }
                      recordSelect.mMusicPathIsWholeFile = b;
                      d te1 = this.e;
                      if (te1 != null) {
                         i = te1.hashCode();
                      }
                      recordSelect.mActivityHashCode = i;
                      recordSelect.mSpecialRecordDuration = this.i2(p0);
                      ot.L(recordSelect);
                   }
                }
                b3 = false;
                goto label_00e3 ;
             }
             r or = this.d.c(r.class);
             if (or != null) {
                ot.N(or.a());
             }
             ot.h();
             this.e.overridePendingTransition(R.anim.arg_RES_7f010105, 0x7f01004c);
             return;
          }
       }
       b1 = false;
       goto label_0045 ;
    }
    public boolean onBackPressed(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f obj = PatchProxy.apply(objArray, this, f.class, "19");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.u;
       boolean b = false;
       if (obj != null) {
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(objArray, obj, j.class, "3");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             j c = obj.c;
             if (c != null && !c.isHidden()) {
                if (obj.c.Hh()) {
                   obj.c.Jh();
                }else {
                   obj.a();
                }
                b = true;
             }
          }
       }
       return b;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       super.onDestroy();
       this.s.clear();
       f tu = this.u;
       if (tu != null) {
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(null, tu, j.class, "13")) {
             j g = tu.g;
             if (g != null) {
                g.c();
                tu.g = null;
             }
             tu.h = false;
          }
          this.u = null;
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       super.onDestroyView();
       f to = this.o;
       if (to != null) {
          this.r = to.isEnabled();
       }
       return;
    }
    public void onEffectDescriptionUpdatedOnCancel(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.c(this, p0, p1, p2);
    }
    public void onEffectDescriptionUpdatedOnError(EffectDescription p0,EffectSlot p1,EffectResource p2){
       a.d(this, p0, p1, p2);
    }
    public void r0(int p0,Asset$b p1,b p2){
       u.b(this, p0, p1, p2);
    }
    public void s0(){
       if (PatchProxy.applyVoid(null, this, f.class, "7")) {
          return;
       }
       a0.m(this);
       if (q.f(this.s)) {
          i1.b("MusicBtnController", new RuntimeException("mSectionCameraUsageList is null or size is 0"));
       }else {
          f ts = this.s;
          ts.remove((ts.size() - 1));
       }
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       super.w1(p0);
       View view = this.e.findViewById(R.id.camera_touch_view);
       if (this.e.findViewById(0x7f0a2ca4) != null && (view != null && this.d.d(n.j).a == null)) {
          Object[] objArray = new Object[0];
          a.D().w("MusicBtnController", "enable music panel", objArray);
          this.u = new j(this.e, this.d, new f$b(this));
       }
    label_0052 :
       return;
    }
}
