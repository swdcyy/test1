package dl9.a1;
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

public final class a1 implements View$OnClickListener	// class@001f46
{
    public final c1 b;

    public void a1(c1 p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       String id;
       if (PatchProxy.applyVoidOneRefs(p0, this, a1.class, "1")) {
          return;
       }
       a1 tb = this.b;
       c1 s = tb.s;
       if (s != null) {
          d uod = c1.R8(tb);
          QComment attachmentLi = c1.P8(this.b).attachmentList;
          if (attachmentLi != null) {
             AttachmentInfo uAttachmentI = CollectionsKt___CollectionsKt.m2(attachmentLi);
             if (uAttachmentI != null) {
                id = uAttachmentI.getId();
                if (id != null) {
                label_0030 :
                   uod.p(id, f0.a(s, this.b.getActivity()), "report");
                }
             }
          }
          id = "";
          goto label_0030 ;
       }
       this.b.Z8();
       return;
    }
}
