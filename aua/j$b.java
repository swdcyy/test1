package aua.j$b;
import ub.a;
import aua.j;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dsa.e;
import java.lang.StringBuilder;
import q87.c;
import android.graphics.drawable.Animatable;
import bd.f;
import kotlin.jvm.internal.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.facebook.drawee.view.DraweeView;

public final class j$b extends a	// class@000312
{
    public final j b;

    public void j$b(j p0){
       this.b = p0;
       super();
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j$b.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       e.C().w("NormalBottomBarGeneralLabel", "showAvatarRightBottomFeedGeneralCoverLabelViewIfNeeded: authorRelationBigHeadTag load failed£¬exception£º "+String.valueOf(p1), objArray);
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, j$b.class, "1")) {
       }else {
          a.p(p0, "id");
          if (p1 != null && (p1.getWidth() > 0 && p1.getHeight() > 0)) {
             j$b tb = this.b;
             Objects.requireNonNull(tb);
             j oj = PatchProxy.apply(null, tb, j.class, "4");
             if (oj != PatchProxyResult.class) {
             }else {
                oj = tb.z;
                if (oj == null) {
                   a.S("mAvatarRightBottomFeedGeneralCoverLabelView");
                }
             }
             if (oj != null) {
                oj.setAspectRatio(((float)p1.getWidth() / (float)p1.getHeight()));
             }
          }
       }
       return;
    }
}
