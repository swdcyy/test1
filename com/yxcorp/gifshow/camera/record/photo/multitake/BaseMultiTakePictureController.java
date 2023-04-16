package com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import hg9.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.View;
import java.lang.Integer;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import yb9.b;
import th0.e;
import th0.n;
import android.view.animation.Interpolator;
import yb9.b$a;
import android.content.Intent;
import android.app.Activity;
import gh9.i;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$onViewCreated$1;
import java.util.Objects;
import android.view.ViewStub;
import hg9.k;
import msd.l;
import android.view.ViewStub$OnInflateListener;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$b;
import erd.g;
import crd.b;
import eoc.f;
import vb9.a;
import com.yxcorp.gifshow.camera.record.photo.multitake.BaseMultiTakePictureController$c;
import android.view.animation.Animation;
import e17.i$b;
import e17.i;
import java.lang.CharSequence;
import oa0.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import oe6.g;
import ig9.a;

public abstract class BaseMultiTakePictureController extends d0	// class@000ebd
{
    public i o;
    public final l p;
    public ViewStubInflater2 q;
    public Animation r;
    public static final BaseMultiTakePictureController$a s;

    static {
       BaseMultiTakePictureController.s = new BaseMultiTakePictureController$a(null);
    }
    public void BaseMultiTakePictureController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
       this.p = new l();
    }
    public boolean c1(){
       View obj = PatchProxy.apply(null, this, BaseMultiTakePictureController.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       obj = this.p.a(b);
       if (obj != null && obj.isSelected()) {
          b = true;
       }
       return b;
    }
    public void d5(int p0){
       View view;
       BaseMultiTakePictureController uBaseMultiTa = BaseMultiTakePictureController.class;
       if (PatchProxy.isSupport(uBaseMultiTa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseMultiTa, "2")) {
          return;
       }
       super.d5(p0);
       d td = this.d;
       a.o(td, "mCallerContext");
       BaseFragment uBaseFragmen = td.f();
       a.o(uBaseFragmen, "mCallerContext.fragment");
       if (!uBaseFragmen.isAdded()) {
          return;
       }
       if (this.g2()) {
          view = this.p.b(true);
          if (view != null) {
             td = this.d;
             a.o(td, "mCallerContext");
             td.h().d(view, 0, new e(), new n(), null);
             this.o2();
          }
       }else {
          view = this.p.b(false);
          if (view != null) {
             td = this.d;
             a.o(td, "mCallerContext");
             td.h().d(view, 4, new e(), new n(), null);
          }
       }
       return;
    }
    public boolean g2(){
       Object obj = PatchProxy.apply(null, this, BaseMultiTakePictureController.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.f2() ^ 0x01);
    }
    public abstract boolean h2();
    public String i2(){
       return null;
    }
    public void k(View p0){
       ViewStubInflater2 viewStubInfl1;
       View view;
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseMultiTakePictureController.class, "1")) {
          return;
       }
       a.p(p0, "view");
       super.k(p0);
       d te = this.e;
       a.o(te, "mActivity");
       boolean b = i.a(te.getIntent());
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a0eff, 0x7f0a0f00);
       this.q = viewStubInfl;
       a.m(viewStubInfl);
       viewStubInfl.d(p0);
       BaseMultiTakePictureController tp = this.p;
       BaseMultiTakePictureController$onViewCreated$1 oonViewCreat = new BaseMultiTakePictureController$onViewCreated$1(this);
       Objects.requireNonNull(tp);
       if (!PatchProxy.isSupport(l.class) || !PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(b), oonViewCreat, tp, l.class, "1")) {
          a.p(p0, "rootView");
          tp.g = b;
          if (b) {
             viewStubInfl1 = new ViewStubInflater2(0x7f0a3d4e, 0x7f0a06c6);
             tp.a = viewStubInfl1;
             viewStubInfl1.d(p0);
             tp.b = p0.findViewById(0x7f0a3d4e);
             tp.c = p0.findViewById(0x7f0a06c6);
          }else {
             viewStubInfl1 = new ViewStubInflater2(0x7f0a3d4f, 0x7f0a06c6);
             tp.a = viewStubInfl1;
             viewStubInfl1.d(p0);
             tp.b = p0.findViewById(0x7f0a3d4f);
             tp.c = p0.findViewById(0x7f0a06c6);
             view = p0.findViewById(R.id.camera_denoise_mode_view_stub);
             if (view == null) {
                view = p0.findViewById(R.id.camera_denoise_mode_image_view);
             }
             tp.f = view;
          }
          l b1 = tp.b;
          if (b1 != null) {
             a.m(b1);
             b1.setOnInflateListener(new k(oonViewCreat));
          }else {
             b1 = tp.c;
             if (b1 != null) {
                oonViewCreat.invoke(b1);
             }
          }
       }
       if (!this.f2()) {
          p0 = this.p.b(true);
          if (p0 != null) {
             p0.setVisibility(0);
             this.o2();
          }
       }
       this.Y1(f.a(PanelShowEvent.class, new BaseMultiTakePictureController$b(this)));
       this.d.l(a.class, new BaseMultiTakePictureController$c(this));
       return;
    }
    public abstract Animation k2();
    public final l l2(){
       return this.p;
    }
    public abstract String m2();
    public boolean n2(){
       return false;
    }
    public abstract void o2();
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseMultiTakePictureController.class, "3")) {
          return;
       }
       super.onDestroyView();
       BaseMultiTakePictureController tp = this.p;
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, l.class, "2")) {
          l b = tp.b;
          if (b != null) {
             b.setOnInflateListener(null);
          }
          tp.b = null;
          tp.a = null;
          tp.c = null;
          tp.d = null;
          tp.e = null;
       }
       return;
    }
    public void p2(boolean p0,boolean p1,boolean p2){
       if (PatchProxy.isSupport(BaseMultiTakePictureController.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), Boolean.valueOf(p2), this, BaseMultiTakePictureController.class, "11")) {
          return;
       }
       if (this.c1() == p0) {
          return;
       }
       if (p0 && !p2) {
          i$b uob = i.m();
          uob.y(this.m2());
          this.o = i.z(uob);
       }
       View view = this.p.a(p0);
       if (view != null) {
          view.setSelected(p0);
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putBoolean("enableMultiTakePicture", p0);
       g.a(uEditor);
       this.d.m(new a(p0));
       return;
    }
    public abstract void r2();
}
