package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3$a;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainFragmentV3;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import android.content.Context;
import androidx.fragment.app.Fragment;
import android.os.IBinder;
import com.yxcorp.utility.n;
import android.view.View;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.a;
import java.lang.Runnable;
import java.util.Objects;
import rod.k;

public final class TextMainFragmentV3$a implements Observer	// class@000c40
{
    public final TextMainFragmentV3 b;

    public void TextMainFragmentV3$a(TextMainFragmentV3 p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextMainFragmentV3$a.class, "1")) {
       }else {
          boolean b = false;
          if (!p0.booleanValue()) {
             TextMainFragmentV3.sh(this.b).clearFocus();
             TextMainFragmentV3.sh(this.b).setFocusable(b);
             TextMainFragmentV3.sh(this.b).setFocusableInTouchMode(b);
             n.E(this.b.getContext(), TextMainFragmentV3.sh(this.b).getWindowToken());
             p0 = this.b.getView();
             if (p0 != null) {
                p0.postDelayed(new a(this), 20);
             }
          }else {
             TextMainFragmentV3.sh(this.b).setFocusable(true);
             TextMainFragmentV3.sh(this.b).setFocusableInTouchMode(true);
             TextMainFragmentV3.sh(this.b).requestFocus();
             TextMainFragmentV3.sh(this.b).setEnabled(true);
             p0 = this.b;
             Objects.requireNonNull(p0);
             if (!PatchProxy.applyVoid(null, p0, TextMainFragmentV3.class, "5") && p0.th()) {
                p0.Ch((k.a() + p0.w));
             }
             n.a0(this.b.getContext(), TextMainFragmentV3.sh(this.b), b);
          }
       }
       return;
    }
}
