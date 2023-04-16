package dl9.p2;
import android.view.View$OnClickListener;
import dl9.q2;
import java.lang.Object;
import android.view.View;
import al9.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.activity.x;
import java.util.Objects;
import yk9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;

public final class p2 implements View$OnClickListener	// class@001f93
{
    public final q2 b;

    public void p2(q2 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       p2 tb = this.b;
       tb.r.o();
       q2 s = tb.s;
       q2 q = tb.q;
       x ox = tb.getActivity().N2();
       Objects.requireNonNull(s);
       if (PatchProxy.applyVoidTwoRefs(q, ox, s, d.class, "45")) {
       }else if(s.a == null || q == null){
          ClientContent$ContentPackage uContentPack = s.c(q, q.mReplyToCommentId, true);
          uContentPack.photoPackage = s.i();
          u1.B(new ClickMetaData().setLogPage(ox).setType(true).setElementPackage(s.f(q, true, "more_hot_comment_click", 0x791c)).setContentPackage(uContentPack).setFeedLogCtx(s.a.getFeedLogCtx()));
       }
       return;
    }
}
