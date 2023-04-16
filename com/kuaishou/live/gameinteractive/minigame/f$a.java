package com.kuaishou.live.gameinteractive.minigame.f$a;
import vq5.b;
import com.kuaishou.live.gameinteractive.minigame.f;
import java.lang.Object;
import vq5.a;
import android.net.Uri;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.x0;
import com.kuaishou.live.gameinteractive.minigame.data.LiveMiniGameInfo;

public class f$a implements b	// class@001beb
{
    public final f a;

    public void f$a(f p0){
       this.a = p0;
       super();
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "1")) {
          return;
       }
       LiveMiniGameInfo liveMiniGame = new LiveMiniGameInfo();
       liveMiniGame.gameId = x0.a(p0, "gameId");
       liveMiniGame.appId = x0.a(p0, "appId");
       this.a.Y8(liveMiniGame);
       return;
    }
}
