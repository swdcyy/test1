package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1;
import androidx.lifecycle.LifecycleEventObserver;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.vb.KeyBoardPanelBaseViewBinder;
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
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import iod.a;
import ynd.c;
import android.view.View$OnClickListener;

public final class KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1 implements LifecycleEventObserver	// class@000bc7
{
    public final KeyBoardPanelBaseViewBinder b;

    public void KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1(KeyBoardPanelBaseViewBinder p0){
       this.b = p0;
       super();
    }
    public final void onStateChanged(LifecycleOwner p0,Lifecycle$Event p1){
       c uoc;
       TextKeyboardFragment q;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1.class, "1")) {
          return;
       }
       a.p(p0, "<anonymous parameter 0>");
       a.p(p1, "event");
       if (p1 == Lifecycle$Event.ON_RESUME) {
          Object[] objArray = new Object[0];
          a.D().w("KeyBoardPanelBaseViewBinder", "mTextPanelDialogFragment, lifecycleEventObserver, ON_RESUME, "+"isSubtitle="+this.b.Y(), objArray);
          KeyBoardPanelBaseViewBinder$lifecycleEventObserver$1 tb = this.b;
          KeyBoardPanelBaseViewBinder g = tb.g;
          if (g != null) {
             KeyBoardPanelBaseViewBinder o = tb.o;
             if (!PatchProxy.applyVoidOneRefs(o, g, TextKeyboardFragment.class, "26")) {
                a.p(o, "onFoldListener");
                q = g.q;
                if (q == null) {
                   a.S("mTextKeyboardViewModel");
                }
                q.j = o;
             }
          }
          tb = this.b;
          g = tb.g;
          String str = "onTextKeyboardItemListener";
          if (g != null) {
             uoc = tb.T();
             if (!PatchProxy.applyVoidOneRefs(uoc, g, TextKeyboardFragment.class, "22")) {
                a.p(uoc, str);
                q = g.q;
                if (q == null) {
                   a.S("mTextKeyboardViewModel");
                }
                q.f = uoc;
             }
          }
          tb = this.b;
          g = tb.g;
          if (g != null) {
             uoc = tb.K();
             if (!PatchProxy.applyVoidOneRefs(uoc, g, TextKeyboardFragment.class, "23")) {
                a.p(uoc, str);
                q = g.q;
                if (q == null) {
                   a.S("mTextKeyboardViewModel");
                }
                q.g = uoc;
             }
          }
          tb = this.b;
          g = tb.g;
          if (g != null) {
             uoc = tb.F();
             if (!PatchProxy.applyVoidOneRefs(uoc, g, TextKeyboardFragment.class, "24")) {
                a.p(uoc, str);
                q = g.q;
                if (q == null) {
                   a.S("mTextKeyboardViewModel");
                }
                q.h = uoc;
             }
          }
          tb = this.b;
          g = tb.g;
          if (g != null) {
             View$OnClickListener onClickListe = tb.S();
             if (!PatchProxy.applyVoidOneRefs(onClickListe, g, TextKeyboardFragment.class, "25")) {
                q = g.q;
                if (q == null) {
                   a.S("mTextKeyboardViewModel");
                }
                q.i = onClickListe;
             }
          }
       }
    label_00e7 :
       return;
    }
}
