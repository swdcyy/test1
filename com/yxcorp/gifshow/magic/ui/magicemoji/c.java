package com.yxcorp.gifshow.magic.ui.magicemoji.c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicEmojiFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import s5b.b;
import java.lang.StringBuilder;
import q87.c;
import m4b.v;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.magic.ui.magicemoji.MagicFaceFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import k2b.e0;
import r5b.e;
import java.util.Objects;
import l5b.d;
import com.yxcorp.gifshow.model.MagicEmoji;
import java.util.List;
import java.util.Iterator;

public class c implements ViewPager$i	// class@001bb7
{
    public final MagicEmojiFragment b;

    public void c(MagicEmojiFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       this.b.ei(p0);
       Fragment uFragment = this.b.rh(p0);
       int i = 0;
       Object[] objArray = new Object[i];
       b.D().w("MagicEmojiFragment", "onPageSelected "+p0+" fragment:"+uFragment, objArray);
       if (uFragment == null) {
          k1.r(new v(this), 16);
          return;
       }else if(uFragment instanceof MagicFaceFragment){
          uFragment.yh(i);
          e.c(p0, this.b.vh(p0).f().toString(), this.b.I);
          uFragment.ph(this.b.ph());
          MagicEmojiFragment d1 = this.b.d1;
          MagicFaceFragment l = uFragment.l;
          Objects.requireNonNull(d1);
          if (!PatchProxy.applyVoidOneRefs(l, d1, d.class, "5")) {
             b uob = b.D();
             StringBuilder str = "setLastTab ";
             String str1 = null;
             String str2 = (l == null)? str1: l.mName;
             Object[] objArray1 = new Object[i];
             uob.w("MagicEmojiTabs", str+str2, objArray1);
             d1.d(d1.a);
             if (l != null) {
                str1 = l.mId;
             }
             d1.a = str1;
          }
          uoc = this.b;
          uoc.e1 = uoc.ph();
       }
       Iterator iterator = this.b.nh().iterator();
       while (iterator.hasNext()) {
          Fragment uFragment1 = iterator.next();
          if (uFragment1 instanceof MagicFaceFragment) {
             uFragment1.qh(p0);
          }
       }
       this.b.ai(p0);
       return;
    }
}
