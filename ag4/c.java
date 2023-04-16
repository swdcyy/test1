package ag4.c;
import androidx.lifecycle.Observer;
import com.kuaishou.merchant.transaction.detail.self.basic.stock.DetailStockManager;
import java.lang.Object;
import com.kuaishou.ksmvvm.command.KSCommand$Status;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;

public final class c implements Observer	// class@0000bf
{
    public final DetailStockManager b;

    public void c(DetailStockManager p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c.class, "1")) {
       }else if(p0 == KSCommand$Status.SUCCESS){
          b9.a(this.b.h);
       }
       PatchProxy.onMethodExit(c.class, "1");
       return;
    }
}
