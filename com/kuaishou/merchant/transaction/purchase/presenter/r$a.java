package com.kuaishou.merchant.transaction.purchase.presenter.r$a;
import com.kuaishou.merchant.transaction.purchase.presenter.r$h;
import com.kuaishou.merchant.transaction.purchase.presenter.r;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;

public class r$a implements r$h	// class@00099d
{
    public final r a;

    public void r$a(r p0){
       this.a = p0;
       super();
    }
    public String a(){
       return this.a.p;
    }
    public void submit(){
       if (PatchProxy.applyVoid(null, this, r$a.class, "1")) {
          return;
       }
       this.a.X8(false);
       return;
    }
}
