package a0c.e;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import q2b.h$b;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.Gson;
import com.yxcorp.gifshow.postentrance.util.b$a;
import k2b.u1;

public final class e implements Runnable	// class@00000d
{
    public final int b;
    public final String c;
    public final String d;

    public void e(int p0,String p1,String p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void run(){
       h$b uob = h$b.e(7, "MISS_GUIDE_BUBBLE");
       ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
       uElementPack.params = new Gson().q(new b$a(this.b, this.c, this.d));
       uob.k(uElementPack);
       u1.r0(uob);
    }
}
