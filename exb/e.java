package exb.e;
import java.lang.String;
import java.lang.Throwable;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CdnResourceLoadStatEvent;

public interface abstract e	// class@0024df
{

    void b(String p0,String p1);
    void c(long p0,float p1);
    void d(Throwable p0,String p1,String p2);
    void e(ClientStat$CdnResourceLoadStatEvent p0);
    boolean f();
    void onCancel(String p0);
    void onStart(String p0);
}
