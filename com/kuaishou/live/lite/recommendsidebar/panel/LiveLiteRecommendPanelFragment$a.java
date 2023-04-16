package com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$a;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment$c;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Integer;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.entity.QPhoto;
import android.view.View;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelAdapter;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;

public class LiveLiteRecommendPanelFragment$a implements LiveLiteRecommendPanelFragment$c	// class@000aef
{
    public final LiveLiteRecommendPanelFragment a;

    public void LiveLiteRecommendPanelFragment$a(LiveLiteRecommendPanelFragment p0){
       this.a = p0;
       super();
    }
    public int a(){
       LiveLiteRecommendPanelFragment$a obj = PatchProxy.apply(null, this, LiveLiteRecommendPanelFragment$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a;
       RecyclerFragment t = obj.t;
       if (t != null) {
          return t.getHeight();
       }
       return n.j(obj.getActivity());
    }
    public void b(int p0){
       LiveLiteRecommendPanelFragment$a uoa = LiveLiteRecommendPanelFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "2")) {
          return;
       }
       RecyclerFragment t = this.a.t;
       if (t != null) {
          t.smoothScrollBy(0, p0, null);
       }
       return;
    }
    public View c(QPhoto p0){
       LiveLiteRecommendPanelFragment$a obj = PatchProxy.applyOneRefs(p0, this, LiveLiteRecommendPanelFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       LiveLiteRecommendPanelFragment f = obj.F;
       if (f != null && obj.H != null) {
          int i = f.r1(p0.getLiveStreamId());
          if (i >= 0) {
             i = i + this.a.Gh();
             if (this.a.I.b.getValue() != null && (this.a.I.b.getValue().intValue() && (this.a.I.b.getValue().intValue() - 1) < i)) {
                i++;
             }
          label_005e :
             return this.a.H.findViewByPosition(i);
          }
       }
       return null;
    }
}
