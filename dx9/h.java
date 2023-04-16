package dx9.h;
import y8c.g;
import com.yxcorp.gifshow.detail.comment.limitcomment.d;
import dx9.h$a;
import a9c.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.component.feedstaggercard.PhotoItemViewParam$a;
import com.kwai.component.feedstaggercard.PhotoItemViewParam;
import android.view.ViewGroup;
import y8c.f;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.comment.limitcomment.l;
import ja5.g;
import ml8.c;

public class h extends g	// class@001fef
{
    public PhotoItemViewParam w;
    public final d x;

    public void h(d p0){
       super(new h$a());
       this.x = p0;
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
       }else {
          PhotoItemViewParam$a builder = PhotoItemViewParam.getBuilder(0, 0);
          builder.q(true);
          PhotoItemViewParam photoItemVie = builder.a();
          this.w = photoItemVie;
          this.n1("FEED_ITEM_VIEW_PARAM", photoItemVie);
          this.n1("COMMENT_LIMIT_CONTROLLER", p0);
       }
       return;
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oh, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new l());
       obj.U7(new g());
       return new f(a.i(p0, 0x7f0d0667), obj);
    }
}
