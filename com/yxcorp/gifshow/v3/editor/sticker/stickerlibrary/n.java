package com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.n;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import java.lang.CharSequence;
import java.util.Map;
import com.yxcorp.utility.TextUtils;
import itc.x2;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import com.yxcorp.gifshow.v3.editor.sticker.h1;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.sticker.model.StickerGroupInfo;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerLibraryFragment$c;
import rwc.j;
import com.yxcorp.gifshow.v3.editor.sticker.stickerlibrary.StickerGroupFragment;

public class n implements ViewPager$i	// class@0012a8
{
    public int b;
    public final StickerLibraryFragment c;

    public void n(StickerLibraryFragment p0){
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
    }
    public void onPageSelected(int p0){
       ClientEvent$ElementPackage uElementPack;
       Pair[] pairArray;
       Pair pair;
       n on = n.class;
       if (PatchProxy.isSupport(on) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, on, "1")) {
          return;
       }
       Fragment uFragment = this.c.rh(p0);
       int i = -1;
       if (uFragment != null) {
          CharSequence uCharSequenc = this.c.vh(p0).f();
          int i1 = (TextUtils.x(this.c.G.get(uCharSequenc.toString())))? -1: Integer.valueOf(this.c.G.get(uCharSequenc.toString())).intValue();
          n tb = this.b;
          List list = 2;
          int i2 = 1;
          if (tb == list || tb == i2) {
             boolean b = (tb == list)? true: false;
             x2 ox2 = x2.class;
             if (!PatchProxy.isSupport(ox2) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Integer.valueOf(i1), null, ox2, "2")) {
                if (b) {
                   if (!PatchProxy.isSupport(ox2) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), null, ox2, "3")) {
                      uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.name = "switch_sticker_tab";
                      uElementPack.action = 404;
                      pairArray = new Pair[i2];
                      pair = new Pair("tab_id", Integer.valueOf(i1));
                      pairArray[0] = pair;
                      uElementPack.params = pair.a(pairArray);
                      x2.b(uElementPack);
                   }
                }else if(PatchProxy.isSupport(ox2) && PatchProxy.applyVoidOneRefs(Integer.valueOf(i1), null, ox2, "4")){
                   uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.name = "switch_sticker_tab";
                   uElementPack.action = 404;
                   pairArray = new Pair[i2];
                   pair = new Pair("tab_id", Integer.valueOf(i1));
                   pairArray[0] = pair;
                   uElementPack.params = pair.a(pairArray);
                   u1.u(5, uElementPack, new ClientContent$ContentPackage());
                }
             }
          }
       label_00f2 :
          x2.a(uCharSequenc.toString(), this.c.G.get(uCharSequenc.toString()));
          h1.n(p0);
       }
       this.b = i;
       StickerLibraryFragment f = this.c.F;
       if (f != null && f.size() > p0) {
          n tc = this.c;
          StickerLibraryFragment e = tc.E;
          if (e != null) {
             e.a(tc.F.get(p0));
          }
          tc = this.c;
          e = tc.K;
          if (e != null) {
             e.setValue(tc.F.get(p0).mGroupId);
          }
       }
    label_013c :
       if (this.c.L == null && uFragment instanceof StickerGroupFragment) {
          uFragment.ch();
       }
       return;
    }
}
