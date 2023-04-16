package bed.a;
import ded.f$b;
import bed.y;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.retrofit.model.KwaiException;
import e17.i;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public final class a implements f$b	// class@0003fe
{
    public final y a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;

    public void a(y p0,int p1,int p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final void a(QPhoto p0,Throwable p1){
       a ta = this.a;
       a tb = this.b;
       a tc = this.c;
       a td = this.d;
       a te = this.e;
       Objects.requireNonNull(ta);
       boolean b = false;
       if (p1 != null) {
          if (p1 instanceof KwaiException) {
             KwaiException mErrorCode = p1.mErrorCode;
             if (mErrorCode == 224 || mErrorCode == 403) {
                b = 1;
             }
             if (b) {
                i.a(R.style.arg_RES_7f11066a, 0x7f104333);
             }
          }
          ExceptionHandler.handleException(ta.a, p1);
       }else if(ta.a == null || tb != null){
          ta.h(tc, b, td, te);
       }
       return;
    }
}
