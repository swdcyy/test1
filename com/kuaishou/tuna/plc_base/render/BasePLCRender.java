package com.kuaishou.tuna.plc_base.render.BasePLCRender;
import u06.e;
import com.kuaishou.tuna.plc_base.render.BasePLCRender$a;
import nsd.u;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import y06.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo;
import android.app.Activity;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import f4a.i;
import u06.b;
import f4a.b0;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dz4.c;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StyleInfo;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$StrongStyleInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import com.yxcorp.gifshow.detail.plc.adapter.PlcEntryDataAdapter;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.detail.plc.utils.TunaPlcLogger;
import u06.e$a;
import android.view.View$OnClickListener;
import java.lang.Boolean;
import e4a.a;
import java.lang.Throwable;
import com.yxcorp.gifshow.detail.plc.error.exception.BasePlcException;
import com.yxcorp.gifshow.detail.plc.error.exception.PlcExceptionHandler;
import java.util.Objects;
import java.lang.StringBuilder;
import com.kuaishou.tuna.plc_base.render.BasePLCRender$onCreateView$2;
import q4a.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.yxcorp.utility.n;
import zy4.a;
import android.view.ViewTreeObserver;
import bz4.a;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;

public abstract class BasePLCRender implements e	// class@00107f
{
    public final PlcEntryStyleInfo$PageType a;
    public Activity b;
    public Fragment c;
    public i d;
    public b e;
    public b0 f;
    public PlcEntryDataAdapter g;
    public View h;
    public boolean i;
    public final PlcEntryStyleInfo$PageType j;
    public final a k;
    public static final BasePLCRender$a l;

    static {
       BasePLCRender.l = new BasePLCRender$a(null);
    }
    public void BasePLCRender(PlcEntryStyleInfo$PageType p0,a p1){
       PlcEntryStyleInfo plcEntryStyl;
       a.p(p0, "pageType");
       a.p(p1, "plcContextHolder");
       super();
       this.j = p0;
       this.k = p1;
       QPhoto photo = p1.getPhoto();
       if (photo != null) {
          plcEntryStyl = photo.getPlcEntryStyleInfo();
          if (plcEntryStyl != null) {
             plcEntryStyl.setPageType(p0.getPageType());
          }
       }
       plcEntryStyl = p1.e();
       if (plcEntryStyl != null) {
          plcEntryStyl.setPageType(p0.getPageType());
       }
       this.a = p0;
       this.b = p1.getActivity();
       this.c = p1.b();
       this.d = p1.k();
       this.e = p1.j();
       this.f = p1.d();
       return;
    }
    public final PlcEntryStyleInfo$PageType A(){
       return this.j;
    }
    public final a B(){
       return this.k;
    }
    public final boolean C(){
       boolean b = (this.a == PlcEntryStyleInfo$PageType.COUPLE)? true: false;
       return b;
    }
    public final boolean D(){
       boolean b = (this.a == PlcEntryStyleInfo$PageType.ATTENTION_LIST)? true: false;
       return b;
    }
    public final boolean E(){
       boolean b = (this.a == PlcEntryStyleInfo$PageType.LONG_VIDEO_DETAIL)? true: false;
       return b;
    }
    public boolean F(){
       return false;
    }
    public final boolean G(){
       boolean b = (this.a == PlcEntryStyleInfo$PageType.SINGLE)? true: false;
       return b;
    }
    public final boolean H(){
       boolean b = (this.a == PlcEntryStyleInfo$PageType.SINGLE_LANDSCAPE)? true: false;
       return b;
    }
    public boolean I(){
       return false;
    }
    public boolean J(){
       return false;
    }
    public final void K(View p0,PlcEntryStyleInfo$PageType p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, BasePLCRender.class, "5")) {
          return;
       }
       if (this.G() && !this.I()) {
          int i = c.e();
          PlcEntryStyleInfo plcEntryStyl = this.k.e();
          int i1 = 1;
          if (plcEntryStyl != null) {
             plcEntryStyl = plcEntryStyl.mStyleInfo;
             if (plcEntryStyl != null) {
                PlcEntryStyleInfo$StyleInfo mStrongStyle = plcEntryStyl.mStrongStyleTemplateInfo;
                if (mStrongStyle != null && (mStrongStyle.isSecondaryStrongStyle() == i1 && (p0 instanceof ConstraintLayout && p0.getMinWidth() > i))) {
                label_0041 :
                   if (i1) {
                      ConstraintLayout uConstraintL = p0;
                      uConstraintL.setMinWidth(i);
                      ViewGroup$LayoutParams layoutParams = uConstraintL.getLayoutParams();
                      if (layoutParams != null) {
                         layoutParams.width = i;
                      }
                   }
                   p0.requestLayout();
                }
             }
          }
          i1 = 0;
          goto label_0041 ;
       }
       return;
    }
    public abstract void L(PlcEntryDataAdapter p0);
    public abstract void M(PlcEntryDataAdapter p0);
    public abstract void N(View p0);
    public abstract void O(String p0);
    public final View a(){
       return this.h;
    }
    public int b(){
       int i;
       Object obj = PatchProxy.apply(null, this, BasePLCRender.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.G() || this.H()) {
          i = this.u();
       }else if(this.C()){
          i = this.r();
       }else if(this.D()){
          i = this.s();
       }else if(this.E()){
          i = this.t();
       }else {
          TunaPlcLogger.a("PLCRender", "getLayoutId Exception");
          i = 0;
       }
       return i;
    }
    public void c(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "16")) {
          return;
       }
       a.p(p0, "text");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, e$a.class, "3")) {
          a.p(p0, "text");
       }
       return;
    }
    public void d(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "15")) {
          return;
       }
       a.p(p0, "listener");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, e$a.class, "2")) {
          a.p(p0, "listener");
       }
       return;
    }
    public final void e(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "7")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       this.g = p0;
       this.M(p0);
       return;
    }
    public final View f(ViewGroup p0,boolean p1){
       String str;
       String str1;
       String str2;
       QPhoto photo;
       PlcEntryStyleInfo plcEntryStyl;
       BasePLCRender$onCreateView$2 iNSTANCE;
       int i1;
       Object[] objArray;
       Object obj1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(BasePLCRender.class)) {
          BasePLCRender obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, BasePLCRender.class, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       View view = this.p(p0, p1);
       int i = 4;
       if (view != null) {
          try{
             this.h = view;
             this.K(view, this.j);
          }catch(java.lang.Exception e2){
             a uoa = new a();
             uoa.b(i);
             PlcExceptionHandler.a(uoa.c("plc change max width crash!").d(e2).a(), "PLCRender");
          }
       }
    }
    public void g(int p0){
       if (PatchProxy.isSupport(BasePLCRender.class)) {
          PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BasePLCRender.class, "13");
       }
       return;
    }
    public int getViewStyle(){
       return 0;
    }
    public final void h(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "6")) {
          return;
       }
       a.p(p0, "rootView");
       this.N(p0);
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, BasePLCRender.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "9")) {
          return;
       }
       p0 = TextUtils.k(p0);
       a.o(p0, "TextUtils.emptyIfNull\(text\)");
       this.O(p0);
       return;
    }
    public void l(String p0){
       PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "17");
    }
    public int m(){
       Object obj = PatchProxy.apply(null, this, BasePLCRender.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 0;
    }
    public final void n(PlcEntryDataAdapter p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "8")) {
          return;
       }
       a.p(p0, "plcEntryDataAdapter");
       this.L(p0);
       return;
    }
    public PlcEntryDataAdapter o(){
       return this.g;
    }
    public void onAttach(){
    }
    public void onDetach(){
    }
    public void onRelease(){
       this.g = null;
    }
    public abstract View p(ViewGroup p0,boolean p1);
    public abstract String q();
    public int r(){
       return 0;
    }
    public int s(){
       return 0;
    }
    public void setOnClickListener(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BasePLCRender.class, "14")) {
          return;
       }
       a.p(p0, "listener");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, e$a.class, "1")) {
          a.p(p0, "listener");
       }
       return;
    }
    public int t(){
       return 0;
    }
    public int u(){
       return 0;
    }
    public final b v(){
       return this.e;
    }
    public final Activity w(){
       return this.b;
    }
    public final i x(){
       return this.d;
    }
    public final PlcEntryDataAdapter y(){
       return this.g;
    }
    public final b0 z(){
       return this.f;
    }
}
