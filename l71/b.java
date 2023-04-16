package l71.b;
import gq1.h$b;
import l71.a;
import asd.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import gq1.i;
import com.kuaishou.protobuf.livestream.nano.SCInteractiveChatCall;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.Result;
import o63.m;
import o63.m$a;
import zb6.a;
import com.kuaishou.protobuf.livestream.nano.InteractiveChatUserInfoIdentity;

public final class b implements h$b	// class@002e8f
{
    public final a a;
    public final c b;

    public void b(a p0,c p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void a(String p0,boolean p1,Throwable p2){
       i.e(this, p0, p1, p2);
    }
    public void b(SCInteractiveChatCall p0){
       i.g(this, p0);
    }
    public void c(String p0,boolean p1,Throwable p2){
       i.b(this, p0, p1, p2);
    }
    public void d(String p0){
       i.d(this, p0);
    }
    public void e(String p0,boolean p1,Throwable p2){
       i.h(this, p0, p1, p2);
    }
    public void f(String p0,boolean p1,Throwable p2){
       if (PatchProxy.isSupport(b.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), p2, this, b.class, "1")) {
          return;
       }
       this.a.m();
       p0 = null;
       if (p1) {
          this.b.resumeWith(Result.constructor-impl(m$a.g(m.g, p0, false, 3, p0)));
       }else {
          int i = a.b(p2);
          if (p2 != null) {
             p0 = p2.getMessage();
          }
          this.b.resumeWith(Result.constructor-impl(m.g.a(i, p0)));
       }
       return;
    }
    public void g(String p0,int p1,int p2){
       i.c(this, p0, p1, p2);
    }
    public void h(InteractiveChatUserInfoIdentity p0){
       i.f(this, p0);
    }
}
