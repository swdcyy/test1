package com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerViewV2;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import java.util.Iterator;
import java.util.LinkedList;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import android.view.View;

public final class EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2 extends Lambda implements a	// class@000f02
{
    public final float $toScale$inlined;
    public final EditDecorationContainerViewV2 this$0;

    public void EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2(EditDecorationContainerViewV2 p0,float p1){
       this.this$0 = p0;
       this.$toScale$inlined = p1;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoidWithListener(null, this, EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2.class, "1")) {
          return;
       }
       Iterator iterator = this.this$0.l.iterator();
       while (iterator.hasNext()) {
          EditDecorationBaseDrawer uEditDecorat = iterator.next();
          a.o(uEditDecorat, "drawer");
          uEditDecorat.setGlobalScale(this.$toScale$inlined);
       }
       this.this$0.t.invalidate();
       PatchProxy.onMethodExit(EditDecorationContainerViewV2$updateGlobalScale$$inlined$apply$lambda$2.class, "1");
       return;
    }
}
