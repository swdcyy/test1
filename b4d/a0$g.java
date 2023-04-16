package b4d.a0$g;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import b4d.a0;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import android.widget.EditText;
import java.lang.CharSequence;
import java.lang.Character;
import java.lang.Boolean;
import lnc.c0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a0$g implements EmojiEditText$e	// class@000353
{
    public final a0 a;

    public void a0$g(a0 p0){
       this.a = p0;
       super();
    }
    public final void a(int p0,int p1){
       a0 uoa0 = a0.class;
       a0$g og = a0$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, og, "1")) {
          return;
       }
       a0$g ta = this.a;
       if (ta.B != null) {
          return;
       }
       ta.c9();
       k1.m(this.a.G);
       if (a0.R8(this.a).Fi()) {
          a0 w = this.a.w;
          if (w != null) {
             Editable text = w.getText();
             if (text != null) {
                og = this.a;
                a.o(text, "it");
                Objects.requireNonNull(og);
                CharSequence obj = PatchProxy.applyTwoRefs(w, text, og, uoa0, "2");
                if (obj != PatchProxyResult.class) {
                }else {
                   w = w.getSelectionEnd();
                   obj = text.subSequence(0, w);
                   int i = obj.length() - 1;
                   while (true) {
                      if (i >= 0) {
                         Character uCharacter = Character.valueOf(obj.charAt(i));
                         Object obj1 = PatchProxy.applyOneRefs(uCharacter, og, uoa0, "39");
                         boolean b = (obj1 != PatchProxyResult.class)? obj1.booleanValue(): a.g(String.valueOf(uCharacter), "@");
                         if (b) {
                         label_0094 :
                            obj = null;
                            if (i != -1) {
                               CharSequence uCharSequenc = text.subSequence(i, w);
                               if (!c0.a.matcher(uCharSequenc).find()) {
                                  obj = uCharSequenc.subSequence(1, uCharSequenc.length()).toString();
                               }
                            }
                         }else {
                            i = i - 1;
                         }
                      }else {
                         i = -1;
                         goto label_0094 ;
                      }
                   }
                }
                if (obj != null) {
                   ta = this.a;
                   Objects.requireNonNull(ta);
                   if (!PatchProxy.applyVoidOneRefs(obj, ta, uoa0, "1")) {
                      ta.C = obj;
                      k1.m(ta.G);
                      k1.r(ta.G, 300);
                   }
                }
             }
          }
       }
       return;
    }
}
