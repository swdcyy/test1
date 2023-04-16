package com.kwai.live.gzone.gestureguide.GameLiveGestureGuideFragment;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import com.kwai.live.gzone.gestureguide.GameLiveGestureGuideFragment$a;
import android.view.View$OnClickListener;

public class GameLiveGestureGuideFragment extends ContainerFragment	// class@000d01
{
    public View x;
    public ViewGroup y;

    public void GameLiveGestureGuideFragment(){
       super();
       this.zh(false);
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GameLiveGestureGuideFragment.class, "2")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f1103a5);
          window.setGravity(81);
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, GameLiveGestureGuideFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (this.x == null) {
          this.x = a.g(p0, 0x7f0d0b16, p1, false);
       }
       ViewGroup viewGroup = this.x.findViewById(R.id.live_gesture_browse_layout);
       this.y = viewGroup;
       viewGroup.setVisibility(4);
       this.x.setOnClickListener(new GameLiveGestureGuideFragment$a(this));
       return this.x;
    }
}
