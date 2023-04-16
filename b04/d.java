package b04.d;
import qw3.a;
import androidx.lifecycle.MutableLiveData;
import com.oceanlong.home_perf.cache.MerchantHomeCacheManager;
import com.kuaishou.merchant.home.basic.log.MerchantHomePerfRepository;
import xz3.a;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.ViewModelProvider;
import b04.d$f;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModel;
import com.kuaishou.merchant.home2.basic.model.HomePage;
import java.util.Objects;
import java.lang.Exception;
import java.lang.Throwable;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo;
import com.kuaishou.merchant.home2.feed.FeedChannelInfo$a;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.merchant.home.basic.log.MerchantHomeLogBiz;
import java.lang.Integer;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.StringBuilder;
import p74.a;
import o74.a;
import java.util.Collection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import ot3.u0;
import com.kuaishou.merchant.home2.basic.stability.ExceptionCluesTags;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.LiveData;
import vw3.b;
import androidx.fragment.app.Fragment;
import android.view.View;
import iv.a;
import android.view.ViewGroup;
import java.util.HashMap;
import c04.a;
import android.app.Application;
import o56.a;
import android.content.Context;
import com.google.gson.JsonObject;
import su.g$a;
import java.util.Map;
import fg6.a;
import com.google.gson.Gson;
import ww3.a;
import f04.a;
import b04.d$c;
import androidx.recyclerview.widget.RecyclerView$r;
import b04.d$b;
import tu.i;
import b04.d$a;
import tu.b;
import com.kwai.sdk.switchconfig.a;
import zw3.f;
import tu.a;
import rw3.c;
import b04.d$d;
import su.g;
import b04.d$e;
import co4.d;
import com.kuaishou.merchant.pagedy.a;
import com.kuaishou.merchant.home2.main.Prefetch;
import zw3.b;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentResponse;
import java.lang.Boolean;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils;
import com.kuaishou.merchant.home2.MerchantHomePrefetchUtils$CacheConfig;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentHierarchyInfo;
import java.util.Set;
import java.lang.CharSequence;
import oy3.e;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo;
import com.kuaishou.bowl.data.center.data.model.page.component.PageComponentDataInfo$Field;
import com.kuaishou.merchant.home2.feed.model.FeedLivingData;
import com.google.gson.JsonElement;
import com.kuaishou.merchant.home2.feed.model.FeedLivingData$LiveStreamViews;
import crd.b;
import cx3.d;
import cx3.c;
import brd.t;
import com.kuaishou.merchant.home2.home.presenter.PageRefreshPresenter$a;
import erd.o;
import b04.b;
import b04.c;
import erd.g;
import androidx.recyclerview.widget.RecyclerView;

public class d extends a	// class@0002f9
{
    public String b;
    public long c;
    public b d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public final MutableLiveData h;
    public final MutableLiveData i;
    public final MutableLiveData j;
    public final MutableLiveData k;
    public final MutableLiveData l;
    public final MutableLiveData m;
    public final MutableLiveData n;
    public final MutableLiveData o;
    public final MerchantHomePerfRepository p;
    public final a q;
    public List r;
    public boolean s;
    public boolean t;
    public long u;
    public RecyclerView v;
    public a w;
    public boolean x;
    public final MerchantHomeCacheManager y;

    public void d(){
       super();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.i = new MutableLiveData();
       this.j = new MutableLiveData();
       this.k = new MutableLiveData();
       this.l = new MutableLiveData();
       this.m = new MutableLiveData();
       this.n = new MutableLiveData();
       this.o = new MutableLiveData();
       this.s = false;
       this.t = false;
       this.u = 0;
       this.x = false;
       this.y = new MerchantHomeCacheManager();
       this.p = new MerchantHomePerfRepository();
       this.q = new a();
       if (!SystemUtil.I()) {
          return;
       }
       throw new RuntimeException("please use HomePageViewModel.of factory method");
    }
    public void d(MerchantHomePerfRepository p0){
       super();
       this.e = new MutableLiveData();
       this.f = new MutableLiveData();
       this.g = new MutableLiveData();
       this.h = new MutableLiveData();
       this.i = new MutableLiveData();
       this.j = new MutableLiveData();
       this.k = new MutableLiveData();
       this.l = new MutableLiveData();
       this.m = new MutableLiveData();
       this.n = new MutableLiveData();
       this.o = new MutableLiveData();
       this.s = false;
       this.t = false;
       this.u = 0;
       this.x = false;
       this.y = new MerchantHomeCacheManager();
       this.p = p0;
       this.q = new a();
    }
    public static d J0(FragmentActivity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, d.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new ViewModelProvider(p0, new d$f(p0)).get(d.class);
    }
    public static void p0(d p0,HomePage p1){
       String str;
       Object obj = p0;
       List list = p1;
       Objects.requireNonNull(p0);
       d uod = d.class;
       if (PatchProxy.applyVoidOneRefs(list, obj, uod, "18")) {
       }else if(list == null){
          obj.K0(new Exception("home page is null!").fillInStackTrace());
       }else if(PatchProxy.applyVoidOneRefs(list, obj, uod, "20")){
          p0.s0();
          p1.fillRequiredData();
          FeedChannelInfo$a companion = FeedChannelInfo.Companion;
          HomePage mFeedChannel = list.mFeedChannelList;
          Objects.requireNonNull(companion);
          List list1 = PatchProxy.applyOneRefs(mFeedChannel, companion, FeedChannelInfo$a.class, "2");
          if (list1 != PatchProxyResult.class) {
          }else {
             list1 = null;
             int i = 1;
             if (mFeedChannel != null) {
                ArrayList uArrayList = new ArrayList();
                Iterator iterator = mFeedChannel.iterator();
                while (iterator.hasNext()) {
                   Object obj1 = iterator.next();
                   Object obj2 = obj1;
                   if (!obj2.isPictureTab()) {
                      FeedChannelInfo mChannelName = obj2.mChannelName;
                      boolean b = (mChannelName == null || !mChannelName.length())? true: false;
                      if (!b) {
                         obj2.setImageUrls(list1);
                      }else {
                         MerchantHomeLogBiz feed = MerchantHomeLogBiz.Feed;
                         Integer integer = Integer.valueOf(obj2.mChannelId);
                         mChannelName = obj2.mChannelName;
                         List imageUrls = obj2.getImageUrls();
                         if (imageUrls != null) {
                            CDNUrl uCDNUrl = imageUrls.get(0);
                            if (uCDNUrl != null) {
                               str = uCDNUrl.getUrl();
                            label_00a3 :
                               a.k(feed, "FeedChannelInfo", "key data must be non-null", "id", integer, "name", mChannelName, "url", str, "size", "width:"+obj2.getWidth()+" height:"+obj2.getHeight());
                            }
                         }
                         str = list1;
                         goto label_00a3 ;
                      }
                   }
                   uArrayList.add(obj1);
                }
                list1 = uArrayList;
             }
             FeedChannelInfo uFeedChannel = (list1 == null || list1.isEmpty())? 1: null;
             if (uFeedChannel) {
                FeedChannelInfo[] uFeedChannel1 = new FeedChannelInfo[i];
                uFeedChannel1[0] = new FeedChannelInfo(0, "推荐");
                list1 = CollectionsKt__CollectionsKt.P(uFeedChannel1);
             }
          }
          list.mFeedChannelList = list1;
          list.mResponseTime = u0.b();
          ExceptionCluesTags.logPage(ExceptionCluesTags.MerchantHomePage, list);
       }
       obj.e.setValue(list);
       obj.p.onEvent(8);
       return;
    }
    public static void q0(d p0,Throwable p1){
       p0.K0(p1);
    }
    public long A0(){
       return this.u;
    }
    public MutableLiveData C0(){
       return this.k;
    }
    public boolean D0(){
       return this.s;
    }
    public boolean E0(){
       return this.t;
    }
    public void F0(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "6")) {
          return;
       }
       this.e.observe(p0, p1);
       return;
    }
    public void G0(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "16")) {
          return;
       }
       this.m.observe(p0, p1);
       return;
    }
    public void H0(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "14")) {
          return;
       }
       this.l.observe(p0, p1);
       return;
    }
    public void I0(LifecycleOwner p0,Observer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "10")) {
          return;
       }
       this.n.observe(p0, p1);
       return;
    }
    public final void K0(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "22")) {
          return;
       }
       this.p.onEvent(9, p0);
       String str = "HomePageError";
       if (!PatchProxy.applyVoidTwoRefs(str, p0, null, b.class, "1")) {
          new b(str).a(p0);
       }
       ExceptionCluesTags.logPage(ExceptionCluesTags.MerchantHomePageError, null);
       if (this.e.getValue() == null) {
          this.e.setValue(HomePage.createDefault());
       }else {
          this.f.setValue(p0);
       }
       return;
    }
    public void L0(String p0,Fragment p1,View p2,a p3,String p4,String p5){
       d uod = d.class;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,p5};
          if (PatchProxy.applyVoid(objArray, this, uod, "23")) {
             return;
          }
       }
       ViewGroup viewGroup = null;
       if (p2 instanceof ViewGroup) {
       }else {
          ViewGroup viewGroup1 = viewGroup;
       }
       HashMap hashMap = new HashMap();
       hashMap.put("payInfo", a.b.a(a.b()));
       d tb = this.b;
       if (tb != null) {
          hashMap.put("channel", tb);
       }
       g$a uoa = new g$a(p0, "", "");
       uoa.v(p4);
       uoa.l(1);
       uoa.u(new HashMap());
       uoa.f(hashMap);
       uoa.g(p5);
       uoa.h(a.a);
       if (!a.a() || !a.b()) {
          viewGroup = p2;
       }
       uoa.D(viewGroup);
       uoa.e(p3);
       uoa.r(new d$c(this));
       uoa.B(new d$b(this));
       uoa.y(new d$a(this));
       if (a.t().d("merchantHomeAgileLocalOptimizeCode", 0)) {
          uoa.x(new f(p1));
       }
       HashMap hashMap1 = new HashMap();
       hashMap1.put("pageName", p0);
       c.b("merchant_home_onRefreshDynamicHomePage", hashMap1);
       if (a.a()) {
          HashMap hashMap2 = new HashMap();
          hashMap2.put("KEY_NEST_LIST_CONFIG_CALLBACK", new d$d(this));
          uoa.d(hashMap2);
       }
       a.i(p1, uoa.a(), new d$e(this));
       return;
    }
    public void M0(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "17")) {
          return;
       }
       this.m.removeObserver(p0);
       return;
    }
    public void O0(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "15")) {
          return;
       }
       this.l.removeObserver(p0);
       return;
    }
    public void P0(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
          return;
       }
       this.e.removeObserver(p0);
       return;
    }
    public void Q0(Observer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       this.n.removeObserver(p0);
       return;
    }
    public void R0(boolean p0){
       this.s = p0;
    }
    public void S0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       this.r = new ArrayList(p0);
       return;
    }
    public void T0(boolean p0){
       this.t = p0;
    }
    public void onCleared(){
       if (PatchProxy.applyVoid(null, this, d.class, "25")) {
          return;
       }
       super.onCleared();
       this.s0();
       Prefetch.w.a();
       HomePage value = this.e.getValue();
       if (value != null && value.mIsGuarantee == null) {
          SharedPreferences$Editor uEditor = b.a.edit();
          uEditor.putString(b.d("user")+"merchant_home_home_page_cache", b.e(this.e.getValue()));
          g.a(uEditor);
       }
       return;
    }
    public boolean r0(PageComponentResponse p0){
       FeedLivingData$LiveStreamViews liveStreamId1;
       MerchantHomePrefetchUtils$CacheConfig obj = PatchProxy.applyOneRefs(p0, this, d.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = MerchantHomePrefetchUtils.a;
       MerchantHomePrefetchUtils$CacheConfig pageSize = obj.pageSize;
       obj = obj.minFeedSize;
       Prefetch o = Prefetch.x.o;
       MerchantHomeLogBiz merchantCach = MerchantHomeLogBiz.MerchantCache;
       StringBuilder str = "startup response used, getNewLiveStreamInfoMap: ";
       String str1 = (o == null)? "liveStreamInfoMap null": Integer.valueOf(o.size());
       a.s(merchantCach, "HomePageViewModel", str+str1);
       boolean b = false;
       PageComponentResponse data = p0.data;
       if (data != null) {
          PageComponentInfo hierarchy = data.hierarchy;
          if (hierarchy != null) {
             PageComponentHierarchyInfo structure = hierarchy.structure;
             if (structure != null) {
                Iterator iterator = structure.keySet().iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      String str2 = iterator.next();
                      if (str2.contains("list_component")) {
                         List list = p0.data.hierarchy.structure.get(str2);
                         ArrayList uArrayList = new ArrayList();
                         if (o == null || o.isEmpty()) {
                            a.g(e.b, "DynamicFeedCache", "startUp返回res为空");
                            if (!a.b()) {
                               return b;
                            }
                         }
                         Iterator iterator1 = list.iterator();
                         while (true) {
                            if (iterator1.hasNext()) {
                               String str3 = iterator1.next();
                               PageComponentInfo data1 = p0.data.data;
                               if (data1 != null && (data1.get(str3) == null || p0.data.data.get(str3).fields == null)) {
                                  return b;
                               }else {
                                  FeedLivingData uFeedLivingD = a.a.c(p0.data.data.get(str3).fields.data, FeedLivingData.class);
                                  if (!MerchantHomePrefetchUtils.a(uFeedLivingD)) {
                                     uArrayList.add(str3);
                                  }else if(uFeedLivingD != null){
                                     FeedLivingData mLiveStreamV = uFeedLivingD.mLiveStreamView;
                                     if (mLiveStreamV != null) {
                                        FeedLivingData$LiveStreamViews liveStreamId = mLiveStreamV.liveStreamId;
                                        if (liveStreamId != null && !liveStreamId.isEmpty()) {
                                           liveStreamId1 = uFeedLivingD.mLiveStreamView.liveStreamId;
                                        label_00f8 :
                                           if (o != null && o.containsKey(liveStreamId1)) {
                                              uArrayList.add(str3);
                                              continue ;
                                           }else {
                                              continue ;
                                           }
                                        }
                                     }
                                     liveStreamId1 = uFeedLivingD.mWorkId;
                                     goto label_00f8 ;
                                  }else {
                                     continue ;
                                  }
                               }
                            }else if(uArrayList.size() <= obj){
                               return b;
                            }else {
                               list.clear();
                               if (uArrayList.size() <= pageSize) {
                                  list.addAll(uArrayList);
                               }else {
                                  for (; b < pageSize; b = b + 1) {
                                     list.add(uArrayList.get(b));
                                  }
                               }
                               a.g(e.b, "DynamicFeedCache", "清空startUp res");
                               if (o != null) {
                                  o.clear();
                                  break ;
                               }
                               break ;
                            }
                         }
                         return true;
                      }
                   }
                }
             }
          }
       }
       a.g(e.b, "DynamicFeedCache", "从磁盘读取的缓存为空");
       return b;
    }
    public final void s0(){
       if (PatchProxy.applyVoid(null, this, d.class, "21")) {
          return;
       }
       d td = this.d;
       if (td != null) {
          td.dispose();
          this.d = null;
       }
       return;
    }
    public void t0(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       this.o0(c.c().h(this.b).map(new PageRefreshPresenter$a()).subscribe(new b(this), new c(this)));
       return;
    }
    public RecyclerView u0(){
       return this.v;
    }
    public MutableLiveData v0(){
       return this.g;
    }
    public MutableLiveData w0(){
       return this.i;
    }
    public HomePage x0(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.e.getValue();
    }
    public MutableLiveData y0(){
       return this.j;
    }
    public long z0(){
       return this.c;
    }
}
