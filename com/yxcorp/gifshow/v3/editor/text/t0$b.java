package com.yxcorp.gifshow.v3.editor.text.t0$b;
import wpc.y;
import com.yxcorp.gifshow.v3.editor.text.t0;
import java.lang.Object;
import wpc.x;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import uld.g;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import lwc.d;
import brd.a0;
import t45.d;
import brd.z;
import huc.p0;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.editor.text.s0;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class t0$b implements y	// class@0014b1
{
    public final t0 a;

    public void t0$b(t0 p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.b(this);
    }
    public void b(){
       x.c(this);
    }
    public void c(boolean p0){
       t0$b uob = t0$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       Objects.requireNonNull(uob);
       t0 ot0 = t0.class;
       if (!PatchProxy.isSupport(ot0) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), uob, ot0, "4")) {
          if (uob.A.getSelectDrawer() != null && uob.A.getSelectDrawer() instanceof EditTextBaseElement) {
             uob.A.R();
          }
          if (uob.s.C0().c()) {
             uob.F.a("SinglePicTextEditPresenter");
             uob.X7(uob.s.C1(true).G(d.a).n(new p0(uob, p0)).R(Functions.d(), s0.b));
          }else if(p0){
             uob.P8(p0);
          }
       }
       return;
    }
}
