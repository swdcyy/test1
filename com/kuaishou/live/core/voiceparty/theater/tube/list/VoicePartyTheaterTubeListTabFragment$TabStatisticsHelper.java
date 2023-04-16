package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$d;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import kotlin.jvm.internal.a;
import com.google.android.material.tabs.TabLayout;
import android.widget.HorizontalScrollView;
import kotlin.jvm.internal.Ref$IntRef;
import com.google.android.material.tabs.TabLayout$f;
import java.util.Objects;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.theater.tube.b;
import com.kuaishou.live.core.voiceparty.theater.tube.b$a;
import java.util.List;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper$logShowEvent$1;
import msd.a;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper$logShowEventOnMorePage$1;

public final class VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper extends VoicePartyTheaterTubeListTabFragment$d	// class@001a16
{
    public int b;
    public final VoicePartyTheaterTubeListTabFragment c;

    public void VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper(VoicePartyTheaterTubeListTabFragment p0){
       this.c = p0;
       super(p0);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper.class, "1")) {
          return;
       }
       TabHostFragmentV2 j = this.c.j;
       a.o(j, "mTabLayout");
       int tabCount = j.getTabCount();
       if (tabCount > 0) {
          int i = 0;
          if (this.b(i)) {
             TabHostFragmentV2 j1 = this.c.j;
             a.o(j1, "mTabLayout");
             int scrollX = j1.getScrollX();
             if (scrollX < this.b) {
                return;
             }else {
                this.b = scrollX;
                Ref$IntRef intRef = new Ref$IntRef();
                intRef.element = i;
                i = - scrollX;
                scrollX = this.a();
                i = i + scrollX;
                while (intRef.element < tabCount) {
                   j1 = this.c.j;
                   a.o(j1, "mTabLayout");
                   if (i < j1.getWidth()) {
                      TabLayout$f uof = this.c.j.v(intRef.element);
                      Object[] objArray = (uof != null)? uof.d(): null;
                      Objects.requireNonNull(objArray, "null cannot be cast to non-null type kotlin.Int");
                      if (this.c.qh(objArray.intValue()) != -1) {
                         b.h0.a().W(VoicePartyTheaterTubeListTabFragment.nh(this.c).get(intRef.element).mChannelId, new VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper$logShowEvent$1(this, intRef));
                      }
                      scrollX = intRef.element + 1;
                      intRef.element = scrollX;
                      scrollX = this.b(scrollX);
                   }
                }
             }
          }
       }
       return;
    }
    public final void d(StaggeredGridLayoutManager p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper.class, "2")) {
          return;
       }
       a.p(p0, "layoutManager");
       int[] ointArray = new int[4];
       ointArray = p0.findFirstVisibleItemPositions(ointArray);
       a.o(ointArray, "layoutManager.findFirstV¡­emPositions\(visibleItems\)");
       int i = ointArray[0];
       int[] ointArray1 = p0.findLastVisibleItemPositions(ointArray);
       a.o(ointArray1, "layoutManager.findLastVi¡­emPositions\(visibleItems\)");
       int i1 = ointArray1[(ointArray1.length - 1)];
       if (i <= i1) {
          while (i > 0 && i < VoicePartyTheaterTubeListTabFragment.nh(this.c).size()) {
             b.h0.a().W(VoicePartyTheaterTubeListTabFragment.nh(this.c).get(i).mChannelId, new VoicePartyTheaterTubeListTabFragment$TabStatisticsHelper$logShowEventOnMorePage$1(this, i));
             break ;
             i = i + 1;
          }
          if (i != i1) {
             goto label_005b ;
          }
       }
       return;
    }
}
