package com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment;
import eb5.g;
import on5.f;
import com.yxcorp.gifshow.lazy.LazyInitSupportedFragment;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment$a;
import com.yxcorp.gifshow.channel.stagger.HotChannelWebContainerFragment$b;
import on5.e;
import brd.t;
import eb5.f;
import com.yxcorp.gifshow.refresh.RefreshType;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.channel.HotChannel;
import lnc.u3;
import fr6.a;
import wq6.k;
import wq6.j;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import i2b.a;
import androidx.fragment.app.Fragment;
import xa5.a;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.webview.yoda.view.KwaiYodaWebViewFragment;
import com.yxcorp.gifshow.webview.api.WebViewFragment$b;
import com.kwai.yoda.model.LaunchModel$a;
import com.kwai.yoda.model.LaunchModel;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import gj9.k;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import ab5.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import cb5.g;
import im8.c;
import java.lang.StringBuilder;
import lnc.g0;
import wq6.d;

public class HotChannelWebContainerFragment extends LazyInitSupportedFragment implements g, f	// class@00105d
{
    public KwaiYodaWebViewFragment s;
    public a t;
    public PresenterV2 u;
    public HotChannel v;
    public final KwaiYodaWebView$b w;
    public final WebViewFragment$b x;

    public void HotChannelWebContainerFragment(){
       super();
       this.w = new HotChannelWebContainerFragment$a(this);
       this.x = new HotChannelWebContainerFragment$b(this);
    }
    public boolean B7(){
       return e.f(this);
    }
    public void L8(){
       e.h(this);
    }
    public int M(){
       return 2;
    }
    public void N1(){
       e.j(this);
    }
    public t Ra(){
       return f.b(this);
    }
    public void U0(boolean p0){
       e.k(this, p0);
    }
    public void X(RefreshType p0,boolean p1){
       e.i(this, p0, p1);
    }
    public String X3(){
       Object obj = PatchProxy.apply(null, this, HotChannelWebContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u3.a(this.v.mId, "hot");
    }
    public boolean Xg(){
       return false;
    }
    public void a6(){
       e.b(this);
    }
    public a b0(){
       return j.a(this);
    }
    public View eh(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, HotChannelWebContainerFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d04a4, p1, false);
       if (!PatchProxy.applyVoidOneRefs(view, this, HotChannelWebContainerFragment.class, "3") && !a.g(this)) {
          View view1 = view.findViewById(R.id.channel_web_container);
          ViewGroup$MarginLayoutParams layoutParams = view1.getLayoutParams();
          layoutParams.bottomMargin = 0;
          view1.setLayoutParams(layoutParams);
       }
       return view;
    }
    public int f(){
       int i = (this.v.mIsLive != null)? 88: 8;
       return i;
    }
    public void fh(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, HotChannelWebContainerFragment.class, "4")) {
          return;
       }
       this.a6();
       Object[] objArray = null;
       int i = 0;
       if (!PatchProxy.applyVoid(objArray, this, HotChannelWebContainerFragment.class, "8") && this.s == null) {
          HotChannelWebContainerFragment tv = this.v;
          if (tv != null && !TextUtils.isEmpty(tv.mH5Url)) {
             KwaiYodaWebViewFragment kwaiYodaWebV = new KwaiYodaWebViewFragment();
             this.s = kwaiYodaWebV;
             kwaiYodaWebV.lh(this.x);
             kwaiYodaWebV = this.getArguments();
             if (kwaiYodaWebV != null) {
                SerializableHook.putSerializable(kwaiYodaWebV, "model", new LaunchModel$a(this.v.mH5Url).l("none").g(i).f(1).a());
             }
             this.s.setArguments(kwaiYodaWebV);
             e uoe = this.getChildFragmentManager().beginTransaction();
             uoe.v(R.id.channel_web_container, this.s);
             uoe.m();
             this.Vg().i().compose(c.c(this.m(), FragmentEvent.DESTROY_VIEW)).subscribe(new k(this), Functions.e);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, HotChannelWebContainerFragment.class, "6") && this.t == null) {
          this.t = new a();
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, HotChannelWebContainerFragment.class, "7")) {
          this.u = new PresenterV2();
          if (a.h(this)) {
             this.u.U7(new g(this));
          }
          this.u.f(p0);
          Object[] objArray1 = new Object[]{this.t,new c("FRAGMENT", this)};
          this.u.i(objArray1);
       }
       return;
    }
    public int getPage(){
       return 3;
    }
    public String getPageParams(){
       Object obj = PatchProxy.apply(null, this, HotChannelWebContainerFragment.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "channel_id="+this.v.mId+"&channel_name="+g0.a(this.v)+"&sub_channel_name="+g0.a(this.v)+"&sub_channel_id="+this.v.mSubChannelId;
    }
    public String getUrl(){
       return "";
    }
    public String h5(){
       return this.v.mId;
    }
    public boolean i8(){
       return e.e(this);
    }
    public boolean kf(){
       return f.a(this);
    }
    public boolean lh(){
       return true;
    }
    public String o(){
       Object obj = PatchProxy.apply(null, this, HotChannelWebContainerFragment.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.o();
    }
    public boolean o3(){
       return e.d(this);
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotChannelWebContainerFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.v = SerializableHook.getSerializable(this.getArguments(), "key_channel");
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, HotChannelWebContainerFragment.class, "5")) {
          return;
       }
       HotChannelWebContainerFragment tu = this.u;
       if (tu != null) {
          tu.destroy();
          this.u = null;
       }
       super.onDestroyView();
       return;
    }
    public void onRefresh(){
       e.g(this);
    }
    public String pg(){
       Object obj = PatchProxy.apply(null, this, HotChannelWebContainerFragment.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (a.d(this) && this.v != null) {
          return "_"+this.v.mId;
       }
       return super.pg();
    }
    public int r(){
       return e.a(this);
    }
    public d s8(){
       return j.b(this);
    }
    public boolean u0(boolean p0){
       return e.c(this, p0);
    }
    public d z5(){
       return j.c(this);
    }
}
