package com.kwai.dva.dex2oat.Dex2OatManager$mClassVerifyHandler$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.dva.dex2oat.verify.ClassVerifyHandlerImpl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Dex2OatManager$mClassVerifyHandler$2 extends Lambda implements a	// class@000ad5
{
    public static final Dex2OatManager$mClassVerifyHandler$2 INSTANCE;

    static {
       Dex2OatManager$mClassVerifyHandler$2.INSTANCE = new Dex2OatManager$mClassVerifyHandler$2();
    }
    public void Dex2OatManager$mClassVerifyHandler$2(){
       super(0);
    }
    public final ClassVerifyHandlerImpl invoke(){
       Object obj = PatchProxy.apply(null, this, Dex2OatManager$mClassVerifyHandler$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ClassVerifyHandlerImpl();
    }
    public Object invoke(){
       return this.invoke();
    }
}
