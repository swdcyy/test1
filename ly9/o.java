package ly9.o;
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
import k2b.h;
import lnc.i3;
import java.lang.Number;
import com.kuaishou.android.model.mix.QComment$CommentMarqueeTag;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.Boolean;

public final class o implements g	// class@002ec4
{
    public final q b;

    public void o(q p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       Objects.requireNonNull(tb);
       a h = p0.h;
       a b = p0.b;
       a a = p0.a;
       g b1 = tb.c.b;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(h, Integer.valueOf(b), a, b1, null, a.class, "2")) {
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.photoPackage = w1.f(b1.mEntity);
          h oh = h.m("2859460", "BARRAGE_POPUP");
          i3 oi3 = i3.f();
          oi3.d("click_area", "tail");
          oi3.c("type", Integer.valueOf(b));
          oi3.d("marquee_id", a);
          boolean b2 = (h != null && !TextUtils.x(h.mTagText))? true: false;
          oi3.a("tag_judge", Boolean.valueOf(b2));
          String str = "";
          String str1 = (h == null)? str: h.mTagText;
          oi3.d("tag_name", str1);
          if (h != null) {
             str = h.mTageType;
          }
          oi3.d("tag_type", str);
          oh.n(oi3.e());
          oh.c(uContentPack);
          oh.h();
       }
       tb.a(p0);
       return;
    }
}
