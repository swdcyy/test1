package f.e;
import f.n$a;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class e extends n$a	// class@001f8e
{
    public final int a;

    public void e(int p0){
       this.a = p0;
    }
    public int b(){
       return this.a;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof n$a) {
          return false;
       }
       if (this.a != p0.b()) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (this.a ^ 0xf4243);
    }
    public String toString(){
       return "BitcodeConfigBean{needUpdate="+this.a+"}";
    }
}
