package com.yxcorp.gifshow.detail.ocrtext.OcrFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$a;
import nsd.u;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import f3a.j;
import f3a.l;
import y8c.t;
import f3a.i;
import androidx.fragment.app.FragmentActivity;
import java.lang.Boolean;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.ref.WeakReference;
import f3a.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import java.util.List;
import kotlin.jvm.internal.a;
import trd.t;
import java.util.Collection;
import java.lang.Number;
import e0a.j;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import android.os.Bundle;
import android.os.Parcelable;
import org.parceler.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import d0a.m;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import android.content.Context;
import m9a.m;
import ekd.c;
import ekd.i;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import android.view.ViewGroup$MarginLayoutParams;
import ekd.p1;
import com.yxcorp.gifshow.detail.ocrtext.OcrFragment$c;
import android.view.View$OnClickListener;
import i2b.a;
import android.widget.LinearLayout;
import g9c.d;
import y8c.g;
import f3a.a;
import com.smile.gifmaker.mvps.utils.observable.ObservableMap;
import qvb.i;
import f3a.h;

public final class OcrFragment extends RecyclerFragment	// class@0015ff
{
    public LinearLayout F;
    public View G;
    public OcrFragment$b H;
    public QPhoto I;
    public a J;
    public SwipeLayout K;
    public PresenterV2 L;
    public WeakReference M;
    public static final OcrFragment$a N;

    static {
       OcrFragment.N = new OcrFragment$a(null);
    }
    public void OcrFragment(){
       super();
       this.H = new OcrFragment$b();
       this.L = new PresenterV2();
    }
    public static boolean Ih(OcrFragment p0,boolean p1,int p2,Object p3){
       if (p2 & 1) {
          p1 = true;
       }
       return p0.Hh(p1);
    }
    public static final OcrFragment Jh(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, OcrFragment.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return OcrFragment.N.a(p0);
    }
    public PresenterV2 B2(){
       Object obj = PatchProxy.applyWithListener(null, this, OcrFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.L.U7(new j());
       this.L.U7(new l());
       PatchProxy.onMethodExit(OcrFragment.class, "8");
       return this.L;
    }
    public t Bh(){
       i oi = PatchProxy.apply(null, this, OcrFragment.class, "18");
       if (oi != PatchProxyResult.class) {
       }else {
          oi = new i(this);
       }
       return oi;
    }
    public final void Gh(boolean p0,FragmentActivity p1){
       OcrFragment tK;
       z touchDetecto;
       if (PatchProxy.isSupport(OcrFragment.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, OcrFragment.class, "15")) {
          return;
       }
       if (this.K == null) {
          this.K = w9.c(p1);
       }
       if (p0) {
          tK = this.K;
          if (tK != null) {
             touchDetecto = tK.getTouchDetector();
             if (touchDetecto != null) {
                touchDetecto.g(23);
             }
          }
       }else {
          tK = this.K;
          if (tK != null) {
             touchDetecto = tK.getTouchDetector();
             if (touchDetecto != null) {
                touchDetecto.a(23);
             }
          }
       }
       tK = this.K;
       if (tK != null) {
          tK.n(p0, 23);
       }
       return;
    }
    public final boolean Hh(boolean p0){
       FragmentActivity obj;
       if (PatchProxy.isSupport(OcrFragment.class)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, OcrFragment.class, "9");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       obj = this.getActivity();
       e uoe = null;
       c supportFragm = (obj != null)? obj.getSupportFragmentManager(): uoe;
       if (supportFragm != null) {
          uoe = supportFragm.beginTransaction();
       }
       if (uoe != null) {
          uoe.u(this);
       }
       if (p0) {
          if (uoe != null) {
             uoe.o();
          }
       }else if(uoe != null){
          uoe.m();
       }
       return true;
    }
    public final void Kh(BaseFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OcrFragment.class, "10")) {
          return;
       }
       this.M = new WeakReference(p0);
       GifshowActivity gifshowActiv = null;
       FragmentActivity activity = (p0 != null)? p0.getActivity(): gifshowActiv;
       c supportFragm = (activity != null)? activity.getSupportFragmentManager(): gifshowActiv;
       e uoe = (supportFragm != null)? supportFragm.beginTransaction(): gifshowActiv;
       if (uoe != null) {
          uoe.g(0x1020002, this, this.getTag());
       }
       if (!PatchProxy.applyVoidOneRefs(activity, this, OcrFragment.class, "12")) {
          if (this.J == null) {
             this.J = new b(this);
          }
          if (activity instanceof GifshowActivity) {
             gifshowActiv = activity;
          }
          if (gifshowActiv != null) {
             gifshowActiv.F2(this.J);
          }
       }
       if (uoe != null) {
          uoe.m();
       }
       this.Gh(false, activity);
       return;
    }
    public int M(){
       return 1;
    }
    public boolean S1(){
       return false;
    }
    public List fg(){
       List obj = PatchProxy.apply(null, this, OcrFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.fg();
       a.o(obj, "super.onCreateCallerContext\(\)");
       obj.addAll(t.k(this.H));
       return obj;
    }
    public int getLayoutResId(){
       Object obj = PatchProxy.apply(null, this, OcrFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       boolean b = j.b();
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("OcrFragment", "getLayoutResId enableCopyTextEnter:"+b, objArray);
       if (!b) {
          Object[] objArray1 = new Object[i];
          o.C().w("OcrFragment", "getLayoutResId disable", objArray1);
          return 0x7f0d10de;
       }else {
          b = j.s();
          Object[] objArray2 = new Object[i];
          o.C().w("OcrFragment", "getLayoutResId isCopyTextDialogStyle:"+b, objArray2);
          if (b) {
             return 0x7f0d10de;
          }
          return 0x7f0d10dd;
       }
    }
    public Object getObjectByTag(String p0){
       return null;
    }
    public Map getObjectsByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, OcrFragment.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Map objectsByTag = super.getObjectsByTag(p0);
       objectsByTag.put(OcrFragment.class, null);
       return objectsByTag;
    }
    public String o(){
       return "EXTRACTION_TEXT_PAGE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, OcrFragment.class, "16")) {
          return;
       }
       super.onCreate(p0);
       p0 = this.getArguments();
       a.m(p0);
       QPhoto qPhoto = b.a(p0.getParcelable("OCR_PHOTO_INFO"));
       this.I = qPhoto;
       this.H.b = qPhoto;
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, OcrFragment.class, "20")) {
          return;
       }
       super.onDestroy();
       RxBus.f.b(new m(2));
       return;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, OcrFragment.class, "17")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, OcrFragment.class, "13") && this.J != null) {
          FragmentActivity activity = this.getActivity();
          if (activity instanceof GifshowActivity) {
             objArray = activity;
          }
          if (objArray != null) {
             objArray.l3(this.J);
          }
       }
    label_002e :
       this.Gh(true, this.getActivity());
       OcrFragment tM = this.M;
       if (tM != null) {
          BaseFragment uBaseFragmen = tM.get();
          if (uBaseFragmen != null) {
             a.o(uBaseFragmen, "it");
             this.S2(uBaseFragmen);
             this.b2(true);
          }
       }
       super.onDestroyView();
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, OcrFragment.class, "19")) {
          return;
       }
       super.onStart();
       RxBus.f.b(new m(1));
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, OcrFragment.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       m.a(p0.getContext());
       c.c(p0, "ocr");
       p0 = p0.findViewById(R.id.ocr_close_btn_layout);
       a.o(p0, "view.findViewById\(R.id.ocr_close_btn_layout\)");
       this.G = p0;
       String str = "mCloseBtn";
       if (p0 == null) {
          a.S(str);
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, OcrFragment.class, "14") && i.c()) {
          ViewGroup$LayoutParams layoutParams = (p0 != null)? p0.getLayoutParams(): null;
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
          layoutParams.topMargin = layoutParams.topMargin + p1.f(this.getContext());
          p0.requestLayout();
       }
       OcrFragment tG = this.G;
       if (tG == null) {
          a.S(str);
       }
       tG.setOnClickListener(new OcrFragment$c(this));
       this.S2(this);
       this.b2(1);
       return;
    }
    public int qh(){
       return 0x7f0a2e97;
    }
    public void th(){
       if (PatchProxy.applyVoid(null, this, OcrFragment.class, "3")) {
          return;
       }
       super.th();
       if (this.F == null) {
          this.F = a.a(this.getContext(), 0x7f0d10df);
       }
       if (!this.ia().U0(this.F)) {
          d uod = this.ia();
          if (uod != null) {
             uod.P0(this.F);
          }
       }
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, OcrFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this.H.a());
    }
    public i yh(){
       String photoId;
       Object obj = PatchProxy.apply(null, this, OcrFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       OcrFragment tI = this.I;
       if (tI != null) {
          photoId = tI.getPhotoId();
          if (photoId != null) {
          label_001f :
             return new h(photoId);
          }
       }
       photoId = "";
       goto label_001f ;
    }
}
