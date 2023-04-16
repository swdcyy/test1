package com.yxcorp.login.helper.a;
import erd.o;
import com.yxcorp.login.helper.c;
import java.lang.String;
import java.lang.Object;
import java.security.KeyPair;
import java.util.Objects;
import java.util.HashMap;
import gud.a;
import java.util.Map;
import com.yxcorp.login.loginaction.LoginHelper;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import l1d.a;
import erd.g;

public final class a implements o	// class@001ab5
{
    public final c b;
    public final String c;
    public final String d;

    public void a(c p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       p0 = new HashMap();
       p0.put("code", this.c);
       p0.put("password", a.f(this.d));
       tb.a.c(p0);
       return b.a(0x5cfaafff).o(p0).map(new e()).doOnNext(new a(tb));
    }
}
