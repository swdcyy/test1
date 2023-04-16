package com.facebook.react.views.textinput.ReactTextInputManager$d;
import ag.a;
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
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.text.Layout;
import ag.b;
import ze.p;
import df.b;

public class ReactTextInputManager$d implements a	// class@00142b
{
    public ReactEditText a;
    public c b;
    public int c;
    public int d;
    public final ReactTextInputManager e;

    public void ReactTextInputManager$d(ReactTextInputManager p0,ReactEditText p1){
       this.e = p0;
       super();
       this.c = 0;
       this.d = 0;
       this.a = p1;
       this.b = p1.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, ReactTextInputManager$d.class, "1")) {
          return;
       }
       int width = this.a.getWidth();
       int height = this.a.getHeight();
       if (this.a.getLayout() != null) {
          width = (this.a.getCompoundPaddingLeft() + this.a.getLayout().getWidth()) + this.a.getCompoundPaddingRight();
          height = (this.a.getCompoundPaddingTop() + this.a.getLayout().getHeight()) + this.a.getCompoundPaddingBottom();
       }
       if (width != this.c || height != this.d) {
          this.d = height;
          this.c = width;
          this.b.c(new b(this.a.getId(), p.a((float)width), p.a((float)height)));
       }
       return;
    }
}
