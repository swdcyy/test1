package f.b;
import f.h;
import java.lang.String;
import java.util.Set;
import f.b$a;
import java.lang.Object;
import java.lang.StringBuilder;

public final class b extends h	// class@001f86
{
    public final int a;
    public final String b;
    public final String c;
    public final Set d;
    public final String e;

    public void b(int p0,String p1,String p2,Set p3,String p4,b$a p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public String a(){
       return this.b;
    }
    public Set b(){
       return this.d;
    }
    public String c(){
       return this.c;
    }
    public int d(){
       return this.a;
    }
    public String e(){
       return this.e;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof h) {
          return false;
       }
       if (this.a != p0.d() || (!(this.b).equals(p0.a()) || (!(this.c).equals(p0.c()) || (!this.d.equals(p0.b()) || !(this.e).equals(p0.e()))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((((this.a ^ 0xf4243) * 0xf4243) ^ (this.b).hashCode()) * 0xf4243) ^ (this.c).hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ (this.e).hashCode());
    }
    public String toString(){
       return "BCUpdateEntry{bcVer="+this.a+", bcCdn="+this.b+", bcMd5="+this.c+", bcCdnList="+this.d+", vmBizId="+this.e+"}";
    }
}
