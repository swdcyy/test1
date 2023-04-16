package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$f;
import erd.g;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import android.view.MotionEvent;
import java.lang.Object;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;

public final class EditDecorationContainerViewV2$f implements g	// class@000efd
{
    public final EditDecorationContainerViewV2 b;
    public final MotionEvent c;

    public void EditDecorationContainerViewV2$f(EditDecorationContainerViewV2 p0,MotionEvent p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EditDecorationContainerViewV2$f.class, "1")) {
       }else {
          a.p(p0, "decorationActionListener");
          p0.k(this.b.k, this.c);
       }
       return;
    }
}
