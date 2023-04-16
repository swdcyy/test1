package com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment$a;
import androidx.viewpager.widget.ViewPager$i;
import com.yxcorp.gifshow.v3.editor.music_v2.ui_new.MainTabHostFragment;
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
import com.google.gson.JsonObject;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.v3.editor.music_v2.action.SwitchTabAction;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.music.vb.SwitchTab;
import xvc.b;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;

public final class MainTabHostFragment$a implements ViewPager$i	// class@001101
{
    public final MainTabHostFragment b;

    public void MainTabHostFragment$a(MainTabHostFragment p0){
       this.b = p0;
       super();
    }
    public void onPageScrollStateChanged(int p0){
    }
    public void onPageScrolled(int p0,float p1,int p2){
    }
    public void onPageSelected(int p0){
       MainTabHostFragment$a uoa = MainTabHostFragment$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "1")) {
          return;
       }
       uoa = this.b;
       if (uoa.C != null) {
          uoa.C = false;
          return;
       }else {
          FragmentActivity activity = uoa.getActivity();
          Objects.requireNonNull(activity, "null cannot be cast to non-null type com.yxcorp.gifshow.log.ILogPage");
          FragmentActivity uFragmentAct = activity;
          PagerSlidingTabStrip$d uod = this.b.wh().get(p0).c();
          a.o(uod, "tabFragmentDelegates[position].tab");
          String str = uod.c();
          if (!PatchProxy.applyVoidTwoRefs(uFragmentAct, str, null, g0.class, "21")) {
             JsonObject jsonObject = new JsonObject();
             jsonObject.c0("tab_name", str);
             g0.j(uFragmentAct, 0, "RECO_COLLECT_TAB", 0, "", jsonObject, null);
          }
          uoa = this.b;
          uoa.B.t0(new SwitchTabAction(uoa.Qh(p0)));
          return;
       }
    }
}
