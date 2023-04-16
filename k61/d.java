package k61.d;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment$d;
import com.kuaishou.live.bottombar.service.model.panel.LiveBottomBarPanelData;
import k61.f;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarPanelContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.bottombar.component.panel.settting.LiveBottomBarSettingPanelFragment;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.bottombar.component.panel.LiveBottomBarBasePanelFragment;
import com.kuaishou.live.bottombar.component.panel.fetaure.LiveBottomBarFeaturePanelFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;

public final class d implements LiveDialogContainerFragment$d	// class@002c95
{
    public final LiveBottomBarPanelData a;
    public final f b;
    public final LiveBottomBarPanelContainerFragment c;

    public void d(LiveBottomBarPanelData p0,f p1,LiveBottomBarPanelContainerFragment p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(){
       LiveBottomBarSettingPanelFragment liveBottomBa;
       Object[] objArray = null;
       String str = "1";
       if (PatchProxy.applyVoid(objArray, this, d.class, str)) {
          return;
       }
       d ta = this.a;
       if (ta.mLayoutType == 1) {
          d tb = this.b;
          liveBottomBa = PatchProxy.applyTwoRefs(ta, tb, objArray, LiveBottomBarSettingPanelFragment.class, str);
          if (liveBottomBa != PatchProxyResult.class) {
          }else {
             liveBottomBa = new LiveBottomBarSettingPanelFragment();
             liveBottomBa.b = ta;
             liveBottomBa.f = tb;
          }
       }else {
          liveBottomBa = LiveBottomBarFeaturePanelFragment.Yg(ta, this.b);
       }
       e uoe = this.c.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.live_bottom_dialog_container_root, liveBottomBa);
       uoe.m();
       return;
    }
}
