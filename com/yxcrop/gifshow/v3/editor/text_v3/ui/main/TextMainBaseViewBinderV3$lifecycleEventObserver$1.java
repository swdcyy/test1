package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$lifecycleEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import java.lang.Object;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Lifecycle$Event;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import rod.m;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import rod.b;

public final class TextMainBaseViewBinderV3$lifecycleEventObserver$1 implements LifecycleEventObserver	// class@000c3d
{
    public final TextMainBaseViewBinderV3 b;

    public void TextMainBaseViewBinderV3$lifecycleEventObserver$1(TextMainBaseViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       m om;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, TextMainBaseViewBinderV3$lifecycleEventObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_RESUME) {
          Object[] objArray = new Object[0];
          a.D().w("TextMainBaseViewBinderV3", "mTextPanelDialogFragment, lifecycleEventObserver, ON_RESUME, "+"isSubtitle="+this.b.W(), objArray);
          TextMainBaseViewBinderV3 h = this.b.h;
          if (h != null) {
             om = h.uh();
             if (om != null) {
                om.i = this.b.q;
             }
          }
          h = this.b.h;
          if (h != null) {
             om = h.uh();
             if (om != null) {
                om.c = this.b.R();
             }
          }
          h = this.b.h;
          if (h != null) {
             om = h.uh();
             if (om != null) {
                om.e = this.b.J();
             }
          }
          h = this.b.h;
          if (h != null) {
             om = h.uh();
             if (om != null) {
                om.g = this.b.Q();
             }
          }
          h = this.b.h;
          if (h != null) {
             om = h.uh();
             if (om != null) {
                om.h = this.b.P();
             }
          }
       }
    label_00a3 :
       return;
    }
}
