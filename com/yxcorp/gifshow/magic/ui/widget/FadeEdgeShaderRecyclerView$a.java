package com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.magic.ui.widget.FadeEdgeShaderRecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;

public class FadeEdgeShaderRecyclerView$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@001c4c
{
    public final int b;
    public final FadeEdgeShaderRecyclerView c;

    public void FadeEdgeShaderRecyclerView$a(FadeEdgeShaderRecyclerView p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, FadeEdgeShaderRecyclerView$a.class, "1")) {
          return;
       }
       this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.c.y(this.b);
       return;
    }
}
