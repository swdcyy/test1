package dl9.d1;
import com.yxcorp.gifshow.widget.m;
import dl9.c1;
import com.kuaishou.android.model.mix.AttachmentInfo;
import com.yxcorp.gifshow.models.QMedia;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import yk9.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import java.util.ArrayList;
import com.kuaishou.android.model.mix.ImageLayoutInfo;
import java.lang.Float;
import com.kuaishou.android.model.mix.ImageContent;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.mix.UrlInfo;
import android.graphics.Rect;
import com.yxcorp.gifshow.comment.image.model.ImagePreviewModel;
import android.content.Context;
import rk9.m$a;
import com.kuaishou.android.model.mix.QComment;
import rk9.m;
import com.yxcorp.gifshow.comment.image.ImageDetailActivity;

public final class d1 extends m	// class@001f56
{
    public final c1 c;
    public final AttachmentInfo d;
    public final QMedia e;

    public void d1(c1 p0,AttachmentInfo p1,QMedia p2){
       this.c = p0;
       this.d = p1;
       this.e = p2;
       super();
    }
    public void a(View p0){
       String id;
       float f1;
       String str2;
       String str3;
       m$a uoa;
       if (PatchProxy.applyVoidOneRefs(p0, this, d1.class, "1")) {
          return;
       }
       a.p(p0, "v");
       d1 tc = this.c;
       c1 s = tc.s;
       String str = "";
       if (s != null) {
          d uod = c1.R8(tc);
          d1 td = this.d;
          if (td != null) {
             id = td.getId();
             if (id != null) {
             label_0028 :
                e0 uoe0 = f0.a(s, this.c.getActivity());
                Objects.requireNonNull(uod);
                if (!PatchProxy.applyVoidTwoRefs(id, uoe0, uod, d.class, "84")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "COMMENT_AREA_PICTURE";
                   i3 oi3 = i3.f();
                   oi3.d("picture_id", id);
                   uElementPack.params = oi3.e();
                   u1.B(new ClickMetaData().setLogPage(uoe0).setType(1).setElementPackage(uElementPack).setFeedLogCtx(uod.a.getFeedLogCtx()));
                }
             }
          }
          id = str;
          goto label_0028 ;
       }
       ArrayList uArrayList = new ArrayList();
       d1 td1 = this.d;
       QMedia qMedia = null;
       ImageLayoutInfo layout = (td1 != null)? td1.getLayout(): qMedia;
       float f = 0;
       if (layout != null) {
          layout = this.d.getLayout();
          if (layout != null) {
             Float width = layout.getWidth();
             if (width != null) {
                f1 = width.floatValue();
             label_009e :
                ImageLayoutInfo layout1 = this.d.getLayout();
                if (layout1 != null) {
                   Float height = layout1.getHeight();
                   if (height != null) {
                      f = height.floatValue();
                   }
                }
                f = f1;
                f1 = f;
             }
          }
          uoa = 0;
          goto label_009e ;
       }else {
          QMedia qMedia1 = null;
       }
       d1 te = this.e;
       if (te != null) {
          f = (float)te.mWidth;
          f1 = (float)te.mHeight;
       }
       te = this.d;
       String id1 = (te != null)? te.getId(): qMedia;
       String str1 = a.C(id1, str);
       d1 td2 = this.d;
       if (td2 != null) {
          ImageContent content = td2.getContent();
          if (content != null) {
             List bigUrl = content.getBigUrl();
             if (bigUrl != null) {
                UrlInfo urlInfo = CollectionsKt___CollectionsKt.m2(bigUrl);
                if (urlInfo != null) {
                   str2 = urlInfo.getUrl();
                label_00ec :
                   td2 = this.d;
                   if (td2 != null) {
                      content = td2.getContent();
                      if (content != null) {
                         bigUrl = content.getSmallUrl();
                         if (bigUrl != null) {
                            urlInfo = CollectionsKt___CollectionsKt.m2(bigUrl);
                            if (urlInfo != null) {
                               str3 = urlInfo.getUrl();
                            label_010b :
                               td2 = this.e;
                               if (td2 != null) {
                                  qMedia = td2.path;
                               }
                               ImagePreviewModel imagePreview = ImagePreviewModel.b(str1, str2, str3, qMedia, new Rect(p0.getLeft(), p0.getTop(), p0.getRight(), p0.getBottom()), Float.valueOf(f), Float.valueOf(f1));
                               a.o(imagePreview, "previewModel");
                               uArrayList.add(imagePreview);
                               p0.getGlobalVisibleRect(imagePreview.g);
                               Context context = this.c.getContext();
                               if (context != null) {
                                  uoa = m$a.b();
                                  uoa.e(0);
                                  uoa.c(0);
                                  uoa.d(c1.P8(this.c).getId());
                                  c1 r = this.c.r;
                                  if (r == null) {
                                     a.S("mPhoto");
                                  }
                                  uoa.i(r.getPhotoId());
                                  ImageDetailActivity.A3(context, uoa.j(uArrayList).a());
                               }
                               return;
                            }
                         }
                      }
                   }
                   str3 = qMedia;
                   goto label_010b ;
                }
             }
          }
       }
       str2 = qMedia;
       goto label_00ec ;
    }
}
