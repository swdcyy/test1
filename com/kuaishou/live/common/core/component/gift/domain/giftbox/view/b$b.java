package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$b;
import android.text.TextWatcher;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b;
import android.widget.TextView;
import java.lang.Object;
import android.text.Editable;
import java.lang.CharSequence;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Long;
import android.widget.EditText;
import java.lang.NumberFormatException;
import android.text.TextUtils;

public class b$b implements TextWatcher	// class@001231
{
    public final TextView b;
    public final b c;

    public void b$b(b p0,TextView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void afterTextChanged(Editable p0){
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(b$b.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, b$b.class, "1")) {
          return;
       }
       if (this.c.e != null) {
          try{
             b$b tc = this.c;
             b d = tc.d;
             if (Long.parseLong(p0.toString()) - (long)d > 0) {
                tc.b.setText(String.valueOf(d));
                b b = this.c.b;
                b.setSelection(b.getText().length());
             }
          }catch(java.lang.NumberFormatException e10){
             e10.printStackTrace();
          }
       }
    }
}
