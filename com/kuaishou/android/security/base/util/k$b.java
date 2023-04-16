package com.kuaishou.android.security.base.util.k$b;
import javax.net.ssl.HostnameVerifier;
import java.lang.Object;
import com.kuaishou.android.security.base.util.k$a;
import java.lang.String;
import javax.net.ssl.SSLSession;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.util.ArrayList;
import com.kuaishou.android.security.base.util.k;
import java.util.Iterator;

public class k$b implements HostnameVerifier	// class@000f24
{

    public void k$b(){
       super();
    }
    public void k$b(k$a p0){
       super();
    }
    public boolean verify(String p0,SSLSession p1){
       p1 = PatchProxy.applyTwoRefs(p0, p1, this, k$b.class, "1");
       if (p1 != PatchProxyResult.class) {
          return p1.booleanValue();
       }
       if (!TextUtils.isEmpty(p0)) {
          Iterator iterator = k.a().iterator();
          while (iterator.hasNext()) {
             if (p0.contains(iterator.next())) {
                return true;
             }
          }
       }
       return false;
    }
}
