package com.facebook.react.views.textinput.ReactTextInputManager$c;
import android.widget.TextView$OnEditorActionListener;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.textinput.ReactEditText;
import ze.n0;
import java.lang.Object;
import android.widget.TextView;
import android.view.KeyEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import df.c;
import ag.l;
import android.widget.EditText;
import android.text.Editable;
import df.b;

public class ReactTextInputManager$c implements TextView$OnEditorActionListener	// class@00142a
{
    public final ReactEditText a;
    public final n0 b;
    public final ReactTextInputManager c;

    public void ReactTextInputManager$c(ReactTextInputManager p0,ReactEditText p1,n0 p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public boolean onEditorAction(TextView p0,int p1,KeyEvent p2){
       if (PatchProxy.isSupport(ReactTextInputManager$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), p2, this, ReactTextInputManager$c.class, "1");
          if (p0 != PatchProxyResult.class) {
             return p0.booleanValue();
          }
       }
       boolean b = true;
       if ((p1 & 0x00ff) || !p1) {
          boolean blurOnSubmit = this.a.getBlurOnSubmit();
          boolean b1 = this.a.d();
          this.b.getNativeModule(UIManagerModule.class).getEventDispatcher().c(new l(this.a.getId(), this.a.getText().toString()));
          if (blurOnSubmit) {
             this.a.clearFocus();
          }
          if (!blurOnSubmit && (!b1 || (p1 != 5 && p1 != 7))) {
             b = false;
          }
       label_0071 :
          return b;
       }else {
          return b;
       }
    }
}
