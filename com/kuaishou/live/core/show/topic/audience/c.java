package com.kuaishou.live.core.show.topic.audience.c;
import k51.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import ql2.o0;
import ql2.h;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Integer;
import android.app.Activity;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import com.yxcorp.gifshow.entity.QPhoto;
import nb2.l;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import ql2.a;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import lb2.i;
import com.kuaishou.live.core.basic.utils.e;
import rb2.g;
import e12.c;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import android.view.View;
import com.kuaishou.live.core.show.topic.audience.c$a;
import com.yxcorp.gifshow.widget.m;
import ekd.m1;
import ql2.u;
import com.kuaishou.live.core.show.topic.audience.LiveAudienceTopicDetailFragment;

public class c extends c	// class@0011fb
{
    public o0 p;
    public QPhoto q;
    public u r;
    public LiveAudienceTopicDetailFragment s;
    public g t;
    public static String sLivePresenterClassName = "LiveAudienceTopicDetailFeedReplacePresenter";

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       o0 oo0 = o0.p0(this.s);
       this.p = oo0;
       this.X7(oo0.i.subscribe(new h(this)));
       return;
    }
    public void P8(int p0){
       boolean b1;
       Object obj = this;
       int i = p0;
       o0 oo0 = o0.class;
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoc, "4")) {
          return;
       }
       boolean b = true;
       if (!l.c(this.getActivity(), r1.n1(obj.p.a), obj.q, b)) {
          obj.p.f.onNext(Boolean.TRUE);
          return;
       }else {
          obj.p.f.onNext(Boolean.TRUE);
          c p = obj.p;
          Objects.requireNonNull(p);
          QPhoto obj1 = PatchProxy.apply(null, p, oo0, "3");
          if (obj1 != PatchProxyResult.class) {
             b1 = obj1.booleanValue();
          }else {
             a a1 = p.h.a;
             if (a1 == null || a1.b() == null) {
                b = 0;
             }
             b1 = b;
          }
          p = obj.p;
          obj1 = obj.q.mEntity;
          Objects.requireNonNull(p);
          if (!PatchProxy.isSupport(oo0) || !PatchProxy.applyVoidThreeRefs(obj1, Integer.valueOf(p0), Boolean.FALSE, p, o0.class, "2")) {
             a a = p.h.a;
             if (a != null) {
                a.d(obj1, i, false);
             }
          }
          if (e.s(this.getActivity())) {
             if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), obj, uoc, "5")) {
                obj.t.s();
                c p1 = obj.p;
                obj.t.a(p1.b, obj.r, obj.q, b1, p1.h.e);
             }
          }else if(!this.getActivity() instanceof LivePlayActivity || (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), obj, uoc, "6"))){
             e.v(this.getActivity(), obj.q.mEntity, i);
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       m1.b(p0, new c$a(this), R.id.live_audience_topic_detail_feed_cover_view);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(QPhoto.class);
       this.r = this.r8("DETAIL_PAGE_LIST");
       this.s = this.r8("FRAGMENT");
       this.t = this.r8("LIVE_SQUARE_REPLACE_FEED_LIST_SERVICE");
       return;
    }
}
