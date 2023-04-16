package jy1.b$a;
import jy1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class b$a implements b	// class@002c31
{

    public void b$a(){
       super();
    }
    public void a(String p0){
    }
    public boolean b(String p0){
       return true;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "NoLimitFrequencyStrategy@"+Integer.toHexString(System.identityHashCode(this));
    }
}
