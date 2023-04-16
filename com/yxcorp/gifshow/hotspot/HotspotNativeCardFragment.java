package com.yxcorp.gifshow.hotspot.HotspotNativeCardFragment;
import im8.g;
import com.yxcorp.gifshow.commoninsertcard.fragment.CommonCardFragment;
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import awa.e;
import java.util.Map;
import com.kwai.component.photo.detail.slide.groot.DetailSlidePlayFragment;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import androidx.recyclerview.widget.RecyclerView;
import vkc.b;
import com.kwai.library.groot.slide.fragment.GrootBaseFragment;
import android.view.View;
import android.os.Bundle;
import q99.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.LivePlayConfig;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import ag6.a;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import gwa.h;
import com.yxcorp.gifshow.hotspot.presenter.f;
import com.yxcorp.gifshow.hotspot.presenter.d;
import x99.o;
import gwa.e;
import im8.c;

public class HotspotNativeCardFragment extends CommonCardFragment implements g	// class@0018e2
{
    public PresenterV2 G;
    public a H;
    public RecyclerView I;
    public Map J;
    public static final int K;

    public void HotspotNativeCardFragment(){
       super();
       this.J = new HashMap();
    }
    public int M(){
       return 1;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, HotspotNativeCardFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, HotspotNativeCardFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(HotspotNativeCardFragment.class, new e());
       }else {
          obj.put(HotspotNativeCardFragment.class, null);
       }
       return obj;
    }
    public String getPageParams(){
       DetailSlidePlayFragment tx = this.x;
       if (tx == null || tx.mPhoto == null) {
          return "is_hot_card=0";
       }
       return "is_hot_card=1";
    }
    public final RecyclerView h0(){
       GrootBaseFragment obj = PatchProxy.apply(null, this, HotspotNativeCardFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (b.c()) {
          obj = this.j;
          if (obj != null) {
             RecyclerView recyclerView = obj.findViewById(R.id.child_auto_play_recycler);
             this.I = recyclerView;
             return recyclerView;
          }
       }
       if (this.I == null) {
          obj = this.j;
          if (obj != null) {
             this.I = obj.findViewById(0x7f0a06d2);
          }
       }
       return this.I;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotspotNativeCardFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.H = new a(this, null, 15);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, HotspotNativeCardFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.onCreateView(p0, p1, p2);
       this.j = a.c(p0, 0x7f0d1524, p1, false);
       this.xh();
       this.h0();
       return this.j;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, HotspotNativeCardFragment.class, "7")) {
          return;
       }
       super.onDestroy();
       HotspotNativeCardFragment tH = this.H;
       if (tH != null) {
          tH.a();
       }
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HotspotNativeCardFragment.class, "6")) {
          return;
       }
       super.onDestroyView();
       HotspotNativeCardFragment tG = this.G;
       if (tG != null) {
          tG.destroy();
          this.G = null;
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotspotNativeCardFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       DetailSlidePlayFragment tx = this.x;
       if (tx != null && (tx.mPhoto != null && !PatchProxy.applyVoidOneRefs(p0, this, HotspotNativeCardFragment.class, "5"))) {
          PresenterV2 presenterV2 = new PresenterV2();
          this.G = presenterV2;
          presenterV2.U7(new h());
          this.G.U7(new f());
          this.G.U7(new d(this.H));
          this.G.U7(new o());
          this.G.U7(new e());
          this.G.f(p0);
          Object[] objArray = new Object[]{this.x,new c("FRAGMENT", this),new c("HOTSPOT_LIST_SCROLL_STATE", this.J),this.H,this.I};
          this.G.i(objArray);
       }
    label_008d :
       return;
    }
}
