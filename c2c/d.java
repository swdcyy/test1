package c2c.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.List;
import com.yxcorp.gifshow.profile.background.player.ProfileBgVideoInfo;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.ImageSource;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import java.lang.Long;

public final class d extends PresenterV2	// class@0004f9
{
    public KwaiImageView p;
    public ProfileBgVideoInfo q;
    public long r;

    public void d(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, d.class, "3")) {
          return;
       }
       if (this.r - null > 0) {
          return;
       }
       d tq = this.q;
       if (tq == null) {
          a.S("mVideoInfo");
       }
       List coverUrls = tq.getCoverUrls();
       if (coverUrls != null) {
          d tp = this.p;
          if (tp == null) {
             a.S("mCover");
          }
          a$a uoa = a.d();
          uoa.b(":ks-features:ft-social:profile");
          uoa.d(ImageSource.DETAIL_COVER_VIDEO);
          tp.S(coverUrls, uoa.a());
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       a.p(p0, "view");
       p0 = m1.f(p0, R.id.cover);
       a.o(p0, "ViewBindUtils.bindWidget\(view, R.id.cover\)");
       this.p = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       Long obj = this.r8("PROFILE_PREVIEW_VIDEO_INFO");
       a.o(obj, "inject\(AccessIds.PROFILE_PREVIEW_VIDEO_INFO\)");
       this.q = obj;
       obj = this.t8("PROFILE_PREVIEW_VIDEO_PROGRESS");
       long l = (obj != null)? obj.longValue(): 0;
       this.r = l;
       return;
    }
}
