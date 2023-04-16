package dl9.d$b;
import android.view.View$OnClickListener;
import android.widget.TextView;
import dl9.d;
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

public final class d$b implements View$OnClickListener	// class@001f54
{
    public final TextView b;
    public final d c;

    public void d$b(TextView p0,d p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, d$b.class, "1")) {
          return;
       }
       d p = this.c.p;
       if (p == null) {
          a.S("mCommentLogger");
       }
       d$b tc = this.c;
       Objects.requireNonNull(tc);
       Object[] objArray = null;
       d uod = PatchProxy.apply(objArray, tc, d.class, "3");
       if (uod != PatchProxyResult.class) {
       }else {
          uod = tc.t;
          if (uod == null) {
             a.S("mComment");
          }
       }
       d q = this.c.q;
       if (q == null) {
          a.S("mFragment");
       }
       p.s(uod, f0.a(q, this.c.getActivity()));
       Activity activity = this.c.getActivity();
       if (activity instanceof FragmentActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          if (this.c.S8().isMine()) {
             PhotoMeta photoMeta = this.c.S8().getPhotoMeta();
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
             i.b(objArray, this.c.S8(), k.e());
          }
       }
       PatchProxy.onMethodExit(d$b.class, "1");
       return;
    }
}
