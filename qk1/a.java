package qk1.a;
import java.lang.Object;
import com.kwai.framework.model.user.UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mk1.d;
import java.lang.Integer;

public abstract class a	// class@003941
{
    public boolean a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public UserInfo g;

    public void a(){
       super();
       this.a = true;
       this.b = -1;
       this.c = -1;
       this.d = -1;
       this.e = -1;
       this.g = null;
    }
    public UserInfo a(){
       return this.g;
    }
    public int b(){
       return this.c;
    }
    public int c(){
       return this.b;
    }
    public int d(){
       return this.e;
    }
    public int e(){
       return this.d;
    }
    public boolean f(){
       return this.a;
    }
    public boolean g(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.e() > 0)? true: false;
       return b;
    }
    public void h(UserInfo p0){
       this.g = p0;
    }
    public void i(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.k(p0.a);
       this.j(p0.b);
       return;
    }
    public void j(int p0){
       this.c = p0;
    }
    public void k(int p0){
       this.b = p0;
    }
    public void l(int p0){
       this.e = p0;
    }
    public void m(int p0){
       this.d = p0;
    }
    public void n(int p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       this.m(p0);
       this.l(p1);
       return;
    }
}
