package dl9.c$a;
import android.view.View$OnClickListener;
import android.widget.TextView;
import dl9.c;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.QComment;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import yk9.d;
import androidx.fragment.app.FragmentActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.components.feedmodel.RewardPhotoInfo;
import android.content.Intent;
import android.net.Uri;
import ekd.w0;
import zf6.k;
import oz5.i;

public final class c$a implements View$OnClickListener	// class@001f4d
{
    public final TextView b;
    public final c c;

    public void c$a(TextView p0,c p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, c$a.class, "1")) {
          return;
       }
       c p = this.c.p;
       if (p == null) {
          a.S("mCommentLogger");
       }
       c$a tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       c uoc = PatchProxy.apply(objArray, tc, c.class, "4");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = tc.t;
          if (uoc == null) {
             a.S("mComment");
          }
       }
       c q = this.c.q;
       if (q == null) {
          a.S("mFragment");
       }
       p.s(uoc, f0.a(q, this.c.getActivity()));
       Activity activity = this.c.getActivity();
       if (activity instanceof FragmentActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          if (this.c.R8().isMine()) {
             PhotoMeta photoMeta = this.c.R8().getPhotoMeta();
             if (photoMeta != null) {
                photoMeta = photoMeta.mRewardPhotoInfo;
                if (photoMeta != null) {
                   RewardPhotoInfo mActionUrl = photoMeta.mActionUrl;
                   if (mActionUrl != null) {
                      objArray.startActivity(new Intent("android.intent.action.VIEW", w0.f(mActionUrl)));
                   }
                }
             }
          }else {
             i.b(objArray, this.c.R8(), k.e());
          }
       }
       PatchProxy.onMethodExit(c$a.class, "1");
       return;
    }
}
