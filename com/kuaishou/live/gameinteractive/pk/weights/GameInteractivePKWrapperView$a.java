package com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView$a;
import com.kuaishou.live.core.show.pk.LivePkScoreProgressBar$a;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView;
import java.lang.Object;
import hd2.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;

public class GameInteractivePKWrapperView$a implements LivePkScoreProgressBar$a	// class@001bf2
{
    public final GameInteractivePKWrapperView a;

    public void GameInteractivePKWrapperView$a(GameInteractivePKWrapperView p0){
       this.a = p0;
       super();
    }
    public void H(){
       i0.a(this);
    }
    public void a(int p0,int p1,int p2){
       if (PatchProxy.isSupport(GameInteractivePKWrapperView$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, GameInteractivePKWrapperView$a.class, "2")) {
          return;
       }
       this.a.b(p2);
       return;
    }
    public void b(int p0){
       GameInteractivePKWrapperView$a uoa = GameInteractivePKWrapperView$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       this.a.b(p0);
       return;
    }
}
