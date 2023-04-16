package co6.a;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.String;
import java.lang.Object;
import com.kuaishou.romid.inlet.OaidHelper;

public final class a implements Runnable	// class@000728
{
    public final Throwable b;
    public final String c;

    public void a(Throwable p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       OaidHelper.OAID = this.c;
    }
}
