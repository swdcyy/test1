package com.facebook.react.views.textinput.ReactTextInputManager$e;
import ag.m;
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
import com.facebook.react.views.scroll.ScrollEventType;
import uf.c;
import df.b;

public class ReactTextInputManager$e implements m	// class@00142c
{
    public ReactEditText a;
    public c b;
    public int c;
    public int d;
    public final ReactTextInputManager e;

    public void ReactTextInputManager$e(ReactTextInputManager p0,ReactEditText p1){
       this.e = p0;
       super();
       this.a = p1;
       this.b = p1.getContext().getNativeModule(UIManagerModule.class).getEventDispatcher();
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(ReactTextInputManager$e.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, ReactTextInputManager$e.class, "1")) {
          return;
       }
       if (this.c != p0 || this.d != p1) {
          this.b.c(c.k(this.a.getId(), ScrollEventType.SCROLL, p0, p1, 0, 0, 0, 0, this.a.getWidth(), this.a.getHeight()));
          this.c = p0;
          this.d = p1;
       }
       return;
    }
}
