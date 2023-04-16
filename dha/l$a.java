package dha.l$a;
import eda.l;
import java.lang.Object;
import eda.n;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class l$a	// class@0024ac
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public void l$a(l p0){
       super();
       this.a = true;
       this.c = p0.b;
       this.b = p0.a;
       this.e = p0.d;
       this.d = p0.c;
    }
    public void l$a(n p0){
       super();
       this.a = false;
       this.c = p0.a;
       this.b = false;
       this.e = false;
       this.d = false;
    }
    public boolean a(){
       return this.a;
    }
    public boolean b(){
       return (this.a ^ 0x01);
    }
    public boolean c(){
       return this.c;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, l$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "Status{mIsLogined="+this.a+", mIsSwitchAccount="+this.c+", mIsNewRegister="+this.b+", mIsResetPassword="+this.d+", mIsAddAccount="+this.e+'}';
    }
}
