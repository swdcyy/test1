package ced.g1;
import erd.g;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.model.response.SharePlatformDataResponse;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;

public final class g1 implements g	// class@000557
{
    public final OperationModel b;

    public void g1(OperationModel p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       g1 tb = this.b;
       if (p0.a() != null && !TextUtils.x(p0.a().mShareId)) {
          tb.C(TextUtils.c(tb.r(), "shareId", p0.a().mShareId));
       }
       return;
    }
}
