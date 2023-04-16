package bp6.r;
import io.reactivex.g;
import com.kwai.imsdk.internal.o;
import com.kwai.imsdk.msg.KwaiMsg;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import iq6.f;
import iq6.d;
import iq6.m;
import brd.g;
import com.kwai.imsdk.internal.UploadFileMsg;
import java.lang.String;
import wp6.a;
import com.kwai.imsdk.internal.MultiFileMsg;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.io.File;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.kwai.imsdk.internal.UploadManager;
import uo6.c;
import mq6.r;
import iq6.e;
import nq6.s;
import com.kwai.imsdk.msg.state.SendMsgThrowable;
import java.lang.Throwable;

public final class r implements g	// class@00054a
{
    public final o b;
    public final KwaiMsg c;

    public void r(o p0,KwaiMsg p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       r or;
       String str1;
       KwaiMsg kwaiMsg;
       r tb = this.b;
       r tc = this.c;
       Objects.requireNonNull(tb);
       p0.onNext(new f(tc, new d()));
       boolean b = true;
       String str = null;
       if (!tc instanceof UploadFileMsg || a.c(tc.getUploadUri())) {
          if (tc instanceof MultiFileMsg) {
             or = tc;
             if (or != null) {
                Iterator iterator = or.getUploadFiles().values().iterator();
                str1 = null;
                while (iterator.hasNext()) {
                   File uFile = iterator.next();
                   if (uFile != null) {
                      str1 = a.c(uFile.getAbsolutePath());
                   }
                }
             }else {
                str1 = false;
             }
             if (!str1) {
             label_0059 :
                str = 1;
             }
          }
       }else {
          goto label_0059 ;
       }
       if (str) {
          or = tc;
          if (TextUtils.isEmpty(or.getUploadUri())) {
             or.preProcessBeforeUpload();
             if (or instanceof MultiFileMsg) {
                Iterator iterator1 = or.getUploadFiles().values().iterator();
                while (iterator1.hasNext()) {
                   UploadManager.c(iterator1.next());
                }
             }
          }
          kwaiMsg = tb.o(or, b);
       }else {
          kwaiMsg = tb.o(tc, b);
       }
       if (kwaiMsg != null) {
          if (c.c().f()) {
             r.d(tb.g).b(tc, tc.getTarget(), tc.getTargetType(), b);
          }
          p0.onNext(new f(kwaiMsg, new e()));
          p0.onComplete();
       }else {
          s.t(tb.g).Q(tc, -110, "insert message to db fail");
          p0.tryOnError(new SendMsgThrowable(-110, ""));
       }
       return;
    }
}
