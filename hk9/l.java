package hk9.l;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.comment.common.b;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ek9.f;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;
import com.yxcorp.gifshow.comment.CommentParams;
import com.kuaishou.android.model.mix.QComment;
import ek9.t0;

public final class l implements View$OnClickListener	// class@0026a8
{
    public final b b;

    public void l(b p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       b b;
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, b.class, "11")) {
       }else {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GUIDE_COMMENT_BUTTON";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(tb.b.b.mEntity);
          u1.G("", 1, uElementPack, uContentPack);
       }
       b = tb.b;
       b.S.e(b.b, b.c.mComment);
       return;
    }
}
