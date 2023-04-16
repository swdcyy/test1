package f4a.t;
import ok.h;
import com.yxcorp.gifshow.detail.plc.helper.j;
import java.lang.Object;
import com.yxcorp.gifshow.commercial.model.APKDownloadTask;
import java.util.Objects;
import f4a.k;
import java.lang.Integer;

public final class t implements h	// class@0022b8
{
    public final j b;

    public void t(j p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       t tb = this.b;
       Objects.requireNonNull(tb);
       return Integer.valueOf(tb.b(p0.mSoFarBytes, p0.mTotalBytes, 0));
    }
}
