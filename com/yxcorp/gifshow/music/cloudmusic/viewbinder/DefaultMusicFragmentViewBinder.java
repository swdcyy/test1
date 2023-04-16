package com.yxcorp.gifshow.music.cloudmusic.viewbinder.DefaultMusicFragmentViewBinder;
import com.yxcorp.gifshow.music.cloudmusic.viewbinder.AbsMusicFragmentViewBinder;
import c35.c;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import ekd.m1;
import com.yxcorp.gifshow.music.cloudmusic.search.MusicSearchLayout;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import android.widget.ImageButton;
import com.yxcorp.gifshow.music.cloudmusic.widget.MusicSmoothPagerSlidingTabStrip;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import i2b.a;

public class DefaultMusicFragmentViewBinder extends AbsMusicFragmentViewBinder	// class@002043
{
    public TabLayout h;
    public ViewPager i;
    public View j;
    public View k;
    public MusicSmoothPagerSlidingTabStrip l;

    public void DefaultMusicFragmentViewBinder(c p0){
       super(p0);
    }
    public View A(){
       DefaultMusicFragmentViewBinder obj = PatchProxy.apply(null, this, DefaultMusicFragmentViewBinder.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k;
       if (obj == null) {
          a.S("_TabsContainer");
       }
       return obj;
    }
    public ViewPager B(){
       DefaultMusicFragmentViewBinder obj = PatchProxy.apply(null, this, DefaultMusicFragmentViewBinder.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.i;
       if (obj == null) {
          a.S("_viewPager");
       }
       return obj;
    }
    public void C(){
       if (PatchProxy.applyVoid(null, this, DefaultMusicFragmentViewBinder.class, "11")) {
          return;
       }
       DefaultMusicFragmentViewBinder tj = this.j;
       if (tj == null) {
          a.S("_dividerView");
       }
       tj.setVisibility(0);
       return;
    }
    public void D(){
       if (PatchProxy.applyVoid(null, this, DefaultMusicFragmentViewBinder.class, "10")) {
          return;
       }
       DefaultMusicFragmentViewBinder tj = this.j;
       if (tj == null) {
          a.S("_dividerView");
       }
       tj.setVisibility(4);
       return;
    }
    public void s(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DefaultMusicFragmentViewBinder.class, "9")) {
          return;
       }
       a.p(p0, "rootView");
       View view = p0.findViewById(R.id.tab_layout);
       a.o(view, "rootView.findViewById\(R.id.tab_layout\)");
       this.h = view;
       view = p0.findViewById(R.id.view_pager);
       a.o(view, "rootView.findViewById\(R.id.view_pager\)");
       this.i = view;
       view = p0.findViewById(R.id.tabs_container);
       a.o(view, "rootView.findViewById\(R.id.tabs_container\)");
       this.k = view;
       this.e = m1.f(p0, 0x7f0a37a6);
       this.f = m1.f(p0, 0x7f0a3f6a);
       view = m1.f(p0, R.id.divider);
       a.o(view, "ViewBindUtils.bindWidget\(rootView, R.id.divider\)");
       this.j = view;
       this.g = m1.f(p0, 0x7f0a3657);
       this.l = m1.f(p0, 0x7f0a3a78);
       DefaultMusicFragmentViewBinder tj = this.j;
       if (tj == null) {
          a.S("_dividerView");
       }
       tj.setTag(R.id.view_status_tag, "ignore");
       return;
    }
    public View u(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, DefaultMusicFragmentViewBinder.class, "12");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       View view = a.g(p0, R.layout.arg_RES_7f0d1009, p1, false);
       a.o(view, "KwaiLayoutInflater.infla¡­esId\(\), container, false\)");
       return view;
    }
    public MusicSmoothPagerSlidingTabStrip y(){
       return this.l;
    }
    public TabLayout z(){
       DefaultMusicFragmentViewBinder obj = PatchProxy.apply(null, this, DefaultMusicFragmentViewBinder.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.h;
       if (obj == null) {
          a.S("_tabLayout");
       }
       return obj;
    }
}
