package lz0.c$d;
import jk1.c;
import lz0.c;
import java.lang.Object;
import jk1.d;
import com.kwai.framework.model.user.UserInfo;
import jk1.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bk2.e;

public class c$d implements c	// class@003083
{
    public final c a;

    public void c$d(c p0){
       this.a = p0;
       super();
    }
    public void a(d p0,UserInfo p1){
       b.e(this, p0, p1);
    }
    public void c(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$d.class, "1")) {
          return;
       }
       this.a.M.e();
       return;
    }
    public void d(){
       b.c(this);
    }
    public void e(int p0,int p1){
       b.d(this, p0, p1);
    }
    public void f(d p0){
       b.b(this, p0);
    }
}
