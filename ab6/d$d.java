package ab6.d$d;
import rjd.k;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import gud.a;
import java.lang.StringBuilder;
import ta6.r;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.app.Application;
import o56.a;
import iud.a;
import java.nio.charset.Charset;
import android.os.Build$VERSION;
import android.content.Context;
import com.yxcorp.gifshow.util.CPU;

public final class d$d implements k	// class@000066
{

    public void d$d(){
       super();
    }
    public String a(byte[] p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       String str = a.b(p0);
       a.o(str, "DigestUtils.md5Hex\(data\)");
       return str;
    }
    public String b(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sig1");
       a.p(p1, "path");
       p0 = r.b(p1+p0);
       a.o(p0, "Sig3.getSigWrapper\(path + sig1\)");
       return p0;
    }
    public String c(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, d$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "sig");
       a.p(p1, "tokenSalt");
       p0 = (TextUtils.x(p1))? null: a.e(p0+p1);
       return p0;
    }
    public String d(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "plainText");
       Charset f = a.f;
       a.o(f, "Charsets.UTF_8");
       byte[] bytes = p0.getBytes(f);
       a.o(bytes, "\(this as java.lang.String\).getBytes\(charset\)");
       bytes = CPU.getClock(a.b(), bytes, Build$VERSION.SDK_INT);
       if (bytes == null) {
          bytes = "";
       }
       return bytes;
    }
}
