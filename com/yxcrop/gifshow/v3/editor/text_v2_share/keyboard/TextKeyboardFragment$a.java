package com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.TextKeyboardFragment;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import iod.a;
import ynd.a;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yxcrop.gifshow.v3.editor.text_v2_share.keyboard.a;
import java.lang.Runnable;
import java.util.Objects;
import ynd.d;

public final class TextKeyboardFragment$a implements Observer	// class@000b92
{
    public final TextKeyboardFragment b;

    public void TextKeyboardFragment$a(TextKeyboardFragment p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextKeyboardFragment$a.class, "1")) {
       }else if(!p0.booleanValue()){
          p0 = this.b.th().q0();
          if (p0 != null) {
             p0.a(false);
          }
          p0 = this.b.getView();
          if (p0 != null) {
             p0.postDelayed(new a(this), 20);
          }
       }else {
          p0 = this.b;
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, TextKeyboardFragment.class, "15") && p0.sh()) {
             p0.vh(d.a());
          }
          p0 = this.b.th().q0();
          if (p0 != null) {
             p0.a(true);
          }
       }
       return;
    }
}
