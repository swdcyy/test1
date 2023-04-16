package g4a.a;
import ok.h;
import com.yxcorp.gifshow.detail.plc.helper.ad.a;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.util.Objects;
import f4a.k;
import java.lang.Integer;

public final class a implements h	// class@0023a6
{
    public final a b;

    public void a(a p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       return Integer.valueOf(tb.b(p0.mSoFarBytes, p0.mTotalBytes, 0));
    }
}
