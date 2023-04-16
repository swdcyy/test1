package b4d.a0$f;
import erd.g;
import b4d.a0;
import java.lang.Object;
import zu5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Integer;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.Set;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import kotlin.jvm.internal.a;
import android.widget.EditText;
import java.util.List;
import trd.t;
import java.util.Collection;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.util.HashSet;
import android.text.Spannable;
import android.text.Selection;
import brd.y;

public final class a0$f implements g	// class@000352
{
    public final a0 b;

    public void a0$f(a0 p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, a0$f.class, "1")) {
       }else {
          a a = p0.a;
          if (a != null) {
             a0$f tb = this.b;
             p0 = p0.b;
             Objects.requireNonNull(tb);
             a0 uoa0 = a0.class;
             if (!PatchProxy.isSupport(uoa0) || !PatchProxy.applyVoidTwoRefs(a, Integer.valueOf(p0), tb, uoa0, "6")) {
                a0 w = tb.w;
                if (w != null) {
                   Editable text = w.getText();
                   if (text != null) {
                      tb.B = true;
                      Iterator obj = PatchProxy.applyOneRefs(a, tb, uoa0, "7");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else {
                         obj = tb.b9().iterator();
                         while (true) {
                            if (obj.hasNext()) {
                               if (a.g(obj.next().getId(), a.getId())) {
                                  String atIdWithAt = a.getAtIdWithAt();
                                  a.o(atIdWithAt, "user.atIdWithAt");
                                  b = tb.Z8(atIdWithAt);
                               }
                            }else {
                               b = false;
                            }
                         }
                      }
                      if (b || !tb.X8()) {
                         tb.B = false;
                      }else {
                         a.o(text, "it");
                         tb.Y8(w, text);
                         b = (w.getSelectionStart() && (!tb.h9(w.getSelectionStart()) && !tb.e9(w.getSelectionStart())))? true: false;
                         w.i(tb.a9(t.k(a), b), Boolean.TRUE);
                         uoa0 = tb.p;
                         if (uoa0 == null) {
                            a.S("mFloatEditorFragment");
                         }
                         uoa0.n1.add(a.getId());
                         Selection.setSelection(text, w.getSelectionStart());
                         tb.B = false;
                         tb.c9();
                         if (p0 == true) {
                            p0 = tb.r;
                            if (p0 == null) {
                               a.S("mAtFloatPanelShowHideSubject");
                            }
                            p0.onNext(Boolean.FALSE);
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
