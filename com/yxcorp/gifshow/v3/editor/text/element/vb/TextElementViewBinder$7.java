package com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder$7;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcorp.gifshow.v3.editor.text.element.vb.TextElementViewBinder;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.yxcorp.gifshow.decoration.drawer.DecorationDrawer;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.text.element.EditTextBaseElement;

public final class TextElementViewBinder$7 implements LifecycleEventObserver	// class@0013fd
{
    public final TextElementViewBinder b;

    public void TextElementViewBinder$7(TextElementViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextElementViewBinder$7.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_PAUSE) {
          DecorationDrawer topDecoratio = this.b.J().getTopDecorationDrawer();
          if (topDecoratio != null && (topDecoratio.mIsSelected != null && topDecoratio instanceof EditTextBaseElement)) {
             this.b.G(topDecoratio);
          }
       label_0034 :
          TextElementViewBinder.F(this.b, false, 1, null);
       }
       return;
    }
}
