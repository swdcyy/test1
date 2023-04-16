package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$h;
import androidx.lifecycle.Observer;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import e17.i;
import faa.a;
import java.lang.StringBuilder;
import q87.c;

public final class ReorderPanelViewBinder$h implements Observer	// class@0011b5
{
    public static final ReorderPanelViewBinder$h b;

    static {
       ReorderPanelViewBinder$h.b = new ReorderPanelViewBinder$h();
    }
    public void ReorderPanelViewBinder$h(){
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReorderPanelViewBinder$h.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             i.a(R.style.arg_RES_7f11066a, 0x7f100b73);
          }
          Object[] objArray = new Object[0];
          a.D().w("ReorderPanelViewBinder", "mShowCanNotDeleteToast it:"+p0, objArray);
       }
       return;
    }
}
