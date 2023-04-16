package com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.BaseEditPreviewFragmentViewBinder;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder$a;
import nsd.u;
import c35.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.FlexScreenStatusData;
import com.yxcorp.gifshow.v3.customizer.preview.EditorPreviewContainerLayout;
import toc.d;
import toc.e;
import com.kwai.gifshow.post.api.core.camerasdk.model.Size;
import android.graphics.RectF;
import lwc.h;
import java.util.List;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import java.lang.Float;
import java.util.Collection;
import com.kuaishou.edit.draft.Asset$ShootInfo$Resolution;
import com.yxcorp.gifshow.v3.customizer.preview.BaseEditorPreviewContainerLayout;
import androidx.lifecycle.MutableLiveData;
import nwc.m;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import roc.e;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.widget.PicturesContainer;
import com.yxcorp.gifshow.widget.PassThroughEventView;
import com.yxcorp.gifshow.v3.customizer.viewbinder.AbsPhotoFragmentV3ViewBinder$c;
import java.util.Objects;
import t36.f;

public abstract class AbsPhotoFragmentV3ViewBinder extends BaseEditPreviewFragmentViewBinder	// class@000d5d
{
    public e p;
    public d q;
    public EditorPreviewContainerLayout r;
    public PicturesContainer s;
    public PassThroughEventView t;
    public View u;
    public View v;
    public static final AbsPhotoFragmentV3ViewBinder$a w;

    static {
       AbsPhotoFragmentV3ViewBinder.w = new AbsPhotoFragmentV3ViewBinder$a(null);
    }
    public void AbsPhotoFragmentV3ViewBinder(c p0){
       a.p(p0, "viewHost");
       super(p0);
       this.q = new AbsPhotoFragmentV3ViewBinder$b(this);
    }
    public void R(){
       if (PatchProxy.applyVoid(null, this, AbsPhotoFragmentV3ViewBinder.class, "11")) {
          return;
       }
       FlexScreenStatusData uFlexScreenS = this.B();
       AbsPhotoFragmentV3ViewBinder tr = this.r;
       String str = "previewContainer";
       if (tr == null) {
          a.S(str);
       }
       tr.setMFlexScreenStatusData(uFlexScreenS);
       tr = this.r;
       if (tr == null) {
          a.S(str);
       }
       tr.c(this.d0().a(uFlexScreenS), null);
       return;
    }
    public void S(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, AbsPhotoFragmentV3ViewBinder.class, "12")) {
          return;
       }
       FlexScreenStatusData uFlexScreenS = this.B();
       d uod = this.d0();
       AbsPhotoFragmentV3ViewBinder tr = this.r;
       if (tr == null) {
          a.S("previewContainer");
       }
       RectF limitRect = tr.getLimitRect();
       List list = this.D().w0();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Size size = iterator.next();
          float f = (float)size.b * 0x3f800000;
          f = f / (float)size.c;
          uArrayList.add(Float.valueOf(f));
       }
       RectF rectF = uod.b(uFlexScreenS, limitRect, uArrayList, Asset$ShootInfo$Resolution.NONE);
       AbsPhotoFragmentV3ViewBinder tr1 = this.r;
       if (tr1 == null) {
          a.S("previewContainer");
       }
       tr1.setOriginLayoutRect(rectF);
       AbsPhotoFragmentV3ViewBinder tr2 = this.r;
       if (tr2 == null) {
          a.S("previewContainer");
       }
       BaseEditorPreviewContainerLayout.e(tr2, false, false, 2, objArray);
       MutableLiveData mutableLiveD = this.D().A0();
       AbsPhotoFragmentV3ViewBinder tr3 = this.r;
       if (tr3 == null) {
          a.S("previewContainer");
       }
       mutableLiveD.setValue(tr3.getOriginLayoutRect());
       return;
    }
    public void T(m p0){
       Object obj = this;
       Object obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, AbsPhotoFragmentV3ViewBinder.class, "13")) {
          return;
       }
       a.p(obj1, "previewTransformParam");
       FlexScreenStatusData uFlexScreenS = this.B();
       d uod = this.d0();
       AbsPhotoFragmentV3ViewBinder r = obj.r;
       if (r == null) {
          a.S("previewContainer");
       }
       RectF limitRect = r.getLimitRect();
       r = obj.r;
       if (r == null) {
          a.S("previewContainer");
       }
       RectF originLayout = r.getOriginLayoutRect();
       List list = this.D().w0();
       ArrayList uArrayList = new ArrayList(u.Y(list, 10));
       Iterator iterator = list.iterator();
       while (iterator.hasNext()) {
          Size size = iterator.next();
          float f = (float)size.b * 0x3f800000;
          f = f / (float)size.c;
          uArrayList.add(Float.valueOf(f));
       }
       RectF rectF = uod.c(uFlexScreenS, limitRect, originLayout, uArrayList, p0.d());
       AbsPhotoFragmentV3ViewBinder r1 = obj.r;
       if (r1 == null) {
          a.S("previewContainer");
       }
       r1.a(rectF, true, p0.b(), false, 300);
       return;
    }
    public d d0(){
       return this.q;
    }
    public final View e0(){
       return this.v;
    }
    public final e f0(){
       AbsPhotoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsPhotoFragmentV3ViewBinder.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("iEditItemCustomizer");
       }
       return obj;
    }
    public final PicturesContainer g0(){
       AbsPhotoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsPhotoFragmentV3ViewBinder.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.s;
       if (obj == null) {
          a.S("picturesContainer");
       }
       return obj;
    }
    public final EditorPreviewContainerLayout h0(){
       AbsPhotoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsPhotoFragmentV3ViewBinder.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.r;
       if (obj == null) {
          a.S("previewContainer");
       }
       return obj;
    }
    public final View i0(){
       return this.u;
    }
    public final PassThroughEventView j0(){
       AbsPhotoFragmentV3ViewBinder obj = PatchProxy.apply(null, this, AbsPhotoFragmentV3ViewBinder.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("touchView");
       }
       return obj;
    }
    public final void k0(){
       if (PatchProxy.applyVoid(null, this, AbsPhotoFragmentV3ViewBinder.class, "9")) {
          return;
       }
       AbsPhotoFragmentV3ViewBinder tr = this.r;
       if (tr == null) {
          a.S("previewContainer");
       }
       AbsPhotoFragmentV3ViewBinder$c uoc = new AbsPhotoFragmentV3ViewBinder$c(this);
       Objects.requireNonNull(tr);
       if (!PatchProxy.applyVoidOneRefs(uoc, tr, EditorPreviewContainerLayout.class, "16")) {
          a.p(uoc, "listener");
          tr.e.d(uoc);
       }
       return;
    }
    public void l0(RectF p0,RectF p1,RectF p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, AbsPhotoFragmentV3ViewBinder.class, "10")) {
          return;
       }
       a.p(p0, "limitRect");
       a.p(p1, "originLayoutRect");
       a.p(p2, "customTransformRect");
       return;
    }
    public final void m0(View p0){
       this.v = p0;
    }
    public final void n0(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPhotoFragmentV3ViewBinder.class, "2")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.p = p0;
       return;
    }
    public final void o0(PicturesContainer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPhotoFragmentV3ViewBinder.class, "6")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.s = p0;
       return;
    }
    public final void p0(EditorPreviewContainerLayout p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPhotoFragmentV3ViewBinder.class, "4")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.r = p0;
       return;
    }
    public final void q0(View p0){
       this.u = p0;
    }
    public final void r0(PassThroughEventView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AbsPhotoFragmentV3ViewBinder.class, "8")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.t = p0;
       return;
    }
}
