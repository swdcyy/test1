package com.kwai.chat.kwailink.net.SignalStrengthsHandler$c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ca7.f;
import com.google.gson.Gson;

public class SignalStrengthsHandler$c	// class@000a64
{
    public boolean a;
    public int b;
    public boolean c;
    public int d;

    public void SignalStrengthsHandler$c(){
       super();
       this.a = false;
       this.b = -1;
       this.c = false;
       this.d = 0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, SignalStrengthsHandler$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return f.b.q(this);
    }
}
