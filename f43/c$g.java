package f43.c$g;
import erd.g;
import f43.c;
import java.lang.String;
import java.lang.Object;
import njd.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthApplyResponse;
import java.util.Map;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthInfo;
import com.kuaishou.live.gameinteractive.auth.model.GameLiveAuthApplyResponse$GameLiveAuthApplyData;
import com.kuaishou.live.gameinteractive.auth.model.a;

public class c$g implements g	// class@002872
{
    public final String b;
    public final c c;

    public void c$g(c p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$g.class, "1")) {
       }else if(p0 != null && (p0.a() != null && p0.a().data != null)){
          p0 = p0.a().data;
          GameLiveAuthInfo gameLiveAuth = this.c.b.get(this.b);
          if (gameLiveAuth != null) {
             gameLiveAuth.a = p0.openId;
             if (!PatchProxy.applyVoidOneRefs(p0, gameLiveAuth, GameLiveAuthInfo.class, "7")) {
                GameLiveAuthInfo b = gameLiveAuth.b;
                if (b != null) {
                   b.d(p0.authorizedUserAuth);
                }
                gameLiveAuth = gameLiveAuth.c;
                if (gameLiveAuth != null) {
                   gameLiveAuth.d(p0.authorizedLiveAuth);
                }
             }
          }
       }
       return;
    }
}
