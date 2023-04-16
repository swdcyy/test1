package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$a;
import java.lang.Object;
import nsd.u;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent$PanelType;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;

public final class IMFilterOptionConfig$a	// class@001db6
{

    public void IMFilterOptionConfig$a(){
       super();
    }
    public void IMFilterOptionConfig$a(u p0){
       super();
    }
    public final PanelShowEvent a(BaseFragment p0,boolean p1){
       IMFilterOptionConfig$a uoa = IMFilterOptionConfig$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PanelShowEvent(CameraPageType.IM_CHAT, PanelShowEvent$PanelType.FILTER, p0.getActivity(), p1);
    }
}
