package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener;
import com.kuaishou.live.core.voiceparty.theater.tube.widget.ScrollAwareTabLayout$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$d;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$rightMoreIndicator$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import android.widget.HorizontalScrollView;
import java.lang.Number;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper;

public final class VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener extends VoicePartyTheaterTubeListTabFragment$d implements ScrollAwareTabLayout$a	// class@001a13
{
    public final p b;
    public final p c;
    public final VoicePartyTheaterTubeListTabFragment d;

    public void VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener(VoicePartyTheaterTubeListTabFragment p0){
       this.d = p0;
       super(p0);
       this.b = s.c(new VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$leftMoreIndicator$2(this));
       this.c = s.c(new VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener$rightMoreIndicator$2(this));
    }
    public void onScrollChanged(int p0,int p1,int p2,int p3){
       int i1;
       if (PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class, "3")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (!PatchProxy.isSupport(VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class, "4")) {
          p3 = 1;
          int i = 0;
          p2 = (p0 > this.a())? 1: 0;
          View view = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class, "1");
          if (view == patchProxyRe) {
             view = this.b.getValue();
          }
          a.o(view, "leftMoreIndicator");
          p2 = (p2)? 0: 8;
          view.setVisibility(p2);
          TabHostFragmentV2 j = this.d.j;
          a.o(j, "mTabLayout");
          if (j.getChildCount() > 0) {
             View childAt = this.d.j.getChildAt(i);
             a.o(childAt, "indicatorLayout");
             childAt = childAt.getWidth();
             TabHostFragmentV2 obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$d.class, "3");
             if (obj != patchProxyRe) {
                i1 = obj.intValue();
             }else {
                obj = this.a.j;
                a.o(obj, "mTabLayout");
                i1 = obj.getPaddingRight();
             }
             TabHostFragmentV2 j1 = this.d.j;
             a.o(j1, "mTabLayout");
             if (((childAt - i1) - p0) <= j1.getWidth()) {
                p3 = 0;
             }
             View view1 = PatchProxy.apply(null, this, VoicePartyTheaterTubeListTabFragment$TabScrollChangeListener.class, "2");
             if (view1 == patchProxyRe) {
                view1 = this.c.getValue();
             }
             a.o(view1, "rightMoreIndicator");
             if (!p3) {
                i = 8;
             }
             view1.setVisibility(i);
          }
       }
       this.d.z.c();
       return;
    }
}
