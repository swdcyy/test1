package com.yxcorp.login.helper.b;
import erd.o;
import com.yxcorp.login.helper.c;
import java.util.Map;
import java.lang.String;
import java.lang.Object;
import java.security.KeyPair;
import java.util.Objects;
import gud.a;
import s00.b$b;
import s00.b;
import java.security.PublicKey;
import com.yxcorp.login.loginaction.LoginHelper;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import l1d.b;
import erd.g;

public final class b implements o	// class@001ab6
{
    public final c b;
    public final Map c;
    public final String d;
    public final String e;

    public void b(c p0,Map p1,String p2,String p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       b tb = this.b;
       b tc = this.c;
       Objects.requireNonNull(tb);
       tc.put("userId", this.d);
       tc.put("password", a.f(this.e));
       if (p0 != null) {
          tc.put("publicKey", b.b().a(p0.getPublic().getEncoded()));
       }
       tb.a.c(tc);
       return b.a(0x5cfaafff).n0(tc).map(new e()).doOnNext(new b(tb));
    }
}
