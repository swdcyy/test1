package com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder$i;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.reorder.vb.ReorderPanelViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public final class ReorderPanelViewBinder$i implements ViewTreeObserver$OnGlobalLayoutListener	// class@0011b6
{
    public final ReorderPanelViewBinder b;
    public final int c;

    public void ReorderPanelViewBinder$i(ReorderPanelViewBinder p0,int p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, ReorderPanelViewBinder$i.class, "1")) {
          return;
       }
       this.b.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.D(this.c);
       return;
    }
}
