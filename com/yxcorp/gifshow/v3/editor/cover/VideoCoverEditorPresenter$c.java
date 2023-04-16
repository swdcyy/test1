package com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter$c;
import voc.y;
import com.yxcorp.gifshow.v3.editor.cover.VideoCoverEditorPresenter;
import java.lang.Object;
import voc.x;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.yxcorp.gifshow.v3.editor.text.ReEditCoverPresenter$Action;
import io.reactivex.subjects.PublishSubject;
import e17.i;
import lnc.a1;
import com.yxcorp.gifshow.v3.editor.cover.r0;
import java.lang.Integer;
import erd.r;
import com.yxcorp.gifshow.v3.editor.cover.CoverEditorFragment;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import hba.a;
import java.lang.Double;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.List;
import ppc.k;
import java.lang.Boolean;

public class VideoCoverEditorPresenter$c implements y	// class@000e2e
{
    public final VideoCoverEditorPresenter b;

    public void VideoCoverEditorPresenter$c(VideoCoverEditorPresenter p0){
       this.b = p0;
       super();
    }
    public void Md(){
       x.g(this);
    }
    public void N0(){
       x.f(this);
    }
    public void O(){
       x.e(this);
    }
    public void c2(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter$c.class, "1")) {
          return;
       }
       x.d(this);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverEditorPresenter", "onEnterAnimationStart", objArray);
       return;
    }
    public void o4(){
       x.h(this);
    }
    public void onRestart(){
       x.i(this);
    }
    public void rd(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter$c.class, "4")) {
          return;
       }
       this.b.H.R();
       if (this.b.W.D()) {
          this.b.W.j();
       }
       if (this.b.y.D()) {
          this.b.y.j();
       }
       this.b.D.onNext(ReEditCoverPresenter$Action.DISCARD);
       if (this.b.X0 != null) {
          i.a(R.style.arg_RES_7f11066a, 0x7f100b65);
          this.b.S8(a1.p(R.string.arg_RES_7f100b65));
       }
       this.b.H.f0(r0.b, Integer.valueOf(10));
       return;
    }
    public void x9(){
       x.b(this);
    }
    public void yd(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter$c.class, "3")) {
          return;
       }
       double d = this.b.s.Pf();
       VideoCoverEditorPresenter$c tb = this.b;
       Double[] uDoubleArray = new Double[]{Double.valueOf(d)};
       this.b.C.d1().D0(k.b(tb.W, tb.C.W0(), this.b.E, Lists.e(uDoubleArray), this.b.s.k8()));
       if (this.b.P.booleanValue()) {
          this.b.C.d1().G0(0xbff0000000000000);
       }else {
          this.b.C.d1().G0(d);
       }
       return;
    }
    public void z2(){
       if (PatchProxy.applyVoid(null, this, VideoCoverEditorPresenter$c.class, "2")) {
          return;
       }
       x.c(this);
       Object[] objArray = new Object[0];
       a.D().w("VideoCoverEditorPresenter", "onEnterAnimationFinish", objArray);
       return;
    }
}
