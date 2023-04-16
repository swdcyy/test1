package com.kuaishou.live.gameinteractive.minigame.LiveMiniGamePlayPanelFragment$a;
import rib.c;
import com.kuaishou.live.gameinteractive.minigame.LiveMiniGamePlayPanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pp.a;
import q87.c;
import rib.f;
import rib.d;
import java.lang.Integer;

public class LiveMiniGamePlayPanelFragment$a implements c	// class@001bd9
{
    public final LiveMiniGamePlayPanelFragment a;

    public void LiveMiniGamePlayPanelFragment$a(LiveMiniGamePlayPanelFragment p0){
       this.a = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LiveMiniGamePlayPanelFragment$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneMiniGamePanelFragment", "onGameResReady", objArray);
       return;
    }
    public void b(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGamePlayPanelFragment$a.class, "3")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneMiniGamePanelFragment", "onGameStartSuccess", objArray);
       return;
    }
    public void c(f p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGamePlayPanelFragment$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneMiniGamePanelFragment", "onGameFirstFrameRender", objArray);
       return;
    }
    public void d(d p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMiniGamePlayPanelFragment$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneMiniGamePanelFragment", "onGotGameInfo", objArray);
       return;
    }
    public void onError(int p0,String p1){
       LiveMiniGamePlayPanelFragment$a uoa = LiveMiniGamePlayPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.C().s("LiveGzoneMiniGamePanelFragment", "onError", objArray);
       return;
    }
}
