package com.kuaishou.live.bottombar.component.panel.settting.LiveBottomBarSettingPanelFragment;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import com.kuaishou.live.bottombar.component.panel.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import m61.a;
import k61.f;
import androidx.lifecycle.LifecycleOwner;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.fragment.app.Fragment;

public class LiveBottomBarSettingPanelFragment extends LiveBottomBarBasePanelFragment	// class@000d3d
{
    public static final int h;

    public void LiveBottomBarSettingPanelFragment(){
       super();
    }
    public a Ug(){
       Object obj = PatchProxy.apply(null, this, LiveBottomBarSettingPanelFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a(this, this.Wg());
    }
    public RecyclerView$LayoutManager Vg(Context p0){
       p0 = PatchProxy.applyOneRefs(p0, this, LiveBottomBarSettingPanelFragment.class, "3");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       return new LinearLayoutManager(this.getContext());
    }
}
