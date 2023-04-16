package com.yxcorp.gifshow.follow.stagger.header.c;
import androidx.lifecycle.Observer;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$o;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import zha.a;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;
import com.kuaishou.android.model.feed.PhotoType;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiBarMeta;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiTipModel;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.follow.common.model.FollowingUserBannerFeed$UserBannerInfo;
import com.kwai.feature.api.social.followStagger.model.FeedUserAvatarInfo;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse$PymiTipModel;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Map;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.follow.common.pymi.PymiUserRecyclerView;
import androidx.recyclerview.widget.RecyclerView$r;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.follow.common.pymi.PymiLayoutManager;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import lnc.a1;
import vha.c;
import y8c.g;
import z0b.b;
import nl8.a;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.follow.common.widget.FollowHorizontallyGestureRecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import qrd.p;
import wha.c;
import xha.a;
import java.lang.Integer;
import tja.a;
import rja.c;
import com.yxcorp.gifshow.follow.model.FilterOption;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xtd.a;
import via.k;
import ytd.b;
import androidx.recyclerview.widget.RecyclerView$l;
import qrd.l1;
import g9c.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import crd.b;
import lnc.b9;
import via.h;
import java.util.concurrent.Callable;
import brd.t;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import via.i;
import erd.a;
import via.j;
import kga.c;
import erd.g;
import java.lang.StringBuilder;

public final class c implements Observer	// class@0011bb
{
    public final FollowPymiListDampingPresenter$o b;

    public void c(FollowPymiListDampingPresenter$o p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       PymiBarFeed$PymiBarMeta pymiBarMeta;
       PymiBarFeed mPymiBarMeta1;
       l1 a;
       PymiTipsShowResponse pymiTipsShow1;
       Object obj = this;
       Object obj1 = p0;
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c.class, str)) {
       }else {
          FollowPymiListDampingPresenter$o b = obj.b.b;
          Objects.requireNonNull(b);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          a uoa = a.class;
          FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
          if (!PatchProxy.applyVoidOneRefs(obj1, b, uFollowPymiL, "26")) {
             c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "updatePymi");
             QCurrentUser mE = QCurrentUser.ME;
             a.o(mE, "QCurrentUser.ME");
             if (mE.isLogined() && QCurrentUser.ME.enableShowFrequentUsers()) {
                FollowPymiListDampingPresenter u = b.u;
                if (u == null) {
                   a.S("mPymiFragment");
                }
                i oi = u.q();
                a.o(oi, "mPymiFragment.pageList");
                if (oi.isEmpty() || (obj1 instanceof PymiBarFeed && PhotoType.fromFeed(obj1).toInt() == PhotoType.PYMI_BAR_FEED.toInt())) {
                   PymiBarFeed mPymiBarMeta = obj1.mPymiBarMeta;
                   if (mPymiBarMeta != null) {
                      PymiBarFeed$PymiBarMeta mLlsid = mPymiBarMeta.mLlsid;
                      if (mLlsid != null) {
                         PymiBarFeed$PymiBarMeta mPymiUserBar = mPymiBarMeta.mPymiUserBar;
                         if (mPymiUserBar != null) {
                            PymiBarFeed$PymiTipModel mInfos = mPymiUserBar.mInfos;
                            if (mInfos != null) {
                               Iterator iterator = mInfos.iterator();
                               while (iterator.hasNext()) {
                                  FollowingUserBannerFeed$UserBannerInfo userBannerIn = iterator.next();
                                  userBannerIn.mLlsid = mLlsid;
                                  userBannerIn = userBannerIn.mAvatarInfo;
                                  if (userBannerIn != null) {
                                     FeedUserAvatarInfo mLiveStreamF = userBannerIn.mLiveStreamFeed;
                                     if (mLiveStreamF != null) {
                                        LiveStreamFeed mCommonMeta = mLiveStreamF.mCommonMeta;
                                        if (mCommonMeta != null) {
                                           mCommonMeta.mListLoadSequenceID = mLlsid;
                                        }
                                     }
                                  }
                               }
                            }
                         }
                      }
                   }
                   a uoa1 = a.b();
                   String str1 = "FOLLOW_PYMI_LIST";
                   PymiTipsShowResponse pymiTipsShow = PatchProxy.applyOneRefs(obj1, null, uoa, "4");
                   int i = 0;
                   if (pymiTipsShow != patchProxyRe) {
                   }else {
                      PymiBarFeed mPymiBarMeta2 = obj1.mPymiBarMeta;
                      if (mPymiBarMeta2 == null || mPymiBarMeta2.mPymiUserBar == null) {
                         pymiTipsShow = null;
                      }else {
                         pymiTipsShow = new PymiTipsShowResponse();
                         PymiBarFeed mPymiBarMeta3 = obj1.mPymiBarMeta;
                         pymiTipsShow.mLlsid = mPymiBarMeta3.mLlsid;
                         pymiTipsShow.mCollapse = mPymiBarMeta3.mCollapsed;
                         pymiTipsShow.mFrequentUserContentType = mPymiBarMeta3.mFrequentUserContentType;
                         PymiTipsShowResponse$PymiTipModel pymiTipModel = new PymiTipsShowResponse$PymiTipModel();
                         pymiTipsShow.mPymiUserBar = pymiTipModel;
                         pymiTipModel.mInfos = Lists.b();
                         int i1 = 0;
                         while (i1 < mPymiBarMeta3.mPymiUserBar.mInfos.size()) {
                            pymiTipsShow.mPymiUserBar.mInfos.add(new FollowingUserBannerFeed$UserBannerInfo(mPymiBarMeta3.mPymiUserBar.mInfos.get(i1)));
                            i1 = i1 + 1;
                            pymiTipsShow1 = null;
                         }
                         pymiTipsShow1 = pymiTipsShow.mPymiUserBar;
                         PymiBarFeed$PymiBarMeta mPymiUserBar2 = mPymiBarMeta3.mPymiUserBar;
                         pymiTipsShow1.mFeedId = mPymiUserBar2.mFeedId;
                         pymiTipsShow1.mType = mPymiUserBar2.mType;
                         pymiTipsShow1.mExpTag = mPymiUserBar2.mExpTag;
                         pymiTipsShow1.mTitle = mPymiUserBar2.mTitle;
                      }
                   }
                   Objects.requireNonNull(uoa1);
                   if (!PatchProxy.applyVoidTwoRefs(str1, pymiTipsShow, uoa1, uoa, str)) {
                      uoa1.a.put(str1, pymiTipsShow);
                   }
                   if (!PatchProxy.applyVoidOneRefs(obj1, b, uFollowPymiL, "20") && b.H == null) {
                      View view = a.i(b.G, R.layout.arg_RES_7f0d0441);
                      if (view != null) {
                         b.I = view.findViewById(0x7f0a3361);
                         FollowPymiListDampingPresenter g = b.G;
                         if (g != null) {
                            g.addView(view);
                         }
                         g = b.I;
                         if (g == null || PatchProxy.applyVoidTwoRefs(g, obj1, b, uFollowPymiL, "21")) {
                            pymiBarMeta = null;
                         }else {
                            g.removeOnScrollListener(b.h9());
                            g.addOnScrollListener(b.h9());
                            g.setLayoutManager(b.a9());
                            g.setPadding(a1.d(R.dimen.arg_RES_7f07031b), i, i, a1.d(R.dimen.arg_RES_7f070271));
                            b.k9();
                            b.k9().n1("PYMI_USER_AVATAR_REQUEST_CACHE", b.P);
                            b uob = b.P8();
                            a.o(uob, "fragment");
                            g.setRefreshLayout(uob.Ac());
                            g.setAdapter(b.k9());
                            g.setNestedScrollingEnabled(i);
                            g.setHasFixedSize(true);
                            b.k9().n1("PYMI_USER_LIST_ADAPTER", b.k9());
                            b.k9().n1("PYMI_LOGPAGE_FRAGMENT", b.P8());
                            b.k9().n1("PYMI_RECYCLER_VIEW", g);
                            c uoc = b.k9();
                            pymiBarMeta = null;
                            c uoc1 = PatchProxy.apply(pymiBarMeta, b, uFollowPymiL, "12");
                            if (uoc1 == patchProxyRe) {
                               uoc1 = b.F.getValue();
                            }
                            uoc.n1("PYMI_SHOW_DETAIL_HELPER", uoc1);
                            b.k9().n1("PYMI_LOGGER", new a());
                            b.k9().n1("PYMI_VERTICAL_POSITION", Integer.valueOf(i));
                            b.k9().n1("FOLLOW_PAGE_IS_PULLING", b.N);
                            b.k9().n1("FOLLOW_VERSION", Integer.valueOf(b.z));
                            c uoc2 = b.k9();
                            u = b.A;
                            if (u == null) {
                               a.S("mPhotoClickedState");
                            }
                            uoc2.n1("HOME_FOLLOW_PHOTO_CLICKED", u);
                            b.k9().n1("PYMI_PHOTO_DETAIL_PARAM_PROCESSOR", b.B);
                            uoc2 = b.k9();
                            u = b.x;
                            if (u != null) {
                               uoa1 = u.c();
                               if (uoa1 != null) {
                                  FilterOption uFilterOptio = uoa1.a();
                                  if (uFilterOptio != null) {
                                     uFilterOptio = uFilterOptio.mName;
                                  label_0265 :
                                     uoc2.n1("PYMI_FILTER_BOX_NAME", uFilterOptio);
                                     mPymiBarMeta1 = obj1.mPymiBarMeta;
                                     if (mPymiBarMeta1 != null) {
                                        PymiBarFeed$PymiBarMeta mPymiUserBar1 = mPymiBarMeta1.mPymiUserBar;
                                        if (mPymiUserBar1 != null) {
                                           PymiBarFeed$PymiTipModel mExpTag = mPymiUserBar1.mExpTag;
                                        label_0276 :
                                           str1 = "";
                                           String str2 = "PYMI_EXP_TAG";
                                           if (!TextUtils.x(mExpTag)) {
                                              b.k9().n1(str2, mExpTag);
                                           }else {
                                              b.k9().n1(str2, str1);
                                           }
                                           mPymiBarMeta1 = obj1.mPymiBarMeta;
                                           mPymiUserBar1 = (mPymiBarMeta1 != null)? mPymiBarMeta1.mLlsid: pymiBarMeta;
                                           str2 = "PYMI_LIST_LOAD_SEQUENCEID";
                                           if (!TextUtils.x(mPymiUserBar1)) {
                                              b.k9().n1(str2, mPymiUserBar1);
                                           }else {
                                              b.k9().n1(str2, str1);
                                           }
                                           a uoa2 = new a(new k(g), 2.00f, 0x3f800000, -2.50f);
                                           if (g.getItemAnimator() != null) {
                                              RecyclerView$l itemAnimator = g.getItemAnimator();
                                              a.m(itemAnimator);
                                              a.o(itemAnimator, "recyclerView.itemAnimator!!");
                                              itemAnimator.A(0);
                                           }
                                        }
                                     }
                                     Object[] objArray = pymiBarMeta;
                                     goto label_0276 ;
                                  }
                               }
                            }
                            Object[] objArray1 = pymiBarMeta;
                            goto label_0265 ;
                         }
                         a = l1.a;
                      }else {
                         pymiBarMeta = null;
                         view = pymiBarMeta;
                      }
                      b.H = view;
                   }else {
                      pymiBarMeta = null;
                   }
                   if (!PatchProxy.applyVoidOneRefs(obj1, b, uFollowPymiL, "30")) {
                      KsLogFollowTag fOLLOW_PYMI = KsLogFollowTag.FOLLOW_PYMI;
                      fOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter");
                      c.i(fOLLOW_PYMI, "handlePymiResponse");
                      mPymiBarMeta1 = obj1.mPymiBarMeta;
                      if (mPymiBarMeta1 != null) {
                         pymiBarMeta = mPymiBarMeta1.mPymiUserBar;
                      }
                      if (pymiBarMeta == null) {
                         b.n9();
                      }else if(b.k9().R0() || !b.a9().h()){
                         c.i(fOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "handlePymiResponse isEmpty count="+obj1.mPymiBarMeta.mPymiUserBar.mInfos.size());
                         b.Y8(obj1.mPymiBarMeta.mPymiUserBar.mInfos);
                      }else {
                         b9.a(b.D);
                         b.D = t.fromCallable(new h(b)).delay(100, TimeUnit.MILLISECONDS, d.c).observeOn(d.a).doOnTerminate(new i(b)).subscribe(new j(b, obj1), c.a);
                      }
                   }
                }
             }
          label_0378 :
             b.n9();
          }
       }
       return;
    }
}
