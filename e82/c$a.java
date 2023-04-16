package e82.c$a;
import java.lang.Object;
import e82.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import mk1.b;
import lm1.i;
import com.kwai.framework.model.user.UserInfo;

public class c$a	// class@0026a3
{
    public long a;
    public boolean b;
    public i c;
    public int d;
    public Gift e;
    public int f;
    public boolean g;
    public UserInfo h;
    public DrawingGift i;
    public b j;
    public int k;

    public void c$a(){
       super();
    }
    public c a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new c(this);
    }
    public c$a b(b p0){
       this.j = p0;
       return this;
    }
    public c$a c(int p0){
       this.d = p0;
       return this;
    }
    public c$a d(boolean p0){
       this.b = p0;
       return this;
    }
    public c$a e(long p0){
       this.a = p0;
       return this;
    }
    public c$a f(i p0){
       this.c = p0;
       return this;
    }
    public c$a g(UserInfo p0){
       this.h = p0;
       return this;
    }
}
