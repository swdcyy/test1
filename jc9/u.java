package jc9.u;
import erd.g;
import jc9.b0;
import lc9.b;
import java.lang.Object;
import java.lang.Throwable;
import java.util.Objects;
import com.yxcorp.gifshow.magic.exception.UnSupportedMagicException;
import java.lang.Exception;
import w3b.l;
import com.yxcorp.gifshow.camera.record.autoapply.exception.AutoApplyException;
import java.lang.String;
import java.lang.CharSequence;
import e17.i;
import lnc.s6;
import com.yxcorp.gifshow.camera.record.autoapply.sample.SampleDownloadException;
import hc9.e;

public final class u implements g	// class@00294d
{
    public final b0 b;
    public final b c;
    public final Object d;

    public void u(b0 p0,b p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       u tb = this.b;
       u tc = this.c;
       u td = this.d;
       Objects.requireNonNull(tb);
       if (p0 instanceof UnSupportedMagicException) {
          l.o(p0);
          tb.d(0);
       }else if(p0 instanceof AutoApplyException){
          i.d(R.style.arg_RES_7f110668, p0.getToastText());
          tb.d(0);
       }else if(!s6.H()){
          i.d(R.style.arg_RES_7f110668, tc.a(td, 4, 0));
          tb.d(0);
       }else if(p0 instanceof SampleDownloadException){
          i.a(R.style.arg_RES_7f11066a, 0x7f104333);
          tb.d(0);
       }else {
          tb.e.d(4, td);
       }
       return;
    }
}
