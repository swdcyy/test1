package com.kwai.framework.accountsecurity.c;
import java.util.concurrent.Callable;
import java.lang.Object;
import com.kwai.framework.accountsecurity.d;
import java.security.KeyPair;
import e66.c;
import java.lang.String;
import q87.c;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import zb6.a;
import com.yxcorp.utility.TextUtils;

public final class c implements Callable	// class@0014ce
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final Object call(){
       KeyPair keyPair;
       String str = "ks://keygen";
       int i = 0;
       if (d.h()) {
          keyPair = d.d();
          Object[] objArray = new Object[i];
          c.C().s(str, "getExistKeyPair", objArray);
       }else {
          int i1 = 40;
          Object[] objArray1 = new Object[i];
          c.C().s(str, "getKeyPair1", objArray1);
          KeyPair keyPair1 = d.e();
          u1.I0(i1, 7, i);
          keyPair = keyPair1;
       }
       return keyPair;
    }
}
