package com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mParentScrollListener$2$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter$mParentScrollListener$2;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.yxcorp.gifshow.follow.stagger.header.FollowPymiListDampingPresenter;
import android.view.View;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.i;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import xha.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.model.user.QCurrentUser;
import android.os.SystemClock;
import java.lang.Number;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed;
import com.yxcorp.gifshow.follow.common.model.PymiBarFeed$PymiBarMeta;
import wkd.b;
import nga.c;
import com.kuaishou.android.model.feed.PhotoType;
import rja.c;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import com.yxcorp.gifshow.follow.stagger.data.i;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.follow.stagger.selector.model.FilterOptionRequest;
import java.util.ArrayList;
import fg6.a;
import com.google.gson.Gson;
import brd.t;
import cjd.e;
import erd.o;
import via.l;
import erd.r;
import via.m;
import erd.g;
import via.n;
import kga.c;
import crd.b;

public final class FollowPymiListDampingPresenter$mParentScrollListener$2$a extends RecyclerView$r	// class@00119a
{
    public final FollowPymiListDampingPresenter$mParentScrollListener$2 a;

    public void FollowPymiListDampingPresenter$mParentScrollListener$2$a(FollowPymiListDampingPresenter$mParentScrollListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       long l1;
       String str1;
       Object[] objArray1;
       FollowPymiListDampingPresenter$mParentScrollListener$2$a omParentScro = FollowPymiListDampingPresenter$mParentScrollListener$2$a.class;
       if (PatchProxy.isSupport(omParentScro) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, omParentScro, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       RecyclerView$LayoutManager layoutManage = p0.getLayoutManager();
       Object[] objArray = null;
       if (!layoutManage instanceof VirtualLayoutManager) {
          layoutManage = objArray;
       }
       if (layoutManage != null) {
          int i = layoutManage.h();
          if (!p1 && !i) {
             FollowPymiListDampingPresenter h = this.a.this$0.H;
             if (h != null && !h.getVisibility()) {
                i oi = this.a.this$0.d9().q();
                a.o(oi, "mPymiFragment.pageList");
                if (!oi.isEmpty()) {
                   c.i(KsLogFollowTag.FOLLOW_PYMI.appendTag("FollowPymiListDampingPresenter"), "parent onScrollStateChanged enableLogPymiBanner="+this.a.this$0.J);
                   FollowPymiListDampingPresenter$mParentScrollListener$2 this$0 = this.a.this$0;
                   boolean b = false;
                   if (this$0.J != null) {
                      this$0.J = b;
                      this$0.o9();
                      a.f("PULL");
                   }
                   this$0 = this.a.this$0;
                   Objects.requireNonNull(this$0);
                   PatchProxyResult patchProxyRe = PatchProxyResult.class;
                   FollowPymiListDampingPresenter uFollowPymiL = FollowPymiListDampingPresenter.class;
                   if (!PatchProxy.applyVoid(objArray, this$0, uFollowPymiL, "33") && QCurrentUser.ME.enableShowFrequentUsers()) {
                      long l = SystemClock.elapsedRealtime();
                      String obj = PatchProxy.apply(objArray, this$0, uFollowPymiL, "8");
                      if (obj != patchProxyRe) {
                         l1 = obj.longValue();
                      }else {
                         PymiBarFeed pymiBarFeed = this$0.c9();
                         if (pymiBarFeed != null) {
                            pymiBarFeed = pymiBarFeed.mPymiBarMeta;
                            if (pymiBarFeed != null) {
                               l1 = pymiBarFeed.mLastPymiRequestTime;
                            }
                         }
                         l1 = SystemClock.elapsedRealtime();
                      }
                      if ((l - l1) - (long)0xea60 > 0) {
                         c uoc = b.a(0x5eeadcc5);
                         int i1 = PhotoType.PYMI_BAR_FEED.toInt();
                         obj = PatchProxy.apply(objArray, this$0, uFollowPymiL, "34");
                         if (obj != patchProxyRe) {
                         }else {
                            obj = PatchProxy.apply(objArray, this$0, uFollowPymiL, "35");
                            if (obj != patchProxyRe) {
                            }else {
                               FollowPymiListDampingPresenter x = this$0.x;
                               obj = (x != null)? x.b(): objArray;
                            }
                            String str = PatchProxy.apply(objArray, this$0, uFollowPymiL, "36");
                            if (str != patchProxyRe) {
                            }else {
                               FollowPymiListDampingPresenter u = this$0.u;
                               if (u == null) {
                                  a.S("mPymiFragment");
                               }
                               if (u instanceof HomeFollowFragment) {
                                  objArray = u;
                               }
                               if (objArray != null) {
                                  i oi1 = objArray.ai();
                                  if (oi1 != null) {
                                     str1 = oi1.L();
                                     if (str1 != null) {
                                     label_0131 :
                                        str = str1;
                                     }
                                  }
                               }
                               str1 = "default";
                               goto label_0131 ;
                            }
                            if (TextUtils.x(obj) || TextUtils.x(str)) {
                               obj = "";
                            }else {
                               FilterOptionRequest uFilterOptio = new FilterOptionRequest();
                               uFilterOptio.mFilterBoxName = obj;
                               uFilterOptio.mOptionName = str;
                               ArrayList uArrayList = new ArrayList();
                               uArrayList.add(uFilterOptio);
                               obj = a.a.q(uArrayList);
                            }
                         }
                         uoc.e(i1, obj, b).map(new e()).filter(l.b).doOnNext(m.b).subscribe(new n(this$0), c.a);
                      }
                   }
                }
             }
          }
       }
    label_017c :
       return;
    }
}
