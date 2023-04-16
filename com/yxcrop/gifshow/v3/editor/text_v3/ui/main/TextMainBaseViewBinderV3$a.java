package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import fvc.c;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import androidx.fragment.app.FragmentActivity;
import rod.m;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.LiveData;
import java.lang.Boolean;

public final class TextMainBaseViewBinderV3$a implements Observer	// class@000c38
{
    public final TextMainBaseViewBinderV3 b;

    public void TextMainBaseViewBinderV3$a(TextMainBaseViewBinderV3 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainBaseViewBinderV3$a.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().w("TextMainBaseViewBinderV3", "keyboardOffset="+p0+", isSubtitle="+this.b.W(), objArray);
          TextMainBaseViewBinderV3 m = this.b.m;
          if (p0 == null || m != p0.intValue()) {
             a.o(p0, "keyboardOffset");
             this.b.m = p0.intValue();
             if (p0.intValue() > 0) {
                if (this.b.K().isResumed()) {
                   TextMainBaseViewBinderV3$a tb = this.b;
                   tb.l = tb.X((p0.intValue() - c.a()));
                   tb = this.b;
                   int i = p0.intValue();
                   Objects.requireNonNull(tb);
                   TextMainBaseViewBinderV3 textMainBase = TextMainBaseViewBinderV3.class;
                   if (!PatchProxy.isSupport(textMainBase) || (!PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, textMainBase, "5") && i > 0)) {
                      textMainBase = tb.h;
                      if (textMainBase != null) {
                         textMainBase.Dh(i);
                      }else {
                         tb.t.getActivity();
                      }
                   }
                }
             }else {
                p0 = this.b.h;
                if (p0 != null) {
                   p0 = p0.uh();
                   if (p0 != null) {
                      p0 = p0.p0();
                      if (p0 != null) {
                         p0 = p0.getValue();
                         Objects.requireNonNull(p0, "null cannot be cast to non-null type kotlin.Boolean");
                         if (p0.booleanValue()) {
                            this.b.D();
                         }
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
