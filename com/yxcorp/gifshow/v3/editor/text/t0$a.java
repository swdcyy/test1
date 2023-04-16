package com.yxcorp.gifshow.v3.editor.text.t0$a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcorp.gifshow.v3.editor.text.t0;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import faa.a;
import q87.c;
import h80.c;
import h80.k;
import h80.m;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.List;
import oa0.a;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;

public class t0$a extends DecorationContainerView$e	// class@0014b0
{
    public final t0 a;

    public void t0$a(t0 p0){
       this.a = p0;
       super();
    }
    public void l(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t0$a.class, "1")) {
       }else {
          super.l(p0);
          t0$a ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, t0.class, "7")) {
             Object[] objArray = new Object[0];
             a.D().w("SinglePicTextEditPresenter", "saveTextTemplateList", objArray);
             if (!k.a().b().b() && PostExperimentUtils.j1()) {
                a.t1(ta.y);
                a.u1(ta.z);
             }
          }
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       return p0 instanceof EditTextBaseElement;
    }
}
