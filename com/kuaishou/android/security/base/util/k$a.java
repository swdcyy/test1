package com.kuaishou.android.security.base.util.k$a;
import okhttp3.CookieJar;
import com.kuaishou.android.security.base.util.k;
import java.lang.Object;
import okhttp3.HttpUrl;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.ArrayList;
import com.kuaishou.android.security.bridge.main.b;
import com.kuaishou.android.security.internal.common.KSecurityContext;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kuaishou.android.security.base.util.n;
import okhttp3.Cookie$Builder;
import okhttp3.Cookie;
import java.lang.Throwable;
import com.kuaishou.android.security.base.log.d;

public class k$a implements CookieJar	// class@000f23
{
    public final k a;

    public void k$a(k p0){
       this.a = p0;
       super();
    }
    public List loadForRequest(HttpUrl p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, this, k$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       String did = b.i().h().getDid();
       if (TextUtils.isEmpty(did)) {
          did = n.b(did);
       }
       if (TextUtils.isEmpty(did)) {
          did = "unknow";
       }
       obj.add(new Cookie$Builder().domain(p0.host()).name("did").value(did).build());
       return obj;
    }
    public void saveFromResponse(HttpUrl p0,List p1){
    }
}
