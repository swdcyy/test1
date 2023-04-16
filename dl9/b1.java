package dl9.b1;
import android.view.View$OnClickListener;
import dl9.c1;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yk9.d;
import com.kuaishou.android.model.mix.QComment;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.android.model.mix.AttachmentInfo;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import k2b.f0;
import com.kuaishou.android.model.mix.ImageContent;
import com.kuaishou.android.model.mix.UrlInfo;
import com.yxcorp.gifshow.models.QMedia;
import com.yxcorp.gifshow.comment.g;

public final class b1 implements View$OnClickListener	// class@001f4a
{
    public final c1 b;

    public void b1(c1 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String id;
       String url;
       if (PatchProxy.applyVoidOneRefs(p0, this, b1.class, "1")) {
          return;
       }
       this.b.V8();
       b1 tb = this.b;
       c1 s = tb.s;
       if (s != null) {
          d uod = c1.R8(tb);
          QComment attachmentLi = c1.P8(this.b).attachmentList;
          if (attachmentLi != null) {
             AttachmentInfo uAttachmentI = CollectionsKt___CollectionsKt.m2(attachmentLi);
             if (uAttachmentI != null) {
                id = uAttachmentI.getId();
                if (id != null) {
                label_0035 :
                   uod.p(id, f0.a(s, this.b.getActivity()), "add_to_album");
                }
             }
          }
          id = "";
          goto label_0035 ;
       }
       tb = this.b;
       s = tb.F;
       QComment attachmentLi1 = c1.P8(tb).attachmentList;
       QMedia qMedia = null;
       if (attachmentLi1 != null) {
          AttachmentInfo uAttachmentI1 = CollectionsKt___CollectionsKt.m2(attachmentLi1);
          if (uAttachmentI1 != null) {
             ImageContent content = uAttachmentI1.getContent();
             if (content != null) {
                List bigUrl = content.getBigUrl();
                if (bigUrl != null) {
                   UrlInfo urlInfo = CollectionsKt___CollectionsKt.m2(bigUrl);
                   if (urlInfo != null) {
                      url = urlInfo.getUrl();
                   label_0073 :
                      QComment mQMedia = c1.P8(this.b).mQMedia;
                      if (mQMedia != null) {
                         qMedia = mQMedia.path;
                      }
                      s.b(url, qMedia, this.b.getActivity());
                      return;
                   }
                }
             }
          }
       }
       url = qMedia;
       goto label_0073 ;
    }
}
