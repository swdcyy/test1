package com.kuaishou.live.core.show.myfollow.LiveMyFollowFragment;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import ua2.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import sc2.a;
import va2.j;
import f72.d0;
import x99.o;
import y8c.t;
import sc2.h;
import q99.a;
import y99.i;
import sc2.f;
import java.util.Map;
import android.os.Bundle;
import com.kuaishou.live.core.show.doublelist.model.LiveDoubleListParam;
import com.yxcorp.gifshow.model.LivePlayConfig;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import g9c.d;
import androidx.recyclerview.widget.RecyclerView;
import y8c.g;
import e72.n;
import com.kwai.component.photo.reduce.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.DecoSafeStaggeredLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import qvb.i;
import e72.o;

public class LiveMyFollowFragment extends RecyclerFragment	// class@000d47
{
    public LiveDoubleListParam F;
    public a G;
    public final f H;

    public void LiveMyFollowFragment(){
       super();
       this.H = new f();
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, LiveMyFollowFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.B2();
       obj.U7(new a());
       obj.U7(new j());
       obj.U7(new d0());
       obj.U7(new o());
       PatchProxy.onMethodExit(LiveMyFollowFragment.class, "6");
       return obj;
    }
    public t Bh(){
       Object obj = PatchProxy.apply(null, this, LiveMyFollowFragment.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new h(this, 3);
    }
    public boolean Eh(){
       return true;
    }
    public int M(){
       return 5;
    }
    public boolean S0(){
       return false;
    }
    public void c0(){
       if (PatchProxy.applyVoid(null, this, LiveMyFollowFragment.class, "9")) {
          return;
       }
       super.c0();
       this.G.d.d(false);
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0cd3;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveMyFollowFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       Map obj = PatchProxy.applyOneRefs(p0, this, LiveMyFollowFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getObjectsByTag(p0);
       if (p0.equals("provider")) {
          obj.put(LiveMyFollowFragment.class, new f());
       }else {
          obj.put(LiveMyFollowFragment.class, null);
       }
       return obj;
    }
    public String o(){
       return "MY_FOLLOW_LIVE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveMyFollowFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       LiveDoubleListParam liveDoubleLi = PatchProxy.apply(null, this, LiveMyFollowFragment.class, "10");
       if (liveDoubleLi != PatchProxyResult.class) {
       }else {
          liveDoubleLi = new LiveDoubleListParam();
          liveDoubleLi.mType = 4;
          liveDoubleLi.mSummaryMode = 3;
       }
       this.F = liveDoubleLi;
       this.G = new a(this, FollowConfigUtil.o(), 14);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveMyFollowFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.ia().R0(this.h0());
       return;
    }
    public int qh(){
       return 0x7f0a21f3;
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, LiveMyFollowFragment.class, "8")) {
          return;
       }
       super.u();
       this.G.d.d(true);
       return;
    }
    public g vh(){
       Object obj = PatchProxy.apply(null, this, LiveMyFollowFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{this.G,this.H};
       return new n(new f(this), this.F, objArray);
    }
    public boolean x0(){
       return true;
    }
    public RecyclerView$LayoutManager xh(){
       DecoSafeStaggeredLayoutManager obj = PatchProxy.apply(null, this, LiveMyFollowFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new DecoSafeStaggeredLayoutManager(2, 1);
       obj.setGapStrategy(2);
       obj.N(this.h0());
       return obj;
    }
    public i yh(){
       Object obj = PatchProxy.apply(null, this, LiveMyFollowFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveMyFollowFragment tF = this.F;
       return new o(tF.mType, null, tF.mCardStyle);
    }
}
