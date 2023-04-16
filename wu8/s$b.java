package wu8.s$b;
import wu8.q$a;
import wu8.q;
import java.lang.String;
import java.lang.Long;
import java.lang.Boolean;
import ub7.f;
import bv8.a;
import wu8.o;
import java.lang.Object;
import java.util.Objects;
import java.lang.StringBuilder;
import wu8.s;
import wu8.s$a;
import java.lang.IllegalStateException;

public final class s$b extends q$a	// class@002795
{
    public String a;
    public Long b;
    public Boolean c;
    public f d;
    public a e;
    public o f;
    public Boolean g;
    public f h;
    public f i;
    public String j;
    public Boolean k;
    public Long l;
    public Boolean m;

    public void s$b(){
       super();
    }
    public void s$b(q p0){
       super();
       this.a = p0.n();
       this.b = Long.valueOf(p0.l());
       this.c = Boolean.valueOf(p0.g());
       this.d = p0.h();
       this.e = p0.c();
       this.f = p0.j();
       this.g = Boolean.valueOf(p0.i());
       this.h = p0.b();
       this.i = p0.a();
       this.j = p0.k();
       this.k = Boolean.valueOf(p0.d());
       this.l = Long.valueOf(p0.e());
       this.m = Boolean.valueOf(p0.f());
    }
    public q$a a(f p0){
       Objects.requireNonNull(p0, "Null apiParams");
       this.i = p0;
       return this;
    }
    public q$a b(f p0){
       Objects.requireNonNull(p0, "Null apiRouter");
       this.h = p0;
       return this;
    }
    public q$a c(a p0){
       Objects.requireNonNull(p0, "Null apiService");
       this.e = p0;
       return this;
    }
    public q d(){
       s$b uob = this;
       String str = (uob.a == null)? " userId": "";
       if (uob.b == null) {
          str = str+" requestInterval";
       }
       if (uob.c == null) {
          str = str+" isInMultiProcessMode";
       }
       if (uob.d == null) {
          str = str+" isInSubsidiaryMode";
       }
       if (uob.e == null) {
          str = str+" apiService";
       }
       if (uob.g == null) {
          str = str+" needSwitchHost";
       }
       if (uob.h == null) {
          str = str+" apiRouter";
       }
       if (uob.i == null) {
          str = str+" apiParams";
       }
       if (uob.j == null) {
          str = str+" requestConfigUrlPath";
       }
       if (uob.k == null) {
          str = str+" enableEntranceLog";
       }
       if (uob.l == null) {
          str = str+" entranceLogIntervalMs";
       }
       if (uob.m == null) {
          str = str+" entranceLogUsingHighFrequency";
       }
       if (str.isEmpty()) {
          s os = new s(uob.a, uob.b.longValue(), uob.c.booleanValue(), uob.d, uob.e, uob.f, uob.g.booleanValue(), uob.h, uob.i, uob.j, uob.k.booleanValue(), uob.l.longValue(), uob.m.booleanValue(), null);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:"+str);
       }
    }
    public q$a e(boolean p0){
       this.k = Boolean.valueOf(p0);
       return this;
    }
    public q$a f(long p0){
       this.l = Long.valueOf(p0);
       return this;
    }
    public q$a g(boolean p0){
       this.m = Boolean.valueOf(p0);
       return this;
    }
    public q$a h(boolean p0){
       this.c = Boolean.valueOf(p0);
       return this;
    }
    public q$a i(f p0){
       Objects.requireNonNull(p0, "Null isInSubsidiaryMode");
       this.d = p0;
       return this;
    }
    public q$a j(boolean p0){
       this.g = Boolean.valueOf(p0);
       return this;
    }
    public q$a k(o p0){
       this.f = p0;
       return this;
    }
    public q$a l(String p0){
       Objects.requireNonNull(p0, "Null requestConfigUrlPath");
       this.j = p0;
       return this;
    }
    public q$a m(long p0){
       this.b = Long.valueOf(p0);
       return this;
    }
    public q$a n(String p0){
       Objects.requireNonNull(p0, "Null userId");
       this.a = p0;
       return this;
    }
}
