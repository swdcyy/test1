package com.kuaishou.merchant.transaction.live.dynamic.component.message.a$a;
import tyc.u4;
import com.kuaishou.merchant.transaction.live.dynamic.component.message.a;
import android.text.Editable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import android.widget.EditText;
import android.text.Spannable;
import android.text.Selection;
import java.util.Objects;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import com.kuaishou.merchant.transaction.base.dynamic.component.message.MessageModel;
import com.google.gson.JsonElement;
import androidx.fragment.app.Fragment;
import bo4.b;

public class a$a extends u4	// class@000798
{
    public final a b;

    public void a$a(a p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       int i = 200;
       if (p0.length() > i) {
          this.b.r.setText(p0.subSequence(0, i));
          Selection.setSelection(this.b.r.getText(), i);
       }
       a$a tb = this.b;
       String str = (tb.r.getText() != null)? this.b.r.getText().toString(): "";
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(str, tb, a.class, "6")) {
          JsonObject jsonObject = new JsonObject();
          jsonObject.c0("content", str);
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.G("remind"+tb.p.mSellerId, jsonObject);
          jsonObject = new JsonObject();
          jsonObject.c0("type", "stashPageData");
          jsonObject.G("data", jsonObject1);
          b.a(tb.s, jsonObject.toString());
       }
       return;
    }
}
