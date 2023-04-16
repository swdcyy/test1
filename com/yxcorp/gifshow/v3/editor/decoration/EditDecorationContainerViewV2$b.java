package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$b;
import erd.g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class EditDecorationContainerViewV2$b implements g	// class@000ef9
{
    public final EditDecorationBaseDrawer b;

    public void EditDecorationContainerViewV2$b(EditDecorationBaseDrawer p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2$b.class, "1")) {
       }else {
          a.p(p0, "decorationActionListener");
          p0.n(this.b);
       }
       return;
    }
}
