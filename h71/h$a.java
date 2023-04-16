package h71.h$a;
import nsd.u;
import java.lang.Object;
import o56.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public final class h$a	// class@002635
{
    public final boolean isFirstInstall;

    public void h$a(){
       super(false, 1, null);
    }
    public void h$a(boolean p0){
       super();
       this.isFirstInstall = p0;
    }
    public void h$a(boolean p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = TextUtils.x(a.n);
       }
       super(p0);
       return;
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof h$a && this.isFirstInstall == p0.isFirstInstall)) {
          return true;
       }
       return false;
    }
    public int hashCode(){
       h$a tisFirstInst = this.isFirstInstall;
       if (tisFirstInst != null) {
          tisFirstInst = 1;
       }
       return tisFirstInst;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, h$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Result\(isFirstInstall="+this.isFirstInstall+"\)";
    }
}
