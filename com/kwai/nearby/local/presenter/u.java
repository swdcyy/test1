package com.kwai.nearby.local.presenter.u;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dd7.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.yxcorp.gifshow.entity.QPhoto;
import p5a.e;
import de5.a;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kwai.framework.player.core.b;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class u extends PresenterV2	// class@000fd6
{
    public String p;
    public PhotoDetailParam q;
    public a r;
    public SlidePlayViewModel s;
    public BaseFragment t;
    public QPhoto u;
    public String v;
    public boolean w;
    public final IMediaPlayer$OnInfoListener x;

    public void u(){
       super();
       this.p = "TRENDING_REQUEST_SOURCE";
       this.x = new o0(this);
    }
    public void E8(){
       boolean b;
       u ou = u.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ou, "2")) {
          return;
       }
       PhotoDetailParam obj = PatchProxy.apply(objArray, this, ou, "4");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          ou = this.v;
          b = (ou != null && !("nearby").equals(ou))? true: false;
       }
       if (b) {
          return;
       }else {
          obj = this.q.mPhoto;
          if (obj != null && (obj.isVideoType() || this.q.mPhoto.isImageType())) {
             this.r.getPlayer().addOnInfoListener(this.x);
          }
          this.s = SlidePlayViewModel.B0(this.t.getParentFragment());
          return;
       }
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, u.class, "3")) {
          return;
       }
       if (TextUtils.isEmpty(this.v)) {
          return;
       }
       PhotoDetailParam mPhoto = this.q.mPhoto;
       if (mPhoto != null && (mPhoto.isVideoType() || this.q.mPhoto.isImageType())) {
          this.r.getPlayer().removeOnInfoListener(this.x);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, u.class, "1")) {
          return;
       }
       this.q = this.q8(PhotoDetailParam.class);
       this.r = this.q8(a.class);
       this.t = this.r8("DETAIL_FRAGMENT");
       this.v = this.t8(this.p);
       this.u = this.q8(QPhoto.class);
       return;
    }
}
