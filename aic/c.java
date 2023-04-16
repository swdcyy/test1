package aic.c;
import zhc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import uo7.k;
import rq4.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.share.KsShareBuilder;
import com.kwai.robust.PatchProxyResult;
import uo7.l;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment;
import java.util.Objects;
import com.yxcorp.gifshow.share.widget.ForwardFansSectionFragment$a;
import java.lang.Integer;
import nsd.u;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import com.kwai.sharelib.ui.SharePanelFragment;
import djc.i0;
import mp7.e;
import com.kwai.sharelib.model.ShareInitResponse$SharePanelElement;
import uhc.a;

public class c extends a	// class@000128
{

    public void c(GifshowActivity p0,PhotoDetailParam p1){
       a.p(p0, "activity");
       a.p(p1, "mParam");
       String str = (p1.isThanos())? "BROWSE_SLIDE_PHOTO_FANS_ENCOURAGE": "PHOTO_FANS_ENCOURAGE";
       super(p0, p1, str);
       return;
    }
    public void k(k p0,d p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "3")) {
          return;
       }
       a.p(p0, "conf");
       a.p(p1, "log");
       p1.g = 2;
       p1.d = 2;
       p1.G = this.r();
       PhotoDetailParam mPhoto = this.p().mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       p1.j = TextUtils.I(mPhoto.getUserId());
       mPhoto = this.p().mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       p1.k = TextUtils.I(mPhoto.getPhotoId());
       return;
    }
    public KsShareBuilder m(){
       String str1;
       QPhoto obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p().getPhoto();
       String str = "mParam.photo";
       a.o(obj, str);
       if (obj.isVideoType()) {
          str1 = "VIDEO";
       }else {
          obj = this.p().getPhoto();
          a.o(obj, str);
          str1 = (obj.isImageType())? "IMAGE": "UNKNOWN";
       }
       KsShareBuilder ksShareBuild = super.m();
       ksShareBuild.o("POP_GUIDE").p(str1);
       return ksShareBuild;
    }
    public ForwardGridSectionFragment n(){
       ForwardFansSectionFragment uForwardFans;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, c.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = (this.p().enableSlidePlay())? 1: 2;
       ForwardFansSectionFragment$a b1 = ForwardFansSectionFragment.b1;
       GifshowActivity gifshowActiv = this.l();
       Objects.requireNonNull(b1);
       ForwardFansSectionFragment$a uoa = ForwardFansSectionFragment$a.class;
       if (PatchProxy.isSupport(uoa)) {
          uForwardFans = PatchProxy.applyTwoRefs(gifshowActiv, Integer.valueOf(i), b1, uoa, "1");
          if (uForwardFans != patchProxyRe) {
          label_006a :
             return uForwardFans;
          }
       }
       a.p(gifshowActiv, "activity");
       uForwardFans = new ForwardFansSectionFragment(objArray);
       uForwardFans.fi(gifshowActiv);
       uForwardFans.a1 = i;
       uForwardFans.u = 0x7f11017e;
       int i1 = (uForwardFans.ai())? 0x7f0d0495: 0x7f0d0494;
       uForwardFans.Xh().Xg(i1, new i0(uForwardFans, gifshowActiv, i));
       goto label_006a ;
    }
    public void s(k p0,ShareInitResponse$SharePanelElement p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "4")) {
          return;
       }
       a.p(p0, "ksShareConfiguration");
       a.p(p1, "panelElement");
       super.s(p0, p1);
       PhotoDetailParam mPhoto = this.p().mPhoto;
       a.o(mPhoto, "mParam.mPhoto");
       String photoId = mPhoto.getPhotoId();
       a.o(photoId, "mParam.mPhoto.photoId");
       a.f(photoId, p1);
       return;
    }
}
