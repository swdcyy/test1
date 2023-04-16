package com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder$f;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.v3.editor.cover.proportion.VideoCoverProportionViewBinder;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView;
import android.view.ViewTreeObserver;
import android.widget.AbsoluteLayout;
import com.yxcorp.gifshow.v3.editor.cover.proportion.c;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class VideoCoverProportionViewBinder$f implements Observer	// class@000ea4
{
    public final VideoCoverProportionViewBinder b;

    public void VideoCoverProportionViewBinder$f(VideoCoverProportionViewBinder p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, VideoCoverProportionViewBinder$f.class, "1")) {
       }else {
          VideoCoverProportionViewBinder$f tb = this.b;
          if (tb.v != null) {
             EditDecorationContainerView uEditDecorat = tb.H();
             if (uEditDecorat != null) {
                a.o(p0, "it");
                i = (p0.booleanValue())? 8: 0;
                uEditDecorat.setVisibility(i);
             }
             i = this.b.H();
             if (i != null) {
                i = i.getViewTreeObserver();
                if (i != null) {
                   i.addOnGlobalLayoutListener(new c(this));
                }
             }
          }
       }
       return;
    }
}
