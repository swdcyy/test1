package com.facebook.react.modules.network.e$b$a;
import android.os.Handler$Callback;
import com.facebook.react.modules.network.e$b;
import com.facebook.react.modules.network.e;
import java.lang.Object;
import android.os.Message;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class e$b$a implements Handler$Callback	// class@0012d2
{
    public final e b;
    public final e$b c;

    public void e$b$a(e$b p0,e p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public boolean handleMessage(Message p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e$b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0.what != true) {
          return false;
       }
       this.c.b();
       return true;
    }
}
