package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewStub;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$collapseListener$1;
import fx2.e;
import msd.l;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import com.google.android.material.tabs.TabLayout;
import java.lang.Math;
import java.lang.Integer;
import mrd.a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$e;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1;
import com.google.android.material.tabs.TabLayout$c;
import androidx.recyclerview.widget.RecyclerView$l;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$b;
import java.util.List;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$c;
import lnc.a1;
import androidx.recyclerview.widget.RecyclerView$n;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$b;
import java.lang.Runnable;
import android.view.ViewGroup;

public final class VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1 implements View$OnClickListener	// class@001a26
{
    public final VoicePartyTheaterTubeListTabFragment b;
    public final View c;

    public void VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1(VoicePartyTheaterTubeListTabFragment p0,View p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1.class, "1")) {
          return;
       }
       ViewStub viewStub = this.c.findViewById(R.id.tab_more_page_stub);
       if (viewStub != null) {
          viewStub = viewStub.inflate();
          a.o(viewStub, "morePageStub.inflate\(\)");
          VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$collapseListener$1 oinitMoreCha = new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$collapseListener$1(viewStub);
          viewStub.findViewById(R.id.collapse_top).setOnClickListener(new e(oinitMoreCha));
          viewStub.findViewById(R.id.collapse_bottom).setOnClickListener(new e(oinitMoreCha));
          RecyclerView recyclerView = viewStub.findViewById(R.id.recycler_view);
          a.o(recyclerView, "recyclerView");
          if (recyclerView.getAdapter() == null) {
             TabHostFragmentV2 j = this.b.j;
             a.o(j, "mTabLayout");
             a uoa = a.h(Integer.valueOf(Math.max(j.getSelectedTabPosition(), 0)));
             a.o(uoa, "BehaviorSubject.createDefault\(max\(selectedPos, 0\)\)");
             this.b.j.a(new VoicePartyTheaterTubeListTabFragment$e(new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$1(this, uoa)));
             recyclerView.setItemAnimator(null);
             recyclerView.setAdapter(new VoicePartyTheaterTubeListTabFragment$b(VoicePartyTheaterTubeListTabFragment.nh(this.b), 0, uoa, new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$2(this, viewStub)));
             StaggeredGridLayoutManager staggeredGri = new StaggeredGridLayoutManager(4, 1);
             recyclerView.setLayoutManager(staggeredGri);
             recyclerView.addItemDecoration(new VoicePartyTheaterTubeListTabFragment$c(4, a1.e(8.00f), a1.e(16.00f)));
             recyclerView.addOnScrollListener(new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$a(this, staggeredGri));
             recyclerView.post(new VoicePartyTheaterTubeListTabFragment$initMoreChannelIfNeed$1$b(this, staggeredGri));
          }
       }else {
          viewStub = this.c.findViewById(R.id.tab_more_page);
          a.o(viewStub, "view.findViewById<View>\(R.id.tab_more_page\)");
       }
       viewStub.setVisibility(0);
       return;
    }
}
