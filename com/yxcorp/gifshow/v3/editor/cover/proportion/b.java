package com.yxcorp.gifshow.v3.editor.cover.proportion.b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$d;
import java.util.List;
import tpc.e0$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import android.view.ViewTreeObserver;

public final class b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000eb8
{
    public final VideoCoverProportionViewBinder$d b;
    public final List c;
    public final e0$a d;

    public void b(VideoCoverProportionViewBinder$d p0,List p1,e0$a p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.F().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.b.D(this.c, this.d.b());
       return;
    }
}
