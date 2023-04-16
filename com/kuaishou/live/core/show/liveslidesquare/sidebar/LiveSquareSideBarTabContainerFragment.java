package com.kuaishou.live.core.show.liveslidesquare.sidebar.LiveSquareSideBarTabContainerFragment;
import com.yxcorp.gifshow.recycler.fragment.TabHostFragment;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;
import pb2.a;
import android.os.Bundle;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTrans;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import pb2.u;
import java.util.Objects;
import com.kuaishou.android.live.model.QLivePlayConfig;
import tl8.d;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xl8.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import wkd.b;
import com.kuaishou.live.playeradapter.statistics.a;
import java.lang.StringBuilder;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveSourceType;
import f3b.o;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import android.view.View;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import lnc.g2;
import nb2.k;
import lnc.g2$a;
import im8.c;
import java.util.List;
import java.lang.Number;

public class LiveSquareSideBarTabContainerFragment extends TabHostFragment	// class@000ca1
{
    public g2 B;
    public final LivePlayLogger C;
    public String D;
    public final a E;
    public static final int F;

    public void LiveSquareSideBarTabContainerFragment(){
       super();
       this.C = new LivePlayLogger();
       this.E = new a();
    }
    public int Bh(){
       return 0x7f0a25ec;
    }
    public void Gh(int p0,Bundle p1){
       if (PatchProxy.isSupport(LiveSquareSideBarTabContainerFragment.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LiveSquareSideBarTabContainerFragment.class, "12")) {
          return;
       }
       if (this.u != null && this.v != null) {
          super.Gh(p0, p1);
       }
       return;
    }
    public ClientEvent$ExpTagTrans I1(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       u obj = PatchProxy.apply(objArray, this, LiveSquareSideBarTabContainerFragment.class, "7");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = u.c(this.getActivity());
       Objects.requireNonNull(obj);
       QLivePlayConfig qLivePlayCon = PatchProxy.apply(objArray, obj, u.class, "8");
       if (qLivePlayCon != patchProxyRe) {
       }else if(obj.a()){
          qLivePlayCon = obj.i.a(QLivePlayConfig.class);
       }else {
          qLivePlayCon = objArray;
       }
       if (qLivePlayCon != null) {
          objArray = this.C.buildExpTagTrans(qLivePlayCon);
       }
       return objArray;
    }
    public ClientEvent$ExpTagTrans K5(){
       Object[] objArray = null;
       LiveStreamFeed obj = PatchProxy.apply(objArray, this, LiveSquareSideBarTabContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = u.c(this.getActivity()).j();
       if (obj != null) {
          objArray = this.C.buildExpTagTrans(obj.a(QLivePlayConfig.class));
       }
       return objArray;
    }
    public int M(){
       return 5;
    }
    public String Qh(){
       Object obj = PatchProxy.apply(null, this, LiveSquareSideBarTabContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u.c(this.getActivity()).g();
    }
    public void Rh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSquareSideBarTabContainerFragment.class, "9")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.E.f.d(p0);
       }
       return;
    }
    public void Sh(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSquareSideBarTabContainerFragment.class, "8")) {
          return;
       }
       if (!TextUtils.x(p0)) {
          this.E.e.d(p0);
       }
       return;
    }
    public int getLayoutResId(){
       return 0x7f0d0ddc;
    }
    public String getPageParams(){
       Object[] objArray = null;
       String obj = PatchProxy.apply(objArray, this, LiveSquareSideBarTabContainerFragment.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = super.getPageParams();
       b.a(0x30f594c9).b(this.D);
       if (u.c(this.getActivity()).f() != null) {
          objArray = u.c(this.getActivity()).f();
       }
       StringBuilder str = "refer_live_source_type="+o.g(ClientContent$LiveSourceType.class, u.c(this.getActivity()).i())+"&aggregation_session_id="+this.getArguments().getString("aggregation_session_id")+"&live_streamid="+u.c(this.getActivity()).g()+"&author_id="+u.c(this.getActivity()).e()+"&exptag"+objArray+"&live_session_id="+this.D;
       if (this.v != null && this.vh(this.ph()) != null) {
          str = str+"&tag_id="+this.vh(this.ph()).c()+"&tag_name="+this.vh(this.ph()).f();
       }
       if (TextUtils.x(obj)) {
          obj = str;
       }else if(!obj.contains("refer_live_source_type") && !obj.contains("aggregation_session_id")){
          obj = obj+"&"+str;
       }
       return obj;
    }
    public String o(){
       return "LIVE_MORE_SQUARE";
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveSquareSideBarTabContainerFragment.class, "2")) {
          return;
       }
       super.onCreate(p0);
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveSquareSideBarTabContainerFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.D = b.a(0x30f594c9).a(this.o());
       if (!PatchProxy.applyVoid(null, this, LiveSquareSideBarTabContainerFragment.class, "15")) {
          if (this.B == null) {
             this.B = new g2(this, new k(this));
          }
          Object[] objArray = new Object[]{new c("FRAGMENT", this),this.E};
          this.B.b(objArray);
       }
       return;
    }
    public List wh(){
       return null;
    }
    public int yh(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveSquareSideBarTabContainerFragment.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.v != null) {
          return super.yh(p0);
       }
       return -1;
    }
}
