package jy1.b$b;
import jy1.b;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class b$b implements b	// class@002c32
{

    public void b$b(){
       super();
    }
    public void a(String p0){
    }
    public boolean b(String p0){
       return false;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ForbiddenFrequencyStrategy@"+Integer.toHexString(System.identityHashCode(this));
    }
}
