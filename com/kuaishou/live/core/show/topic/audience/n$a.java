package com.kuaishou.live.core.show.topic.audience.n$a;
import qvb.q;
import com.kuaishou.live.core.show.topic.audience.n;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kuaishou.live.core.show.topic.api.LiveTopicHeaderInfo;
import ql2.u;
import java.util.Objects;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import qvb.a;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailHeaderView;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.topic.audience.h$b;
import com.kuaishou.live.core.show.topic.api.LiveAudienceTopicRecommendUserListInfo;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.show.topic.audience.o$b;
import com.kuaishou.live.core.show.topic.audience.d$b;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.topic.audience.k$b;
import android.view.ViewGroup$MarginLayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;

public class n$a implements q	// class@00120c
{
    public final n b;

    public void n$a(n p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       n$a uoa = n$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       if (!p0) {
          return;
       }
       if (this.b.r.h2() == null) {
          return;
       }
       n$a tb = this.b;
       LiveTopicHeaderInfo liveTopicHea = tb.r.h2();
       u s = this.b.r.s;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidTwoRefs(liveTopicHea, s, tb, n.class, "4")) {
          if (tb.p != null) {
             tb.q.ia().m1(tb.p);
          }
          if (!tb.r.isEmpty()) {
             if (tb.p == null) {
                tb.p = new LiveAudienceTopicDetailHeaderView(tb.getContext());
             }
             tb.s.a(tb.p, liveTopicHea);
             if (s != null && !q.f(s.mRecommendUserList)) {
                tb.u.a(tb.p, s);
             }else if(liveTopicHea.mTopicActivityInfo != null){
                tb.t.a(tb.p, liveTopicHea);
             }else if(!TextUtils.x(liveTopicHea.mTopicDescription)){
                tb.v.a(tb.p, liveTopicHea.mTopicDescription);
             }
             ViewGroup$MarginLayoutParams marginLayout = new ViewGroup$MarginLayoutParams(-1, -2);
             marginLayout.leftMargin = - a1.d(0x7f07029e);
             marginLayout.rightMargin = - a1.d(0x7f07029e);
             tb.q.ia().o1(false);
             tb.q.ia().Q0(tb.p, marginLayout);
          }
       }
       return;
    }
}
