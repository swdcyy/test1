package com.tachikoma.core.component.input.a$a;
import android.text.TextWatcher;
import com.tachikoma.core.component.input.a;
import java.lang.Object;
import android.text.Editable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.EditText;
import java.lang.CharSequence;

public class a$a implements TextWatcher	// class@000d7a
{
    public int b;
    public String c;
    public boolean d;
    public final a e;

    public void a$a(a p0,int p1){
       this.e = p0;
       super();
       this.c = "";
       this.d = false;
       this.b = p1;
    }
    public void afterTextChanged(Editable p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (this.b > null) {
          int lineCount = this.e.a.getLineCount();
          if (!lineCount && this.d == null) {
             return;
          }else {
             this.d = false;
             if (lineCount > this.b) {
                this.e.a.removeTextChangedListener(this);
                this.e.a.setText(this.c);
                this.e.a.addTextChangedListener(this);
                this.e.a.setSelection((this.c).length());
             }else if(p0 != null){
                str = p0.toString();
             }else {
                str = "";
             }
             this.c = str;
          }
       }
       return;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.d = true;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
}
