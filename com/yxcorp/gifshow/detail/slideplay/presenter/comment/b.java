package com.yxcorp.gifshow.detail.slideplay.presenter.comment.b;
import z1.k;
import com.yxcorp.gifshow.detail.slideplay.presenter.comment.NasaCommentCreatorPresenter;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import e0a.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.component.tabs.panel.h;
import java.lang.Boolean;
import com.kwai.framework.model.feed.BaseFeed;
import j06.a;
import mrd.a;
import java.lang.Integer;
import gx9.l;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import tkd.b;
import tkd.d;
import gx5.e;
import android.os.Bundle;
import qm5.e;
import com.kwai.feature.api.feed.detail.router.DetailDanmakuParam;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.feature.api.danmaku.utils.DanmakuSwitchUtils;
import f6a.a;
import im5.d;
import com.kwai.feature.api.danmaku.c;
import java.util.Iterator;
import g7a.l;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.framework.model.user.User;
import com.kwai.sdk.switchconfig.a;
import gx5.d;
import hx9.a;
import g7a.u0;
import hx9.g;
import com.kuaishou.android.model.mix.DynamicTabInfo;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.e;
import com.yxcorp.gifshow.detail.comment.nasa.tab.dynamic.CommentRnContainerFragment;
import gx9.g;
import com.kwai.component.tabs.panel.a;
import gx9.a;
import com.kwai.component.tabs.panel.TabsPanelConfig$Style;
import com.kwai.component.tabs.panel.TabsPanelConfig$b;
import gx9.f;
import yg5.q0;
import rkd.b;
import yg5.b;
import yg5.j0;
import com.kwai.component.tabs.panel.TabsPanelConfig;
import yg5.d0;

public final class b implements k	// class@001856
{
    public final NasaCommentCreatorPresenter b;

    public void b(NasaCommentCreatorPresenter p0){
       this.b = p0;
    }
    public final Object get(){
       boolean b2;
       int i;
       Object[] obj1;
       e obj3;
       l a;
       h obj5;
       boolean b3;
       b b = this.b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaCommentCreatorPresenter p = b.p;
       NasaCommentCreatorPresenter u = b.u;
       j oj = j.class;
       NasaCommentCreatorPresenter nasaCommentC = NasaCommentCreatorPresenter.class;
       ArrayList uArrayList = PatchProxy.applyTwoRefs(p, u, b, nasaCommentC, "8");
       if (uArrayList != patchProxyRe) {
       }else {
          uArrayList = new ArrayList();
          Object[] objArray = null;
          int b1 = false;
          if (r1.A2(b.p)) {
             uArrayList.add(b.P8(p, u, b1));
          }else {
             NasaCommentCreatorPresenter obj6 = PatchProxy.applyOneRefs(p, b, nasaCommentC, "9");
             if (obj6 != patchProxyRe) {
                b3 = obj6.booleanValue();
             }else if(p != null && (p.getEntity() == null || !a.a(p.getEntity()))){
                obj6 = b.F;
                if (obj6 != null && obj6.i().intValue() > 0) {
                   b3 = true;
                }
             }
          label_0069 :
             b3 = false;
             if (b3) {
                obj5 = b.P8(b.p, b.u, true);
                obj5.g = 6050;
                uArrayList.add(obj5);
                l.b(uArrayList);
             }else {
                obj6 = PatchProxy.apply(objArray, b, nasaCommentC, "6");
                if (obj6 != patchProxyRe) {
                   b3 = obj6.booleanValue();
                }else if(l.a(b.p, b.q) && b.p.numberOfLike() > 0){
                   b3 = true;
                }else {
                   b3 = false;
                }
                if (b3) {
                   uArrayList.add(b.P8(p, u, b1));
                   uArrayList.add(b.R8());
                }else if(b.q.getNasaSlideParam().mIsUserStatusNasaDetail != null){
                   obj5 = PatchProxy.apply(objArray, b, nasaCommentC, "15");
                   u = 0xcb98120;
                   if (obj5 != patchProxyRe) {
                   }else {
                      obj5 = d.a(u).xu(Bundle.EMPTY, "STATUS_LIKE", Integer.valueOf(3001), b.p);
                   }
                   uArrayList.add(obj5);
                   obj5 = PatchProxy.apply(objArray, b, nasaCommentC, "17");
                   if (obj5 != patchProxyRe) {
                   }else {
                      obj5 = d.a(u).G5(Bundle.EMPTY, "STATUS_VIEW", Integer.valueOf(5001), b.p);
                   }
                   uArrayList.add(obj5);
                }else {
                   uArrayList.add(b.P8(p, u, b1));
                   if (b.p.enableShowLikeList() && b.p.numberOfLike() > 0) {
                      uArrayList.add(b.R8());
                   }
                }
             }
          }
          if (!PatchProxy.applyVoidOneRefs(uArrayList, b, nasaCommentC, "10")) {
             obj3 = PatchProxy.apply(objArray, b, nasaCommentC, "12");
             if (obj3 != patchProxyRe) {
             }else {
                obj5 = PatchProxy.apply(objArray, b, nasaCommentC, "11");
                if (obj5 != patchProxyRe) {
                   b2 = obj5.booleanValue();
                }else {
                   p = b.E;
                   b2 = (p != null && (!p.i().booleanValue() && (!TextUtils.x(b.u.getDetailDanmakuParam().openDanmakuSource) && (!DanmakuSwitchUtils.h.f() || !a.a.a(b.p, b.u)))))? true: false;
                }
                if (!b2) {
                   p = b.C;
                   if (p != null && p.a() != null) {
                      obj3 = b.C.a().v();
                   }
                }
                obj1 = objArray;
             }
             i = 2001;
             if (obj3 != null) {
                uArrayList.add(obj3.l(i, b.p));
             }else {
                Iterator iterator1 = uArrayList.iterator();
                Object[] objArray1 = objArray;
                while (iterator1.hasNext()) {
                   h oh = iterator1.next();
                   if (oh.f() == i) {
                      objArray1 = oh;
                   }
                }
                if (objArray1 != null) {
                   uArrayList.remove(objArray1);
                }
             }
          }
          a obj = PatchProxy.apply(objArray, b, nasaCommentC, "7");
          if (obj != patchProxyRe) {
             b2 = obj.booleanValue();
          }else {
             p = b.p;
             u = b.q;
             l ol = l.class;
             NasaSlideParam obj2 = PatchProxy.applyTwoRefs(p, u, objArray, ol, "1");
             if (obj2 != patchProxyRe) {
                b2 = obj2.booleanValue();
             }else {
                a.p(p, "photo");
                a.p(u, "nasaBizParam");
                if (u.getNasaSlideParam().mIsFriendsNasaDetail == null) {
                   obj2 = u.getNasaSlideParam();
                   String str = "nasaBizParam.nasaSlideParam";
                   a.o(obj2, str);
                   if (!obj2.isEnableReceiveLikeComment()) {
                      NasaSlideParam nasaSlidePar = u.getNasaSlideParam();
                      a.o(nasaSlidePar, str);
                      if (nasaSlidePar.isFollowNasaDetail()) {
                         a = l.a;
                         Objects.requireNonNull(a);
                         User obj4 = PatchProxy.applyOneRefs(p, a, ol, "2");
                         if (obj4 != patchProxyRe) {
                            i = obj4.booleanValue();
                         }else if(p.getUser() == null){
                            i = false;
                         }else {
                            obj4 = p.getUser();
                            a.o(obj4, "photo.user");
                            i = (obj4.isFriend())? true: p.enableShowLikeList();
                         }
                         if (i) {
                         label_0255 :
                            if (p.numberOfCollects() - null > 0) {
                               b2 = true;
                            }else {
                            label_0261 :
                               b2 = false;
                            }
                         }
                      }
                      if (p.enableShowLikeList()) {
                         goto label_0255 ;
                      }else {
                         goto label_0261 ;
                      }
                   }else {
                      goto label_0255 ;
                   }
                }else {
                   goto label_0255 ;
                }
             }
             if (b2) {
                obj3 = PatchProxy.apply(objArray, objArray, oj, "34");
                b2 = (obj3 != patchProxyRe)? obj3.booleanValue(): a.t().d("showCommentPanelCollectorListTab", b1);
                if (b2) {
                   b2 = true;
                }
             }
             b2 = false;
          }
          i = -1188553266;
          if (b2) {
             obj = PatchProxy.apply(objArray, b, nasaCommentC, "16");
             if (obj != patchProxyRe) {
             }else {
                a uoa2 = new a(d.a(i).w00(), Bundle.EMPTY, "COLLECTION", 6001);
                uoa2.o = b.p;
                NasaSlideParam mSourcePage = b.q.getNasaSlideParam().mSourcePage;
                if (b.q.getNasaSlideParam().isFollowNasaDetail() && TextUtils.n(mSourcePage, "follow")) {
                   uoa2.l(String.valueOf(6));
                }else {
                   uoa2.l(mSourcePage);
                }
                obj = uoa2;
             }
             uArrayList.add(obj);
          }
          if (u0.a(b.p, b.q.getNasaSlideParam().isFromViewerKwaiLink(), b.q.getNasaSlideParam().shouldShowViewerTab())) {
             g og = PatchProxy.apply(objArray, b, nasaCommentC, "14");
             if (og != patchProxyRe) {
             }else {
                og = new g(d.a(i).sp(), Bundle.EMPTY, "VIEW_AREA", b.p);
             }
             uArrayList.add(og);
          }
          obj1 = PatchProxy.apply(objArray, objArray, oj, "28");
          b2 = (obj1 != patchProxyRe)? obj1.booleanValue(): a.t().d("enableCommentPanelWonderfulContainer", b1);
          if (b2) {
             obj1 = PatchProxy.apply(objArray, b, nasaCommentC, "18");
             if (obj1 != patchProxyRe) {
             }else {
                List commentPanel = b.p.getCommentPanelDynamicTabsInfo();
                if (commentPanel != null && commentPanel.size() > 0) {
                   objArray = new ArrayList();
                   i = 0;
                   while (i < commentPanel.size()) {
                      DynamicTabInfo uDynamicTabI = commentPanel.get(i);
                      if (uDynamicTabI != null && uDynamicTabI.mPageStyle == true) {
                         e uoe = new e(CommentRnContainerFragment.class, Bundle.EMPTY, uDynamicTabI.mLogTabName, uDynamicTabI.mTabId, b.p, uDynamicTabI);
                         nasaCommentC.k = b.q.getNasaSlideParam().mSourcePage;
                         objArray.add(nasaCommentC);
                      }
                      i = i + 1;
                      NasaCommentCreatorPresenter nasaCommentC1 = null;
                   }
                }
                obj1 = objArray;
             }
             if (obj1 != null) {
                for (b1 = 0; b1 < obj1.size(); b1 = b1 + 1) {
                   uArrayList.add(obj1.get(b1));
                }
             }
          }
          l.b(uArrayList);
       }
       p = b.p;
       NasaCommentCreatorPresenter g = b.G;
       a uoa = PatchProxy.applyThreeRefs(uArrayList, p, g, null, g.class, "1");
       if (uoa != patchProxyRe) {
       }else {
          a uoa1 = new a();
          uoa1.b = p;
          uoa1.c = g;
          TabsPanelConfig$Style sTYLE1 = TabsPanelConfig$Style.STYLE1;
          Iterator iterator = uArrayList.iterator();
          while (true) {
             if (iterator.hasNext()) {
                if (iterator.next().f() == 6050) {
                   sTYLE1 = TabsPanelConfig$Style.STYLE2;
                }
             }
             TabsPanelConfig$b uob = new TabsPanelConfig$b();
             uob.k(uArrayList);
             uob.d(true);
             uob.e(true);
             uob.i(sTYLE1);
             uob.h(true);
             uob.b(uoa1);
             uob.j(true);
             uob.g(new f(p, sTYLE1));
             if (b.b()) {
                uob.f(new b());
             }
             uoa = d0.a(uob.a());
             break ;
          }
       }
       return uoa;
    }
}
