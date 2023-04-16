package com.yxcorp.gifshow.v3.editor.cover.s0;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$g;
import com.yxcorp.gifshow.v3.editor.cover.q0;
import java.lang.Object;
import brd.a0;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.yxcorp.gifshow.edit.draft.model.c;
import com.kuaishou.edit.draft.Cover$b;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.cover.q0$j;
import com.yxcorp.gifshow.v3.editor.text.element.vm.TextElementViewModel;
import brd.t;
import t45.d;
import brd.z;
import ppc.p0;
import erd.o;
import ppc.q0;
import ppc.o0;
import erd.g;
import axc.i;

public class s0 implements ExpandFoldHelperView$g	// class@000ed8
{
    public final q0 a;

    public void s0(q0 p0){
       this.a = p0;
       super();
    }
    public a0 a(){
       Object obj = PatchProxy.apply(null, this, s0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.a.Y.R();
       s0 ta = this.a;
       ta.x.b = ta.Y.getScaleX();
       return this.a.Z.C1(true).d0().observeOn(d.c).flatMap(new p0(this)).observeOn(d.a).flatMap(new q0(this, this.a.H.k())).doOnError(new o0(this)).singleOrError();
    }
    public a0 b(){
       return i.a(this);
    }
}
