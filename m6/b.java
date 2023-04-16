package m6.b;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$InitResultListener;
import java.lang.String;
import android.os.ConditionVariable;
import java.lang.Object;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk$TokenResult;

public final class b implements APSecuritySdk$InitResultListener	// class@0025b5
{
    public final String[] a;
    public final ConditionVariable b;

    public void b(String[] p0,ConditionVariable p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void onResult(APSecuritySdk$TokenResult p0){
       if (p0 != null) {
          this.a[0] = p0.apdidToken;
       }
       this.b.open();
       return;
    }
}
