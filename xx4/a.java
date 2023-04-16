package xx4.a;
import java.lang.String;
import org.json.JSONObject;
import com.kwai.player.qos.KwaiPlayerResultQos;
import com.kwai.video.player.IKwaiMediaPlayer;
import com.kwai.video.cache.AcCallBackInfo;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;

public interface abstract a	// class@0037fb
{

    void a(String p0);
    JSONObject b();
    void c(KwaiPlayerResultQos p0,long p1,String p2,String p3,int p4);
    void d(IKwaiMediaPlayer p0,AcCallBackInfo p1);
    void e(ClientEvent$UrlPackage p0);
}
