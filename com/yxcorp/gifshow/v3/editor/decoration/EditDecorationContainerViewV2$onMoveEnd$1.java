package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$onMoveEnd$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;

public final class EditDecorationContainerViewV2$onMoveEnd$1 extends Lambda implements a	// class@000f01
{
    public final EditDecorationBaseDrawer $targetDrawer;
    public final EditDecorationContainerViewV2 this$0;

    public void EditDecorationContainerViewV2$onMoveEnd$1(EditDecorationContainerViewV2 p0,EditDecorationBaseDrawer p1){
       this.this$0 = p0;
       this.$targetDrawer = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, EditDecorationContainerViewV2$onMoveEnd$1.class, "1")) {
          return;
       }
       EditDecorationContainerViewV2.D0(this.this$0, this.$targetDrawer);
       if (this.this$0.getSelectDrawer() != null) {
          EditDecorationContainerViewV2$onMoveEnd$1 tthis$0 = this.this$0;
          if (a.g(tthis$0.D, tthis$0.getSelectDrawer())) {
             this.this$0.A0();
          }
       }
       return;
    }
}
