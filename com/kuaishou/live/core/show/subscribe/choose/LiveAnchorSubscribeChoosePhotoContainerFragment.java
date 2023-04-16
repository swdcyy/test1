package com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoContainerFragment;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment;
import java.lang.String;
import z1.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Object;
import com.kuaishou.live.core.show.subscribe.edit.LiveAnchorSubscribeContainerFragment;
import com.kuaishou.live.core.show.subscribe.choose.LiveAnchorSubscribeChoosePhotoFragment;
import qk2.b;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class LiveAnchorSubscribeChoosePhotoContainerFragment extends LiveDialogContainerFragment	// class@0010c4
{
    public LiveAnchorSubscribeChoosePhotoFragment A;
    public boolean B;
    public static final int C;

    public void LiveAnchorSubscribeChoosePhotoContainerFragment(){
       super();
       this.B = false;
    }
    public static LiveAnchorSubscribeChoosePhotoContainerFragment Eh(String p0,int p1,boolean p2,a p3){
       LiveAnchorSubscribeChoosePhotoContainerFragment obj;
       LiveAnchorSubscribeChoosePhotoFragment liveAnchorSu;
       if (PatchProxy.isSupport(LiveAnchorSubscribeChoosePhotoContainerFragment.class)) {
          obj = PatchProxy.applyFourRefs(p0, Integer.valueOf(p1), Boolean.valueOf(p2), p3, null, LiveAnchorSubscribeChoosePhotoContainerFragment.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new LiveAnchorSubscribeChoosePhotoContainerFragment();
       obj.Bh(-1, LiveAnchorSubscribeContainerFragment.G);
       if (PatchProxy.isSupport(LiveAnchorSubscribeChoosePhotoFragment.class)) {
          liveAnchorSu = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, LiveAnchorSubscribeChoosePhotoFragment.class, "1");
          if (liveAnchorSu != PatchProxyResult.class) {
          label_004e :
             liveAnchorSu.Q = new b(obj, p3);
             obj.A = liveAnchorSu;
             obj.B = p2;
             return obj;
          }
       }
       liveAnchorSu = new LiveAnchorSubscribeChoosePhotoFragment(p0, p1);
       goto label_004e ;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAnchorSubscribeChoosePhotoContainerFragment.class, "2")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!this.isAdded()) {
          return;
       }
       e uoe = this.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.live_bottom_dialog_container_root, this.A);
       uoe.m();
       return;
    }
    public int wh(){
       return 0;
    }
    public float yh(){
       float f = (this.B != null)? 0.40f: 0;
       return f;
    }
    public int zh(){
       return 1;
    }
}
