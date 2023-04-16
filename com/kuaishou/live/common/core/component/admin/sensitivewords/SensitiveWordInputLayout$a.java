package com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$a;
import android.text.TextWatcher;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.view.View;
import com.kuaishou.live.common.core.component.admin.sensitivewords.SensitiveWordInputLayout$b;

public class SensitiveWordInputLayout$a implements TextWatcher	// class@000f4f
{
    public final SensitiveWordInputLayout b;

    public void SensitiveWordInputLayout$a(SensitiveWordInputLayout p0){
       this.b = p0;
       super();
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SensitiveWordInputLayout$a.class, "1")) {
          return;
       }
       SensitiveWordInputLayout$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, SensitiveWordInputLayout.class, "6")) {
          String str = (p0 != null)? (p0.toString()).trim(): "";
          tb.f = str;
          SensitiveWordInputLayout b = tb.b;
          int i = 0;
          int i1 = (TextUtils.isEmpty(str))? 8: 0;
          b.setVisibility(i1);
          SensitiveWordInputLayout c = tb.c;
          if (TextUtils.isEmpty(tb.f)) {
             i = 8;
          }
          c.setVisibility(i);
          c = tb.g;
          if (c != null) {
             c.b(tb.f);
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
