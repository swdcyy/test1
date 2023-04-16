package m.a;
import m.b;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.security.kste.export.KSTEResult;
import a.a.a.a.b.a.b;
import com.kuaishou.security.kste.logic.base.InitCommonKSTEParams;
import com.kuaishou.security.kste.export.IKSTECallback;
import com.kuaishou.security.kste.logic.event.KSTEException;
import com.kuaishou.security.kste.export.KSTEApi;

public abstract class a implements b	// class@00259b
{

    public void a(){
       super();
    }
    public KSTEResult b(String p0,String p1,String p2,int p3,byte[] p4,int p5){
       if (this.c()) {
          return KSTEApi.invoke("ZT_APPKEY", "ZT_KPN", p2, p4, p5);
       }
       if (b.b().r() != null) {
          b.b().r().initCallback().onError(new KSTEException("[KSTE] kste sdk invoke error", 0x2714));
       }
       throw new KSTEException(0x2714);
    }
    public abstract boolean c();
}
