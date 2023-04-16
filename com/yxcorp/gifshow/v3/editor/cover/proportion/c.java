package com.yxcorp.gifshow.v3.editor.cover.proportion.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;

public final class c implements ViewTreeObserver$OnGlobalLayoutListener	// class@000eb9
{
    public final VideoCoverProportionViewBinder$f b;

    public void c(VideoCoverProportionViewBinder$f p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.b.b.H().getViewTreeObserver().removeOnGlobalLayoutListener(this);
       if (this.b.b.H().getTopElement() != null) {
          this.b.b.H().C0(this.b.b.H().getTopElement());
       }
       return;
    }
}
