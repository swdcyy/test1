package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment;
import com.kwai.feature.post.api.fragment.FlyWheelTabHostFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment$divider$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.String;
import android.view.View;
import android.os.Bundle;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabInfo;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import java.util.List;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.MusicMainFragment;

public final class MusicTabHostFragment extends FlyWheelTabHostFragment	// class@0010d3
{
    public final p E;
    public HashMap F;

    public void MusicTabHostFragment(){
       super();
       this.E = s.c(new MusicTabHostFragment$divider$2(this));
    }
    public String E7(){
       return "MusicPanel";
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicTabHostFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.fh(p0, p1);
       p1 = null;
       this.Gh(MusicTabInfo.MUSIC.getTabIndex(), p1);
       PagerSlidingTabStrip pagerSliding = this.zh();
       if (pagerSliding != null) {
          pagerSliding.setVisibility(8);
       }
       pagerSliding = PatchProxy.apply(p1, this, MusicTabHostFragment.class, "1");
       if (pagerSliding == PatchProxyResult.class) {
          pagerSliding = this.E.getValue();
       }
       if (pagerSliding != null) {
          pagerSliding.setVisibility(8);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d035b;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, MusicTabHostFragment.class, "6")) {
       }else {
          MusicTabHostFragment tF = this.F;
          if (tF != null) {
             tF.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MusicTabHostFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.Nh(2);
       this.Oh(new MusicTabHostFragment$a(this));
       return;
    }
    public List wh(){
       Bundle obj = PatchProxy.apply(null, this, MusicTabHostFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getArguments();
       ArrayList uArrayList = new ArrayList();
       MusicTabInfo mUSIC = MusicTabInfo.MUSIC;
       String tabName = mUSIC.getTabName();
       PagerSlidingTabStrip$d uod = new PagerSlidingTabStrip$d(tabName, mUSIC.getTabName());
       if (obj == null) {
          obj = new Bundle();
       }
       uArrayList.add(new b(uod, MusicMainFragment.class, obj));
       return uArrayList;
    }
}
