package ly9.n;
import erd.g;
import ly9.q;
import java.lang.Object;
import hr7.a;
import java.util.Objects;
import ly9.g;
import my9.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.f3;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public final class n implements g	// class@002ec3
{
    public final q b;

    public void n(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.j != null) {
       }else {
          boolean b = true;
          p0.j = b;
          a h = p0.h;
          a b1 = p0.b;
          p0 = p0.a;
          g b2 = tb.c.b;
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(h, Integer.valueOf(b1), p0, b2, null, a.class, "1")) {
             ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
             uContentPack.photoPackage = w1.f(b2.mEntity);
             f3 uof3 = f3.l("2859459", "BARRAGE_POPUP");
             i3 oi3 = i3.f();
             oi3.c("type", Integer.valueOf(b1));
             oi3.d("marquee_id", p0);
             if (h == null || TextUtils.x(h.mTagText)) {
                b = false;
             }
             oi3.a("tag_judge", Boolean.valueOf(b));
             p0 = "";
             String str = (h == null)? p0: h.mTagText;
             oi3.d("tag_name", str);
             if (h != null) {
                p0 = h.mTageType;
             }
             oi3.d("tag_type", p0);
             uof3.m(oi3.e());
             uof3.b(uContentPack);
             uof3.g();
          }
       }
       return;
    }
}
