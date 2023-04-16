package com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView$c;
import android.view.ViewOutlineProvider;
import com.kuaishou.live.gameinteractive.pk.weights.GameInteractivePKWrapperView;
import android.view.View;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class GameInteractivePKWrapperView$c extends ViewOutlineProvider	// class@001bf4
{
    public final GameInteractivePKWrapperView a;

    public void GameInteractivePKWrapperView$c(GameInteractivePKWrapperView p0){
       this.a = p0;
       super();
    }
    public void getOutline(View p0,Outline p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, GameInteractivePKWrapperView$c.class, "1")) {
          return;
       }
       p1.setRoundRect(0, 0, p0.getWidth(), p0.getHeight(), 0);
       return;
    }
}
