package a84.b;
import com.kuaishou.merchant.marketing.base.lifecycle.MarketingBasePresenter;
import b84.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a84.a;
import a84.a$a;
import g14.e;
import g14.c;

public final class b extends MarketingBasePresenter	// class@00003e
{
    public a I;

    public void b(){
       super();
       this.I = new a();
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, b.class, "2")) {
          return;
       }
       a$a c = a.c;
       c.c(false);
       c.b(false);
       c.b(this.I);
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       c.a(this.I);
       return;
    }
}
