package cxb.a$a;
import axb.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.photo.download.model.StatModel;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.api.response.DownloadPhotoInfoResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.photo.download.image.ImageDownloadForSearchDialog;
import java.io.Serializable;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import com.kwai.robust.PatchProxyResult;
import cxb.a;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import com.yxcorp.gifshow.photo.download.widget.DownloadPicDialog;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import axb.a;

public class a$a implements b	// class@00208b
{
    public final BaseFeed a;
    public final GifshowActivity b;
    public final StatModel c;

    public void a$a(BaseFeed p0,GifshowActivity p1,StatModel p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(DownloadPhotoInfoResponse p0){
       a$a tb;
       DownloadPicDialog a;
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       if (TextUtils.n(r1.O1(this.a), "p20")) {
          tb = this.b;
          a$a ta = this.a;
          a$a tc = this.c;
          if (!PatchProxy.applyVoidFourRefsWithListener(tb, ta, tc, p0, null, ImageDownloadForSearchDialog.class, "1")) {
             ImageDownloadForSearchDialog imageDownloa = new ImageDownloadForSearchDialog();
             imageDownloa.lh("feed", ta);
             imageDownloa.lh("stat", tc);
             imageDownloa.lh("response", p0);
             imageDownloa.show(tb.getSupportFragmentManager(), "image_download");
             PatchProxy.onMethodExit(ImageDownloadForSearchDialog.class, "1");
          }
       }else {
          tb = this.a;
          a$a tb1 = this.b;
          Object obj = PatchProxy.applyThreeRefs(p0, tb, tb1, null, a.class, "5");
          if (obj != PatchProxyResult.class) {
          }else {
             obj = PatchProxy.applyThreeRefsWithListener(tb1, tb, p0, null, DownloadPicDialog.class, "1");
             if (obj != PatchProxyResult.class) {
             }else {
                obj = new DownloadPicDialog();
                obj.y = p0;
                obj.z = tb1;
                obj.x = tb;
                obj.A = r1.f2(tb);
                int len = r1.n0(tb).length;
                obj.C = len;
                a = obj.A;
                int i = 1;
                int i1 = (a != null)? 1: 2;
                obj.B = len + i1;
                if (a == null) {
                   i = 2;
                }
                obj.E = i;
                PatchProxy.onMethodExit(DownloadPicDialog.class, "1");
             }
          }
          obj.show(this.b.getSupportFragmentManager(), "download_pic");
       }
       return;
    }
    public void b(){
       a.b(this);
    }
}
