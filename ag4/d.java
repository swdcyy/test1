package ag4.d;
import sk0.a;
import java.util.HashMap;
import com.kuaishou.ksmvvm.command.KSCommand;
import ag4.d$a;
import pk0.a;
import com.kuaishou.ksmvvm.command.b;
import com.kuaishou.ksmvvm.command.a;
import com.kuaishou.merchant.transaction.detail.self.selfdetail.commodityinfo.model.Stock;

public final class d extends a	// class@0000c1
{
    public final String b;
    public final String c;
    public final String d;
    public final HashMap e;
    public HashMap f;
    public DetailCommonData g;
    public DetailStock h;
    public Stock i;
    public KSCommand j;

    public void d(){
       super();
       this.b = "sellerId";
       this.c = "sceneType";
       this.d = "id";
       this.e = new HashMap();
       this.f = new HashMap();
       this.j = new KSCommand(this, new d$a(this), null, null);
    }
    public final void p0(Stock p0){
       this.i = p0;
    }
}
