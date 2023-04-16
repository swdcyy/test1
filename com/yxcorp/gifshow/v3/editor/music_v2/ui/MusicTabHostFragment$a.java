package com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.MusicTabHostFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import java.util.Objects;
import k2b.e0;
import java.util.List;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import kotlin.jvm.internal.a;
import lsc.g0;

public final class MusicTabHostFragment$a implements ViewPager$i	// class@0010d1
{
    public final MusicTabHostFragment b;

    public void MusicTabHostFragment$a(MusicTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       MusicTabHostFragment$a uoa = MusicTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       FragmentActivity activity = this.b.getActivity();
       Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
       PagerSlidingTabStrip$d uod = this.b.wh().get(p0).c();
       a.o(uod, "tabFragmentDelegates[position].tab");
       g0.i(activity, uod.c());
       return;
    }
}
