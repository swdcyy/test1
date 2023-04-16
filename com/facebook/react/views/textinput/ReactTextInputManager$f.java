package com.facebook.react.views.textinput.ReactTextInputManager$f;
import ag.n;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.facebook.react.views.textinput.ReactEditText;
import java.lang.Object;
import android.content.Context;
import android.widget.EditText;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.lang.Class;
import com.facebook.react.bridge.NativeModule;
import df.c;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Math;
import ag.k;
import df.b;

public class ReactTextInputManager$f implements n	// class@00142d
{
    public ReactEditText a;
    public c b;
    public int c;
    public int d;
    public final ReactTextInputManager e;

    public void ReactTextInputManager$f(ReactTextInputManager p0,ReactEditText p1){
       this.e = p0;
       super();
       this.a = p1;
       this.b = p1.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
    }
    public void a(int p0,int p1){
       ReactTextInputManager$f uof = ReactTextInputManager$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "1")) {
          return;
       }
       int i = Math.min(p0, p1);
       p0 = Math.max(p0, p1);
       if (this.c != i || this.d != p0) {
          this.b.c(new k(this.a.getId(), i, p0));
          this.c = i;
          this.d = p0;
       }
       return;
    }
}
