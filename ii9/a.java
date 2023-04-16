package ii9.a;
import com.yxcorp.gifshow.camera.record.album.o;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import lnc.s6;
import android.view.View;
import com.yxcorp.gifshow.widget.PressedImageView;
import android.widget.TextView;
import pi9.e;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.camera.record.base.d;
import oc9.w;
import com.yxcorp.gifshow.camera.record.widget.AnimCameraView;
import com.yxcorp.gifshow.models.QMedia;
import ekd.k1;
import sb9.l0;
import j8c.a;
import q87.c;
import tkd.b;
import tkd.d;
import v26.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.model.RectInfo;
import android.graphics.RectF;
import android.graphics.Rect;
import hi9.d;
import v26.b;
import com.yxcorp.utility.AbiUtil;
import qi9.b;
import com.yxcorp.gifshow.c0;
import com.yxcorp.gifshow.albumwrapper.filter.MiYouMediaSelectableFilter;
import android.content.Context;
import com.yxcorp.gifshow.util.PermissionUtils;
import java.lang.Runnable;
import g56.a;
import java.lang.Boolean;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import cw9.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.io.File;

public class a extends o	// class@00282e
{
    public AnimCameraView G;

    public void a(CameraPageType p0,b p1){
       super(p0, p1);
    }
    public int i2(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (s6.m())? 0: 3;
       return i;
    }
    public void k(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.k(p0);
       if (!s6.m()) {
          this.t2(this.q, false);
          e.c(this.q, this.r, p0.findViewById(R.id.button_album_tv));
       }
       n.Y(this.t, false, false);
       this.G = this.d.b().z7();
       return;
    }
    public int k2(){
       return 1;
    }
    public void l2(QMedia p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (k1.t((p0.mModified * 1000)) - 0x5265c00 > 0) {
          p0 = null;
       }
       super.l2(p0);
       return;
    }
    public boolean m2(){
       return true;
    }
    public void p2(l0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       a.D().w("WhatsUpAlbumController", "openAlbum", objArray);
       b uob = d.a(-1846373150);
       GifshowActivity gifshowActiv = this.d.a();
       String taskId = this.d.b().getTaskId();
       String str = (this.c == CameraPageType.WHATS_UP)? "SOCIAL_WHATS_UP_PICTURE": "SOCIAL_TIETIE_PICTURE";
       uob.G8(gifshowActiv, taskId, str, 0, new RectInfo(new RectF(n.B(this.G, i)), (float)d.c(), (float)d.c()), null);
       return;
    }
    public void r2(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       if (AbiUtil.b() && !b.a()) {
          Object[] objArray = new Object[0];
          a.D().w("WhatsUpAlbumController", "preloadAlbum", objArray);
          c0 uoc0 = new c0();
          uoc0.a = new MiYouMediaSelectableFilter(0x5265c00);
          if (PermissionUtils.a(this.e, "android.permission.WRITE_EXTERNAL_STORAGE")) {
             uoc0.g(4);
          }
          uoc0.e().run();
          a.c().d(uoc0.d());
       }
       return;
    }
    public void t2(PressedImageView p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uoa, "2")) {
          return;
       }
       if (p0 != null) {
          ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
          if (!p1) {
             p0.setImageDrawable(a1.f(R.drawable.arg_RES_7f081ca0));
          }
          int i = c.b(a.b().getResources(), R.dimen.arg_RES_7f071095);
          layoutParams.width = i;
          layoutParams.height = i;
          p0.setLayoutParams(layoutParams);
       }
       return;
    }
    public void v2(String p0){
    }
    public void y2(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       super.y2();
       if (!s6.m()) {
          int i = 0;
          if (TextUtils.x(this.z) || !new File(this.z).exists()) {
             this.r.setVisibility(i);
             i = c.b(a.b().getResources(), R.dimen.arg_RES_7f071094);
          }
          this.q.setPadding(i, i, i, i);
       }
       return;
    }
}
