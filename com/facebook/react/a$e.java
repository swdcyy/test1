package com.facebook.react.a$e;
import ae.g;
import com.facebook.react.a;
import me.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.facebook.react.a$e$a;
import java.lang.Runnable;
import com.facebook.react.bridge.UiThreadUtil;

public class a$e implements g	// class@001174
{
    public final a a;
    public final a b;

    public void a$e(a p0,a p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(boolean p0){
       a$e uoe = a$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoe, "1")) {
          return;
       }
       UiThreadUtil.runOnUiThread(new a$e$a(this, p0));
       return;
    }
}
