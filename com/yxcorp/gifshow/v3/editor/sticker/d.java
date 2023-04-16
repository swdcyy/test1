package com.yxcorp.gifshow.v3.editor.sticker.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adv.model.f;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.List;
import com.kwai.video.minecraft.model.EditorSdk2V2$AnimatedSubAsset;
import aw9.z;
import wba.b;
import java.lang.Number;
import java.util.Collection;
import ekd.q;
import ekd.j;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import android.app.Activity;
import itc.k3;
import brd.t;
import com.kuaishou.edit.draft.Sticker;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.google.protobuf.GeneratedMessageLite;
import com.kuaishou.edit.draft.Sticker$b;
import com.yxcorp.gifshow.fragment.AttrAnimProgressFragment;
import androidx.fragment.app.DialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.DraftFileManager;
import com.kuaishou.edit.draft.StickerResult;
import java.io.File;
import qkd.b;
import w46.b;
import itc.j3;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import itc.i3;
import eba.a;
import erd.o;
import itc.h3;
import nsc.d;
import erd.a;
import brd.w;
import com.yxcorp.gifshow.v3.editor.sticker.b;
import com.yxcorp.gifshow.v3.editor.sticker.a;
import itc.e;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.v3.editor.sticker.c;
import erd.r;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import io.reactivex.subjects.PublishSubject;
import mrd.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import im8.f;

public abstract class d extends PresenterV2	// class@001220
{
    public EditorDelegate p;
    public f q;
    public i r;
    public a s;
    public c t;
    public PublishSubject u;
    public c v;
    public z w;
    public EditDecorationContainerView x;
    public f y;
    public Boolean z;

    public void d(){
       super();
       this.z = Boolean.FALSE;
    }
    public void E8(){
       boolean b;
       int i1;
       int i3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uod, "2")) {
          return;
       }
       this.y = this.r.i();
       if (!this.s.D()) {
          this.s.c0();
       }
       Object[] obj = PatchProxy.apply(objArray, this, uod, "3");
       String str = "BaseStickerDraftPresenter";
       Object[] objArray1 = 1;
       int i = 0;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else {
          List list1 = this.s.z();
          EditorSdk2V2$AnimatedSubAsset[] uAnimatedSub = this.w.i();
          Object[] obj1 = PatchProxy.applyOneRefs(uAnimatedSub, objArray, b.class, "25");
          if (obj1 != patchProxyRe) {
             i3 = obj1.intValue();
          }else {
             i3 = uAnimatedSub.length;
             int i4 = 0;
             int i5 = 0;
             while (i5 < i3) {
                String str1 = uAnimatedSub[i5].opaque();
                if (!b.t(str1) && (b.u(str1) || b.q(str1))) {
                   i4 = i4 + 1;
                }
                i5 = i5 + 1;
             }
             i3 = i4;
          }
          if (q.f(list1) || (!this.y.d.isEmpty() && this.y.d.size() == i3)) {
             obj1 = new Object[i];
             a.D().w(str, "isNeedRestore no draft or Timeline data exists, StickerAnimatedSubAssetsSize is "+i3+", mStickerRangeDataList size is "+this.y.d.size(), obj1);
          }else if(j.h(uAnimatedSub)){
             i1.c(new RuntimeException("isNeedRestore animatedSubAssets is empty"));
          }else if(this.y.d.size() != i3){
             this.z = Boolean.TRUE;
          }
          b = true;
          b = false;
       }
       if (b) {
          Object[] objArray2 = new Object[i];
          a.D().w(str, "restore need restore", objArray2);
          uod = this.s;
          Activity activity = this.getActivity();
          t ot = PatchProxy.applyTwoRefs(uod, activity, objArray, k3.class, "48");
          if (ot != patchProxyRe) {
          }else {
             objArray2 = new Object[i];
             a.D().w("StickerUtils", "preRestore heshixi build pre reatore observable", objArray2);
             objArray2 = new Object[i];
             a.D().w("StickerUtils", "", objArray2);
             List list = uod.z();
             i1 = 0;
             while (true) {
                if (i1 < list.size()) {
                   if (k3.z(list.get(i1).toBuilder())) {
                   label_013b :
                      if (objArray1) {
                         objArray1 = new Object[i];
                         a.D().w("StickerUtils", "preRestore need pre restore", objArray1);
                         AttrAnimProgressFragment uAttrAnimPro = new AttrAnimProgressFragment();
                         uAttrAnimPro.setCancelable(i);
                         uAttrAnimPro.show(activity.getSupportFragmentManager(), "StickerUtils");
                         ArrayList uArrayList = new ArrayList();
                         int i2 = 0;
                         while (i2 < uod.p()) {
                            Sticker$b uob = uod.n(i2);
                            if (k3.z(uob)) {
                               File uFile = DraftFileManager.E().B(uob.getResult().getPreviewImageFile(), uod);
                               if (!b.S(uFile)) {
                                  Object[] objArray3 = new Object[i];
                                  a.D().t("StickerUtils", "restore sticker file invalid stickerFile:"+uFile, objArray3);
                                  uArrayList.add(objArray);
                               }else {
                                  uArrayList.add(uFile);
                               }
                            }else {
                               uArrayList.add(objArray);
                            }
                            i2 = i2 + 1;
                         }
                         objArray1 = new Object[i];
                         a.D().w("StickerUtils", "preRestore sticker file list build", objArray1);
                         ot = t.fromCallable(new j3(uArrayList)).subscribeOn(d.c).observeOn(d.a).map(new i3(uod)).map(new h3(uod)).doAfterTerminate(new d(uAttrAnimPro));
                      }else {
                         obj = new Object[i];
                         a.D().w("StickerUtils", "preRestore do not need pre restore", obj);
                         ot = t.just(new Object());
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   objArray1 = null;
                   goto label_013b ;
                }
             }
          }
          this.X7(ot.concatWith(this.v).subscribe(b.b, a.b, new e(this)));
       }
       return;
    }
    public void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("BaseStickerDraftPresenter", "restore start restore", objArray);
       if (this.z.booleanValue()) {
          this.y.d.clear();
          this.z = Boolean.FALSE;
       }
       uod = this.x;
       uod.v0(uod.o0(c.b));
       k3.E(false, this.w, this.x, this.r, this.t, this.y);
       this.w.e();
       this.u.onNext(new Object());
       if (p0) {
          this.r.d();
       }
       this.x.e0();
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.r = this.r8("EDITOR_HELPER_CONTRACT");
       this.s = this.r8("STICKER");
       this.t = this.r8("WORKSPACE");
       this.u = this.r8("DECORATION_TIMELINE_UPDATE");
       this.v = this.r8("PUSH_PANEL_ANIMATION_END_PUBLISHER");
       this.w = this.r8("DECORATION_PLAYER");
       this.x = this.r8("DECORATION_CONTAINER_VIEW");
       this.p = this.r8("EDITOR_DELEGATE");
       this.q = this.x8("CURRENT_PROGRESS");
       return;
    }
}
