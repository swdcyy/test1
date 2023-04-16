package k71.u$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class u$a	// class@002cc9
{
    public boolean isLowPhone;

    public void u$a(){
       super(false);
    }
    public void u$a(boolean p0){
       super();
       this.isLowPhone = p0;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof u$a && this.isLowPhone == p0.isLowPhone)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       u$a tisLowPhone = this.isLowPhone;
       if (tisLowPhone != null) {
          tisLowPhone = 1;
       }
       return tisLowPhone;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, u$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Response\(isLowPhone="+this.isLowPhone+"\)";
    }
}
