package com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler$d;
import com.yxcorp.gifshow.widget.EmojiEditText$e;
import com.yxcorp.gifshow.activity.share.presenter.ShareEditorTextDisplayHandler;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.widget.EmojiEditText;
import android.text.Editable;
import com.kwai.library.widget.edittext.SafeEditText;
import java.lang.CharSequence;
import kotlin.text.StringsKt__StringsKt;
import usd.q;
import android.widget.EditText;

public final class ShareEditorTextDisplayHandler$d implements EmojiEditText$e	// class@0013a3
{
    public final ShareEditorTextDisplayHandler a;

    public void ShareEditorTextDisplayHandler$d(ShareEditorTextDisplayHandler p0){
       this.a = p0;
       super();
    }
    public void a(int p0,int p1){
       ShareEditorTextDisplayHandler$d uod = ShareEditorTextDisplayHandler$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       uod = this.a;
       ShareEditorTextDisplayHandler k = uod.K;
       if (k != null) {
          Editable text = uod.u().getText();
          if (text == null || (StringsKt__StringsKt.R4(text, k, false, 2, null) == true && (p1 >= 0 && p0 <= k.length()))) {
             this.a.u().setSelection(q.n(p0, k.length()), q.n(p1, k.length()));
          }
       }
    label_0055 :
       return;
    }
}
