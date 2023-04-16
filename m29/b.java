package m29.b;
import mf5.w0;
import com.yxcorp.gifshow.entity.QPhoto;
import android.app.Activity;
import com.kuaishou.commercial.photoreduce.a$a;
import com.yxcorp.gifshow.ad.dislike.thanosdetail.DislikeViewModel;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import zf6.k;
import zf6.l;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kf5.g;
import com.yxcorp.gifshow.ad.dislike.DislikeHelper;

public final class b extends w0	// class@002de6
{
    public final QPhoto C;
    public final Activity D;
    public final a$a E;
    public final DislikeViewModel F;

    public void b(QPhoto p0,Activity p1,a$a p2,DislikeViewModel p3,String p4){
       String str1;
       a$a b;
       a.p(p0, "qPhoto");
       a.p(p2, "reasonModel");
       a.p(p4, "optionType");
       super(p4);
       this.C = p0;
       this.D = p1;
       this.E = p2;
       this.F = p3;
       String str = "";
       if (k.d()) {
          str1 = l.j(p2.f);
          a.o(str1, "DayNightUtil.getDarkImgUrl\(reasonModel.icon\)");
       }else {
          b = p2.f;
          if (b == null) {
             str1 = str;
          }
       }
       if (!PatchProxy.applyVoidOneRefs(str1, this, w0.class, "2")) {
          a.p(str1, "<set-?>");
          this.b = str1;
       }
       b = p2.b;
       if (b != null) {
          str = b;
       }
       this.U(str);
       boolean b1 = (p2.a != 18)? true: false;
       this.H(b1);
       return;
    }
    public void d(w0 p0,g p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "1")) {
          return;
       }
       a.p(p0, "item");
       a.p(p1, "panel");
       b tF = this.F;
       if (tF == null) {
          DislikeHelper.a.a(this.D, this.C, this.E);
       }else {
          tF.c(this.E);
       }
       p1.a();
       return;
    }
    public void onShow(){
    }
}
