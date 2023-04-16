package dl9.s1;
import java.lang.Runnable;
import dl9.u1;
import java.lang.Object;
import yk9.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.QComment;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.e0;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;

public final class s1 implements Runnable	// class@001f9d
{
    public final u1 b;

    public void s1(u1 p0){
       this.b = p0;
    }
    public final void run(){
       s1 tb = this.b;
       u1 w = tb.w;
       if (w != null) {
          u1 v = tb.v;
          u1 a = tb.A;
          if (PatchProxy.applyVoidTwoRefs(v, a, w, d.class, "36") || (w.a != null && v != null)) {
             ClientContent$ContentPackage uContentPack = w.c(v, v.mReplyToCommentId, true);
             uContentPack.photoPackage = w.i();
             String str = (v.isSub())? "2": "1";
             if (w.b != null) {
                str = "slide_comment_like";
             }
             ClientEvent$ElementPackage uElementPack = w.f(v, 3, str, 320);
             w.a(uElementPack);
             u1.B(new ClickMetaData().setLogPage(a).setType(true).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(w.a.getFeedLogCtx()));
          }
       }
       return;
    }
}
