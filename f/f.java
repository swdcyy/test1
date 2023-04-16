package f.f;
import f.n$c;
import java.lang.String;
import java.util.Set;
import f.f$a;
import java.lang.Object;
import java.lang.StringBuilder;

public final class f extends n$c	// class@001f91
{
    public final int a;
    public final String b;
    public final String c;
    public final Set d;
    public final String e;

    public void f(int p0,String p1,String p2,Set p3,String p4,f$a p5){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public String b(){
       return this.c;
    }
    public Set c(){
       return this.d;
    }
    public String d(){
       return this.e;
    }
    public String e(){
       return this.b;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n$c) {
          return false;
       }
       if (this.a != p0.f() || (!(this.b).equals(p0.e()) || (!(this.c).equals(p0.b()) || (!this.d.equals(p0.c()) || !(this.e).equals(p0.d()))))) {
          b = false;
       }
       return b;
    }
    public int f(){
       return this.a;
    }
    public int hashCode(){
       return (((((((((this.a ^ 0xf4243) * 0xf4243) ^ (this.b).hashCode()) * 0xf4243) ^ (this.c).hashCode()) * 0xf4243) ^ this.d.hashCode()) * 0xf4243) ^ (this.e).hashCode());
    }
    public String toString(){
       return "InterpreterConfigBean{needUpdate="+this.a+", interpreterVer="+this.b+", interpreterCdn="+this.c+", interpreterCdnList="+this.d+", interpreterMd5="+this.e+"}";
    }
}
