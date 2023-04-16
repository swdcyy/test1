package b4d.u;
import erd.g;
import b4d.w;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditorFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import com.yxcorp.plugin.emotion.fragment.EmotionFloatEditConfig;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.widget.EditText;
import com.yxcorp.utility.TextUtils;

public final class u implements g	// class@000393
{
    public final w b;

    public void u(w p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       w p = this.b.p;
       p0 = p0.replaceAll(" ", "");
       Objects.requireNonNull(p);
       if (PatchProxy.applyVoidOneRefs(p0, p, EmotionFloatEditorFragment.class, "64")) {
       }else if(p.isAdded() && (p.V0.getText() != null && (p.M.mTextLimit > null && ((p.V0.getText().length() + p0.length()) <= p.M.mTextLimit || p.c2.getStyle() == 4)))){
          p.V0.h(p0);
          p0.mText = TextUtils.G(p.V0).toString();
       }
       return;
    }
}
