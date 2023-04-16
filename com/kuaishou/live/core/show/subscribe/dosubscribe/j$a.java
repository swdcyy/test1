package com.kuaishou.live.core.show.subscribe.dosubscribe.j$a;
import com.kuaishou.live.core.basic.widget.LiveDialogContainerFragment$c;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.show.subscribe.helper.LiveSubscribeDialogContainerFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.subscribe.dosubscribe.LiveSubscribeFragment;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.e;

public class j$a implements LiveDialogContainerFragment$c	// class@0010e7
{
    public final String a;
    public final QPhoto b;
    public final String c;
    public final LiveSubscribeDialogContainerFragment d;

    public void j$a(String p0,QPhoto p1,String p2,LiveSubscribeDialogContainerFragment p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, j$a.class, "1")) {
          return;
       }
       j$a ta = this.a;
       j$a tb = this.b;
       j$a tc = this.c;
       LiveSubscribeFragment liveSubscrib = PatchProxy.applyThreeRefs(ta, tb, tc, null, LiveSubscribeFragment.class, "1");
       if (liveSubscrib != PatchProxyResult.class) {
       }else {
          liveSubscrib = new LiveSubscribeFragment();
          Bundle uBundle = new Bundle();
          uBundle.putString("LIVE_SUBSCRIBE_RESERVATION_ID", ta);
          uBundle.putString("LIVE_SUBSCRIBE_SOURCE", tc);
          if (tb != null) {
             SerializableHook.putSerializable(uBundle, "LIVE_SUBSCRIBE_Q_PHOTO", tb);
          }
          liveSubscrib.setArguments(uBundle);
       }
       e uoe = this.d.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.live_bottom_dialog_container_root, liveSubscrib);
       uoe.m();
       return;
    }
}
