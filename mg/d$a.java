package mg.d$a;
import r26.e;
import q46.r;
import java.lang.Object;
import r26.a;
import com.yxcorp.gifshow.postwork.PostStatus;
import mg.c;
import java.lang.Enum;
import e17.i;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class d$a implements e	// class@0025db
{
    public final r b;

    public void d$a(r p0){
       this.b = p0;
       super();
    }
    public void V4(float p0,a p1){
    }
    public void w9(PostStatus p0,a p1){
       if (p0 == null) {
       }else {
          int i = c.a[p0.ordinal()];
          if (i != 1) {
             if (i == 2) {
                this.b.c(this);
             }
          }else {
             this.b.c(this);
             a.o(i.a(R.style.arg_RES_7f110669, 0x7f104fae), "KSToast.applyStyle\(R.sty¡­ R.string.upload_success\)");
          }
       }
       return;
    }
}
