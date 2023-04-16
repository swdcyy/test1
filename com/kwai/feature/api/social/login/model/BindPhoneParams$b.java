package com.kwai.feature.api.social.login.model.BindPhoneParams$b;
import java.lang.Object;
import com.kwai.feature.api.social.login.model.BindPhoneParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.api.social.login.model.BindPhoneParams$a;
import com.kwai.feature.api.social.login.model.BindPhoneParams$ActionBarType;
import com.kwai.feature.api.social.login.model.BindPhoneParams$FirstStepPageStyle;

public class BindPhoneParams$b	// class@001112
{
    public String A;
    public String B;
    public Map C;
    public int a;
    public boolean b;
    public boolean c;
    public String d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public String j;
    public int k;
    public String l;
    public String m;
    public String n;
    public long o;
    public String p;
    public boolean q;
    public String r;
    public String s;
    public int t;
    public BindPhoneParams$ActionBarType u;
    public BindPhoneParams$ActionBarType v;
    public String w;
    public int x;
    public int y;
    public BindPhoneParams$FirstStepPageStyle z;

    public void BindPhoneParams$b(){
       super();
       this.c = true;
    }
    public BindPhoneParams a(){
       Object obj = PatchProxy.apply(null, this, BindPhoneParams$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new BindPhoneParams(this, null);
    }
    public BindPhoneParams$b b(boolean p0){
       this.c = p0;
       return this;
    }
    public BindPhoneParams$b c(BindPhoneParams$ActionBarType p0){
       this.v = p0;
       return this;
    }
    public BindPhoneParams$b d(String p0){
       this.p = p0;
       return this;
    }
    public BindPhoneParams$b e(String p0){
       this.j = p0;
       return this;
    }
    public BindPhoneParams$b f(BindPhoneParams$FirstStepPageStyle p0){
       this.z = p0;
       return this;
    }
    public BindPhoneParams$b g(String p0){
       this.d = p0;
       return this;
    }
    public BindPhoneParams$b h(int p0){
       this.i = p0;
       return this;
    }
    public BindPhoneParams$b i(boolean p0){
       this.g = p0;
       return this;
    }
    public BindPhoneParams$b j(int p0){
       this.a = p0;
       return this;
    }
    public BindPhoneParams$b k(boolean p0){
       this.h = p0;
       return this;
    }
    public BindPhoneParams$b l(BindPhoneParams$ActionBarType p0){
       this.u = p0;
       return this;
    }
    public BindPhoneParams$b m(boolean p0){
       this.b = p0;
       return this;
    }
    public BindPhoneParams$b n(boolean p0){
       this.f = p0;
       return this;
    }
    public BindPhoneParams$b o(boolean p0){
       this.e = p0;
       return this;
    }
    public BindPhoneParams$b p(long p0){
       this.o = p0;
       return this;
    }
}
