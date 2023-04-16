package com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement$h;
import erd.g;
import com.yxcorp.gifshow.detail.common.controller.SidebarProgressElement;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.gifshow.widget.SwipeLayout;

public final class SidebarProgressElement$h implements g	// class@0013cc
{
    public final SidebarProgressElement b;

    public void SidebarProgressElement$h(SidebarProgressElement p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SidebarProgressElement$h.class, "1")) {
       }else if(p0.getTag(0x7f0a3c34) == null){
          SidebarProgressElement x = this.b.x;
          if (x == null) {
             a.S("mFragment");
          }
          FragmentActivity activity = x.getActivity();
          if (activity != null) {
             SwipeLayout swipeLayout = activity.findViewById(R.id.swipe);
             if (swipeLayout != null) {
                swipeLayout.a(p0);
                p0.setTag(R.id.swipe, swipeLayout);
             }
          }
       }
       return;
    }
}
