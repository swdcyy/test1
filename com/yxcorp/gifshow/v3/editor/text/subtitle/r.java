package com.yxcorp.gifshow.v3.editor.text.subtitle.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import com.yxcorp.gifshow.v3.editor.i;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import huc.k1;
import com.yxcorp.gifshow.widget.adv.Action$Type;
import im8.f;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.text.subtitle.q;
import di0.b;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import dvc.u;
import erd.r;
import dvc.v;
import android.view.View;
import com.yxcorp.gifshow.v3.editor.text.TextEditorV3Fragment;

public class r extends PresenterV2	// class@0014a7
{
    public i p;
    public PublishSubject q;
    public f r;
    public TextEditorV3Fragment s;
    public EditDecorationContainerView t;
    public TextElementViewModel u;
    public Observer v;

    public void r(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       TextElementViewModel textElementV = k1.c(this.p.f(), false);
       this.u = textElementV;
       textElementV.k1(false);
       this.r.set(Action$Type.TEXT);
       this.P8();
       this.q.onNext(new Object());
       this.t.R();
       if (this.v == null) {
          this.v = new q(this);
          this.u.R0().observe(this.s, this.v);
       }
       return;
    }
    public void F8(){
       PatchProxy.applyVoid(null, this, r.class, "3");
    }
    public void J8(){
       PatchProxy.applyVoid(null, this, r.class, "6");
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, r.class, "5")) {
          return;
       }
       if (this.u.T0()) {
          return;
       }
       boolean b = false;
       boolean b1 = (this.r.get() == Action$Type.SUBTITLE)? true: false;
       this.t.c0(new u(b1), b);
       this.t.c0(new v(b1), true);
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, r.class, "2");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.r8("EDITOR_HELPER_CONTRACT");
       this.q = this.r8("DECORATION_TIMELINE_UPDATE");
       this.r = this.x8("TEXT_TYPE");
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("DECORATION_CONTAINER_VIEW");
       return;
    }
}
