package b86.f$a;
import android.os.Handler;
import b86.f;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import b86.g$a;
import kotlin.Triple;
import b86.i;
import java.lang.Number;
import q76.a;
import z76.a;
import java.lang.StringBuilder;
import y76.b;
import u76.a;
import u76.a$a;
import b86.b;
import x76.a;
import y76.c;
import b86.e;
import b86.d;
import java.util.List;
import b86.g;
import java.util.Iterator;
import java.lang.Iterable;
import b86.c;

public final class f$a extends Handler	// class@00043a
{
    public final f a;

    public void f$a(f p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       String str1;
       int i;
       StringBuilder str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, str)) {
          return;
       }
       a.p(p0, "msg");
       f$a ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(p0, ta, f.class, str)) {
          Message what = p0.what;
          Objects.requireNonNull(g$a.b);
          switch (what){
              case 0xfffffffe:
                str1 = "MSG_CHECK_TERMINATE";
                break;
              case 0xffffffff:
                str1 = "MSG_TERMINATE";
                break;
              case 1:
                str1 = "MSG_POST_FEATURE";
                break;
              case 2:
                str1 = "MSG_PREPARE_CALL_ENGINE";
                break;
              case 3:
                str1 = "MSG_CALL_ENGINE";
                break;
              case 4:
                str1 = "MSG_POST_ASYNC_EVENT";
                break;
              case 5:
                str1 = "MSG_POST_EVENT_COMPLETE";
                break;
              case 6:
                str1 = "MSG_FEEDBACK";
                break;
              case 7:
                str1 = "MSG_SAVE_FEEDBACK_FEATURE";
                break;
              default:
             label_002d :
                str1 = "MSG_UNKNOWN";
          }
          String str2 = ", channelId = ";
          String str3 = "#handleMessage: code = ";
          if (what == 1) {
             Triple triple = i.i(p0);
             if (triple != null) {
                a uoa = triple.component2();
                a uoa1 = triple.component3();
                char c = ',';
                str = str3+str1+str2+triple.component1().intValue()+c+" featureType = ";
                str2 = (uoa != null)? uoa.c(): null;
                str = str+str2+c+" feature = ";
                str1 = (uoa != null)? uoa.b(): null;
                b.g(str+str1, false, 2, null);
                ta.d = ta.d + 1;
             }
          }else {
             Triple triple1 = i.i(p0);
             if (triple1 != null) {
                i = triple1.component1().intValue();
                triple1.component3();
                if (what == 2) {
                   b.a(str3+str1+str2+i+", numPostFeature = "+ta.d, false, 2, null);
                }else {
                   b.a(str3+str1+str2+i, false, 2, null);
                }
             }
          }
       }
       this.a.b(p0);
    label_01e6 :
       return;
    }
}
