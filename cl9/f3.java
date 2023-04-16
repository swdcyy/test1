package cl9.f3;
import android.view.View$OnLongClickListener;
import cl9.g3;
import java.lang.Object;
import android.view.View;
import com.kuaishou.android.model.mix.QComment;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.QComment$CommentViewBindEntity;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.text.ClipboardManager;
import hl9.b;
import e17.i;
import com.yxcorp.gifshow.entity.QPhoto;
import ek9.t0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import ek9.m1;
import java.lang.Throwable;
import q87.c;
import java.util.Objects;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;

public final class f3 implements View$OnLongClickListener	// class@00061f
{
    public final g3 b;

    public void f3(g3 p0){
       this.b = p0;
    }
    public final boolean onLongClick(View p0){
       String comment;
       f3 tb = this.b;
       boolean b = false;
       if (TextUtils.x(tb.r.mComment)) {
       }else if(TextUtils.x(tb.r.getEntity().mFormatCaption)){
          comment = tb.r.getComment();
       }else {
          comment = tb.r.getEntity().mFormatCaption;
       }
       String str = comment;
       g3 r = tb.r;
       if (!PatchProxy.isSupport(g3.class) || !PatchProxy.applyVoidThreeRefs(str, r, Boolean.TRUE, tb, g3.class, "4")) {
          tb.getActivity().getSystemService("clipboard").setText(b.a(str));
          i.a(R.style.arg_RES_7f110669, 0x7f100831);
          tb.t.c(tb.q, r);
          tb.s.D(r, true, f0.a(tb.u, tb.getActivity()));
       }
       g3 s = tb.s;
       g3 r1 = tb.r;
       e0 uoe0 = f0.a(tb.u, tb.getActivity());
       Objects.requireNonNull(s);
       if (PatchProxy.applyVoidTwoRefs(r1, uoe0, s, d.class, "43") || (s.a != null && r1 != null)) {
          ClientContent$ContentPackage uContentPack = s.c(r1, r1.mReplyToCommentId, true);
          uContentPack.photoPackage = s.i();
          u1.B(new ClickMetaData().setLogPage(uoe0).setType(true).setElementPackage(s.f(r1, 2, "³¤°´ÆÀÂÛ", 1749)).setContentPackage(uContentPack).setFeedLogCtx(s.a.getFeedLogCtx()));
       }
    label_00e5 :
       b = true;
       return b;
    }
}
