package com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment;
import k3c.w1;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$a;
import nsd.u;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$subTab$2;
import msd.a;
import qrd.p;
import qrd.s;
import s1c.r0;
import com.yxcorp.gifshow.designercreation.model.CreationTab;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$b;
import android.view.View$OnClickListener;
import java.util.List;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import java.util.HashMap;
import android.view.View;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import zf6.j;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout$LayoutParams;
import lnc.a1;
import androidx.viewpager.widget.ViewPager;
import java.util.Objects;
import com.kwai.library.widget.viewpager.ScrollViewPager;
import java.util.ArrayList;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationContainerFragment$c;
import java.util.Iterator;
import java.lang.Iterable;
import androidx.fragment.app.Fragment;
import fw9.a;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationMagicFragment;
import fw9.b;
import com.yxcorp.gifshow.designercreation.feed.fragment.ProfileCreationTemplateFragment;

public final class ProfileCreationContainerFragment extends TabHostFragment implements w1	// class@0012d0
{
    public r0 B;
    public final p C;
    public HashMap D;
    public static final ProfileCreationContainerFragment$a E;

    static {
       ProfileCreationContainerFragment.E = new ProfileCreationContainerFragment$a(null);
    }
    public void ProfileCreationContainerFragment(){
       super();
       this.C = s.c(new ProfileCreationContainerFragment$subTab$2(this));
    }
    public void Fc(r0 p0){
       this.B = p0;
    }
    public final PagerSlidingTabStrip$d Qh(CreationTab p0){
       PagerSlidingTabStrip$d obj = PatchProxy.applyOneRefs(p0, this, ProfileCreationContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PagerSlidingTabStrip$d(String.valueOf(p0.getType()), p0.getName());
       obj.i(new ProfileCreationContainerFragment$b(this, p0));
       return obj;
    }
    public final List Rh(){
       Object obj = PatchProxy.apply(null, this, ProfileCreationContainerFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.C.getValue();
    }
    public int getLayoutResId(){
       return 0x7f0d0503;
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, ProfileCreationContainerFragment.class, "6")) {
       }else {
          ProfileCreationContainerFragment tD = this.D;
          if (tD != null) {
             tD.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ProfileCreationContainerFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       this.t.setTabGravity(17);
       this.t.setBackgroundColor(j.d(this.t, R.color.arg_RES_7f061ca5));
       TabHostFragment tt = this.t;
       a.o(tt, "mTabStrip");
       tt.v(false);
       this.t.setTextColor(R.color.arg_RES_7f061cac);
       LinearLayout$LayoutParams layoutParams = new LinearLayout$LayoutParams(-2, -1);
       layoutParams.rightMargin = a1.e(8.00f);
       this.t.setTabLayoutParams(layoutParams);
       tt = this.u;
       a.o(tt, "mViewPager");
       tt.setOffscreenPageLimit(this.Rh().size());
       tt = this.u;
       Objects.requireNonNull(tt, "null cannot be cast to non-null type com.kwai.library.widget.viewpager.ScrollViewPager");
       tt.setScrollable(false);
       tt = this.u;
       a.o(tt, "mViewPager");
       tt.setCurrentItem(false);
       return;
    }
    public List wh(){
       ArrayList obj = PatchProxy.apply(null, this, ProfileCreationContainerFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       ProfileCreationContainerFragment$c uoc = new ProfileCreationContainerFragment$c(this);
       Iterator iterator = this.Rh().iterator();
       while (iterator.hasNext()) {
          CreationTab uCreationTab = iterator.next();
          Bundle uBundle = new Bundle(this.getArguments());
          uBundle.putInt("TAB_TYPE", 3);
          a uoa = (uCreationTab.isMagic())? new a(this.Qh(uCreationTab), ProfileCreationMagicFragment.class, uBundle, uoc): new a(this.Qh(uCreationTab), ProfileCreationTemplateFragment.class, uBundle, uoc);
          obj.add(uoa);
       }
       return obj;
    }
}
