package com.kwai.feature.component.searchhistory.d;
import com.kwai.feature.component.searchhistory.a;
import g06.e;
import com.kwai.feature.component.searchhistory.d$c;
import com.kwai.feature.component.searchhistory.a$a;
import com.kwai.feature.component.searchhistory.a$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.feature.component.searchhistory.d$b;
import com.kwai.feature.component.searchhistory.a$d;
import com.kwai.feature.component.searchhistory.d$a;

public class d extends a	// class@0012a6
{
    public a$d C;
    public String D;
    public a$a E;

    public void d(e p0){
       super(p0);
       this.D = "music";
       this.E = new d$c(this);
    }
    public a$a r1(){
       return this.E;
    }
    public a$c s1(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d$b(this);
    }
    public String t1(){
       return this.D;
    }
    public a$d u1(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.C == null) {
          this.C = new d$a(this);
       }
       return this.C;
    }
    public void w1(String p0){
       this.D = p0;
    }
}
