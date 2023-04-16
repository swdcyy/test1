package hg0.b$c;
import erd.g;
import hg0.b;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import java.lang.StringBuilder;
import com.kuaishou.growth.taskcenter.model.TaskCommonParams;
import com.yxcorp.retrofit.model.KwaiException;
import wkd.b;
import fg0.l;
import eg0.a;

public final class b$c implements g	// class@002695
{
    public final b b;

    public void b$c(b p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       KwaiException kwaiExceptio;
       int i;
       if (PatchProxy.applyVoidOneRefs(p0, this, b$c.class, "1")) {
       }else {
          TaskCenterLogUtil b = TaskCenterLogUtil.b;
          TaskCenterLogUtil.a(b, "Task", "task "+this.b.f.getMTaskTypeId()+" | "+this.b.f.getMTaskToken()+" report error", null, false, 12, null);
          StringBuilder str = null;
          if (p0 instanceof KwaiException) {
             int errorCode = p0.getErrorCode();
             p0 = p0.mErrorMessage;
             TaskCenterLogUtil.a(b, "Task", "task report errorCode "+errorCode+", errorMsg "+p0, null, false, 12, null);
             if (errorCode == 0x1871a || errorCode == 0x1870f) {
                b.a(-1524711258).e2(this.b.f);
             }
             kwaiExceptio = p0;
             i = errorCode;
          }else {
             kwaiExceptio = str;
             i = 0;
          }
          b$c tb = this.b;
          a.a.b(tb, tb.d, i, kwaiExceptio, false);
          p0 = this.b;
          p0.d = p0.d + 1;
       }
       return;
    }
}
