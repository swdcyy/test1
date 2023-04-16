package com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b;
import jz6.a;
import android.content.Context;
import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$a;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$b;
import android.text.TextWatcher;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Editable;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Integer;
import e17.i;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.b$c;
import java.lang.NumberFormatException;
import android.view.Window;
import com.yxcorp.utility.n;
import android.view.KeyEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.view.WindowManager$LayoutParams;
import android.view.WindowManager;
import android.view.Display;

public class b extends a	// class@001233
{
    public EditText b;
    public b$c c;
    public int d;
    public boolean e;

    public void b(Context p0){
       super(p0, 0x7f110248);
       this.setCanceledOnTouchOutside(true);
       this.setContentView(R.layout.arg_RES_7f0d10dc);
       this.b = this.findViewById(0x7f0a2e8f);
       TextView textView = this.findViewById(R.id.confirm_button);
       textView.setOnClickListener(new b$a(this));
       textView.setEnabled(false);
       this.b.addTextChangedListener(new b$b(this, textView));
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       String str = this.b.getText().toString();
       if (TextUtils.isEmpty(str)) {
          return;
       }
       try{
          int i = Integer.parseInt(str);
          int i1 = 1;
          if (i > this.d) {
             Object[] objArray = new Object[i1];
             objArray[0] = Integer.valueOf(this.d);
             i.d(R.style.arg_RES_7f110668, this.getContext().getString(R.string.arg_RES_7f101264, objArray));
             return;
          }else if(i < i1){
             i = 1;
          }
          b tc = this.c;
          if (tc != null) {
             tc.a(i);
          }
          this.b.setText("");
          this.dismiss();
          return;
       }catch(java.lang.NumberFormatException e0){
          e0.printStackTrace();
          return;
       }
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       this.b.clearFocus();
       n.F(this.getWindow());
       super.dismiss();
       return;
    }
    public boolean dispatchKeyEvent(KeyEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.getKeyCode() != 66) {
          return super.dispatchKeyEvent(p0);
       }
       this.d();
       return true;
    }
    public void e(boolean p0){
       this.e = p0;
    }
    public void f(b$c p0){
       this.c = p0;
    }
    public void g(int p0){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, b.class, "1")) {
          return;
       }
       this.show();
       this.d = p0;
       Window window = this.getWindow();
       WindowManager$LayoutParams attributes = window.getAttributes();
       attributes.gravity = 80;
       attributes.flags = attributes.flags & 0xfd;
       attributes.width = window.getWindowManager().getDefaultDisplay().getWidth();
       window.setAttributes(attributes);
       this.b.requestFocus();
       n.b0(this.b.getContext(), this.b, true);
       Object[] objArray = new Object[true];
       objArray[0] = Integer.valueOf(p0);
       this.b.setHint(this.getContext().getString(R.string.arg_RES_7f100365, objArray));
       return;
    }
}
