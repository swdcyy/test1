package k99.a0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.atlas_detail.horizontal.presenter.HorizontalAtlasExpandPresenterV4;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import k99.w;
import mhc.l2;
import brd.a0;
import k99.x;
import erd.r;
import brd.m;
import k99.y;
import java.lang.Runnable;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import e17.i;

public final class a0 implements View$OnClickListener	// class@002b66
{
    public final HorizontalAtlasExpandPresenterV4 b;

    public void a0(HorizontalAtlasExpandPresenterV4 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       HorizontalAtlasExpandPresenterV4 horizontalAt = HorizontalAtlasExpandPresenterV4.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, a0.class, "1")) {
          return;
       }
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, tb, horizontalAt, "18")) {
          HorizontalAtlasExpandPresenterV4 p = tb.p;
          String str = "mPhoto";
          if (p == null) {
             a.S(str);
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "BUTTON_PACKAGE";
          i3 oi3 = i3.f();
          oi3.d("button_type", "DOWNLOAD");
          HorizontalAtlasExpandPresenterV4 p1 = tb.p;
          if (p1 == null) {
             a.S(str);
          }
          String str1 = (p1.isAllowPhotoDownload())? "AVAILABLE": "UNAVAILABLE";
          oi3.d("button_open_type", str1);
          uElementPack.params = oi3.e();
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(p.getEntity());
          u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack));
       }
       if (HorizontalAtlasExpandPresenterV4.P8(this.b).isAllowPhotoDownload()) {
          tb = this.b;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoid(objArray, tb, horizontalAt, "16")) {
             Activity activity = tb.getActivity();
             if (activity instanceof GifshowActivity) {
                objArray = activity;
             }
             if (objArray != null) {
                w ow = new w(tb, objArray);
                if (!PatchProxy.applyVoidOneRefs(ow, tb, horizontalAt, "17")) {
                   l2.a.a().t(x.b).y(new y(ow), Functions.d());
                }
             }
          }
       }else {
          a.o(i.a(R.style.arg_RES_7f11066a, 0x7f100ecc), "KSToast.applyStyle\(R.sty¡­eed_deny_download_prompt\)");
       }
       return;
    }
}
