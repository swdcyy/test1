package h92.e;
import w61.c;
import lp3.i;
import java.lang.Object;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveVoicePartyPackageV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import xp5.i;
import lp3.c;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import w61.b;

public class e implements c	// class@002d06
{
    public final i a;

    public void e(i p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveVoicePartyPackageV2 B(){
       Object obj = PatchProxy.apply(null, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(i.class).b4();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(i.class).a();
    }
    public String b(){
       return b.a(this);
    }
    public String c(){
       return "LIVE_BOTTOM_PANEL_ENTRANCE_BUTTON";
    }
}
