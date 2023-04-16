package com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2$b;
import com.google.android.material.tabs.TabLayout$d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import java.lang.Object;
import com.google.android.material.tabs.TabLayout$f;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.viewpager.widget.ViewPager;

public class TabHostFragmentV2$b implements TabLayout$d	// class@0017ae
{
    public final TabHostFragmentV2 b;

    public void TabHostFragmentV2$b(TabHostFragmentV2 p0){
       this.b = p0;
       super();
    }
    public void H7(TabLayout$f p0){
    }
    public void sf(TabLayout$f p0){
    }
    public void ua(TabLayout$f p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, TabHostFragmentV2$b.class, "1")) {
          return;
       }
       this.b.k.setCurrentItem(p0.c(), this.b.ch());
       PatchProxy.onMethodExit(TabHostFragmentV2$b.class, "1");
       return;
    }
}
