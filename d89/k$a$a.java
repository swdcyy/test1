package d89.k$a$a;
import du5.c;
import d89.k$a;
import java.lang.Object;
import java.util.HashMap;
import du5.b;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import d89.k;
import ajd.a;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.FormBody;
import okhttp3.MultipartBody;
import java.lang.CharSequence;
import android.text.TextUtils;
import io.reactivex.subjects.PublishSubject;
import java.lang.Integer;
import d89.j;
import java.lang.Runnable;
import ekd.k1;

public class k$a$a implements c	// class@00208d
{
    public final k$a a;

    public void k$a$a(k$a p0){
       this.a = p0;
       super();
    }
    public void c(HashMap p0){
       b.b(this, p0);
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, k$a$a.class, "1")) {
          return;
       }
       k b = this.a.e.b;
       Request request = b.request();
       String str = request.method();
       boolean b1 = ("GET").equals(str);
       boolean b2 = ("POST").equals(str);
       if (b1 || (b2 && (!request.body() instanceof FormBody && !request.body() instanceof MultipartBody))) {
          b.b("ztIdentityVerificationType", p0);
          b.b("ztIdentityVerificationCheckToken", p1);
       }
    label_0045 :
       b.a("ztIdentityVerificationType", p0);
       b.a("ztIdentityVerificationCheckToken", p1);
       if (!TextUtils.isEmpty(this.a.c)) {
          b.a("quickloginToken", this.a.c);
       }
       this.a.d.onNext(p1);
       this.a.d.onComplete();
       return;
    }
    public void onFailed(int p0){
       k$a$a uoa$a = k$a$a.class;
       if (PatchProxy.isSupport(uoa$a) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa$a, "2")) {
          return;
       }
       k1.o(new j(this.a.d, p0));
       return;
    }
}
