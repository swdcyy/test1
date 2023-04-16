package com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d$b;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import wq6.f;
import com.yxcorp.gifshow.reminder.friend.kcube.container.FriendTabContainerKCbeStripViewPager$a;
import h3.a;
import androidx.viewpager.widget.ViewPager$i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Objects;
import com.kwai.kcube.TabIdentifier;
import on5.n;
import wq6.g;
import java.lang.Boolean;
import xr6.c$a;
import xr6.c;

public class FriendTabContainerKCbeStripViewPager extends ViewPager implements PagerSlidingTabStrip$d$b	// class@001aac
{
    public final f b;
    public final FriendTabContainerKCbeStripViewPager$a c;
    public PagerSlidingTabStrip d;

    public void FriendTabContainerKCbeStripViewPager(Context p0,f p1){
       super(p0);
       this.b = p1;
       FriendTabContainerKCbeStripViewPager$a uoa = new FriendTabContainerKCbeStripViewPager$a(this);
       this.c = uoa;
       this.setAdapter(uoa);
    }
    public void addOnPageChangeListener(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendTabContainerKCbeStripViewPager.class, "3")) {
          return;
       }
       this.b.i(p0);
       return;
    }
    public PagerSlidingTabStrip$d b(int p0){
       if (PatchProxy.isSupport(FriendTabContainerKCbeStripViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FriendTabContainerKCbeStripViewPager.class, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c.b(p0);
    }
    public int c(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       FriendTabContainerKCbeStripViewPager obj = PatchProxy.applyOneRefs(p0, this, FriendTabContainerKCbeStripViewPager.class, "10");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = this.c;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, FriendTabContainerKCbeStripViewPager$a.class, "7");
       int i = (obj1 != patchProxyRe)? obj1.intValue(): obj.f.b.P(n.a(p0));
       return i;
    }
    public String d(int p0){
       if (PatchProxy.isSupport(FriendTabContainerKCbeStripViewPager.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FriendTabContainerKCbeStripViewPager.class, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.c.d(p0);
    }
    public PagerSlidingTabStrip$d e(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FriendTabContainerKCbeStripViewPager.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.e(p0);
    }
    public int getChildCount(){
       Object obj = PatchProxy.apply(null, this, FriendTabContainerKCbeStripViewPager.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.h();
    }
    public int getCurrentItem(){
       Object obj = PatchProxy.apply(null, this, FriendTabContainerKCbeStripViewPager.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.b.B();
    }
    public void setCurrentItem(int p0){
       if (PatchProxy.isSupport(FriendTabContainerKCbeStripViewPager.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, FriendTabContainerKCbeStripViewPager.class, "5")) {
          return;
       }
       this.setCurrentItem(p0, true);
       return;
    }
    public void setCurrentItem(int p0,boolean p1){
       if (PatchProxy.isSupport(FriendTabContainerKCbeStripViewPager.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, FriendTabContainerKCbeStripViewPager.class, "6")) {
          return;
       }
       this.b.n(p0, p1, c.a("KCubeHomeStripViewPager").a());
       return;
    }
    public void setOnPageChangeListener(ViewPager$i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FriendTabContainerKCbeStripViewPager.class, "2")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.b.i(p0);
       return;
    }
}
