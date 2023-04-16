package lz9.i;
import erd.g;
import lz9.b0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import qp7.t0;
import qp7.b;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.SlidePageConfig;
import e17.i;
import rd5.g;
import com.kuaishou.android.model.mix.QComment;
import com.yxcorp.gifshow.entity.QPhoto;
import android.os.SystemClock;
import nx9.c;
import io.reactivex.subjects.PublishSubject;
import qp7.x0;
import ks7.h0;
import lnc.i3;
import java.lang.Integer;
import java.lang.String;
import java.lang.Number;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import up.a;
import com.kuaishou.android.model.actionreport.PhotoActionReportParams;
import java.lang.Long;
import p1a.a$a;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.activity.GifshowActivity;
import p1a.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.action.c;
import lz9.o;
import msd.a;
import com.kwai.framework.kgi.sdk.Kgi;

public final class i implements g	// class@002edf
{
    public final b0 b;

    public void i(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       i tb = this.b;
       Objects.requireNonNull(tb);
       if (VisitorModeManager.g(3)) {
       }else if(tb.H().k0()){
          i.a(R.style.arg_RES_7f11066a, 0x7f10054d);
       }else {
          i = 1;
          QComment qComment = null;
          p0 = new g(i, qComment);
          if (tb.t.numberOfComments() <= 0 && tb.t.isAllowComment()) {
             p0.g = i;
             p0.h = tb.t;
          }
          if (tb.U - null && (SystemClock.elapsedRealtime() - tb.U) - 500 < 0) {
             p0.k = c.a() ^ i;
             p0.g = i;
             p0.h = tb.t;
          }
          tb.H().u1.onNext(p0);
          tb.G = i;
          tb.E().j(false);
          i3 oi3 = i3.f();
          oi3.c("comments_cnt", Integer.valueOf(tb.t.numberOfComments()));
          String obj = PatchProxy.apply(qComment, tb, b0.class, "19");
          boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): tb.t.hasGodCommentShow();
          obj = (b)? "TRUE": "FALSE";
          oi3.d("is_dynamic", obj);
          if (p0.k != null) {
             oi3.c("bubble_id", Integer.valueOf(0x2a40));
          }
          if (tb.t.getActionReportFetcher() != null && tb.t.getActionReportFetcher().a() != null) {
             oi3.c("play_cnt", Integer.valueOf(tb.t.getActionReportFetcher().a().mPlayCnt));
             oi3.c("play_time", Long.valueOf(tb.t.getActionReportFetcher().a().mActionRelativeTime));
          }
          a$a uoa = a$a.a(1744, "µã»÷ÆÀÂÛ°´Å¥");
          uoa.m(oi3.e());
          uoa.f("CLICK_COMMENT_BUTTON");
          uoa.r(i);
          uoa.j(tb.t.getFeedLogCtx());
          tb.w.a(uoa);
          c.a(20, tb.t.getEntity());
          Kgi.c(new o(tb, "CLICK_COMMENT_BUTTON"));
       }
       return;
    }
}
