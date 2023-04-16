package com.kwai.framework.accountsecurity.b;
import java.util.concurrent.Callable;
import com.kwai.framework.accountsecurity.d$a;
import java.lang.Object;
import com.kwai.framework.accountsecurity.d;
import java.security.KeyPair;
import e66.c;
import java.lang.String;
import q87.c;
import java.lang.Throwable;
import android.util.Log;
import k2b.u1;
import l56.b;
import java.lang.Runnable;
import ekd.k1;
import zb6.a;
import com.yxcorp.utility.TextUtils;
import e66.a;
import l56.a;

public final class b implements Callable	// class@0014cd
{
    public final d$a b;

    public void b(d$a p0){
       this.b = p0;
    }
    public final Object call(){
       KeyPair keyPair;
       b tb = this.b;
       String str = "ks://keygen";
       int i = 0;
       if (d.h()) {
          keyPair = d.d();
          Object[] objArray = new Object[i];
          c.C().s(str, "getExistKeyPair", objArray);
       }else {
          int i1 = 40;
          keyPair = d.e();
          Object[] objArray1 = new Object[i];
          c.C().s(str, "getKeyPair1", objArray1);
          u1.I0(i1, 7, i);
       }
       k1.o(new b(tb, keyPair));
       return keyPair;
    }
}
