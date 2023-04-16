package com.yxcorp.plugin.search.utils.PlayRecommendController;
import nfd.t0;
import x6d.a;
import java.lang.String;
import android.content.SharedPreferences;
import com.yxcorp.plugin.search.result.fragment.SearchResultFragment;
import java.lang.Object;
import com.yxcorp.plugin.search.utils.PlayRecommendController$a;
import java.util.HashMap;
import java.util.HashSet;
import com.yxcorp.plugin.search.utils.PlayRecommendController$1;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.plugin.search.entity.SearchItem;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import eed.b;
import com.yxcorp.plugin.search.response.RecoAfterPlayResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.ExtInfo;
import com.yxcorp.plugin.search.entity.template.aggregate.FollowGuideInfo;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import q7d.d0;
import java.lang.Integer;
import java.lang.Runnable;
import ekd.k1;
import kotlin.jvm.internal.a;
import nfd.y0;
import com.kwai.framework.abtest.f;
import qvb.i;
import com.yxcorp.plugin.search.response.SearchResultResponse;
import com.yxcorp.plugin.search.response.SearchResultExtParams;
import java.lang.Math;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import android.view.View;
import nfd.o3;
import java.lang.System;

public class PlayRecommendController	// class@000782
{
    public long a;
    public int b;
    public int c;
    public SearchResultFragment d;
    public SearchItem e;
    public SearchItem f;
    public SearchItem g;
    public SearchItem h;
    public int i;
    public final PlayRecommendController$a j;
    public final Map k;
    public final Map l;
    public final Map m;
    public RecoAfterPlayResponse n;
    public final Set o;
    public boolean p;
    public Map q;
    public final DefaultLifecycleObserver r;
    public static final int s;
    public static final int t;
    public static final long u;
    public static int v;
    public static int w;
    public static int x;

    static {
       PlayRecommendController.s = t0.o0 * 2;
       PlayRecommendController.t = t0.p0 * 2;
       PlayRecommendController.u = a.a.getLong("RecoAfterPlayTriggerTime", 5000);
       PlayRecommendController.v = 5;
       PlayRecommendController.w = 5;
       PlayRecommendController.x = 3;
    }
    public void PlayRecommendController(SearchResultFragment p0){
       super();
       this.j = new PlayRecommendController$a(this);
       this.k = new HashMap();
       this.l = new HashMap();
       this.m = new HashMap();
       this.o = new HashSet();
       this.p = true;
       this.q = new HashMap();
       PlayRecommendController$1 u1 = new PlayRecommendController$1(this);
       this.r = u1;
       this.d = p0;
       p0.getLifecycle().addObserver(u1);
    }
    public void a(SearchItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayRecommendController.class, "11")) {
          return;
       }
       b uob = this.m.get(p0);
       if (uob == null) {
          return;
       }
       if (this.d.isResumed()) {
          uob.u7();
       }else {
          this.e = p0;
       }
       return;
    }
    public SearchItem b(){
       return this.h;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PlayRecommendController.class, "4")) {
          return;
       }
       PlayRecommendController tg = this.g;
       if (tg == null) {
          return;
       }
       this.d(tg);
       this.g = null;
       return;
    }
    public final void d(SearchItem p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PlayRecommendController.class, "5")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       b uob = this.m.get(p0);
       if (uob != null) {
          uob.T2(null, true);
       }
       return;
    }
    public void e(SearchItem p0){
       this.h = p0;
    }
    public void f(SearchItem p0,RecoAfterPlayResponse p1){
       this.e = p0;
       this.n = p1;
    }
    public boolean g(SearchItem p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PlayRecommendController.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (p0 != null) {
          SearchItem mExtInfo = p0.mExtInfo;
          if (mExtInfo != null) {
             ExtInfo mFollowGuide = mExtInfo.mFollowGuideInfo;
             if (mFollowGuide != null && (mFollowGuide.mRecoReason != null && mFollowGuide.mButtonInfo != null)) {
                int i = p0.mPhoto.getUser().isFollowingOrFollowRequesting() ^ 1;
                int i1 = (this.o.isEmpty() || !this.o.contains(p0.mPhoto.getUserId()))? 1: 0;
                int i2 = (this.c < 3)? 1: 0;
                if (i && (i1 && i2)) {
                   b = true;
                }
             }
          }
       }
    label_005b :
       return b;
    }
    public void h(RecyclerFragment p0,SearchItem p1,boolean p2,int p3){
       boolean b1;
       boolean b2;
       RecoAfterPlayResponse obj2;
       d0 uod0 = d0.class;
       if (PatchProxy.isSupport(PlayRecommendController.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), Integer.valueOf(p3), this, PlayRecommendController.class, "14")) {
          return;
       }
       if (p1 != null) {
          PlayRecommendController tf = this.f;
          if (p1 != tf && (p2 || (this.e != p1 && p1 == this.h))) {
             this.d(tf);
             this.f(null, null);
             k1.m(this.j);
             SearchItem obj = PatchProxy.applyOneRefs(p1, null, uod0, "11");
             boolean b = false;
             if (obj != PatchProxyResult.class) {
                b1 = obj.booleanValue();
             }else {
                a.p(p1, "$this$isVideoCard");
                obj = p1.mPhoto;
                b1 = (obj != null)? obj.isVideoType(): false;
             }
             if (b1) {
                i obj1 = PatchProxy.applyOneRefs(p1, null, uod0, "6");
                if (obj1 != PatchProxyResult.class) {
                   b2 = obj1.booleanValue();
                }else {
                   a.p(p1, "$this$isAd");
                   SearchItem mPhoto = p1.mPhoto;
                   b2 = (mPhoto != null)? mPhoto.isAd(): false;
                }
                if (!b2) {
                   obj1 = PatchProxy.applyOneRefs(p1, this, PlayRecommendController.class, "8");
                   if (obj1 != PatchProxyResult.class) {
                      b2 = obj1.booleanValue();
                   }else {
                      obj2 = this.k.get(p1);
                      b2 = (obj2 != null && !obj2.isValid())? true: false;
                   }
                   if (!b2) {
                      obj1 = PatchProxy.apply(null, this, PlayRecommendController.class, "26");
                      if (obj1 != PatchProxyResult.class) {
                         b2 = obj1.booleanValue();
                      }else {
                         obj2 = PatchProxy.apply(null, null, y0.class, "10");
                         b2 = (obj2 != PatchProxyResult.class)? obj2.booleanValue(): f.a("enableSearchAfterPlayNewDoubleColumnv4");
                      }
                      if (b2) {
                         obj1 = PatchProxy.applyOneRefs(p1, this, PlayRecommendController.class, "27");
                         if (obj1 != PatchProxyResult.class) {
                            b2 = obj1.booleanValue();
                         }else if(this.k.size() >= a.e() && !this.k.containsKey(p1)){
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                         if (!b2) {
                            obj1 = PatchProxy.applyOneRefs(p1, this, PlayRecommendController.class, "28");
                            if (obj1 != PatchProxyResult.class) {
                               b2 = obj1.booleanValue();
                            }else {
                               obj1 = this.d.q();
                               SearchResultResponse searchResult = obj1.L0();
                               if (searchResult != null) {
                                  SearchResultExtParams mRsRecoAfter = searchResult.getExtParams().mRsRecoAfterPlayInterval;
                                  int i = obj1.A(p1);
                                  int i1 = Math.max(b, (i - mRsRecoAfter));
                                  int i2 = Math.min((obj1.getCount() - 1), (i + mRsRecoAfter));
                                  while (true) {
                                     if (i1 <= i2) {
                                        if (obj1.getItem(i1).mItemType == SearchItem$SearchItemType.RELATION_SEARCH) {
                                           b2 = true;
                                           break ;
                                        }else {
                                           i1++;
                                        }
                                     }
                                  }
                               }
                               b2 = false;
                            }
                            if (!b2) {
                               if (PatchProxy.isSupport(PlayRecommendController.class)) {
                                  obj1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p3), this, PlayRecommendController.class, "29");
                                  if (obj1 != PatchProxyResult.class) {
                                     b = obj1.booleanValue();
                                  }else {
                                  label_015d :
                                     View view = o3.S(p3, p0);
                                     if (view == null || (view.getMeasuredHeight() >= PlayRecommendController.t && view.findViewById(0x7f0a30da) == null)) {
                                        b = true;
                                     }
                                  }
                               }else {
                                  goto label_015d ;
                               }
                               if (b) {
                                  if (!PatchProxy.applyVoid(null, this, PlayRecommendController.class, "16")) {
                                     this.a = System.currentTimeMillis();
                                  }
                                  PlayRecommendController tj = this.j;
                                  tj.b = p1;
                                  if (p2) {
                                     k1.r(tj, PlayRecommendController.u);
                                  }else {
                                     k1.o(tj);
                                  }
                               }
                            }
                         }
                      }
                   }
                }
             }
          }
       }
    label_0197 :
       return;
    }
}
