package com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewFragment;
import s90.b$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$a;
import com.kuaishou.gifshow.kuaishan.ui.preview.BaseTemplatePreviewFragment;
import com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutPostPreviewFragment$a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import u79.a;
import java.util.Collection;
import e17.i;
import android.widget.FrameLayout;
import android.view.View;
import com.kuaishou.gifshow.kuaishan.ui.preview.aicut_preview.AICutSchemeParams;
import s90.b;
import com.kuaishou.gifshow.kuaishan.ui.preview.c;
import com.kuaishou.gifshow.kuaishan.ui.preview.b;
import u79.o;
import r90.c0;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.player.KsAudioPlayer;
import s90.a;
import com.yxcorp.gifshow.player.KsAudioPlayer$c;
import w46.b;
import com.kuaishou.android.model.music.MusicType;
import java.util.Objects;
import java.lang.Integer;
import z80.a;
import wkd.b;
import rfc.a;
import brd.t;
import s90.d;
import erd.o;
import t45.d;
import brd.z;
import s90.e;
import s90.f;
import s90.g;
import erd.g;
import crd.b;
import crd.a;
import java.lang.Long;
import i90.a;
import i90.b;
import cjd.e;
import s90.h;
import s90.i;
import s90.j;
import java.util.Map;
import com.kwai.robust.PatchProxyResult;
import androidx.viewpager.widget.ViewPager$i;
import lnc.a1;
import java.lang.CharSequence;
import com.kuaishou.gifshow.kuaishan.ui.preview.c$b;
import com.kuaishou.gifshow.kuaishan.model.UITemplatePreviewItem;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo$UnSupportReason;
import k2b.e0;
import t90.j;
import zsd.u;
import android.net.Uri;
import xkd.b;
import android.content.Intent;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import java.util.ArrayList;
import com.trello.rxlifecycle3.components.support.RxFragment;
import android.widget.TextView;
import k36.c;
import h36.b;
import k36.f;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;

public final class AICutPostPreviewFragment extends BaseTemplatePreviewFragment implements b$a, c$a	// class@001ae4
{
    public final String E;
    public final String F;
    public AICutSchemeParams G;
    public KsAudioPlayer H;
    public Integer I;
    public final ViewPager$i J;

    public void AICutPostPreviewFragment(){
       super();
       this.E = "AICutPostPreviewFragment";
       this.F = "themeId=";
       this.J = new AICutPostPreviewFragment$a(this);
    }
    public void J7(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutPostPreviewFragment.class, "9")) {
          return;
       }
       e uoe = e.D();
       AICutPostPreviewFragment tE = this.E;
       StringBuilder str = "onPreviewAICutStyleListFetched invoked with styleList size = ";
       int i = (p0 != null)? p0.size(): 0;
       Object[] objArray = new Object[0];
       uoe.w(tE, str+i, objArray);
       BaseTemplatePreviewFragment tw = this.w;
       String str1 = "mAdapter";
       a.o(tw, str1);
       if (tw.j() > 0) {
          Object[] objArray1 = new Object[0];
          e.D().A(this.E, "onPreviewAICutStyleListFetched: list data already exist, ignore", objArray1);
          return;
       }else {
          int i1 = 1;
          BaseTemplatePreviewFragment uBaseTemplat = (p0 == null || p0.isEmpty())? 1: null;
          if (uBaseTemplat) {
             i.a(R.style.arg_RES_7f11066a, 0x7f101bbb);
             this.L();
             return;
          }else {
             uBaseTemplat = this.r;
             a.o(uBaseTemplat, "mEmptyView");
             uBaseTemplat.setVisibility(8);
             uBaseTemplat = this.s;
             a.o(uBaseTemplat, "mMainInfoView");
             uBaseTemplat.setVisibility(0);
             this.dh();
             this.w.z();
             this.I = null;
             AICutPostPreviewFragment tG = this.G;
             if (tG != null && tG.getDisableScroll() == i1) {
                this.w.J(b.c.b(p0.subList(0, i1)));
             }else {
                this.w.J(b.c.b(p0));
             }
             this.w.q();
             uBaseTemplat = this.v;
             if (uBaseTemplat != null) {
                uBaseTemplat.a(0);
                BaseTemplatePreviewFragment tw1 = this.w;
                a.o(tw1, str1);
                uBaseTemplat.b(tw1.j());
             }
             uBaseTemplat = this.w;
             a.o(uBaseTemplat, str1);
             o oo = uBaseTemplat.C();
             if (oo != null) {
                View view = oo.getView();
                if (view != null) {
                   view = view.findViewById(R.id.template_collection_icon);
                   if (view != null) {
                      this.o = view;
                      this.hh();
                      BaseTemplatePreviewFragment tk = this.k;
                      if (tk != null) {
                         tk.R8(0);
                      }
                      if (p0.isEmpty() ^ i1) {
                         AICutPostPreviewFragment tG1 = this.G;
                         if (tG1 != null && !tG1.getDisableScroll()) {
                            BaseTemplatePreviewFragment tk1 = this.k;
                            if (tk1 != null) {
                               tk1.V8();
                            }
                         }
                      }
                      this.nh(i1);
                      this.sh();
                   }
                }
             }
             return;
          }
       }
    }
    public void L(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "5")) {
          return;
       }
       if (this.getActivity() != null) {
          FragmentActivity activity = this.getActivity();
          a.m(activity);
          a.o(activity, "activity!!");
          if (!activity.isFinishing()) {
             activity = this.getActivity();
             a.m(activity);
             activity.finish();
          }
       }
       return;
    }
    public void N3(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "16")) {
          return;
       }
       AICutPostPreviewFragment tH = this.H;
       if (tH != null) {
          tH.v();
       }
       return;
    }
    public void Q4(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutPostPreviewFragment.class, "11")) {
          return;
       }
       a.p(p0, "path");
       Object[] objArray = new Object[0];
       e.D().w(this.E, "onPreviewAICutMusicReady invoked with path = "+p0, objArray);
       if (!PatchProxy.applyVoidOneRefs(p0, this, AICutPostPreviewFragment.class, "14")) {
          this.rh();
          KsAudioPlayer ksAudioPlaye = new KsAudioPlayer(p0, 0, Integer.MAX_VALUE, 0x3f800000);
          this.H = ksAudioPlaye;
          ksAudioPlaye.r(a.a);
       }
       this.th();
       this.oh();
       return;
    }
    public void U3(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "18")) {
          return;
       }
       this.ph();
       return;
    }
    public void Vd(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "17")) {
          return;
       }
       AICutPostPreviewFragment tH = this.H;
       if (tH != null) {
          tH.p();
       }
       tH = this.H;
       if (tH != null) {
          tH.v();
       }
       return;
    }
    public void Y9(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().t(this.E, "onPreviewAICutMusicError invoked", objArray);
       this.th();
       this.rh();
       return;
    }
    public void ag(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "10")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.D().t(this.E, "onPreviewAICutStyleListError invoked", objArray);
       BaseTemplatePreviewFragment tw = this.w;
       a.o(tw, "mAdapter");
       if (!tw.j()) {
          tw = this.s;
          a.o(tw, "mMainInfoView");
          tw.setVisibility(0);
          this.mh();
       }
       return;
    }
    public void eh(){
       b c;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutPostPreviewFragment.class, "6")) {
          return;
       }
       AICutPostPreviewFragment tG = this.G;
       if (tG != null) {
          long styleId = tG.getStyleId();
          BaseTemplatePreviewFragment tr = this.r;
          a.o(tr, "mEmptyView");
          tr.setVisibility(4);
          tG = this.G;
          String musicId = (tG != null)? tG.getMusicId(): objArray;
          if (musicId != null) {
             tG = this.G;
             MusicType musicType = (tG != null)? tG.getMusicType(): objArray;
             if (musicType != null) {
                c = b.c;
                AICutPostPreviewFragment tG1 = this.G;
                String musicId1 = (tG1 != null)? tG1.getMusicId(): objArray;
                a.m(musicId1);
                AICutPostPreviewFragment tG2 = this.G;
                if (tG2 != null) {
                   objArray = tG2.getMusicType();
                }
                a.m(objArray);
                int value = objArray.getValue();
                Objects.requireNonNull(c);
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(musicId1, Integer.valueOf(value), c, uob, "4")) {
                   a.p(musicId1, "musicId");
                   Object[] objArray1 = new Object[0];
                   a.D().w("AICutPreviewDataManager", "fetchMusic with id = "+musicId1+", type = "+value, objArray1);
                   b.b.c(b.a(0x4a533fa).h(musicId1, value).map(d.b).observeOn(d.c).flatMap(e.b).observeOn(d.a).subscribe(new f(musicId1, value), new g(musicId1, value)));
                }
             }else {
             label_00d0 :
                this.w.K();
             }
          }else {
             goto label_00d0 ;
          }
          c = b.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(styleId), c, uob, "3")) {
             objArray = new Object[0];
             e.D().w("AICutPreviewDataManager", "fetchPreviewAICutStyle invoked with styleId = "+styleId, objArray);
             b.b.c(b.a().h(styleId).map(new e()).observeOn(d.a).map(h.b).subscribe(i.b, j.b));
          }
       }
       return;
    }
    public void fh(){
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AICutPostPreviewFragment.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(AICutPostPreviewFragment.class, null);
       return objectsByTag;
    }
    public ViewPager$i gh(){
       return this.J;
    }
    public void ih(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "8")) {
          return;
       }
       AICutPostPreviewFragment tG = this.G;
       if (tG != null && tG.getDisableScroll() == true) {
          return;
       }
       i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f101bd7));
       return;
    }
    public void jh(){
       Object[] objArray1;
       String this;
       Object obj = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, obj, AICutPostPreviewFragment.class, "7")) {
          return;
       }
       BaseTemplatePreviewFragment w = obj.w;
       StringBuilder str = "mAdapter";
       a.o(w, str);
       o oo = w.C();
       if (!oo instanceof c$b) {
          oo = objArray;
       }
       UITemplatePreviewItem uITemplatePr = (oo != null)? oo.A(): objArray;
       int i = 0;
       if (uITemplatePr == null) {
          objArray1 = new Object[i];
          e.D().t(obj.E, "Invalid selected item", objArray1);
          return;
       }else {
          UITemplatePreviewItem mUnSupportRe = uITemplatePr.mUnSupportReason;
          if (mUnSupportRe != null) {
             a.m(mUnSupportRe);
             a.o(mUnSupportRe, "info.mUnSupportReason!!");
             str = mUnSupportRe.getReasonContent();
             a.o(str, "info.mUnSupportReason!!.reasonContent");
             objArray1 = new Object[i];
             e.D().t(obj.E, "This template is no longer available due to: "+str, objArray1);
             i.d(R.style.arg_RES_7f11066a, str);
             return;
          }else {
             AICutPostPreviewFragment g = obj.G;
             if (g != null) {
                String schemeUri = g.getSchemeUri();
                if (schemeUri != null) {
                   mUnSupportRe = uITemplatePr.mTemplateId;
                   UITemplatePreviewItem mName = uITemplatePr.mName;
                   UITemplatePreviewItem mGroupId = uITemplatePr.mGroupId;
                   UITemplatePreviewItem mGroupName = uITemplatePr.mGroupName;
                   BaseTemplatePreviewFragment w1 = obj.w;
                   a.o(w1, str);
                   o oo1 = w1.C();
                   int i1 = (oo1 != null)? oo1.getIndex(): 0;
                   j.b(this, mUnSupportRe, mName, mGroupId, mGroupName, i1, null);
                   this = u.g2(schemeUri, "aicutv2", "aicut", false, 4, null);
                   str = obj.F;
                   g = obj.G;
                   if (g != null) {
                      objArray = Long.valueOf(g.getStyleId());
                   }
                   obj.startActivity(new Intent("android.intent.action.VIEW", b.g(u.g2(this, str+String.valueOf(objArray), obj.F+uITemplatePr.mTemplateId, false, 4, null))));
                }
             }
             return;
          }
       }
    }
    public final void oh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutPostPreviewFragment.class, "21")) {
          return;
       }
       BaseTemplatePreviewFragment tw = this.w;
       String str = "mAdapter";
       a.o(tw, str);
       o oo = tw.C();
       if (oo == null || oo.isPrepared() != true) {
          tw = this.w;
          a.o(tw, str);
          oo = tw.C();
          if (oo != null && oo.isPlaying() == true) {
          label_0031 :
             AICutPostPreviewFragment tH = this.H;
             if (tH != null) {
                tH.v();
             }
          }
       }else {
          goto label_0031 ;
       }
       tw = this.w;
       a.o(tw, str);
       oo = tw.C();
       if (oo instanceof c$b) {
          objArray = oo;
       }
       if (objArray != null) {
          objArray.E(this);
       }
       return;
    }
    public void onCreate(Bundle p0){
       ArrayList a;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutPostPreviewFragment.class, str)) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       AICutSchemeParams uAICutScheme = null;
       Serializable serializable = (p0 != null)? SerializableHook.getSerializable(p0, "KEY_AICUT_SCHEME_PARAMS"): uAICutScheme;
       if (serializable instanceof AICutSchemeParams) {
          uAICutScheme = serializable;
       }
       this.G = uAICutScheme;
       if (uAICutScheme == null) {
          Object[] objArray = new Object[0];
          e.D().t(this.E, "invalid scheme params, close page", objArray);
          this.L();
          return;
       }else {
          b c = b.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(this, c, b.class, str)) {
             a.p(this, "listener");
             a = b.a;
             if (!a.contains(this)) {
                a.add(this);
             }
          }
          return;
       }
    }
    public void onDestroy(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutPostPreviewFragment.class, "4")) {
          return;
       }
       super.onDestroy();
       this.rh();
       b c = b.c;
       Objects.requireNonNull(c);
       if (!PatchProxy.applyVoid(objArray, c, b.class, "7")) {
          objArray = new Object[0];
          e.D().w("AICutPreviewDataManager", "clear invoked", objArray);
          b.a.clear();
          b.b.dispose();
          b.b = new a();
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "3")) {
          return;
       }
       super.onStop();
       this.ph();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AICutPostPreviewFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       BaseTemplatePreviewFragment tp = this.p;
       a.o(tp, "mMoreTemplateBtn");
       tp.setVisibility(8);
       this.lh();
       return;
    }
    public void pb(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "19")) {
          return;
       }
       this.ph();
       return;
    }
    public final void ph(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "22")) {
          return;
       }
       AICutPostPreviewFragment tH = this.H;
       if (tH != null && tH.k() == true) {
          tH = this.H;
          if (tH != null) {
             tH.l();
          }
       }
       return;
    }
    public final void qh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutPostPreviewFragment.class, "23")) {
          return;
       }
       BaseTemplatePreviewFragment tw = this.w;
       String str = "mAdapter";
       a.o(tw, str);
       int currentIndex = tw.getCurrentIndex();
       AICutPostPreviewFragment tI = this.I;
       if (tI != null && currentIndex == tI.intValue()) {
          return;
       }
       tw = this.w;
       a.o(tw, str);
       this.I = Integer.valueOf(tw.getCurrentIndex());
       tw = this.w;
       a.o(tw, str);
       o oo = tw.C();
       if (!oo instanceof c$b) {
          oo = objArray;
       }
       UITemplatePreviewItem uITemplatePr = (oo != null)? oo.A(): objArray;
       c uoc = c.d();
       UITemplatePreviewItem mGroupId = (uITemplatePr != null)? uITemplatePr.mGroupId: objArray;
       UITemplatePreviewItem mTemplateId = (uITemplatePr != null)? uITemplatePr.mTemplateId: objArray;
       if (uITemplatePr != null) {
          objArray = uITemplatePr.mName;
       }
       uoc.g(new b(mGroupId, mTemplateId, objArray));
       return;
    }
    public final void rh(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "15")) {
          return;
       }
       AICutPostPreviewFragment tH = this.H;
       if (tH != null) {
          tH.n();
       }
       this.H = null;
       return;
    }
    public final void sh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AICutPostPreviewFragment.class, "20")) {
          return;
       }
       BaseTemplatePreviewFragment tw = this.w;
       a.o(tw, "mAdapter");
       o oo = tw.C();
       if (oo instanceof c$b) {
          objArray = oo;
       }
       if (objArray != null) {
          this.w.I(objArray.getIndex());
          objArray.E(this);
          objArray.G();
          this.qh();
       }
       return;
    }
    public final void th(){
       if (PatchProxy.applyVoid(null, this, AICutPostPreviewFragment.class, "13")) {
          return;
       }
       this.w.K();
       this.sh();
       return;
    }
}
