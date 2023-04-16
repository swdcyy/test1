package com.yxcorp.gifshow.camera.record.mix.MixSendTipController;
import oc9.d0;
import com.yxcorp.gifshow.camera.record.mix.MixSendTipController$a;
import nsd.u;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import oc9.b0;
import oc9.a0;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.view.View;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import android.view.ViewGroup;
import android.widget.TextView;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import java.util.Objects;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.camera.record.mix.MixSendTipController$onViewCreated$1;
import sf9.b0;
import msd.l;
import erd.g;
import crd.b;
import eoc.f;
import android.content.Intent;
import ekd.j0;

public final class MixSendTipController extends d0	// class@000e64
{
    public TextView o;
    public ViewGroup p;
    public View q;
    public String r;
    public static final MixSendTipController$a s;

    static {
       MixSendTipController.s = new MixSendTipController$a(null);
    }
    public void MixSendTipController(CameraPageType p0,b p1){
       a.p(p0, "pageType");
       a.p(p1, "callerContext");
       super(p0, p1);
    }
    public void A0(){
       if (PatchProxy.applyVoid(null, this, MixSendTipController.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MixSendTipController", "onCaptureStop: ...", objArray);
       a0.j(this);
       this.g2(true, true);
       return;
    }
    public void I7(){
       if (PatchProxy.applyVoid(null, this, MixSendTipController.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().s("MixSendTipController", "onCaptureStart: ...", objArray);
       a0.i(this);
       this.g2(0, true);
       return;
    }
    public final void g2(boolean p0,boolean p1){
       MixSendTipController mixSendTipCo = MixSendTipController.class;
       if (PatchProxy.isSupport(mixSendTipCo) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, mixSendTipCo, "6")) {
          return;
       }
       mixSendTipCo = this.p;
       int i = (p0 && !TextUtils.x(this.r))? 0: 4;
       n.Y(mixSendTipCo, i, p1);
       return;
    }
    public void k(View p0){
       View view;
       MixSendTipController tq;
       MixSendTipController mixSendTipCo = MixSendTipController.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, mixSendTipCo, "2")) {
          return;
       }
       super.k(p0);
       ViewStubInflater2 viewStubInfl = new ViewStubInflater2(0x7f0a3b72);
       viewStubInfl.d(p0);
       viewStubInfl.e(R.layout.arg_RES_7f0d156f);
       this.p = viewStubInfl.b(0x7f0a3b72);
       this.o = viewStubInfl.b(0x7f0a3880);
       Object[] objArray = null;
       if (p0 != null) {
          view = p0.findViewById(R.id.camera_lowlight_boost_view_stub);
          if (view == null) {
          label_003f :
             view = (p0 != null)? p0.findViewById(R.id.camera_lowlight_boost_image_view): objArray;
          }
       }else {
          goto label_003f ;
       }
       this.q = view;
       if (!PatchProxy.applyVoid(objArray, this, mixSendTipCo, "5")) {
          if (!TextUtils.x(this.r)) {
             tq = this.o;
             if (tq != null) {
                tq.setText(this.r);
             }
          }else {
             tq = this.p;
             if (tq != null) {
                a.m(tq);
                tq.setVisibility(4);
             }
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, mixSendTipCo, "8")) {
          tq = this.q;
          ViewGroup$LayoutParams layoutParams = (tq != null)? tq.getLayoutParams(): objArray;
          if (layoutParams instanceof ConstraintLayout$LayoutParams && this.p != null) {
             tq = this.q;
             if (tq != null) {
                objArray = tq.getLayoutParams();
             }
             Objects.requireNonNull(objArray, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             tq = this.p;
             a.m(tq);
             objArray.p = tq.getId();
             tq = this.q;
             if (tq != null) {
                tq.setLayoutParams(objArray);
             }
          }
       }
    label_00ae :
       this.Y1(f.a(PanelShowEvent.class, new b0(new MixSendTipController$onViewCreated$1(this))));
       return;
    }
    public void w1(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MixSendTipController.class, "1")) {
          return;
       }
       super.w1(p0);
       if (p0 != null) {
          this.r = j0.f(p0, "key_message_target_name");
       }
       return;
    }
}
