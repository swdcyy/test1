package com.yxcorp.gifshow.v3.editor.sticker.g0$a;
import ooc.r0;
import com.yxcorp.gifshow.v3.editor.sticker.g0;
import java.lang.Object;
import ooc.q0;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import android.view.View;
import android.os.Bundle;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import uwc.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import htc.a;
import java.util.Map;
import t36.f;
import twc.a;
import itc.v;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Boolean;
import uv8.o$b;
import com.kuaishou.edit.draft.Workspace$From;
import com.kuaishou.edit.draft.Workspace$Type;
import oq.e;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import qr4.k$e;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import xwc.a;
import itc.r;
import itc.p;
import com.yxcorp.gifshow.v3.previewer.EditorBasePreviewFragment;
import r1c.h;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.f;
import uxb.k;
import uxb.l;
import itc.z2;
import com.yxcorp.gifshow.v3.editor.sticker.element.vm.StickerElementViewModel;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import androidx.fragment.app.Fragment;
import qsc.c;
import com.yxcorp.gifshow.v3.editor.sticker.element.vb.StickerElementViewBinder;
import java.util.Iterator;
import ei0.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.v3.editor.sticker.s;
import wpc.y;
import qsc.g;
import lq.i;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.SerialArg;
import com.kuaishou.android.post.PostPageArg;
import com.kwai.feature.post.api.feature.sticker.IStickerDetailInfo;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerDetailInfo;
import faa.a;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i;
import otc.a;
import lnc.p3;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.v3.editor.sticker.resource.EditStickerRepo;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.EditorManager;
import com.yxcorp.gifshow.v3.editor.sticker.StickerRanker$a;
import voc.o;
import qr4.i;
import android.content.Intent;
import wba.p0;
import qr4.m$k0;
import qr4.m$l0;
import android.text.TextUtils;
import qr4.m$a;
import qr4.m$p;
import java.lang.Long;
import qr4.m$m;
import ekd.j0;
import qr4.m$c0;
import qr4.k$j;
import java.lang.Integer;
import java.lang.StringBuilder;
import kotlin.jvm.internal.a;
import wba.z;
import itc.g3;
import java.util.Collection;
import ekd.q$a;
import ekd.q;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import otc.b;
import java.lang.Runnable;
import t45.c;

public class g0$a implements r0	// class@00124e
{
    public final g0 b;

    public void g0$a(g0 p0){
       this.b = p0;
       super();
    }
    public void Z(){
       q0.q(this);
    }
    public void b(c p0){
       q0.j(this, p0);
    }
    public void c(View p0,Bundle p1,BaseEditorFragment p2){
       q0.p(this, p0, p1, p2);
    }
    public void d(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$a.class, "5")) {
          return;
       }
       g0$a tb = this.b;
       g0 g = tb.g;
       if (g != null) {
          f.t0(tb.f, g, a.class);
          this.b.g = null;
       }
       if (p0 != null) {
          p0 = v.a(p0);
          if (p0 != null && p0.D() != null) {
             p0.D().l0();
          }
       }
       return;
    }
    public void d0(){
       q0.g(this);
    }
    public void e(boolean p0){
       q0.a(this, p0);
    }
    public List f(){
       boolean b;
       a[] uoaArray;
       boolean b1;
       g0 og0 = g0.class;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g0$a obj = PatchProxy.apply(null, this, g0$a.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.b;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(null, obj, og0, "9");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          c uoc = obj.c().w0();
          b = (uoc.B0() == Workspace$From.PROFILE_BACKGROUND || (uoc.a1() == Workspace$Type.KTV_SONG || (uoc.a1() != Workspace$Type.KTV_MV && (!(e.a()).isEmpty() || uoc.T0() == Workspace$Source.MEDIA_SCENE))))? true: false;
       }
       if (b || e.c()) {
          uoaArray = new a[]{new p()};
          return Lists.e(uoaArray);
       }else {
          obj = this.b;
          Objects.requireNonNull(obj);
          c obj2 = PatchProxy.apply(null, obj, og0, "10");
          if (obj2 != patchProxyRe) {
             b1 = obj2.booleanValue();
          }else {
             obj2 = obj.c().w0();
             b1 = (obj2.a1() != Workspace$Type.ATLAS && (obj2.a1() != Workspace$Type.LONG_PICTURE && b.g(obj2.d1()) != null))? true: false;
          }
          if (b1 || e.d()) {
             uoaArray = new a[]{new r()};
             return Lists.e(uoaArray);
          }else {
             return Lists.b();
          }
       }
    }
    public void g(int p0){
       q0.i(this, p0);
    }
    public void h(EditorBasePreviewFragment p0,c p1){
       q0.m(this, p0, p1);
    }
    public void i(){
       q0.l(this);
    }
    public List j(h p0,boolean p1){
       return q0.b(this, p0, p1);
    }
    public void m(LayoutInflater p0,ViewGroup p1,Bundle p2,View p3,BaseEditorFragment p4){
       g0$a tb;
       boolean b1;
       g0$a uoa = g0$a.class;
       int i = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }
       if (PostExperimentUtils.x(this.b.c().w0())) {
          return;
       }else if(this.b.c().w0().a1() == Workspace$Type.ALBUM_MOVIE){
          tb = this.b;
          f.o0(tb.f, tb.c().t0(), a.class);
       }
       tb = this.b;
       tb.g = tb.c().t0();
       Object[] objArray1 = null;
       if (this.b.i()) {
          if (f.E(this.b.c().w0().a1())) {
             l.l().eQ(this.b.d, new z2(this.b.h(), p4));
          }
          tb = this.b;
          boolean b = f.F(p4);
          Objects.requireNonNull(tb);
          if (!PatchProxy.isSupport(g0.class) || !PatchProxy.applyVoidTwoRefs(p3, Boolean.valueOf(b), tb, g0.class, "5")) {
             a uoa1 = tb.c();
             Object[] objArray2 = PatchProxy.applyOneRefs(uoa1, tb, g0.class, "7");
             if (objArray2 != PatchProxyResult.class) {
             }else {
                Iterator iterator = uoa1.v0().iterator();
                objArray2 = objArray1;
                while (iterator.hasNext()) {
                   a uoa2 = iterator.next();
                   if (uoa2 instanceof StickerElementViewBinder) {
                      objArray2 = uoa2;
                   }
                }
             }
             if (objArray2 == null) {
                tb.c().v0().add(new StickerElementViewBinder(tb.d, tb.h(), p3, b));
             }
          }
          this.b.c().u0().U7(new s(f.p0(this.b.g, y.class), f.p0(this.b.g, g.class)));
       }else if(f.E(this.b.c().w0().a1())){
          l.l().eQ(this.b.d, new z2(this.b.h(), p4));
       }
       if (i.h()) {
          IStickerDetailInfo iStickerDeta = i.g().getStickerParam().get();
          if (!iStickerDeta instanceof StickerDetailInfo) {
             objArray1 = new Object[0];
             a.D().A("StickerEditFactory", "onFragmentCreateView: stickerDetailInfo is not StickerDetailInfo instance", objArray1);
             return;
          }else if(TextUtils.x(iStickerDeta.mStickerId)){
             i.a(R.style.arg_RES_7f11066a, 0x7f103df1);
             return;
          }else if(e.d()){
             tb = this.b;
             Objects.requireNonNull(tb);
             objArray1 = PatchProxy.apply(objArray1, tb, g0.class, "4");
             if (objArray1 != PatchProxyResult.class) {
                b1 = objArray1.booleanValue();
             }else if(f.B(tb.c().w0().a1()) && tb.c().w0().T0() != Workspace$Source.REEDIT){
                i = 0;
             }
             b1 = i;
             if (b1) {
                i.a(R.style.arg_RES_7f11066a, 0x7f103df2);
             }
          }
       }
       return;
    }
    public void onActivityDestroy(){
       Object[] objArray = null;
       String str = "2";
       if (PatchProxy.applyVoid(objArray, this, g0$a.class, str)) {
          return;
       }
       a g = a.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(objArray, g, a.class, str)) {
          Object[] objArray1 = new Object[0];
          p3.D().w("PostStickerEveManager", "notifyDestroy", objArray1);
          StickerRanker i = StickerRanker.i;
          Objects.requireNonNull(i);
          if (!PatchProxy.applyVoid(objArray, i, StickerRanker.class, "3")) {
             b9.a(StickerRanker.c);
          }
          i.c();
          EditStickerRepo e = a.e;
          if (e != null) {
             e.d();
          }
       }
       return;
    }
    public void onActivityResume(){
       q0.h(this);
    }
    public void p(boolean p0){
       Object[] objArray;
       o oo;
       i oi;
       String str1;
       EditorSdk2V2$VideoEditorProject videoEditorP1;
       g0$a uoa = g0$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "3")) {
          return;
       }
       o$b d = this.b.d;
       if (d != null) {
          BaseEditorFragment b = d.B;
          if (b != null) {
             StickerRanker i = StickerRanker.i;
             EditorDelegate uEditorDeleg = b.m();
             Objects.requireNonNull(i);
             StickerRanker stickerRanke = StickerRanker.class;
             if (!PatchProxy.applyVoidOneRefs(uEditorDeleg, i, stickerRanke, "14") && (i.h().a() && uEditorDeleg != null)) {
                int i1 = 0;
                if (StickerRanker.f) {
                   objArray = new Object[i1];
                   a.D().w("StickerRanker", "isAnalyzedScene", objArray);
                }else {
                   a g = a.g;
                   if (g.b()) {
                      objArray = new Object[i1];
                      a.D().w("StickerRanker", "isFrequencyLimited", objArray);
                   }else {
                      boolean b1 = true;
                      StickerRanker.f = b1;
                      String str = PatchProxy.applyOneRefs(uEditorDeleg, i, stickerRanke, "15");
                      if (str != PatchProxyResult.class) {
                      }else {
                         oo = uEditorDeleg.x();
                         if (oo != null) {
                            VideoContext videoContext = oo.e();
                            if (videoContext != null) {
                               oi = videoContext.F();
                            label_0091 :
                               o oo1 = uEditorDeleg.x();
                               VideoContext videoContext1 = (oo1 != null)? oo1.e(): null;
                               c uoc1 = uEditorDeleg.N();
                               Workspace$Source source = (uoc1 != null)? uoc1.T0(): null;
                               Workspace$Type type1 = (uoc1 != null)? uoc1.a1(): null;
                               Intent intent = uEditorDeleg.getIntent();
                               if (oi == null || (videoContext1 == null || (uoc1 != null && source != null))) {
                                  if (p0.a(source)) {
                                     str = "Recreation";
                                  }else {
                                     i b2 = oi.b;
                                     if (b2 != null) {
                                        m$k0 s0 = b2.S0;
                                        if (s0 != null) {
                                           m$l0 c = s0.c;
                                        label_00d5 :
                                           if (TextUtils.isEmpty(c)) {
                                              b2 = oi.b;
                                              if (b2 != null) {
                                                 s0 = b2.T;
                                                 if (s0 != null) {
                                                    m$a l = s0.l;
                                                 label_00e8 :
                                                    if (TextUtils.isEmpty(l)) {
                                                       b2 = oi.b;
                                                       if (b2 != null) {
                                                          s0 = b2.I;
                                                          if (s0 != null) {
                                                             Long longx = Long.valueOf(s0.c);
                                                          label_0102 :
                                                             if (longx != null && longx.longValue() > 0) {
                                                                str = "FlashPhoto";
                                                             }else {
                                                                b2 = oi.b;
                                                                s0 = (b2 != null)? b2.A: null;
                                                                if (s0 == null || s0.d == null) {
                                                                   if (s0 != null && !TextUtils.isEmpty(s0.a)) {
                                                                      if (intent == null || !j0.a(intent, "VIDEO_IS_LIP_SYNC", i1)) {
                                                                         b1 = false;
                                                                      }
                                                                      if (!b1) {
                                                                         str = "FollowShoot";
                                                                      }
                                                                   }else {
                                                                      b2 = oi.b;
                                                                      s0 = (b2 != null)? b2.i0: null;
                                                                      if (!TextUtils.isEmpty(s0)) {
                                                                         str = "StoryMoodTemplate";
                                                                      }else if(type1 == Workspace$Type.KTV_MV || type1 == Workspace$Type.KTV_SONG){
                                                                         str = "Karaoke";
                                                                      }else if(intent != null){
                                                                         str1 = j0.f(intent, "same_frame_origin_photo_id");
                                                                      }else {
                                                                         videoEditorP1 = null;
                                                                      }
                                                                      if (TextUtils.isEmpty(str1)) {
                                                                         b2 = oi.b;
                                                                         if (b2 != null) {
                                                                            s0 = b2.t;
                                                                            if (s0 != null) {
                                                                               m$c0 b3 = s0.b;
                                                                            label_0179 :
                                                                               if (TextUtils.isEmpty(b3)) {
                                                                                  if (type1 == Workspace$Type.SINGLE_PICTURE) {
                                                                                     str = "SinglePicture";
                                                                                  }else if(type1 != Workspace$Type.PHOTO_MOVIE && (type1 == Workspace$Type.ATLAS || type1 == Workspace$Type.LONG_PICTURE)){
                                                                                     str = "MultiPicture";
                                                                                  }else {
                                                                                     b2 = oi.c;
                                                                                     Integer integer = (b2 != null)? Integer.valueOf(b2.a): null;
                                                                                     if (integer != null) {
                                                                                        b2 = oi.c;
                                                                                        if (b2 == null || b2.a != null) {
                                                                                           str = "Camera";
                                                                                        }
                                                                                     }
                                                                                     b2 = oi.b;
                                                                                     if (b2 != null) {
                                                                                        s0 = b2.E;
                                                                                        if (s0 != null) {
                                                                                           integer = Integer.valueOf(s0.length);
                                                                                        label_01bc :
                                                                                           oi = oi.b;
                                                                                           if (oi == null || (oi.o == b1 || (integer != null && integer.intValue() > 0))) {
                                                                                              str = "Import";
                                                                                           }
                                                                                        }
                                                                                     }
                                                                                     videoEditorP1 = null;
                                                                                     goto label_01bc ;
                                                                                  }
                                                                               }
                                                                            }
                                                                         }
                                                                         videoEditorP1 = null;
                                                                         goto label_0179 ;
                                                                      }
                                                                      str = "SameFrame";
                                                                   }
                                                                }
                                                                str = "LipsSync";
                                                             }
                                                          }
                                                       }
                                                       videoEditorP1 = null;
                                                       goto label_0102 ;
                                                    }
                                                 }
                                              }
                                              videoEditorP1 = null;
                                              goto label_00e8 ;
                                           }
                                           str = "AiCutVideo";
                                        }
                                     }
                                     videoEditorP1 = null;
                                     goto label_00d5 ;
                                  }
                               }
                            label_01d8 :
                               str = "Unknown";
                            }
                         }
                         oi = null;
                         goto label_0091 ;
                      }
                      StickerRanker.e = str;
                      StickerRanker$a enableAnalyz = i.h().enableAnalyzeScene;
                      Object[] objArray1 = new Object[i1];
                      a.D().w("StickerRanker", "tryAnalyzeScene, currentSourceType: "+StickerRanker.e+", "+"enableScanScene: "+enableAnalyz, objArray1);
                      Object[] objArray2 = new Object[i1];
                      a.D().w("StickerRanker", "sourceType: "+StickerRanker.e, objArray2);
                      if (enableAnalyz != null) {
                         oo = uEditorDeleg.x();
                         a.o(oo, "delegate.editorContext");
                         if (f.E(uEditorDeleg.getType())) {
                            Workspace$Type type = uEditorDeleg.getType();
                            a.o(type, "delegate.type");
                            c uoc = uEditorDeleg.N();
                            a.o(uoc, "delegate.workspaceDraft");
                            List list = z.x(type, uoc);
                            i.b(null, q.g(list, g3.a));
                         }else {
                            EditorSdk2V2$VideoEditorProject videoEditorP = oo.f();
                            a.o(videoEditorP, "editorContext.videoEditorProject");
                            i.b(videoEditorP, null);
                         }
                      }else {
                         StickerRanker.d = "";
                         g.c();
                      }
                   }
                }
             }
          }
       }
       return;
    }
    public void s(Bundle p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, g0$a.class, str)) {
          return;
       }
       a g = a.g;
       Objects.requireNonNull(g);
       if (!PatchProxy.applyVoid(null, g, a.class, str)) {
          StickerRanker i = StickerRanker.i;
          if (i.h().a()) {
             Object[] objArray = new Object[0];
             p3.D().w("PostStickerEveManager", "start, isActivated: "+a.a, objArray);
             i.c();
             a.f = null;
             a.e = new EditStickerRepo();
             if (a.a) {
                g.a();
             }else {
                a.a = true;
                c.a(b.b);
             }
          }
       }
       return;
    }
    public void u(boolean p0,String p1){
       q0.d(this, p0, p1);
    }
}
