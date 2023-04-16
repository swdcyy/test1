package com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayFragment;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.library.slide.base.log.SlidePlayLogger;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.Fragment;
import k2b.e0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import ag6.a;
import androidx.fragment.app.c;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayRecyclerFragment;
import androidx.fragment.app.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.pymk.slide.play.empty.e;
import com.kwai.feature.api.social.reminder.model.ReminderRecommendUserListFeed;
import com.kwai.component.feedstaggercard.widget.a;
import ok.x;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import com.yxcorp.gifshow.pymk.slide.play.empty.a;
import java.lang.Boolean;
import com.kwai.library.widget.refresh.RefreshLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import com.yxcorp.gifshow.pymk.slide.play.empty.PymkDetailSlidePlayFragment$a;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import k7c.a;
import com.kwai.library.groot.slide.viewpager.KwaiGrootViewPager;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;

public class PymkDetailSlidePlayFragment extends DetailSlidePlayFragment	// class@0016d1
{
    public View F;
    public RefreshLayout G;
    public RefreshLayout$h H;
    public static final int I;

    public void PymkDetailSlidePlayFragment(){
       super();
    }
    public void H2(){
    }
    public int M(){
       return 1;
    }
    public void N2(){
    }
    public void Q0(){
    }
    public void Q1(){
    }
    public SlidePlayLogger d1(){
       return null;
    }
    public String getPageParams(){
       return "friends_visited_source=0&redpoint_id=null&redpoint_num=null&redpoint_style=null";
    }
    public String getUrl(){
       return "ks://photo";
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, PymkDetailSlidePlayFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getParentFragment() instanceof e0) {
          return this.getParentFragment().o();
       }
       return super.o();
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       BaseFeed uBaseFeed;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, PymkDetailSlidePlayFragment.class, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       if (this.F == null) {
          this.F = a.c(p0, 0x7f0d129f, p1, false);
       }
       String str = "PymkDetailSlidePlay";
       Fragment uFragment = this.getChildFragmentManager().findFragmentByTag(str);
       Object[] objArray = null;
       if (!uFragment instanceof PymkDetailSlidePlayRecyclerFragment) {
          uFragment = PatchProxy.apply(objArray, objArray, PymkDetailSlidePlayRecyclerFragment.class, "12");
          if (uFragment != patchProxyRe) {
          }else {
             PymkDetailSlidePlayRecyclerFragment pymkDetailSl = new PymkDetailSlidePlayRecyclerFragment();
             pymkDetailSl.setArguments(new Bundle());
             uFragment = pymkDetailSl;
          }
          e uoe = this.getChildFragmentManager().beginTransaction();
          uoe.w(R.id.pymk_fragment_container, uFragment, str);
          uoe.m();
       }
       BaseFeed baseFeed = this.x.getBaseFeed();
       ReminderRecommendUserListFeed reminderReco = PatchProxy.applyOneRefs(baseFeed, objArray, e.class, "5");
       if (reminderReco != patchProxyRe) {
       }else if(baseFeed instanceof ReminderRecommendUserListFeed){
          uBaseFeed = baseFeed;
       }else {
          uBaseFeed = objArray;
       }
       if (uBaseFeed != null) {
          reminderReco = uBaseFeed.mCachedPymkHelper;
          if (reminderReco instanceof e) {
          label_0089 :
             if (reminderReco != null) {
                reminderReco.a = baseFeed;
             }else {
                reminderReco = new e(a.b, a.b, objArray);
             }
          }
       }
       reminderReco = objArray;
       goto label_0089 ;
       GrootBaseFragment tk = this.k;
       if (tk != null) {
          uFragment.H = tk;
          uFragment.G = new a(reminderReco, uFragment);
          if (reminderReco.b.get().booleanValue()) {
             if (this.getParentFragment() != null && this.getParentFragment().getView() != null) {
                objArray = this.getParentFragment().getView().findViewById(0x7f0a3537);
             }
             this.G = objArray;
             AtomicBoolean uAtomicBoole = new AtomicBoolean(false);
             PymkDetailSlidePlayFragment tG = this.G;
             if (tG != null) {
                PymkDetailSlidePlayFragment$a uoa = new PymkDetailSlidePlayFragment$a(this, uAtomicBoole, reminderReco);
                this.H = uoa;
                tG.c(uoa);
             }
             uFragment.F = new a(this, uAtomicBoole, reminderReco);
          }
          this.yh("pull down init enabled.", false);
          this.xh("pymk page init.", false);
       }
       return this.F;
    }
    public void onDestroyView(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PymkDetailSlidePlayFragment.class, "4")) {
          return;
       }
       super.onDestroyView();
       PymkDetailSlidePlayFragment tG = this.G;
       if (tG != null) {
          PymkDetailSlidePlayFragment tH = this.H;
          if (tH != null) {
             tG.E(tH);
             this.H = objArray;
          }
          this.G = objArray;
       }
       this.yh("pull down not enabled", true);
       this.xh("pymk page destory", true);
       return;
    }
    public final void xh(String p0,boolean p1){
       if (PatchProxy.isSupport(PymkDetailSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PymkDetailSlidePlayFragment.class, "3")) {
          return;
       }
       Object[] objArray = new Object[]{p0,Boolean.valueOf(p1)};
       e.c("[%1$s] bottom tips enabled [%2$s]", objArray);
       GrootBaseFragment tk = this.k;
       if (tk != null) {
          tk.setDisableShowBottomTips((p1 ^ 1));
       }
       return;
    }
    public void yh(String p0,boolean p1){
       if (PatchProxy.isSupport(PymkDetailSlidePlayFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, PymkDetailSlidePlayFragment.class, "2")) {
          return;
       }
       Object[] objArray = new Object[]{p0,Boolean.valueOf(p1)};
       e.c("[%1$s] scroll enabled [%2$s]", objArray);
       GrootBaseFragment tk = this.k;
       if (tk != null) {
          tk.c0(p1, 15);
       }
       return;
    }
}
