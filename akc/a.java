package akc.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.StringBuilder;

public final class a	// class@00014a
{
    public long a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int i;
    public String j;
    public String k;
    public String l;
    public long m;

    public void a(long p0,String p1,String p2,String p3,String p4,String p5,String p6,String p7,int p8,String p9,String p10,String p11,long p12){
       int i = this;
       a.p(p1, "userId");
       a.p(p2, "sourceUserId");
       super();
       i.a = p0;
       i.b = p1;
       i.c = p2;
       i.d = p3;
       i.e = p4;
       i.f = p5;
       i.g = p6;
       i.h = p7;
       i.i = p8;
       i.j = p9;
       i.k = p10;
       i.l = p11;
       i.m = p12;
    }
    public final String a(){
       return this.h;
    }
    public final long b(){
       return this.a;
    }
    public final String c(){
       return this.d;
    }
    public final String d(){
       return this.e;
    }
    public final String e(){
       return this.k;
    }
    public boolean equals(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this == p0 || (p0 instanceof a && (!this.a - p0.a && (a.g(this.b, p0.b) && (a.g(this.c, p0.c) && (a.g(this.d, p0.d) && (a.g(this.e, p0.e) && (a.g(this.f, p0.f) && (a.g(this.g, p0.g) && (a.g(this.h, p0.h) && (this.i == p0.i && (a.g(this.j, p0.j) && (a.g(this.k, p0.k) && (a.g(this.l, p0.l) && !this.m - p0.m)))))))))))))) {
          return true;
       }
       return false;
    }
    public final String f(){
       return this.j;
    }
    public final String g(){
       return this.f;
    }
    public final String h(){
       return this.g;
    }
    public int hashCode(){
       a obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       long l = 32;
       int i = (int)(obj ^ (obj >> l)) * 31;
       obj = this.b;
       int i1 = 0;
       int i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.c;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.d;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.e;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.f;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.g;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.h;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (((i + i2) * 31) + this.i) * 31;
       obj = this.j;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.k;
       i2 = (obj != null)? obj.hashCode(): 0;
       i = (i + i2) * 31;
       obj = this.l;
       if (obj != null) {
          i1 = obj.hashCode();
       }
       a tm = this.m;
       return (((i + i1) * 31) + (int)(tm ^ (tm >> l)));
    }
    public final String i(){
       return this.l;
    }
    public final String j(){
       return this.c;
    }
    public final long k(){
       return this.m;
    }
    public final String l(){
       return this.b;
    }
    public final int m(){
       return this.i;
    }
    public final void n(long p0){
       this.m = p0;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FolUserSearch\(id="+this.a+", userId="+this.b+", sourceUserId="+this.c+", name="+this.d+", namePY="+this.e+", remarkName="+this.f+", remarkNamePY="+this.g+", gender="+this.h+", isFriend="+this.i+", raw="+this.j+", namePYStart="+this.k+", remarkNamePYStart="+this.l+", time="+this.m+"\)";
    }
}
