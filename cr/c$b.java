package cr.c$b;
import cr.h$a;
import cr.h;
import com.kuaishou.android.vader.stat.ValueOrException;
import java.util.Map;
import java.lang.Integer;
import cr.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import cr.c;
import java.lang.IllegalStateException;
import java.util.Objects;

public final class c$b extends h$a	// class@001420
{
    public ValueOrException a;
    public ValueOrException b;
    public Map c;
    public Map d;
    public Map e;
    public Map f;
    public Integer g;
    public Integer h;
    public Integer i;

    public void c$b(){
       super();
    }
    public void c$b(h p0){
       super();
       this.a = p0.j();
       this.b = p0.i();
       this.c = p0.c();
       this.d = p0.b();
       this.e = p0.f();
       this.f = p0.e();
       this.g = Integer.valueOf(p0.h());
       this.h = Integer.valueOf(p0.d());
       this.i = Integer.valueOf(p0.g());
    }
    public void c$b(h p0,c$a p1){
       super(p0);
    }
    public h a(){
       String obj = PatchProxy.apply(null, this, c$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (this.a == null)? " seqId": "";
       if (this.b == null) {
          obj = obj+" seqDbId";
       }
       if (this.c == null) {
          obj = obj+" channelId";
       }
       if (this.d == null) {
          obj = obj+" channelDbId";
       }
       if (this.e == null) {
          obj = obj+" customId";
       }
       if (this.f == null) {
          obj = obj+" customDbId";
       }
       if (this.g == null) {
          obj = obj+" generatedIdCount";
       }
       if (this.h == null) {
          obj = obj+" commitCount";
       }
       if (this.i == null) {
          obj = obj+" failedCommitCount";
       }
       if (obj.isEmpty()) {
          c uoc = new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g.intValue(), this.h.intValue(), this.i.intValue(), null);
          return obj;
       }else {
          throw new IllegalStateException("Missing required properties:"+obj);
       }
    }
    public h$a b(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null channelDbId");
       this.d = p0;
       return this;
    }
    public h$a c(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null channelId");
       this.c = p0;
       return this;
    }
    public h$a d(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.h = Integer.valueOf(p0);
       return this;
    }
    public h$a e(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null customDbId");
       this.f = p0;
       return this;
    }
    public h$a f(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null customId");
       this.e = p0;
       return this;
    }
    public h$a g(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.i = Integer.valueOf(p0);
       return this;
    }
    public h$a h(int p0){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.g = Integer.valueOf(p0);
       return this;
    }
    public h$a i(ValueOrException p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null seqDbId");
       this.b = p0;
       return this;
    }
    public h$a j(ValueOrException p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Objects.requireNonNull(p0, "Null seqId");
       this.a = p0;
       return this;
    }
}
