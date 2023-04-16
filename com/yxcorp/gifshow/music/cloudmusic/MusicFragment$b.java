package com.yxcorp.gifshow.music.cloudmusic.MusicFragment$b;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.music.cloudmusic.MusicFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragmentV2;
import com.yxcorp.gifshow.music.cloudmusic.local.LocalMusicFragmentWrapper;
import com.yxcorp.gifshow.util.rx.RxBus;
import yob.b;
import java.util.Objects;
import com.yxcorp.gifshow.music.cloudmusic.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import com.google.gson.JsonObject;
import jqb.k;
import k2b.e0;
import yob.d;

public class MusicFragment$b implements ViewPager$i	// class@001fe3
{
    public int b;
    public final MusicFragment c;

    public void MusicFragment$b(MusicFragment p0){
       this.c = p0;
       super();
       this.b = -1;
    }
    public void onPageScrollStateChanged(int p0){
       if (this.b == -1 && p0) {
          this.b = p0;
       }
       return;
    }
    public void onPageScrolled(int p0,float p1,int p2){
       if (PatchProxy.isSupport(MusicFragment$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, MusicFragment$b.class, "1")) {
          return;
       }
       if (this.c.t() instanceof LocalMusicFragmentWrapper) {
          MusicFragment$b tc = this.c;
          if (p0 != tc.L) {
             tc.M = true;
             RxBus.f.b(new b(false));
          }else {
             p0 = p1;
             if (p0 && tc.M == null) {
                tc.M = true;
                RxBus.f.b(new b(false));
             }else if(!p0 && tc.M != null){
                tc.M = false;
                RxBus.f.b(new b(true));
             }
          }
       }
       return;
    }
    public void onPageSelected(int p0){
       MusicFragment$b uob = MusicFragment$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       Fragment uFragment = this.c.t();
       if (uFragment != null) {
          boolean b = false;
          boolean b1 = true;
          if (uFragment instanceof LocalMusicFragmentWrapper) {
             MusicFragment$b tc = this.c;
             MusicFragment g = tc.G;
             if (g != null) {
                tc.L = p0;
                tc.M = b;
                Objects.requireNonNull(g);
                if (PatchProxy.applyVoidOneRefs(uFragment, g, a.class, "7") || (g.u != null && g.r == null)) {
                   g.r = uFragment;
                   if (g.t.findViewById(0x7f0a34b7) == null) {
                      ViewGroup$LayoutParams layoutParams = g.u.getLayoutParams();
                      if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                         layoutParams.bottomMargin = a.x;
                      }
                      g.u.setLayoutParams(layoutParams);
                   }
                }
                RxBus.f.b(new b(b1));
             }
          }
          String str = this.c.ph();
          String str1 = this.c.qh();
          uob = this.b;
          d uod = 2;
          if (uob == uod) {
             k.u(str, str1, this.c.z, 1, k.f(str1), this.c);
          }else if(uob == b1){
             MusicFragment$b tc2 = this.c;
             MusicFragment z = tc2.z;
             k ok = k.class;
             if (PatchProxy.isSupport(ok)) {
                int i = 5;
                Object[] objArray = new Object[i];
                objArray[b] = str;
                objArray[b1] = str1;
                objArray[uod] = z;
                objArray[3] = Integer.valueOf(i);
                objArray[4] = tc2;
                if (!PatchProxy.applyVoid(objArray, null, ok, "22")) {
                }
             }else {
             }
          }
       }
    label_00c3 :
       this.b = -1;
       MusicFragment$b tc1 = this.c;
       RxBus.f.b(new d(tc1.eh(tc1.K)));
       this.c.K = p0;
       return;
    }
}
