package f66.i;
import q87.c;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.SystemUtil;
import android.app.Application;
import o56.a;
import java.lang.StringBuilder;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;

public class i extends c	// class@0015db
{

    public void i(String p0,boolean p1){
       super(p0, p1);
    }
    public void B(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, i.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       this.u(p0, p1, objArray);
       if (SystemUtil.I()) {
          Toast.makeText(a.b(), p1.getMessage()+"Ïê¼ûlogcat", 0).show();
       }
       return;
    }
}
