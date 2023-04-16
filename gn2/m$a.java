package gn2.m$a;
import w61.c;
import lp3.e;
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

public class m$a implements c	// class@002b5b
{
    public final e a;

    public void m$a(e p0){
       this.a = p0;
       super();
    }
    public ClientContent$LiveVoicePartyPackageV2 B(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.a(i.class).b4();
    }
    public ClientContent$LiveStreamPackage a(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "1");
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
