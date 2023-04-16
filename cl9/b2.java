package cl9.b2;
import com.yxcorp.gifshow.comment.utils.Labels.CommentLabelsView$a;
import cl9.e2;
import java.util.List;
import java.lang.Object;
import android.widget.TextView;
import com.kuaishou.android.model.mix.QComment$Label;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import yk9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import java.lang.CharSequence;
import android.text.TextUtils;
import wkd.b;
import nf6.i;
import android.net.Uri;
import ekd.w0;
import android.content.Context;
import android.content.Intent;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.webview.hybrid.WebEntryUrls;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity$a;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity$c;
import com.yxcorp.gifshow.webview.c;

public final class b2 implements CommentLabelsView$a	// class@00060a
{
    public final e2 a;
    public final List b;

    public void b2(e2 p0,List p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(TextView p0,QComment$Label p1,int p2){
       b2 ta = this.a;
       b2 tb = this.b;
       e2 t = ta.t;
       e2 s = ta.s;
       Object obj = tb.get(p2);
       e0 uoe0 = f0.a(ta.u, ta.getActivity());
       Objects.requireNonNull(t);
       if (PatchProxy.applyVoidThreeRefs(s, obj, uoe0, t, d.class, "72")) {
       }else if(t.a != null && (s == null || obj == null)){
          ClientContent$ContentPackage uContentPack = t.c(s, s.mReplyToCommentId, true);
          uContentPack.photoPackage = t.i();
          ClientEvent$ElementPackage uElementPack = t.g(s, 2, "comment_user_label", "COMMENT_USER_LABEL");
          i3 oi3 = i3.f();
          oi3.d("user_label", obj.mLabelName);
          uElementPack.params = oi3.e();
          u1.B(new ClickMetaData().setLogPage(uoe0).setType(true).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(t.a.getFeedLogCtx()));
       }
       if (!TextUtils.isEmpty(tb.get(p2).mLinkUrl)) {
          ta.getActivity().startActivity(b.a(0x66dce92a).a(ta.getActivity(), w0.f(tb.get(p2).mLinkUrl)));
       }else if(p1.mLabelType.intValue() == 1){
          c.i(ta.getActivity(), KwaiWebViewActivity.N3(ta.getContext(), WebEntryUrls.c0+ta.r.getPhotoId()).a());
       }
       return;
    }
}
