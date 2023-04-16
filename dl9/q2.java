package dl9.q2;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.util.Objects;
import yk9.d;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import dl9.p2;
import android.view.View;
import android.view.View$OnClickListener;
import crd.b;
import com.yxcorp.gifshow.comment.utils.c;
import ekd.m1;
import android.widget.TextView;
import nx9.c;
import android.text.TextPaint;
import android.content.Context;
import hl9.t;
import android.content.res.ColorStateList;
import lnc.a1;
import al9.a;

public class q2 extends PresenterV2	// class@001f97
{
    public TextView p;
    public QComment q;
    public a r;
    public d s;
    public boolean t;

    public void q2(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q2.class, "3")) {
          return;
       }
       if (this.t == null) {
          q2 ts = this.s;
          q2 tq = this.q;
          x ox = this.getActivity().N2();
          Objects.requireNonNull(ts);
          if (PatchProxy.applyVoidTwoRefs(tq, ox, ts, d.class, "46") || (ts.a != null && tq != null)) {
             ClientContent$ContentPackage uContentPack = ts.c(tq, tq.mReplyToCommentId, true);
             uContentPack.photoPackage = ts.i();
             u1.B0(new ShowMetaData().setLogPage(ox).setType(6).setElementPackage(ts.f(tq, true, "more_hot_comment_expo", 0x791b)).setContentPackage(uContentPack).setFeedLogCtx(ts.a.getFeedLogCtx()));
          }
       label_006b :
          this.t = true;
       }
       this.X7(c.a(this.p, new p2(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q2.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a2c08);
       if (c.c()) {
          this.p.getPaint().setFakeBoldText(false);
          t.e9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081c, 0x7f0601f6)));
          t.Z8(this.p, 2, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081c, 0x7f0601f6)));
       }else {
          boolean b = true;
          if (c.d()) {
             this.p.getPaint().setFakeBoldText(b);
             t.e9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081b, 0x7f0601d9)));
             t.Z8(this.p, 2, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f06081b, 0x7f0601d9)));
          }else {
             this.p.getPaint().setFakeBoldText(b);
             t.e9(this.p, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f0607cf, 0x7f0601ba)));
             t.Z8(this.p, 2, a1.b(t.R8(this.getContext(), R.color.arg_RES_7f060816, 0x7f0601ba)));
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q2.class, "1")) {
          return;
       }
       this.q = this.q8(QComment.class);
       this.r = this.r8("DETAIL_PAGE_LIST");
       this.s = this.q8(d.class);
       return;
    }
}
