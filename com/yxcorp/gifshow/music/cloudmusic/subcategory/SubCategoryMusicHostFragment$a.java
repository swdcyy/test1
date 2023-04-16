package com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicHostFragment$a;
import androidx.viewpager.widget.ViewPager$l;
import com.yxcorp.gifshow.music.cloudmusic.subcategory.SubCategoryMusicHostFragment;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import java.lang.CharSequence;
import jqb.k;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.utility.TextUtils;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import k2b.u1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;

public final class SubCategoryMusicHostFragment$a extends ViewPager$l	// class@002040
{
    public final SubCategoryMusicHostFragment b;

    public void SubCategoryMusicHostFragment$a(SubCategoryMusicHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageSelected(int p0){
       SubCategoryMusicHostFragment$a uoa = SubCategoryMusicHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       SubCategoryMusicHostFragment c = this.b.C;
       if (c == null) {
          a.S("mTaskId");
       }
       PagerSlidingTabStrip$d uod = this.b.vh(p0);
       a.o(uod, "getTab\(position\)");
       CharSequence uCharSequenc = uod.f();
       PagerSlidingTabStrip$d uod1 = this.b.vh(p0);
       a.o(uod1, "getTab\(position\)");
       String str = uod1.c();
       if (!PatchProxy.applyVoidThreeRefs(c, uCharSequenc, str, null, k.class, "45")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "SWITCH_CLASSIFY_TAB";
          if (!TextUtils.x(uCharSequenc)) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("classify_tab", uCharSequenc);
             uElementPack.params = jsonObject.toString();
          }
          u1.M0(k.g(c, uCharSequenc, str));
          u1.u(1, uElementPack, null);
       }
       return;
    }
}
