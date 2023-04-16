package com.yxcorp.login.debuglogin.f;
import erd.o;
import j1d.e;
import java.util.Map;
import com.yxcorp.login.debuglogin.DebugAccountInfo;
import java.lang.Object;
import java.security.KeyPair;
import java.util.Objects;
import com.yxcorp.login.loginaction.LoginHelper;
import wkd.b;
import m1d.a;
import brd.t;
import cjd.e;
import j1d.c;
import erd.g;
import com.yxcorp.login.debuglogin.e;

public final class f implements o	// class@001ab2
{
    public final e b;
    public final Map c;
    public final DebugAccountInfo d;

    public void f(e p0,Map p1,DebugAccountInfo p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       f tc = this.c;
       f td = this.d;
       Objects.requireNonNull(tb);
       tc.put("quickloginToken", td.mQuickLoginToken);
       tc.put("userId", td.mUid);
       tb.b.c(tc);
       p0 = b.a(0x5cfaafff).v(tc);
       return p0.map(new e()).doOnNext(new c(tb)).doOnError(e.b);
    }
}
