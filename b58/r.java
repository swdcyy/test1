package b58.r;
import io.reactivex.i;
import b58.w;
import b58.m;
import java.lang.Object;
import brd.c0;
import java.util.Objects;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Exception;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import java.io.File;
import b58.l;
import java.lang.Boolean;
import com.mini.host.download.MiniDownloadRequest;

public final class r implements i	// class@00030e
{
    public final w a;
    public final m b;

    public void r(w p0,m p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(c0 p0){
       r ta = this.a;
       r tb = this.b;
       Objects.requireNonNull(ta);
       m c = tb.c;
       m d = tb.d;
       if (TextUtils.isEmpty(c)) {
          p0.onError(new Exception(d+" 没有对应的url"));
       }else {
          m a = tb.a;
          if (TextUtils.isEmpty(a)) {
             p0.onError(new Exception(d+" 没有对应的so name"));
          }else {
             File uFile = ta.a.a();
             if (!uFile.exists()) {
                boolean b = uFile.mkdirs();
                Object[] objArray = new Object[]{uFile,Boolean.valueOf(b)};
                String.format("创建文件夹:%s, %s", objArray);
                if (!b) {
                   p0.onError(new Exception("创建目标文件夹失败:"+uFile));
                }
             }
             p0.onSuccess(new MiniDownloadRequest(c, uFile.getAbsolutePath(), a));
          }
       }
       return;
    }
}
