package com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$j;
import mp7.c;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import java.util.List;
import java.lang.Object;
import uo7.i0;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import mhc.h2;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import nsd.u;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$f;
import com.yxcorp.gifshow.share.util.PendantBannerTool;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Integer;
import mhc.g2;
import mhc.g2$a;
import java.util.Objects;
import java.lang.Boolean;
import android.animation.Animator;
import yic.h;
import uo7.h0;
import mhc.x;
import mhc.o2;
import zsd.u;
import android.animation.AnimatorSet;
import o56.c;
import o56.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.widget.ImageView;
import mhc.o0;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import mhc.p1;
import java.util.Collection;
import com.kwai.sharelib.model.TkConfig;
import com.kwai.sharelib.ui.poster.PosterType;
import com.yxcorp.gifshow.share.widget.slide.ForwardBottomSheetDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.content.DialogInterface;
import androidx.fragment.app.KwaiDialogFragment;

public final class ForwardGridSectionFragment$j implements c	// class@001cd0
{
    public final ForwardGridSectionFragment a;
    public final List b;

    public void ForwardGridSectionFragment$j(ForwardGridSectionFragment p0,List p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(i0 p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionFragment$j.class, "8")) {
          return;
       }
       a.p(p0, "op");
       a.p(p1, "view");
       h2 oh2 = new h2(2, p1, p0.a(), 0, 0, 24, null);
       this.a.R.b(v9);
       ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
       p1 = null;
       sharePanelEl = (sharePanelEl != null)? sharePanelEl.mExtraInfo: p1;
       if (!PatchProxy.applyVoidOneRefs(sharePanelEl, p1, PendantBannerTool.class, "2") && PendantBannerTool.a(sharePanelEl)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHARE_GET_PENDANT_BANNER";
          u1.D0("2908440", null, 4, uElementPack, null, null);
       }
       return;
    }
    public void b(i0 p0,View p1,int p2,int p3){
       ForwardGridSectionFragment$j a;
       View view;
       ForwardGridSectionFragment$j oj = this;
       Object obj = p1;
       int i = p3;
       if (PatchProxy.isSupport(ForwardGridSectionFragment$j.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, ForwardGridSectionFragment$j.class, "4")) {
          return;
       }
       a.p(p0, "op");
       a.p(obj, "view");
       h2 oh2 = new h2(1, p1, p0.a(), p3, p2);
       oj.a.R.b(v11);
       a = oj.a;
       if (a.Y == null && (!ForwardGridSectionFragment.U0 && a.ci())) {
          a = oj.a;
          int i1 = 0x7f0a134d;
          view = obj.findViewById(i1);
          a.o(view, "view.findViewById\(R.id.image\)");
          ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
          String str = "IM";
          int i2 = 3;
          boolean b = (oj.b.size() < i2 || ((a.g(str, p0.a().mId) ^ 1) && (a.g(g2.X.d().b(), p0.a().mId) ^ 1)))? true: false;
          Objects.requireNonNull(a);
          if (PatchProxy.isSupport(ForwardGridSectionFragment.class)) {
             Object[] objArray = new Object[]{obj,view,sharePanelEl,Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(b)};
             if (!PatchProxy.applyVoid(objArray, a, ForwardGridSectionFragment.class, "25")) {
             label_00d6 :
                if (a.X != null) {
                   if ((a.g(sharePanelEl.mId, str) ^ 1) && b) {
                      obj.setVisibility(4);
                      a.Th().add(h.b(obj, p2, i, a.U));
                   }
                   ForwardGridSectionFragment b1 = a.T;
                   if (b1 != null) {
                      ShareInitResponse$SharePanelElement mActionUrl = sharePanelEl.mActionUrl;
                      a.o(mActionUrl, "panelElement.mActionUrl");
                      if (u.J1(b1, o2.i(new h0(mActionUrl).c()).v(), 0, 2, null) || (u.J1(a.T, "download", 0, 2, null) && (a.g(sharePanelEl.mId, "DOWNLOAD") && (!i || !u.J1(a.T, "message", 0, 2, null))))) {
                         a.Th().add(h.a(view));
                      }
                   }
                }
             }
          }else {
             goto label_00d6 ;
          }
          c uoc = a.a();
          a.o(uoc, "AppEnv.get\(\)");
          if (uoc.c()) {
             KwaiImageView kwaiImageVie = obj.findViewById(i1);
             if (kwaiImageVie != null) {
                View view1 = obj.findViewById(R.id.title);
                a.o(view1, "view.findViewById<AppCompatTextView>\(R.id.title\)");
                kwaiImageVie.setContentDescription(view1.getText());
             }
          }
       }
    label_0172 :
       return;
    }
    public void c(List p0,View p1,int p2){
       if (PatchProxy.isSupport(ForwardGridSectionFragment$j.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, ForwardGridSectionFragment$j.class, "7")) {
          return;
       }
       a.p(p0, "bundle");
       a.p(p1, "view");
       o0 oo0 = this.a.Rh();
       if (oo0 != null) {
          ArrayList uArrayList = new ArrayList(u.Y(p0, 10));
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             uArrayList.add(this.a.Ph(iterator.next()));
          }
          oo0.e(uArrayList);
       }
       return;
    }
    public void d(TkConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$j.class, "3")) {
          return;
       }
       a.p(p0, "tkConfig");
       return;
    }
    public void e(i0 p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionFragment$j.class, "9")) {
          return;
       }
       a.p(p0, "op");
       a.p(p1, "view");
       h2 oh2 = new h2(2, p1, p0.a(), 0, 0, 24, null);
       this.a.R.c(v9);
       ShareInitResponse$SharePanelElement sharePanelEl = p0.a();
       p1 = null;
       sharePanelEl = (sharePanelEl != null)? sharePanelEl.mExtraInfo: p1;
       if (!PatchProxy.applyVoidOneRefs(sharePanelEl, p1, PendantBannerTool.class, "1") && PendantBannerTool.a(sharePanelEl)) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SHARE_GET_PENDANT_BANNER";
          u1.M("2908441", null, 4, uElementPack, null, null);
       }
       return;
    }
    public void f(String p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ForwardGridSectionFragment$j.class, "5")) {
          return;
       }
       a.p(p0, "type");
       a.p(p1, "view");
       if (a.g(p0, PosterType.LONG_PIC.getValue())) {
          this.a.Jh(false);
       }
       return;
    }
    public void g(i0 p0,View p1,int p2,int p3){
       if (PatchProxy.isSupport(ForwardGridSectionFragment$j.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), this, ForwardGridSectionFragment$j.class, "2")) {
          return;
       }
       a.p(p0, "op");
       a.p(p1, "view");
       h2 oh2 = new h2(1, p1, p0.a(), p3, p2);
       this.a.R.c(v7);
       return;
    }
    public void h(TkConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ForwardGridSectionFragment$j.class, "6")) {
          return;
       }
       a.p(p0, "tkConfig");
       return;
    }
    public void onCancel(){
       if (PatchProxy.applyVoid(null, this, ForwardGridSectionFragment$j.class, "1")) {
          return;
       }
       ForwardGridSectionFragment$j ta = this.a;
       Dialog dialog = ta.getDialog();
       a.m(dialog);
       ta.onCancel(dialog);
       return;
    }
}
