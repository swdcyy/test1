package com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.c;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment;
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
import qpc.g;
import java.lang.Boolean;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import android.util.Pair;
import lnc.v6;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextLibraryFragment$a;
import rwc.j;
import com.yxcorp.gifshow.v3.editor.cover.covertextlibrary.CoverTextGroupFragment;

public class c implements ViewPager$i	// class@000e53
{
    public int b;
    public final CoverTextLibraryFragment c;

    public void c(CoverTextLibraryFragment p0){
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
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "1")) {
          return;
       }
       Fragment uFragment = this.c.rh(p0);
       int i = -1;
       if (uFragment != null) {
          CharSequence uCharSequenc = this.c.vh(p0).f();
          String str = this.c.J.get(uCharSequenc.toString());
          int i1 = (TextUtils.x(str))? -1: Integer.parseInt(str);
          c tb = this.b;
          int i2 = 2;
          if (tb == i2 || tb == 1) {
             boolean b = (tb == i2)? true: false;
             g og = g.class;
             if (!PatchProxy.isSupport(og) || !PatchProxy.applyVoidTwoRefs(Boolean.valueOf(b), Integer.valueOf(i1), null, og, "7")) {
                ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                uElementPack.action2 = "MORE_COVER_TAB";
                uElementPack.action = 404;
                Pair[] pairArray = new Pair[]{new Pair("tab_id", Integer.valueOf(i1))};
                uElementPack.params = uElementPack.a(pairArray);
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                if (b) {
                   u1.u(1, uElementPack, uContentPack);
                }else {
                   u1.u(5, uElementPack, uContentPack);
                }
             }
          }
          String str1 = uCharSequenc.toString();
          if (TextUtils.x(str)) {
             str = "-1";
          }
          g.a(str1, str);
          g.e = p0;
       }
       this.b = i;
       CoverTextLibraryFragment f = this.c.F;
       if (f != null && f.size() > p0) {
          c tc = this.c;
          CoverTextLibraryFragment l = tc.L;
          if (l != null) {
             l.setValue(tc.F.get(p0).a);
          }
       }
       if (this.c.M == null && uFragment instanceof CoverTextGroupFragment) {
          uFragment.ch();
       }
       return;
    }
}
