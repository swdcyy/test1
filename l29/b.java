package l29.b;
import a17.b$b;
import com.kuaishou.commercial.photoreduce.a$a;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import msd.a;
import java.lang.Object;
import a17.c;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;
import java.util.List;
import java.util.Objects;
import com.kwai.framework.model.feed.BaseFeed;

public final class b implements b$b	// class@002c7c
{
    public final a$a a;
    public final a$a b;
    public final QPhoto c;
    public final Activity d;
    public final a e;

    public void b(a$a p0,a$a p1,QPhoto p2,Activity p3,a p4){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       super();
    }
    public void a(c p0,View p1,int p2){
       DislikeHelper this;
       if (PatchProxy.isSupport2(b.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, p1, Integer.valueOf(p2), this, b.class, "1")) {
          return;
       }
       a.p(p0, "sheet");
       this = DislikeHelper.a;
       b tc = this.c;
       b td = this.d;
       b tb = this.b;
       Object obj = this.a.i.get(p2);
       a.o(obj, "it.negativeSubReason[position]");
       Objects.requireNonNull(this);
       if (!PatchProxy.applyVoidFourRefs(tc, td, tb, obj, this, DislikeHelper.class, "14")) {
          a.p(tc, "qPhoto");
          a.p(obj, "reason");
          if (tb != null) {
             DislikeHelper.k(tb, obj, tc);
          }
          if (obj.d == 1) {
             QPhoto mEntity = tc.mEntity;
             a.o(mEntity, "qPhoto.mEntity");
             DislikeHelper.m(obj, mEntity, td, 3);
          }else {
             DislikeHelper.b(tc);
          }
       }
       PatchProxy.onMethodExit(b.class, "1");
       return;
    }
}
