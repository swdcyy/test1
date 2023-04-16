package com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3$d;
import rod.a;
import com.yxcrop.gifshow.v3.editor.text_v3.ui.main.TextMainBaseViewBinderV3;
import java.lang.Object;
import android.widget.EditText;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import kotlin.jvm.internal.a;
import cq.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.Fragment;
import android.content.Context;
import android.view.View;
import com.yxcorp.utility.n;
import android.os.IBinder;

public final class TextMainBaseViewBinderV3$d implements a	// class@000c3b
{
    public final TextMainBaseViewBinderV3 a;

    public void TextMainBaseViewBinderV3$d(TextMainBaseViewBinderV3 p0){
       this.a = p0;
       super();
    }
    public void a(boolean p0,EditText p1){
       TextMainBaseViewBinderV3$d uod = TextMainBaseViewBinderV3$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, uod, "1")) {
          return;
       }
       a.p(p1, "editText");
       Object[] objArray = new Object[0];
       a.D().w("TextMainBaseViewBinderV3", "onFoldListener, onClick, isSubtitle="+this.a.W(), objArray);
       if (p0) {
          p1.setFocusable(true);
          p1.setFocusableInTouchMode(true);
          p1.requestFocus();
          p1.setEnabled(true);
          n.a0(this.a.K().requireContext(), p1, 0);
       }else {
          p1.clearFocus();
          n.E(this.a.K().requireContext(), p1.getWindowToken());
       }
       return;
    }
}
