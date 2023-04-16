package q90.f;
import y80.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import q90.f$a;
import nsd.u;
import androidx.lifecycle.MutableLiveData;
import q90.y;
import lnc.a1;
import java.util.ArrayList;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import y80.d$a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$a;
import t36.f;
import com.kuaishou.gifshow.kuaishan.model.KSLaunchParams;
import java.lang.CharSequence;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import q90.z;
import androidx.lifecycle.ViewModel;
import mrd.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Boolean;
import brd.t;
import q90.f$g;
import erd.g;
import crd.b;
import com.kwai.library.widget.viewpager.tabstrip.a;
import android.content.Context;
import androidx.fragment.app.c;
import h3.a;
import androidx.viewpager.widget.ViewPager;
import java.util.Objects;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSPagerSlidingTabStrip;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip;
import android.widget.HorizontalScrollView;
import java.util.List;
import java.util.Iterator;
import java.util.HashSet;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import t90.j;
import java.lang.Integer;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.library.widget.refresh.KwaiLoadingView;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import java.lang.Iterable;
import q90.q;
import w36.b;
import com.yxcorp.gifshow.model.CDNUrl;
import q90.g;
import android.view.View$OnClickListener;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.library.widget.viewpager.tabstrip.b;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment;
import com.kwai.library.widget.viewpager.tabstrip.PagerSlidingTabStrip$d;
import q90.k;
import androidx.viewpager.widget.ViewPager$i;
import java.util.Collection;
import w46.b;
import kotlin.Pair;
import q90.h;
import java.lang.Runnable;
import q90.l;
import com.yxcorp.gifshow.kuaishan.model.KSTemplateDetailInfo;
import q90.f$b;
import q90.f$c;
import io.reactivex.g;
import q90.f$d;
import q90.f$e;
import erd.a;
import com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment;
import y80.b;
import t45.d;
import brd.z;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$n;
import cjd.a;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$o;
import erd.o;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$p;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$q;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$r;
import crd.a;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import q90.f$h;
import ekd.k1;
import android.view.View;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView;
import com.kwai.library.widget.emptyview.KwaiEmptyStateView$a;
import q90.f$f;
import kotlin.collections.CollectionsKt__CollectionsKt;
import t90.k;
import trd.u;
import java.util.HashMap;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import nsd.s0;
import e17.i;

public class f extends PresenterV2 implements d	// class@002990
{
    public final MutableLiveData A;
    public b B;
    public boolean C;
    public final y D;
    public final int E;
    public final int F;
    public a G;
    public z H;
    public final List I;
    public KSPagerSlidingTabStrip p;
    public ViewPager q;
    public KwaiLoadingView r;
    public KwaiEmptyStateView s;
    public a t;
    public BaseFragment u;
    public KSLaunchParams v;
    public MutableLiveData w;
    public String x;
    public View y;
    public List z;
    public static final f$a J;

    static {
       f.J = new f$a(null);
    }
    public void f(){
       super();
       this.A = new MutableLiveData();
       this.D = new y();
       this.E = a1.e(3.00f);
       this.F = - a1.e(2.00f);
       this.I = new ArrayList();
    }
    public static final String P8(f p0){
       p0 = p0.x;
       if (p0 == null) {
          a.S("mSelectedGroupId");
       }
       return p0;
    }
    public void A6(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "45")) {
          return;
       }
       a.p(p0, "requestGroupId");
       d$a.a(this, p0);
       return;
    }
    public void E8(){
       f tv1;
       String groupId;
       f tu;
       f uof = f.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uof, "15")) {
          return;
       }
       KSDataManager$a q = KSDataManager.q;
       q.a().d(this);
       f tv = this.v;
       String str = "mKSLaunchParam";
       if (tv == null) {
          a.S(str);
       }
       if (!TextUtils.isEmpty(tv.getGroupId())) {
          tv1 = this.v;
          if (tv1 == null) {
             a.S(str);
          }
          groupId = tv1.getGroupId();
          a.o(groupId, "mKSLaunchParam.groupId");
       }else {
          groupId = q.a().m;
          if (groupId == null) {
             groupId = "";
          }
       }
       this.x = groupId;
       tv1 = this.u;
       String str1 = "mFragment";
       if (tv1 == null) {
          a.S(str1);
       }
       z oz = ViewModelProviders.of(tv1).get(z.class);
       this.H = oz;
       if (oz != null) {
          a uoa = oz.t0();
          if (uoa != null) {
             tu = this.u;
             if (tu == null) {
                a.S(str1);
             }
             uoa.onNext(Boolean.valueOf(tu.K0()));
          }
       }
       tv1 = this.u;
       if (tv1 == null) {
          a.S(str1);
       }
       tv1.n1().subscribe(new f$g(this));
       Context context = this.getContext();
       f tu1 = this.u;
       if (tu1 == null) {
          a.S(str1);
       }
       this.t = new a(context, tu1.g0().getChildFragmentManager());
       if (!PatchProxy.applyVoid(objArray, this, uof, "30")) {
          uof = this.q;
          String str2 = "mTabViewPager";
          if (uof == null) {
             a.S(str2);
          }
          tv1 = this.t;
          if (tv1 == null) {
             a.S("mFragmentAdapter");
          }
          uof.setAdapter(tv1);
          uof = this.p;
          if (uof == null) {
             a.S("mPagerTabStrip");
          }
          tu = this.y;
          if (tu == null) {
             a.S("mRootView");
          }
          tu1 = this.u;
          if (tu1 == null) {
             a.S(str1);
          }
          Objects.requireNonNull(uof);
          if (!PatchProxy.applyVoidTwoRefs(tu, tu1, uof, KSPagerSlidingTabStrip.class, "1")) {
             a.p(tu, "parentView");
             a.p(tu1, "attachedLogPage");
             uof.x1 = tu;
             uof.y1 = tu1;
          }
          uof = this.p;
          if (uof == null) {
             a.S("mPagerTabStrip");
          }
          tv = this.q;
          if (tv == null) {
             a.S(str2);
          }
          uof.setViewPager(tv);
          uof = this.p;
          if (uof == null) {
             a.S("mPagerTabStrip");
          }
          uof.setVisibility(0);
       }
       this.V8();
       return;
    }
    public void H0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "43")) {
          return;
       }
       a.p(p0, "templateList");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "6")) {
          a.p(p0, "templateList");
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "16")) {
          return;
       }
       f tp = this.p;
       if (tp == null) {
          a.S("mPagerTabStrip");
       }
       Objects.requireNonNull(tp);
       if (!PatchProxy.applyVoid(null, tp, KSPagerSlidingTabStrip.class, "3")) {
          Iterator iterator = tp.w1.iterator();
          while (iterator.hasNext()) {
             KSFeedGroupInfo kSFeedGroupI = iterator.next();
             KSPagerSlidingTabStrip y1 = tp.y1;
             KSFeedGroupInfo mId = kSFeedGroupI.mId;
             KSFeedGroupInfo mGroupName = kSFeedGroupI.mGroupName;
             kSFeedGroupI = kSFeedGroupI.mIndex;
             if (PatchProxy.isSupport(j.class) && (PatchProxy.applyVoidFourRefs(y1, mId, mGroupName, Integer.valueOf(kSFeedGroupI), null, j.class, "29") || y1 == null)) {
                continue ;
             }
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "SHOW_KUAISHAN_TEMPLATE_TAB";
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
             moreInfoPack.id = mId;
             moreInfoPack.name = mGroupName;
             moreInfoPack.index = String.valueOf(kSFeedGroupI);
             uContentPack.moreInfoPackage = moreInfoPack;
             u1.D0("2014539", y1, 5, uElementPack, uContentPack, null);
          }
       }
       KSDataManager.q.a().c(this);
       tp = this.B;
       if (tp != null && !tp.isDisposed()) {
          tp.dispose();
       }
       this.x = "";
       this.B = null;
       tp = this.A;
       f tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       tp.removeObservers(tu);
       this.A.setValue(null);
       return;
    }
    public void N3(String p0,List p1,boolean p2,boolean p3,boolean p4){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{p0,p1,Boolean.valueOf(p2),Boolean.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uof, "41")) {
             return;
          }
       }
       a.p(p0, "groupId");
       a.p(p1, "templateList");
       d$a.b(this, p0, p1, p2, p3, p4);
       return;
    }
    public void P6(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "42")) {
          return;
       }
       a.p(p0, "templateList");
       if (!PatchProxy.applyVoidTwoRefs(this, p0, null, d$a.class, "4")) {
          a.p(p0, "templateList");
       }
       return;
    }
    public void Q2(List p0){
       f uof1;
       String str2;
       String str5;
       KSFeedGroupInfo mId;
       Object[] objArray3;
       Iterator iterator;
       Pair pair;
       List list = this;
       f obj = p0;
       f uof = f.class;
       if (PatchProxy.applyVoidOneRefs(obj, list, uof, "17")) {
          return;
       }
       a.p(obj, "groupList");
       Object[] objArray = new Object[0];
       String str = "KSFeedGroupPagerPresenter";
       e.D().w(str, "onGroupListFetched groupList: "+obj, objArray);
       list.z = obj;
       f r = list.r;
       if (r == null) {
          a.S("mLoadingView");
       }
       int i = 8;
       r.setVisibility(i);
       r = list.s;
       if (r == null) {
          a.S("mEmptyView");
       }
       r.setVisibility(i);
       String str1 = "mSelectedGroupId";
       if (!PatchProxy.applyVoidOneRefs(obj, list, uof, "31")) {
          r = list.t;
          if (r == null) {
             a.S("mFragmentAdapter");
          }
          ArrayList uArrayList = PatchProxy.applyOneRefs(obj, list, uof, "36");
          if (uArrayList != PatchProxyResult.class) {
          }else {
             uArrayList = new ArrayList();
             Iterator iterator1 = p0.iterator();
             int i3 = 0;
             while (iterator1.hasNext()) {
                KSFeedGroupInfo kSFeedGroupI = iterator1.next();
                kSFeedGroupI.mIndex = i3;
                KSFeedGroupInfo mId1 = kSFeedGroupI.mId;
                a.o(mId1, "tabInfo.mId");
                q oq = new q(mId1, kSFeedGroupI.mGroupName);
                oq.t = list.H;
                KSFeedGroupInfo mId2 = kSFeedGroupI.mId;
                a.o(mId2, "tabInfo.mId");
                str2 = str;
                Iterator iterator2 = iterator1;
                uof1 = uof;
                b uob = new b(mId2, kSFeedGroupI.mIconUrls, kSFeedGroupI.mGifIconUrls, kSFeedGroupI.mGifMaxShowCount, kSFeedGroupI.mGifShowStartTime, kSFeedGroupI.mGifShowEndTime);
                oq.r = mId1;
                oq.i(new g(list, kSFeedGroupI, i3));
                Bundle uBundle = new Bundle();
                uof = list.v;
                if (uof == null) {
                   a.S("mKSLaunchParam");
                }
                KSLaunchParams kSLaunchPara = uof.copy();
                if (kSLaunchPara != null) {
                   kSLaunchPara.setGroupId(kSFeedGroupI.mId);
                }
                if (kSLaunchPara != null) {
                   kSLaunchPara.setGroupName(kSFeedGroupI.mGroupName);
                }
                SerializableHook.putSerializable(uBundle, "intent_ks_launch_param", kSLaunchPara);
                uArrayList.add(new b(oq, KSFeedListFragment.class, uBundle));
                i3 = i3 + 1;
                str = str2;
                iterator1 = iterator2;
                uof = uof1;
                KSFeedGroupInfo kSFeedGroupI1 = null;
             }
          }
          uof1 = uof;
          str2 = str;
          r.D(uArrayList);
          obj = list.p;
          String str3 = "mPagerTabStrip";
          if (obj == null) {
             a.S(str3);
          }
          List list1 = p0;
          obj.setTabInfoList(list1);
          obj = list.q;
          String str4 = "mTabViewPager";
          if (obj == null) {
             a.S(str4);
          }
          obj.addOnPageChangeListener(new k(list, list1));
          obj = list.p;
          if (obj == null) {
             a.S(str3);
          }
          obj.q();
          obj = list.x;
          if (obj == null) {
             a.S(str1);
          }
          if (!list.R8(obj)) {
             obj = list.q;
             if (obj == null) {
                a.S(str4);
             }
             a adapter = obj.getAdapter();
             Objects.requireNonNull(adapter, "null cannot be cast to non-null type com.kwai.library.widget.viewpager.tabstrip.FragmentAdapter");
             Fragment uFragment = adapter.t();
             if (uFragment instanceof KSFeedListFragment) {
                Object[] objArray1 = new Object[0];
                str5 = str2;
                e.D().w(str5, "Default page impressed", objArray1);
                list.a9(uFragment);
             label_0172 :
                Object[] objArray2 = null;
                if (!PatchProxy.applyVoid(objArray2, list, uof1, "34")) {
                   f z = list.z;
                   objArray = (z == null || z.isEmpty())? 1: null;
                   if (objArray) {
                      objArray = new Object[0];
                      e.D().t(str5, "navigateToSecondTabIfNeed\(\) group list is null, no need navigate", objArray);
                   }else {
                      z = list.x;
                      if (z == null) {
                         a.S(str1);
                      }
                      if (!TextUtils.isEmpty(z)) {
                         objArray3 = new Object[0];
                         e.D().w(str5, "navigateToSecondTabIfNeed\(\) has mSelectedGroupId, no need navigate", objArray3);
                      }else {
                         int i1 = 0;
                         f z1 = list.z;
                         a.m(z1);
                         if (z1.size() == 1) {
                            objArray3 = new Object[i1];
                            e.D().w(str5, "navigateToSecondTabIfNeed\(\) only one group", objArray3);
                         }else {
                            z = list.z;
                            if (z != null) {
                               iterator = z.iterator();
                               while (true) {
                                  if (iterator.hasNext()) {
                                     objArray1 = iterator.next();
                                     if (!a.g(objArray1.mId, "1")) {
                                        continue ;
                                     }
                                  }else {
                                     objArray1 = objArray2;
                                  }
                               }
                            }else {
                               objArray1 = objArray2;
                            }
                            if (objArray1 != null) {
                               z = list.z;
                               if (z != null) {
                                  iterator = z.iterator();
                                  int i2 = 0;
                                  while (true) {
                                     if (iterator.hasNext()) {
                                        e obj1 = iterator.next();
                                        if (a.g(obj1.mId, "10")) {
                                           pair = new Pair(Integer.valueOf(i2), obj1);
                                        label_0229 :
                                           if (pair != null) {
                                              Integer first = pair.getFirst();
                                              if (first != null) {
                                                 i2 = first.intValue();
                                              label_0239 :
                                                 obj1 = e.D();
                                                 StringBuilder str6 = "navigateToSecondTabIfNeed\(\) find reco_tab pos=";
                                                 if (pair != null) {
                                                    objArray2 = pair.getFirst();
                                                 }
                                                 Object[] objArray4 = new Object[0];
                                                 obj1.w(str5, str6+objArray2, objArray4);
                                                 obj = list.q;
                                                 if (obj == null) {
                                                    a.S(str4);
                                                 }
                                                 obj.setCurrentItem(i2, 0);
                                                 obj = list.p;
                                                 if (obj == null) {
                                                    a.S(str3);
                                                 }
                                                 obj.post(new h(list, i2));
                                              }
                                           }
                                           i2 = 1;
                                           goto label_0239 ;
                                        }else {
                                           i2 = i2 + 1;
                                        }
                                     }
                                  }
                               }
                               pair = objArray2;
                               goto label_0229 ;
                            }
                         }
                      }
                   }
                }
                obj = list.p;
                if (obj == null) {
                   a.S(str3);
                }
                obj.post(new l(list, list1));
                obj = list.x;
                if (obj == null) {
                   a.S(str1);
                }
                if (TextUtils.isEmpty(obj) && (p0.isEmpty() ^ 1)) {
                   mId = list1.get(0).mId;
                   a.o(mId, "tabInfoList[0].mId");
                   list.x = mId;
                   KSDataManager kSDataManage = KSDataManager.q.a();
                   uof = list.x;
                   if (uof == null) {
                      a.S(str1);
                   }
                   kSDataManage.F0(uof);
                }
             }
          }
          str5 = str2;
          goto label_0172 ;
       }
    label_02b8 :
       if (list.A.getValue() != null) {
          obj = list.A;
          r = list.x;
          if (r == null) {
             a.S(str1);
          }
          obj.setValue(new Pair(r, Boolean.TRUE));
       }
       obj = list.w;
       if (obj == null) {
          a.S("mHasGroupFeed");
       }
       obj.setValue(Boolean.TRUE);
       return;
    }
    public void R(KSTemplateDetailInfo p0,int p1){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, f.class, "21")) {
          return;
       }
       a.p(p0, "selectedTemplate");
       f tv = this.v;
       if (tv == null) {
          a.S("mKSLaunchParam");
       }
       if (tv.getDisallowTemplateLocating()) {
          return;
       }else {
          this.b9();
          KSFeedListFragment kSFeedListFr = this.W8();
          if (kSFeedListFr != null) {
             kSFeedListFr.Jh();
          }
          kSFeedListFr = this.W8();
          if (kSFeedListFr != null) {
             kSFeedListFr.Ih();
          }
          return;
       }
    }
    public void R3(String p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uof, "46")) {
          return;
       }
       a.p(p0, "requestGroupId");
       d$a.c(this, p0, p1);
       return;
    }
    public final boolean R8(String p0){
       f tq1;
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.z;
       if (obj == null) {
          return false;
       }
       a.m(obj);
       Iterator iterator = obj.iterator();
       int i = 0;
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (TextUtils.equals(iterator.next().mId, p0)) {
             f tq = this.q;
             if (tq == null) {
                a.S("mTabViewPager");
             }
             if (i != tq.getCurrentItem()) {
                Object[] objArray = new Object[false];
                e.D().w("KSFeedGroupPagerPresenter", "autoNavigateToTab: to index "+i, objArray);
                tq1 = this.q;
                if (tq1 == null) {
                   a.S("mTabViewPager");
                }
                tq1.setCurrentItem(i, false);
                tq1 = this.p;
                if (tq1 == null) {
                   a.S("mPagerTabStrip");
                   break ;
                }
                break ;
             }
          }
          i = i + 1;
       }
       tq1.post(new f$b(this, i));
       return true;
    }
    public final t S8(KSFeedListFragment p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = t.create(new f$c(this, p0)).doOnSubscribe(new f$d(this)).doFinally(new f$e(this));
       a.o(ot, "Observable.create { emit¡­shDisposable = null\n    }");
       return ot;
    }
    public final void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "29")) {
          return;
       }
       f tu = this.u;
       if (tu == null) {
          a.S("mFragment");
       }
       int i = 0;
       if (tu instanceof KSFeedGroupPagerFragment) {
          tu = this.r;
          if (tu == null) {
             a.S("mLoadingView");
          }
          tu.setVisibility(i);
       }
       tu = this.s;
       if (tu == null) {
          a.S("mEmptyView");
       }
       tu.setVisibility(8);
       KSDataManager kSDataManage = KSDataManager.q.a();
       Objects.requireNonNull(kSDataManage);
       if (!PatchProxy.applyVoid(objArray, kSDataManage, KSDataManager.class, "7")) {
          String str = "Fetch Groups";
          if (kSDataManage.i.contains(str)) {
             objArray = new Object[i];
             e.D().w("KSDataManager", "Request is in process", objArray);
          }else {
             Object[] objArray1 = new Object[i];
             e.D().w("KSDataManager", "fetchGroups", objArray1);
             kSDataManage.i.add(str);
             kSDataManage.g.c(kSDataManage.k.e().observeOn(d.c).doOnNext(a.a(new KSDataManager$n(kSDataManage))).onErrorReturn(new KSDataManager$o(kSDataManage)).observeOn(d.a).doFinally(new KSDataManager$p(kSDataManage, str)).subscribe(new KSDataManager$q(kSDataManage), new KSDataManager$r(kSDataManage)));
          }
       }
       return;
    }
    public final KSFeedListFragment W8(){
       f tt;
       Fragment uFragment;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       f obj = PatchProxy.apply(null, this, uof, "27");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mFragmentAdapter");
       }
       if (obj.t() instanceof KSFeedListFragment) {
          tt = this.t;
          if (tt == null) {
             a.S("mFragmentAdapter");
          }
          uFragment = tt.t();
          Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment");
          return uFragment;
       }else {
          obj = this.t;
          if (obj == null) {
             a.S("mFragmentAdapter");
          }
          if (obj.t() instanceof KSFeedGroupPagerFragment) {
             obj = this.t;
             if (obj == null) {
                a.S("mFragmentAdapter");
             }
             Fragment uFragment1 = obj.t();
             Objects.requireNonNull(uFragment1, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedGroupPagerFragment");
             Object obj1 = PatchProxy.apply(null, uFragment1, KSFeedGroupPagerFragment.class, "19");
             if (obj1 != patchProxyRe) {
             }else {
                KSFeedGroupPagerFragment n = uFragment1.n;
                if (n == null) {
                   a.S("mKSFeedGroupPagerPresenter");
                }
                Objects.requireNonNull(n);
                Object obj2 = PatchProxy.apply(null, n, uof, "26");
                if (obj2 != patchProxyRe) {
                   obj1 = obj2;
                }else {
                   tt = n.t;
                   if (tt == null) {
                      a.S("mFragmentAdapter");
                   }
                   obj1 = tt;
                }
             }
             uFragment = obj1.t();
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment");
             return uFragment;
          }else {
             return null;
          }
       }
    }
    public final BaseFragment X8(){
       f obj = PatchProxy.apply(null, this, f.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.u;
       if (obj == null) {
          a.S("mFragment");
       }
       return obj;
    }
    public final a Y8(){
       f obj = PatchProxy.apply(null, this, f.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.t;
       if (obj == null) {
          a.S("mFragmentAdapter");
       }
       return obj;
    }
    public void Z0(KSTemplateDetailInfo p0,boolean p1){
       List items;
       Object obj;
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "38")) {
          return;
       }
       a.p(p0, "templateInfo");
       uof = this.t;
       String str = "mFragmentAdapter";
       if (uof == null) {
          a.S(str);
       }
       int i = 0;
       if (!uof.j()) {
          Object[] objArray = new Object[i];
          e.D().t("KSFeedGroupPagerPresenter", "onTemplateCollectionAdded\(\) no tabs wrong case", objArray);
          return;
       }else {
          uof = this.t;
          if (uof == null) {
             a.S(str);
          }
          if (uof.a(i) == null) {
             return;
          }else {
             uof = this.t;
             if (uof == null) {
                a.S(str);
             }
             Fragment uFragment = uof.a(i);
             Objects.requireNonNull(uFragment, "null cannot be cast to non-null type com.kuaishou.gifshow.kuaishan.ui.feed.KSFeedListFragment");
             i oi = uFragment.q();
             a.o(oi, "feedListFragment.pageList");
             if (p1) {
                items = oi.getItems();
                items.add(i, p0);
                oi.l0(items);
             }else {
                items = oi.getItems();
                a.o(items, "pageList.items");
                Iterator iterator = items.iterator();
                while (true) {
                   if (iterator.hasNext()) {
                      obj = iterator.next();
                      if (!a.g(obj.mTemplateId, p0.mTemplateId)) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   oi.remove(obj);
                   break ;
                }
             }
             return;
          }
       }
    }
    public final KSPagerSlidingTabStrip Z8(){
       f obj = PatchProxy.apply(null, this, f.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj == null) {
          a.S("mPagerTabStrip");
       }
       return obj;
    }
    public void a3(String p0,List p1,boolean p2,boolean p3){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Boolean.valueOf(p3), this, f.class, "19")) {
          return;
       }
       a.p(p0, "groupId");
       a.p(p1, "templateList");
       Object[] objArray = new Object[0];
       e.D().w("KSFeedGroupPagerPresenter", "onGroupTemplateListFetched: groupId="+p0+" isFirstPage="+p2+" isLastPage="+p3+" templateList size="+p1.size(), objArray);
       Pair value = this.A.getValue();
       if (value != null && TextUtils.equals(value.getFirst(), p0)) {
          this.A.setValue(new Pair(p0, Boolean.FALSE));
       }
       return;
    }
    public final void a9(KSFeedListFragment p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "32")) {
          return;
       }
       p0.Jh();
       p0.J = true;
       k1.r(new f$h(p0), 1);
       return;
    }
    public final boolean b9(){
       KSDataManager$a obj = PatchProxy.apply(null, this, f.class, "28");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = KSDataManager.q;
       if (obj.a().p() != null) {
          f tx = this.x;
          if (tx == null) {
             a.S("mSelectedGroupId");
          }
          if (!TextUtils.equals(tx, obj.a().p()) && (a.g("2", obj.a().p()) ^ 0x01)) {
             String str = obj.a().p();
             a.m(str);
             this.x = str;
             if (str == null) {
                a.S("mSelectedGroupId");
             }
             return this.R8(str);
          }
       }
    label_0060 :
       return false;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "14")) {
          return;
       }
       a.p(p0, "rootView");
       this.y = p0;
       View view = p0.findViewById(R.id.tabs);
       a.o(view, "rootView.findViewById\(R.id.tabs\)");
       this.p = view;
       view = p0.findViewById(R.id.view_pager);
       a.o(view, "rootView.findViewById\(R.id.view_pager\)");
       this.q = view;
       view = p0.findViewById(R.id.ks_feed_pager_fragment_loading);
       a.o(view, "rootView.findViewById\(R.¡­d_pager_fragment_loading\)");
       this.r = view;
       p0 = p0.findViewById(R.id.ks_feed_pager_error_tip);
       a.o(p0, "rootView.findViewById\(R.¡­.ks_feed_pager_error_tip\)");
       this.s = p0;
       String str = "mEmptyView";
       if (p0 == null) {
          a.S(str);
       }
       p0.q(3);
       f tp = this.p;
       if (tp == null) {
          a.S("mPagerTabStrip");
       }
       tp.setScrollSelectedTabToCenter(true);
       KwaiEmptyStateView$a uoa = KwaiEmptyStateView.e();
       uoa.p(new f$f(this));
       f ts = this.s;
       if (ts == null) {
          a.S(str);
       }
       uoa.a(ts);
       tp = this.D;
       FrameLayout[] uFrameLayout = new FrameLayout[2];
       int i = 0;
       f ts1 = this.s;
       if (ts1 == null) {
          a.S(str);
       }
       uFrameLayout[i] = ts1;
       f tr = this.r;
       if (tr == null) {
          a.S("mLoadingView");
       }
       uFrameLayout[1] = tr;
       tp.a(CollectionsKt__CollectionsKt.L(uFrameLayout));
       return;
    }
    public void f4(List p0){
       k a;
       Object[] objArray;
       List list;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "39")) {
          return;
       }
       String str = "templateInfoList";
       a.p(p0, str);
       a = k.a;
       f tI = this.I;
       int i = 10;
       ArrayList uArrayList = new ArrayList(u.Y(p0, i));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().mTemplateId);
       }
       a.b(tI, uArrayList);
       int i1 = 0;
       this.I.addAll(i1, p0);
       a = k.a;
       KSDataManager kSDataManage = KSDataManager.q.a();
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidTwoRefs(p0, kSDataManage, a, k.class, "3")) {
          a.p(p0, str);
          a.p(kSDataManage, "dataManager");
          String str1 = "KSPreviewFragmentVertical";
          if (!kSDataManage.i0()) {
             objArray = new Object[i1];
             e.D().w(str1, "insertLocalDataIntoGroupCache\(\) no group cache", objArray);
          }else {
             HashMap hashMap = kSDataManage.z0();
             String str2 = "999";
             if (!hashMap.containsKey(str2)) {
                objArray = new Object[i1];
                e.D().w(str1, "insertLocalDataIntoGroupCache\(\) no recent group cache", objArray);
             }else {
                Object[] objArray1 = new Object[i1];
                e.D().w("KSRecentUtil", "insertLocalDataIntoGroupCache, list: "+p0, objArray1);
                KSDataManager$d uod = hashMap.get(str2);
                uArrayList = new ArrayList();
                Iterator iterator1 = p0.iterator();
                while (iterator1.hasNext()) {
                   KSFeedTemplateDetailInfo kSFeedTempla = iterator1.next().toKSFeedTemplateDetailInfo();
                   a.o(kSFeedTempla, "info.toKSFeedTemplateDetailInfo\(\)");
                   uArrayList.add(kSFeedTempla);
                }
                ArrayList uArrayList1 = new ArrayList(u.Y(uArrayList, i));
                Iterator iterator2 = uArrayList.iterator();
                while (iterator2.hasNext()) {
                   uArrayList1.add(iterator2.next().mId);
                }
                list = null;
                List list1 = (uod != null)? uod.h(): list;
                if (s0.F(list1)) {
                   list = list1;
                }
                a.a(list, uArrayList1);
                if (uod != null && !PatchProxy.applyVoidOneRefs(uArrayList, uod, KSDataManager$d.class, "7")) {
                   a.p(uArrayList, "templates");
                   if (uArrayList.isEmpty()) {
                      Object[] objArray2 = new Object[i1];
                      e.D().w("KSDataManager", "addAllAtBeginning: no data addAllAtBeginning, group="+uod.b, objArray2);
                   }else {
                      Object[] objArray3 = new Object[i1];
                      e.D().w("KSDataManager", "addAllAtBeginning, size="+uArrayList.size()+", group="+uod.b, objArray3);
                      uod.a.addAll(i1, uArrayList);
                   }
                }
             }
          }
       }
       return;
    }
    public void g4(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "18")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       e.D().w("KSFeedGroupPagerPresenter", "onGroupListRequestError", objArray1);
       f tr = this.r;
       if (tr == null) {
          a.S("mLoadingView");
       }
       tr.setVisibility(8);
       tr = this.s;
       if (tr == null) {
          a.S("mEmptyView");
       }
       tr.setVisibility(i);
       if (this.A.getValue() != null) {
          this.A.setValue(new Pair(objArray, Boolean.FALSE));
       }
       i.a(R.style.arg_RES_7f110668, 0x7f1038e5);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.u = obj;
       obj = this.r8("KUAISHAN_LAUNCH_PARAM");
       a.o(obj, "inject\(AccessIds.KUAISHAN_LAUNCH_PARAM\)");
       this.v = obj;
       obj = this.r8("HAS_GROUP_FEED");
       a.o(obj, "inject\(AccessIds.HAS_GROUP_FEED\)");
       this.w = obj;
       return;
    }
    public void w4(String p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "20")) {
          return;
       }
       a.p(p0, "groupId");
       Object[] objArray = new Object[0];
       e.D().w("KSFeedGroupPagerPresenter", "onGroupTemplateListRequestError groupId: "+p0+", isFirstPage: "+p1, objArray);
       Pair value = this.A.getValue();
       if (value != null && TextUtils.equals(value.getFirst(), p0)) {
          this.A.setValue(new Pair(p0, Boolean.FALSE));
       }
       return;
    }
    public void x3(){
       PatchProxy.applyVoid(null, this, f.class, "44");
    }
}
