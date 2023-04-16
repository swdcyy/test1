package cl9.o;
import android.view.View$OnClickListener;
import cl9.y;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import yk9.d;
import com.yxcorp.gifshow.comment.utils.e;
import java.lang.CharSequence;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import k2b.u1;
import android.widget.TextView;

public final class o implements View$OnClickListener	// class@000652
{
    public final y b;

    public void o(y p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, y.class, "17")) {
       }else if(!tb.q.isAllowComment()){
          d uod = tb.F.d();
          if (uod != null && tb.A != null) {
             String str1 = tb.F.h().toString();
             y m = tb.M;
             d uod1 = d.class;
             if (!PatchProxy.isSupport(uod1) || !PatchProxy.applyVoidThreeRefs(str1, Integer.valueOf(2), m, uod, d.class, "25")) {
                i3 obj = null;
                if (!PatchProxy.isSupport(uod1) || (PatchProxy.applyVoidFourRefs(str1, Integer.valueOf(2), obj, m, uod, d.class, "26") || (uod.a != null && !TextUtils.x(str1)))) {
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.photoPackage = uod.i();
                   ClientEvent$ElementPackage uElementPack = uod.e(12, str1, 300);
                   uElementPack.index = 2;
                   obj = i3.f();
                   obj.d("tips_content", uod.l());
                   uElementPack.params = obj.e();
                   u1.B(new ClickMetaData().setType(1).setElementPackage(uElementPack).setContentPackage(uContentPack).setFeedLogCtx(uod.a.getFeedLogCtx()));
                }
             }
          }
       }
       y f = tb.F;
       String str = (tb.A.getHint() == null)? tb.P8(): tb.A.getHint().toString();
       f.C(str);
       return;
    }
}
