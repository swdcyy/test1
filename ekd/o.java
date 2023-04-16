package ekd.o;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;

public final class o	// class@000d67
{
    public final String a;

    public void o(String p0){
       a.p(p0, "content");
       super();
       this.a = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof o && a.g(this.a, p0.a))) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       o ta = this.a;
       int i = (ta != null)? ta.hashCode(): 0;
       return i;
    }
    public String toString(){
       return "ClipboardEvent\(content="+this.a+"\)";
    }
}
