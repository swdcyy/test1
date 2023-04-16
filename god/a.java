package god.a;
import java.lang.Object;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.utils.TextKeyboardFragmentNoFoundException;
import iod.a;
import kotlin.jvm.internal.a;
import ynd.g;
import java.util.Objects;
import ynd.f;

public final class a	// class@000f55
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final TextKeyboardFragment a(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       while (true) {
          if (p0 == null) {
             throw new TextKeyboardFragmentNoFoundException("findTextKeyboardFragment failed");
          }
          if (p0 instanceof TextKeyboardFragment) {
             break ;
          }else {
             p0 = p0.getParentFragment();
          }
       }
       return p0;
    }
    public final a b(Fragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "childFragment");
       return this.a(p0).th();
    }
    public final g c(Fragment p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g obj = PatchProxy.applyOneRefs(p0, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "childFragment");
       TextKeyboardFragment textKeyboard = this.a(p0);
       Objects.requireNonNull(textKeyboard);
       obj = PatchProxy.apply(null, textKeyboard, TextKeyboardFragment.class, "3");
       if (obj != patchProxyRe) {
       }else {
          textKeyboard = textKeyboard.p;
          if (textKeyboard == null) {
             a.S("keyboardOption");
          }
          obj = textKeyboard.b();
       }
       return obj;
    }
}
