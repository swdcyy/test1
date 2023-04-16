package com.yxcorp.gifshow.magic.ui.widget.SmoothPagerSlidingTabStrip$c;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.String;
import java.lang.CharSequence;
import android.view.View$OnClickListener;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import com.kwai.feature.post.api.widget.SmoothSlidingTabStrip;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.widget.FrameLayout;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.widget.EmojiTextView;
import android.widget.TextView;
import p5b.h;
import p5b.g;

public class SmoothPagerSlidingTabStrip$c extends PagerSlidingTabStrip$d	// class@001c51
{
    public TextView j;
    public boolean k;
    public View$OnClickListener l;
    public View$OnClickListener m;
    public boolean n;
    public boolean o;
    public boolean p;
    public View$OnClickListener q;

    public void SmoothPagerSlidingTabStrip$c(String p0,CharSequence p1){
       super(p0, p1);
    }
    public void g(boolean p0){
       this.o = p0;
    }
    public void h(boolean p0){
       this.n = p0;
    }
    public void i(View$OnClickListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SmoothPagerSlidingTabStrip$c.class, "2")) {
          return;
       }
       this.j(p0, false);
       return;
    }
    public void j(View$OnClickListener p0,boolean p1){
       this.k = p1;
       this.l = p0;
       SmoothPagerSlidingTabStrip$c tm = this.m;
       if (tm != null) {
          this.q = tm;
          this.p = p1;
       }
       return;
    }
    public View l(Context p0,int p1,ViewPager p2,SmoothSlidingTabStrip p3,ViewGroup p4){
       SmoothPagerSlidingTabStrip$c uoc = SmoothPagerSlidingTabStrip$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4};
          p4 = PatchProxy.apply(objArray, this, uoc, "1");
          if (p4 != PatchProxyResult.class) {
             return p4;
          }
       }
       FrameLayout uFrameLayout = new FrameLayout(p0);
       uFrameLayout.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       EmojiTextView uEmojiTextVi = new EmojiTextView(p0);
       uEmojiTextVi.setId(R.id.magic_tab_view);
       uEmojiTextVi.setText(this.f());
       uEmojiTextVi.setFocusable(1);
       uEmojiTextVi.setGravity(17);
       uEmojiTextVi.setSingleLine();
       EmojiTextView uEmojiTextVi1 = new EmojiTextView(p0);
       this.j = uEmojiTextVi1;
       uEmojiTextVi1.setText(this.f());
       this.j.setFocusable(1);
       this.j.setGravity(17);
       this.j.setSingleLine();
       this.j.setVisibility(4);
       this.j.setId(R.id.magic_tab_replace_view);
       uFrameLayout.addView(this.j);
       uFrameLayout.addView(uEmojiTextVi);
       uFrameLayout.setOnClickListener(new h(this, p2, p1));
       this.m(p1, p2, p3);
       return uFrameLayout;
    }
    public void m(int p0,ViewPager p1,SmoothSlidingTabStrip p2){
       if (PatchProxy.isSupport(SmoothPagerSlidingTabStrip$c.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, SmoothPagerSlidingTabStrip$c.class, "3")) {
          return;
       }
       g og = new g(this, p0, p1, p2);
       this.m = og;
       this.q = og;
       this.p = this.k;
       return;
    }
}
