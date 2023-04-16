package n75.a;
import java.lang.Runnable;
import n75.b;
import com.kwai.chat.kwailink.config.KwaiLinkDefaultServerInfo;
import java.lang.Object;
import q75.c;
import java.lang.String;
import java.lang.StringBuilder;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import com.kwai.chat.kwailink.base.b;
import com.kwai.chat.kwailink.log.a;
import android.os.Build;

public final class a implements Runnable	// class@001f14
{
    public final b b;
    public final KwaiLinkDefaultServerInfo c;

    public void a(b p0,KwaiLinkDefaultServerInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       a tc = this.c;
       c.b().d(this.b.e);
       c uoc = c.b();
       try{
          uoc.e(tc);
          a.g("KwaiLinkGlobal", "ClientAppInfo: "+b.a().toString()+", linkVer="+"4.24.4-kuaishou");
          a.g("KwaiLinkGlobal", "processName="+b.b.c);
          a.g("KwaiLinkGlobal", "MODEL="+Build.MODEL+", MANUFACTURER="+Build.MANUFACTURER);
          return;
       }catch(java.lang.Exception e0){
       }
    }
}
