package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.View;

public final class VideoCoverProportionViewBinder$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@000ea0
{
    public final VideoCoverProportionViewBinder b;
    public final List c;
    public final boolean d;

    public void VideoCoverProportionViewBinder$b(VideoCoverProportionViewBinder p0,List p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, VideoCoverProportionViewBinder$b.class, "1")) {
          return;
       }
       this.b.l.getViewTreeObserver().removeOnGlobalLayoutListener(this);
       this.b.D(this.c, this.d);
       return;
    }
}
