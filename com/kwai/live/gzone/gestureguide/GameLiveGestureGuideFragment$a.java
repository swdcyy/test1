package com.kwai.live.gzone.gestureguide.GameLiveGestureGuideFragment$a;
import android.view.View$OnClickListener;
import com.kwai.live.gzone.gestureguide.GameLiveGestureGuideFragment;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;

public class GameLiveGestureGuideFragment$a implements View$OnClickListener	// class@000d00
{
    public final GameLiveGestureGuideFragment b;

    public void GameLiveGestureGuideFragment$a(GameLiveGestureGuideFragment p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameLiveGestureGuideFragment$a.class, "1")) {
          return;
       }
       this.b.dismissAllowingStateLoss();
       return;
    }
}
