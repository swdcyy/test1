package com.yxcorp.gifshow.v3.EditorManager;
import gka.g;
import ml8.d;
import android.content.Context;
import android.view.View;
import com.kuaishou.edit.draft.Workspace$Type;
import com.kuaishou.edit.draft.Workspace$Source;
import com.kuaishou.edit.draft.Workspace$From;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.lang.String;
import com.yxcorp.gifshow.v3.EditorManager$b;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import uv8.o;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.EditorManager$StartEditorConfig;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.HashMap;
import java.util.LinkedList;
import android.content.Intent;
import ekd.j0;
import java.lang.CharSequence;
import android.text.TextUtils;
import lq.i;
import com.kuaishou.android.post.PostArguments;
import com.kuaishou.android.post.StrArg;
import com.kuaishou.android.post.PostPageArg;
import com.yxcorp.gifshow.v3.y;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import java.util.List;
import androidx.fragment.app.e;
import java.util.Iterator;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import yvc.a;
import com.yxcorp.gifshow.v3.f;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import q16.c$a;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.BaseEditor$EditorShowMode;
import com.yxcorp.gifshow.v3.editor.BaseEditor;
import java.util.Objects;
import ooc.g;
import roc.e;
import java.lang.Runnable;
import ekd.k1;
import java.util.Collection;
import java.util.Map;
import com.yxcorp.gifshow.v3.editor.k;
import android.app.Activity;
import h69.j;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.yxcorp.gifshow.widget.adv.VideoSDKPlayerView;
import u80.d;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import kotlin.jvm.internal.a;
import oaa.a;
import com.google.protobuf.GeneratedMessageLite;
import com.yxcorp.gifshow.edit.draft.model.c;
import naa.a;
import xaa.a;
import raa.i;
import raa.g;
import raa.c;
import raa.a;
import raa.e;
import cba.a;
import taa.a;
import com.kuaishou.edit.draft.Preview;
import u07.t$a;
import u07.f;
import ooc.v0;
import u07.u;
import com.kwai.library.widget.popup.common.c$b;
import com.kwai.library.widget.popup.common.PopupInterface;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import k2b.e0;
import k2b.s;
import tkd.b;
import tkd.d;
import u80.k;
import ooc.z0;
import crd.b;
import ooc.g1;
import java.lang.Enum;
import lnc.e7;
import com.yxcorp.gifshow.v3.editor.BaseEditor$a;
import gba.a;
import com.kuaishou.edit.draft.Template;
import com.yxcorp.utility.TextUtils;
import maa.a;
import haa.a;
import com.kuaishou.edit.draft.Asset;
import k2b.t;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import qrd.l1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import uxb.h;
import uxb.l;
import oa0.a;
import lnc.a1;
import org.json.JSONObject;
import w46.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import t36.f;
import ooc.u0;
import t36.f$a;
import android.view.ViewPropertyAnimator;
import ooc.x0;
import ooc.y0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.util.resource.MagicEmojiResourceHelper;
import h80.c;
import h80.k;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import ooc.s0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.android.post.EditAbilityConfig;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.v3.x;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment;
import java.lang.Exception;
import com.yxcorp.gifshow.v3.v;
import java.lang.Long;
import ooc.a1;
import com.kuaishou.android.model.music.Music;
import e3a.a;
import ooc.w0;
import com.kwai.feature.post.api.util.g;
import ooc.t0;
import ooc.b1;
import com.yxcorp.gifshow.v3.EditorManager$a;
import android.os.Handler;
import ekd.m1;
import aw9.c0;
import uv8.o$b;
import tj7.a;
import java.util.Set;
import com.kuaishou.edit.TimeLineGenerator;
import lq.a;
import com.kwai.video.editorsdk2.VideoEditorSession;
import ok.n;
import voc.f0;
import com.kuaishou.edit.TimeLineGenerator$a;
import y30.a;
import java.lang.Math;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.utility.n;
import java.text.DecimalFormat;
import ekd.n0;
import java.lang.Double;
import gq.a;

public class EditorManager implements g, d	// class@000d20
{
    public EditorManager$StartEditorConfig[] A;
    public EditorItemFunc B;
    public ViewGroup b;
    public View c;
    public View d;
    public View e;
    public View f;
    public Map g;
    public final o h;
    public Workspace$Type i;
    public Workspace$Source j;
    public Workspace$From k;
    public String l;
    public EditorDelegate m;
    public final List n;
    public BaseEditor o;
    public BaseEditor p;
    public boolean q;
    public y r;
    public ValueAnimator s;
    public ValueAnimator t;
    public List u;
    public Context v;
    public View w;
    public Handler x;
    public Runnable y;
    public boolean z;

    public void EditorManager(Context p0,View p1,Workspace$Type p2,Workspace$Source p3,Workspace$From p4,EditorDelegate p5,String p6,EditorManager$b p7,BaseEditPreviewFragmentViewBinder p8,o p9){
       String str1;
       Object[] objArray1;
       EditorManager a;
       Iterator iterator;
       EditorManager uEditorManag = this;
       View view = p1;
       Object obj = p2;
       super();
       boolean b = false;
       uEditorManag.q = b;
       uEditorManag.u = new ArrayList();
       EditorManager$StartEditorConfig[] startEditorC = new EditorManager$StartEditorConfig[]{EditorManager$StartEditorConfig.COVER_VIDEO,EditorManager$StartEditorConfig.STICKER,EditorManager$StartEditorConfig.EFFECT_V2,EditorManager$StartEditorConfig.STYLE};
       uEditorManag.A = startEditorC;
       this.doBindView(view);
       Object[] objArray = new Object[b];
       a.D().s("EditorManager", "EditorManager: type:"+obj, objArray);
       uEditorManag.v = p0;
       uEditorManag.w = view;
       uEditorManag.i = obj;
       uEditorManag.j = p3;
       uEditorManag.k = p4;
       uEditorManag.m = p5;
       uEditorManag.g = new HashMap();
       uEditorManag.l = p6;
       LinkedList linkedList = new LinkedList();
       uEditorManag.n = linkedList;
       linkedList.add(p7);
       uEditorManag.h = p9;
       String str = j0.f(p5.getIntent(), "EDIT_STATR_PARAMETER");
       if (TextUtils.isEmpty(str) && i.h()) {
          str = i.g().getStartEditorParam().get();
       }
       try{
          str1 = str;
          uEditorManag.z = TextUtils.equals(str1, "EDIT_STATR_COVER");
          y oy = new y(this, uEditorManag.m.N(), uEditorManag.i, uEditorManag.j, p8);
          uEditorManag.r = str;
          objArray1 = null;
          if (!PatchProxy.applyVoid(objArray1, this, EditorManager.class, "8")) {
             e uoe = uEditorManag.m.q().getChildFragmentManager().beginTransaction();
             iterator = uEditorManag.m.q().getChildFragmentManager().getFragments().iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (!uFragment.isRemoving()) {
                   uoe.u(uFragment);
                }
             }
             if (!uoe.t()) {
                uoe.m();
             }
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("EditorManager", "clearFragments", e0);
       }
       if (!PatchProxy.applyVoid(objArray1, this, EditorManager.class, "9")) {
          iterator = uEditorManag.r.c().iterator();
          while (iterator.hasNext()) {
             this.j(iterator.next());
          }
          iterator = uEditorManag.r.d().iterator();
          while (iterator.hasNext()) {
             this.j(iterator.next());
          }
       }
       this.t(obj);
       if (uEditorManag.z != null) {
          if (f.E(uEditorManag.i)) {
             if (uEditorManag.i == Workspace$Type.SINGLE_PICTURE) {
                if (PostExperimentUtils.z()) {
                   this.O(EditorItemFunc.TEXT_V2, 0);
                }else {
                   this.O(EditorItemFunc.TEXT, 0);
                }
             }else {
                this.O(EditorItemFunc.COVER_PHOTO, 0);
             }
          }else {
             this.Q();
          }
          return;
       }else if(obj != Workspace$Type.KTV_SONG){
          this.I();
       }
       if (str1 != null && !PatchProxy.applyVoidOneRefs(str1, this, EditorManager.class, "24")) {
          a = uEditorManag.A;
          int len = a.length;
          while (b < len) {
             object oobject = a[b];
             if (oobject == EditorManager$StartEditorConfig.STYLE && str1.contains(oobject.mStartParam)) {
                this.O(EditorItemFunc.STYLE, 300);
             }else if(TextUtils.equals(str1, oobject.mStartParam)){
                this.O(oobject.mEditorItemFunc, 300);
             }
             b = b + 1;
          }
       }
       if (c$a.b(p5.getIntent()) != null) {
          this.O(EditorItemFunc.PIC_TEMPLATE_V2, 0);
       }
       return;
    }
    public static boolean v(EditorSdk2V2$VideoEditorProject p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, EditorManager.class, "53");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 == null || (p1 != null && (p0.isKwaiPhotoMovie() || p1.a1() == Workspace$Type.SINGLE_PICTURE))) {
          b = true;
       }
    label_0029 :
       return b;
    }
    public boolean A(){
       EditorManager obj = PatchProxy.apply(null, this, EditorManager.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       if (obj == null || obj.k() != BaseEditor$EditorShowMode.SHOW_FOREGROUND) {
          return false;
       }
       if (this.o.p() != null) {
          if (!this.o.s()) {
             this.g();
          }
       }else {
          this.L();
       }
       return true;
    }
    public void B(EditorItemFunc p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "47")) {
          return;
       }
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(p0, tr, y.class, "11")) {
          Iterator iterator = tr.c().iterator();
          while (iterator.hasNext()) {
             a uoa = iterator.next();
             if (uoa.a() == p0) {
                tr.e.i(uoa);
             }
          }
       }
       return;
    }
    public void C(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "46")) {
          return;
       }
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(p0, tr, y.class, "10")) {
          tr.e.i(p0);
       }
       return;
    }
    public void D(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorManager.class, "45")) {
          return;
       }
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(objArray, tr, y.class, "9")) {
          tr.e.a();
       }
       return;
    }
    public void E(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorManager.class, "19")) {
          return;
       }
       EditorManager tr = this.r;
       if (tr != null) {
          Objects.requireNonNull(tr);
          if (!PatchProxy.applyVoid(objArray, tr, y.class, "3")) {
             int i = 0;
             Object[] objArray1 = new Object[i];
             a.D().w("BaseEditorListController", "removeSelectEditorRunnableIfNeeded", objArray1);
             if (tr.f != null) {
                Object[] objArray2 = new Object[i];
                a.D().w("BaseEditorListController", "removeSelectEditorRunnable mSelectEditorRunnable is not null", objArray2);
                k1.m(tr.f);
                tr.f = objArray;
             }
          }
       }
       this.m = objArray;
       this.n.clear();
       tr = this.g;
       if (tr != null) {
          Iterator iterator = tr.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().I();
          }
          this.g.clear();
       }
       k.f().i();
       return;
    }
    public void F(EditorManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "18")) {
          return;
       }
       this.n.remove(p0);
       return;
    }
    public void G(EditorItemFunc p0){
       EditorManager uEditorManag;
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "26")) {
          return;
       }
       EditorManager tm = this.m;
       if (tm == null || (tm.getContext() != null && !this.m.getContext().isFinishing())) {
          c uoc = this.m.N();
          boolean b = j.g(uoc);
          boolean b1 = DraftUtils.e(uoc);
          if (this.m.z() instanceof VideoSDKPlayerView) {
             d editingKuaiS = this.m.z().getEditingKuaiShanProject();
             if (editingKuaiS != null) {
                KSTemplateDetailInfo kSTemplateDe = editingKuaiS.k0();
                if (kSTemplateDe != null && kSTemplateDe.mLaunchAlbumWhenTapOnSegment == true) {
                   uEditorManag = 1;
                label_0058 :
                   if (p0 == EditorItemFunc.CLIP_V3) {
                      if (b) {
                         p0 = EditorItemFunc.SEGMENT;
                      }else if(b1){
                         p0 = EditorItemFunc.KUAISHAN_SEGMENT;
                      }
                   }
                   if (p0 == EditorItemFunc.SEGMENT && b1) {
                      p0 = EditorItemFunc.KUAISHAN_SEGMENT;
                   }
                   if (p0 == EditorItemFunc.AICUT && (!b && !b1)) {
                      a obj = PatchProxy.applyOneRefs(uoc, null, j.class, "28");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         a.p(uoc, "workspaceDraft");
                         obj = uoc.v0();
                         if (obj == null || obj.v() == null) {
                            obj = uoc.u0();
                            if (obj == null || obj.v() == null) {
                               obj = uoc.w0();
                               if (obj == null || obj.v() == null) {
                                  i oi = uoc.f1();
                                  if (oi == null || oi.v() == null) {
                                     g og = uoc.Y0();
                                     if (og == null || og.v() == null) {
                                        c uoc1 = uoc.z0();
                                        if (uoc1 == null || uoc1.v() == null) {
                                           obj = uoc.m0();
                                           if (obj == null || obj.v() == null) {
                                              e uoe = uoc.C0();
                                              if (uoe == null || uoe.v() == null) {
                                                 obj = uoc.R0();
                                                 if (obj == null || obj.v() == null) {
                                                    obj = uoc.P0();
                                                    if (obj != null) {
                                                       Preview preview = obj.v();
                                                       if (preview != null) {
                                                          a.o(preview, "it");
                                                          if (preview.getFrameType() > 1 || (preview.getPaddingAreaType() != 3 && preview.getPaddingAreaType() != 4)) {
                                                          }
                                                       }else {
                                                       }
                                                    }else {
                                                    }
                                                 }
                                              }
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                         }
                         b = true;
                      }
                      if (b) {
                         t$a uoa = f.e(new t$a(this.m.getContext()));
                         uoa.y0(R.string.arg_RES_7f100145);
                         uoa.S0(R.string.arg_RES_7f103a83);
                         uoa.Q0(R.string.cancel);
                         uoa.u0(new v0(this));
                         uoa.A(false);
                         uoa.z(false);
                         uoa.Y(PopupInterface.a);
                      }
                   }
                label_016a :
                   if (p0 == EditorItemFunc.KUAISHAN_SEGMENT && uEditorManag) {
                      s.m(this.m.getContext(), "HEAD_SETTINGS");
                      d.a(-264022253).LS(this.m.getContext(), this.m.q(), uoc, this.m.z().getEditingKuaiShanProject());
                   }else if(PostExperimentUtils.A(uoc) && p0 == EditorItemFunc.COVER_VIDEO){
                      f.S(new z0(this), this.m, true);
                   }else {
                      this.H(p0, true);
                   }
                }
             }
          }
          uEditorManag = null;
          goto label_0058 ;
       }
    label_01ba :
       return;
    }
    public void H(EditorItemFunc p0,boolean p1){
       Iterator iterator1;
       int i;
       t a;
       JSONObject jSONObject;
       a uoa3;
       g1 og1 = g1.class;
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.isSupport(uEditorManag) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uEditorManag, "27")) {
          return;
       }
       Iterator iterator = this.n.iterator();
       while (iterator.hasNext()) {
          iterator.next().f();
       }
       EditorManager to = this.o;
       if (to != null && to.k() == BaseEditor$EditorShowMode.SHOW_FOREGROUND) {
          return;
       }
       BaseEditor uBaseEditor = this.g.get(p0);
       if (uBaseEditor == null) {
          return;
       }
       if (!uBaseEditor.w(this.v, true)) {
          return;
       }
       a uoa = PatchProxy.applyOneRefs(p0, this, uEditorManag, "10");
       if (uoa != PatchProxyResult.class) {
       }else {
          Iterator iterator2 = this.r.c().iterator();
          while (true) {
             if (iterator2.hasNext()) {
                uoa3 = iterator2.next();
                if (uoa3.a() != p0) {
                   continue ;
                }
             }else {
                iterator2 = this.r.d().iterator();
                while (true) {
                   if (iterator2.hasNext()) {
                      uoa3 = iterator2.next();
                      if (uoa3.a() != p0) {
                         continue ;
                      }
                   }else {
                      uoa = null;
                      break ;
                   }
                }
             }
             uoa = uoa3;
             break ;
          }
       }
       if (uoa != null) {
          uoa.e(true);
       }
       e7.c(p0.name());
       BaseEditor$a uoa1 = uBaseEditor.j();
       BaseEditor$a b = (uoa1 != null)? uoa1.b: null;
       ("cover_edit").equals(j0.f(this.m.getIntent(), "SOURCE"));
       if (TextUtils.isEmpty(b)) {
          b = "unknown";
       }
       if (p1) {
          if (p0 == EditorItemFunc.FRAME || p0 == EditorItemFunc.FRAME_V2) {
             s.k("2230263", this.m.getContext(), "CLICK_ADJUST_VIDEO_SIZE");
          }else if(p0 == EditorItemFunc.REORDER){
             s.k("2395823", this.m.getContext(), "PICTURE_SORT");
          }else if(p0 == EditorItemFunc.CROP){
             s.k("2123023", this.m.getContext(), "CROP_BUTTON");
          }else if(p0 == EditorItemFunc.FINE_TUNING){
             s.k("2202312", this.m.getContext(), "ADJUST_DATAIL");
          }else if(p0 == EditorItemFunc.STYLE || p0 == EditorItemFunc.AICUT){
             s.m(this.m.getContext(), "EDIT_TEMPLATE");
          }else if(p0 == EditorItemFunc.SEGMENT && j.j(this.m.N())){
             s.m(this.m.getContext(), "CHANGE_PHOTO_BUTTON");
          }else if(this.i == Workspace$Type.LONG_VIDEO && p0 == EditorItemFunc.COVER_VIDEO){
             if (!PatchProxy.applyVoid(null, null, og1, "8")) {
                g1.w(9, "cover", "", "cover_click");
             }
          }else if(p0 == EditorItemFunc.PIC_TEMPLATE_V2){
             if (!PatchProxy.applyVoid(null, this, uEditorManag, "29")) {
                c uoc = this.m.N();
                a uoa2 = uoc.O0();
                if (uoa2 != null) {
                   Template template = uoa2.v();
                   if (template != null) {
                      i = TextUtils.x(template.getTemplateId()) ^ true;
                   label_018b :
                      iterator1 = a.c(uoc).z().iterator();
                      while (true) {
                         if (iterator1.hasNext()) {
                            if (!TextUtils.isEmpty(iterator1.next().getAtlasTemplate().getTemplateId())) {
                               i = true;
                            }
                         }
                         a = t.a;
                         boolean b1 = (this.B == EditorItemFunc.PIC_TEMPLATE_V2)? true: false;
                         Objects.requireNonNull(a);
                         t ot = t.class;
                         if (!PatchProxy.isSupport(ot) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), Boolean.valueOf(i), a, ot, "1")) {
                            ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                            uElementPack.action2 = "TEMPLATE_BUTTON";
                            i3 oi3 = i3.f();
                            oi3.c("is_bubble", Integer.valueOf(b1));
                            oi3.c("is_template", Integer.valueOf(i));
                            uElementPack.params = oi3.e();
                            u1.u(true, uElementPack, null);
                         }
                      }
                   }
                }
                i = false;
                goto label_018b ;
             }
          }else if(p0 == EditorItemFunc.EFFECT || p0 == EditorItemFunc.EFFECT_V2){
             p1 = (l.d().qe() && !a.H())? true: false;
             String str = a1.p(R.string.arg_RES_7f100d09);
             if (!PatchProxy.isSupport(og1) || !PatchProxy.applyVoidTwoRefs(str, Boolean.valueOf(p1), null, og1, "47")) {
                ClientEvent$ElementPackage uElementPack1 = new ClientEvent$ElementPackage();
                uElementPack1.action2 = "EDIT_EFFECT";
                uElementPack1.type = 1;
                try{
                   jSONObject = new JSONObject();
                   jSONObject.put("title", str);
                   jSONObject.put("is_highlight_moment_icon_show", p1);
                }catch(org.json.JSONException e12){
                   Object[] objArray = new Object[false];
                   a.D().u("EditorV3Logger", e12, objArray);
                }
                uElementPack1.params = jSONObject.toString();
                u1.u(6, uElementPack1, new ClientContent$ContentPackage());
             }
             SharedPreferences$Editor uEditor = a.a.edit();
             uEditor.putBoolean("highlight_new_indicator_has_shown", true);
             g.a(uEditor);
          }else if(uoa1 != null){
             g1.d(this.m.getContext(), uoa1.a, uoa1.b, b);
          }
       }
       uBaseEditor.M(p0);
       uBaseEditor.L(this.m);
       if (this.m.z() instanceof VideoSDKPlayerView) {
          if (!this.m.z().isPlaying()) {
             uBaseEditor.N(false);
          }else {
             uBaseEditor.N(true);
          }
       }
       this.o = uBaseEditor;
       iterator1 = this.n.iterator();
       while (iterator1.hasNext()) {
          iterator1.next().d(p0);
       }
       f.p0(this.m.u(), EditorManager$b.class).s0(new u0(p0));
       uBaseEditor.P(true);
       this.K();
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, y.class, "7")) {
          iterator1 = tr.e.d().iterator();
          while (iterator1.hasNext()) {
             iterator1.next().setVisibility(4);
          }
          tr.e.k();
       }
       tr = this.c;
       y0 oy0 = 8;
       if (tr != null) {
          uEditorManag = this.d;
          if (uEditorManag != null) {
             uEditorManag.animate().alpha(0).withEndAction(new x0(this)).start();
          }else {
             tr.setVisibility(oy0);
          }
       }
       tr = this.e;
       if (tr != null) {
          uEditorManag = this.f;
          if (uEditorManag != null) {
             uEditorManag.animate().alpha(0).withEndAction(new y0(this)).start();
          }else {
             tr.setVisibility(oy0);
          }
       }
       this.o.O(BaseEditor$EditorShowMode.SHOW_FOREGROUND);
       this.b.setAlpha(0);
       return;
    }
    public void I(){
       EditorItemFunc fILTER;
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.applyVoid(null, this, uEditorManag, "23")) {
          return;
       }
       boolean b = j.o(this.i, this.m.N().b1());
       EditorManager uEditorManag1 = (this.i == Workspace$Type.KUAISHAN && !DraftUtils.d(this.m.N()))? 1: null;
       if (!uEditorManag1) {
          uEditorManag1 = this.j;
          if (uEditorManag1 == Workspace$Source.KUAI_SHAN || (b || (uEditorManag1 != Workspace$Source.AI_CUT_STYLE && !k.a().e().booleanValue()))) {
             fILTER = EditorItemFunc.PRETTIFY;
          label_0057 :
             if (!PatchProxy.applyVoidOneRefs(fILTER, this, uEditorManag, "25")) {
                BaseEditor uBaseEditor = this.g.get(fILTER);
                if (uBaseEditor != null) {
                   uBaseEditor.M(fILTER);
                   uBaseEditor.L(this.m);
                   uBaseEditor.P(false);
                   this.o = uBaseEditor;
                   this.K();
                   this.o.O(BaseEditor$EditorShowMode.SHOW_BACKGROUND);
                   this.b.setAlpha(0);
                }
             }
             this.h(true);
             return;
          }
       }
    label_0055 :
       fILTER = EditorItemFunc.FILTER;
       goto label_0057 ;
    }
    public void J(EditorItemFunc p0){
       this.B = p0;
    }
    public final void K(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "22")) {
          return;
       }
       this.l();
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          view.setAlpha(0x3f800000);
          view.setVisibility(0);
       }
       return;
    }
    public final void L(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "14")) {
          return;
       }
       EditorManager ts = this.s;
       if (ts != null && ts.isRunning()) {
          return;
       }
       ts = this.t;
       if (ts != null && ts.isRunning()) {
          this.t.cancel();
       }
       this.l();
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       this.s = valueAnimato;
       valueAnimato.setInterpolator(new LinearInterpolator());
       this.s.setDuration(300);
       Iterator iterator = this.u.iterator();
       while (iterator.hasNext()) {
          iterator.next().setVisibility(0);
       }
       this.s.addUpdateListener(new s0(this));
       this.s.start();
       return;
    }
    public void M(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EditorManager.class, "30")) {
          return;
       }
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       y oy = y.class;
       if (!PatchProxy.applyVoid(objArray, tr, oy, "6")) {
          if (!PatchProxy.applyVoid(objArray, tr, oy, "13")) {
             Iterator iterator2 = tr.e.d().iterator();
             while (iterator2.hasNext()) {
                iterator2.next().setEnabled(0);
             }
          }
          if (!PatchProxy.applyVoid(objArray, tr, oy, "14")) {
             boolean b = true;
             tr.a.m().y(b);
             Iterator iterator1 = tr.e.d().iterator();
             while (iterator1.hasNext()) {
                View view = iterator1.next();
                if (PatchProxy.applyVoidOneRefs(view, tr, oy, "15")) {
                   continue ;
                }else if(EditAbilityConfig.disableBottomRecyclerView(i.g())){
                   view.setVisibility(4);
                   view.setEnabled(0);
                }else {
                   view.setEnabled(b);
                   if (!view.getVisibility()) {
                      continue ;
                   }else {
                      view.setVisibility(0);
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(view, "alpha", new float[2]{0,0x3f800000}).setDuration(100);
                      objectAnimat.addListener(new x(tr, view));
                      objectAnimat.start();
                   }
                }
             }
          }
          tr.e.m();
       }
       tr = this.c;
       float f = 0x3f800000;
       if (tr != null) {
          tr.setVisibility(0);
          tr = this.d;
          if (tr != null) {
             tr.animate().alpha(f).start();
          }
       }
       tr = this.e;
       if (tr != null) {
          tr.setVisibility(0);
          tr = this.f;
          if (tr != null) {
             tr.animate().alpha(f).start();
          }
       }
       try{
          List fragments = this.m.q().getChildFragmentManager().getFragments();
          if (this.o == null && this.p == null) {
             e uoe = this.m.q().getChildFragmentManager().beginTransaction();
             Iterator iterator = fragments.iterator();
             while (iterator.hasNext()) {
                Fragment uFragment = iterator.next();
                if (uFragment instanceof BaseEditorFragment) {
                   uoe.u(uFragment).m();
                }
             }
          }
       }catch(java.lang.Exception e0){
          PostUtils.D("EditorManager", "showRecyclerView", e0);
          e0.printStackTrace();
       }
       return;
    }
    public boolean N(){
       Object obj = PatchProxy.apply(null, this, EditorManager.class, "50");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return v.j(this.i, this.k);
    }
    public final void O(EditorItemFunc p0,long p1){
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.isSupport(uEditorManag) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, uEditorManag, "6")) {
          return;
       }
       this.q = true;
       k1.r(new a1(this, p0), p1);
       return;
    }
    public void P(Music p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("EditorManager", "startMusicEditor", objArray);
       this.r.e(EditorItemFunc.MUSIC_V2);
       return;
    }
    public final void Q(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "3")) {
          return;
       }
       Activity uActivity = a.b(this.v);
       if (uActivity != null && g.s(this.w, uActivity, new w0(this))) {
          this.O(EditorItemFunc.COVER_VIDEO, 0);
       }
       return;
    }
    public void R(BaseEditor p0){
       this.o = p0;
    }
    public void a(int p0){
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.isSupport(uEditorManag) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uEditorManag, "35")) {
          return;
       }
       uEditorManag = this.o;
       if (uEditorManag != null) {
          uEditorManag.J(p0);
       }
       this.g();
       return;
    }
    public void b(){
       EditorManager uEditorManag = EditorManager.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uEditorManag, "38")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uEditorManag, "42")) {
          uEditorManag = this.t;
          if (uEditorManag == null || !uEditorManag.isRunning()) {
             uEditorManag = this.s;
             if (uEditorManag != null && uEditorManag.isRunning()) {
                this.s.cancel();
             }
             this.l();
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
             this.t = valueAnimato;
             valueAnimato.setInterpolator(new LinearInterpolator());
             this.t.setDuration(300);
             this.t.addUpdateListener(new t0(this));
             this.t.addListener(new b1(this));
             this.t.start();
          }
       }
       return;
    }
    public void c(boolean p0,boolean p1){
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.isSupport(uEditorManag) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uEditorManag, "36")) {
          return;
       }
       if (p0) {
          EditorManager to = this.o;
          if (to != null && to.k() == BaseEditor$EditorShowMode.SHOW_FOREGROUND) {
             if (this.y == null) {
                this.y = new EditorManager$a(this);
             }
             to = this.x;
             if (to == null) {
                this.x = new Handler();
             }else {
                to.removeCallbacks(this.y);
             }
             if (p1) {
                this.x.postDelayed(this.y, 300);
             }else {
                this.x.post(this.y);
             }
          }else {
          label_0057 :
             this.p = this.o;
             this.o = null;
          }
       }else {
          goto label_0057 ;
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "34")) {
          return;
       }
       this.g();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "1")) {
          return;
       }
       this.b = m1.f(p0, 0x7f0a0936);
       this.c = m1.f(p0, 0x7f0a0ca0);
       this.d = m1.f(p0, 0x7f0a0ca1);
       this.e = m1.f(p0, 0x7f0a0c76);
       this.f = m1.f(p0, 0x7f0a0c77);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "37")) {
          return;
       }
       this.L();
       return;
    }
    public void f(EditorManager$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "17")) {
          return;
       }
       if (p0 != null && !this.n.contains(p0)) {
          this.n.add(p0);
       }
       return;
    }
    public final void g(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "32")) {
          return;
       }
       this.h(true);
       return;
    }
    public void h(boolean p0){
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.isSupport(uEditorManag) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uEditorManag, "33")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       if (f.E(this.i)) {
          this.m.O().play();
       }
       try{
          uEditorManag = this.o;
          if (uEditorManag != null) {
             uEditorManag.g(p0);
          }
       }catch(java.lang.Exception e4){
          PostUtils.D("EditorManager", "doFinishEditor", e4);
       }
       EditorManager tr = this.r;
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoid(null, tr, y.class, "8")) {
          tr.e.e();
       }
       return;
    }
    public boolean i(){
       EditorManager obj = PatchProxy.apply(null, this, EditorManager.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       if (obj == null || obj.p() == null) {
          return true;
       }
       return this.o.e();
    }
    public final void j(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditorManager.class, "11")) {
          return;
       }
       if (!p0.a() instanceof EditorItemFunc) {
          return;
       }
       EditorManager th = this.h;
       EditorItemFunc uEditorItemF = p0.a();
       Objects.requireNonNull(th);
       Object obj = PatchProxy.applyOneRefs(uEditorItemF, th, o.class, "4");
       if (obj != PatchProxyResult.class) {
       }else {
          obj = th.a.get(th.d(uEditorItemF));
       }
       if (obj != null) {
          BaseEditor uBaseEditor = obj.e();
          if (uBaseEditor != null) {
             uBaseEditor.e = this;
             uBaseEditor.B(this.m, p0.c());
             this.g.put(p0.a(), uBaseEditor);
             Object[] objArray = new Object[0];
             a.D().w("EditorManager", "generateEditor: "+p0.a(), objArray);
          }
       }
       return;
    }
    public EditorItemFunc k(){
       g og;
       Iterator obj = PatchProxy.apply(null, this, EditorManager.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.o == null) {
          return null;
       }
       obj = this.g.keySet().iterator();
       while (true) {
          if (!obj.hasNext()) {
             return null;
          }
          og = obj.next();
          if (this.g.get(og) == this.o && og instanceof EditorItemFunc) {
             break ;
          }
       }
       return og;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "41")) {
          return;
       }
       this.u.clear();
       EditorManager to = this.o;
       if (to != null && to.p() != null) {
          View view = this.o.p();
          if (view != null) {
             this.u.add(view);
          }
       }
       return;
    }
    public EditorDelegate m(){
       return this.m;
    }
    public BaseEditor n(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditorManager.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g.get(p0);
    }
    public BaseEditor$a o(){
       EditorManager obj = PatchProxy.apply(null, this, EditorManager.class, "56");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.o;
       if (obj != null) {
          return obj.j();
       }
       return null;
    }
    public o p(){
       return this.h;
    }
    public Map q(){
       return this.g;
    }
    public Workspace$Type r(){
       return this.i;
    }
    public boolean s(){
       EditorManager obj = PatchProxy.apply(null, this, EditorManager.class, "44");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       boolean b = (obj == null || (obj.k() == BaseEditor$EditorShowMode.SHOW_FOREGROUND || this.q != null))? true: false;
       return b;
    }
    public void t(Workspace$Type p0){
       int i;
       float f;
       Object[] objArray1;
       Object[] objArray2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       EditorManager uEditorManag = EditorManager.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uEditorManag, "2")) {
          return;
       }
       if (!f.E(p0)) {
          k ok1 = k.f();
          VideoSDKPlayerView videoSDKPlay = f.n(this.m);
          Objects.requireNonNull(ok1);
          if (!PatchProxy.applyVoidOneRefs(videoSDKPlay, ok1, ok, "10")) {
             if (ok1.a == videoSDKPlay) {
                objArray2 = new Object[0];
                a.D().w("ThumbnailHelper", "setPlayerView: already set this playerview", objArray2);
             }else {
                objArray1 = new Object[0];
                a.D().w("ThumbnailHelper", "setPlayerView: "+videoSDKPlay, objArray1);
                ok1.a = videoSDKPlay;
                if (ok1.c == null) {
                   VideoEditorSession videoEditorS = i.m().p().q();
                   n.k(videoEditorS, "EditSession should be initialized first");
                   TimeLineGenerator timeLineGene = new TimeLineGenerator(videoEditorS);
                   ok1.c = timeLineGene;
                   timeLineGene.m(0xa00a);
                   ok1.c.k = false;
                }
                ok1.c.n(ok1.a.getVideoProject(), new f0(ok1));
             }
          }
          ok1 = k.f();
          Workspace$Type vIDEO = Workspace$Type.VIDEO;
          boolean b = true;
          boolean b1 = (p0 == vIDEO || p0 == Workspace$Type.LONG_VIDEO)? true: false;
          Objects.requireNonNull(ok1);
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), ok1, ok, "12")) {
             ok1 = ok1.c;
             if (ok1 != null) {
                ok1.l = b1;
             }
          }
          ok1 = k.f();
          Object obj = PatchProxy.applyOneRefs(p0, this, uEditorManag, "57");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else if(p0 == vIDEO || p0 == Workspace$Type.LONG_VIDEO){
             b1 = true;
          }else {
             b1 = false;
          }
          a obj1 = PatchProxy.applyOneRefs(p0, this, uEditorManag, "58");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else if(p0 == vIDEO || p0 == Workspace$Type.LONG_VIDEO){
             b = false;
          }
          Objects.requireNonNull(ok1);
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b1), Boolean.valueOf(b), ok1, ok, "17")) {
             if (ok1.c == null || ok1.a == null) {
                Object[] objArray = new Object[0];
                a.D().t("ThumbnailHelper", "autoFetchThumbnail check null", objArray);
             }else {
                a.d().a();
                i = a1.d(R.dimen.arg_RES_7f070418);
                f = 0x3f800000;
                float f1 = ((float)ok1.a.getVideoWidth() * f) / (float)ok1.a.getVideoHeight();
                objArray1 = new Object[0];
                a.D().w("ThumbnailHelper", "video ratio is "+f1, objArray1);
                if (b) {
                   f1 = Math.min((f / f1), f1);
                   objArray2 = new Object[0];
                   a.D().w("ThumbnailHelper", "rotate enabled:"+f1, objArray2);
                }
                if (b1) {
                   f1 = Math.min(f1, 0x3f100000);
                   objArray2 = new Object[0];
                   a.D().w("ThumbnailHelper", "frame enabled:"+f1, objArray2);
                }
                double d = (double)(int)Math.ceil((((double)(int)((double)n.y(a.a().a()) / 7.00f) * ok1.a.getVideoLength()) / (double)(int)((float)i * f1)));
                objArray2 = new Object[0];
                a.D().w("ThumbnailHelper", "intervalThumbnailCount is "+d, objArray2);
                d = Double.parseDouble(n0.b("#.00").format((ok1.a.getVideoLength() / d)));
                TimeLineGenerator b2 = ok1.c.b;
                Objects.requireNonNull(b2);
                obj1 = a.class;
                if (!PatchProxy.isSupport(obj1) || !PatchProxy.applyVoidOneRefs(Double.valueOf(d), b2, obj1, "9")) {
                   b2.d = d;
                   Object[] objArray3 = new Object[0];
                   a.D().s("TimeLineCache", "setMinInterval: "+d, objArray3);
                }
             }
          }
       }
    label_022f :
       return;
    }
    public boolean u(){
       return this.z;
    }
    public boolean w(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       EditorManager obj = PatchProxy.apply(objArray, this, EditorManager.class, "16");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.r;
       Objects.requireNonNull(obj);
       g og = PatchProxy.apply(objArray, obj, y.class, "12");
       if (og != patchProxyRe) {
       }else {
          og = obj.e.c();
       }
       boolean b = (og != EditorItemFunc.COVER_PHOTO && og != EditorItemFunc.COVER_VIDEO)? true: false;
       return b;
    }
    public boolean x(){
       EditorManager obj = PatchProxy.apply(null, this, EditorManager.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.o;
       if (obj == null || obj.p() == null) {
          return false;
       }
       return this.o.x();
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "21")) {
          return;
       }
       Iterator iterator = new ArrayList(this.g.values()).iterator();
       while (iterator.hasNext()) {
          BaseEditor uBaseEditor = iterator.next();
          Objects.requireNonNull(uBaseEditor);
          if (PatchProxy.applyVoid(null, uBaseEditor, BaseEditor.class, "15")) {
             continue ;
          }else {
             uBaseEditor = uBaseEditor.f;
             if (uBaseEditor != null) {
                uBaseEditor.onActivityPause();
             }
          }
       }
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, EditorManager.class, "20")) {
          return;
       }
       Iterator iterator = new ArrayList(this.g.values()).iterator();
       while (iterator.hasNext()) {
          iterator.next().A();
       }
       return;
    }
}
