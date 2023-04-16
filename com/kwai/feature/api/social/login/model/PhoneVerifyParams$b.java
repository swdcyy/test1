package com.kwai.feature.api.social.login.model.PhoneVerifyParams$b;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.login.model.PhoneVerifyParams$a;

public class PhoneVerifyParams$b	// class@001118
{
    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public int h;
    public boolean i;
    public boolean j;
    public String k;
    public boolean l;
    public int m;
    public boolean n;
    public int o;

    public void PhoneVerifyParams$b(){
       super();
    }
    public PhoneVerifyParams a(){
       Object obj = PatchProxy.apply(null, this, PhoneVerifyParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new PhoneVerifyParams(this, null);
    }
    public PhoneVerifyParams$b b(boolean p0){
       this.l = p0;
       return this;
    }
    public PhoneVerifyParams$b c(int p0){
       this.m = p0;
       return this;
    }
    public PhoneVerifyParams$b d(boolean p0){
       this.n = p0;
       return this;
    }
    public PhoneVerifyParams$b e(String p0){
       this.k = p0;
       return this;
    }
    public PhoneVerifyParams$b f(boolean p0){
       this.j = p0;
       return this;
    }
    public PhoneVerifyParams$b g(String p0){
       this.b = p0;
       return this;
    }
    public PhoneVerifyParams$b h(String p0){
       this.a = p0;
       return this;
    }
    public PhoneVerifyParams$b i(String p0){
       this.g = p0;
       return this;
    }
    public PhoneVerifyParams$b j(int p0){
       this.h = p0;
       return this;
    }
    public PhoneVerifyParams$b k(int p0){
       this.o = p0;
       return this;
    }
    public PhoneVerifyParams$b l(String p0){
       this.c = p0;
       return this;
    }
    public PhoneVerifyParams$b m(String p0){
       this.d = p0;
       return this;
    }
}
