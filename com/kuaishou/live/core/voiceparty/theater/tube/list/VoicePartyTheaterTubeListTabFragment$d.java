package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$d;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import kotlin.jvm.internal.a;
import android.widget.HorizontalScrollView;
import android.view.View;
import java.lang.Integer;
import com.google.android.material.tabs.TabLayout$f;
import com.google.android.material.tabs.TabLayout;

public abstract class VoicePartyTheaterTubeListTabFragment$d	// class@001a1d
{
    public final VoicePartyTheaterTubeListTabFragment a;

    public void VoicePartyTheaterTubeListTabFragment$d(VoicePartyTheaterTubeListTabFragment p0){
       this.a = p0;
       super();
    }
    public final int a(){
       TabHostFragmentV2 obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.a.j;
       String str = "mTabLayout";
       a.o(obj, str);
       if (obj.getChildCount() > 0) {
          View childAt = this.a.j.getChildAt(0);
          a.o(childAt, "mTabLayout.getChildAt\(0\)");
          return childAt.getPaddingLeft();
       }else {
          obj = this.a.j;
          a.o(obj, str);
          return obj.getPaddingLeft();
       }
    }
    public final int b(int p0){
       VoicePartyTheaterTubeListTabFragment$d uod = VoicePartyTheaterTubeListTabFragment$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       TabLayout$f uof = this.a.j.v(p0);
       uof = (uof != null)? uof.h: null;
       uof = (uof != null)? uof.getWidth(): 0;
       return uof;
    }
}
