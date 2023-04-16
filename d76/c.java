package d76.c;
import ub7.f;
import android.app.Application;
import java.lang.Object;
import com.kwai.framework.initmodule.AzerothInitModule;
import android.content.Context;
import com.yxcorp.utility.SystemUtil;
import java.lang.Boolean;

public final class c implements f	// class@001474
{
    public final Application a;

    public void c(Application p0){
       this.a = p0;
    }
    public final Object get(){
       return Boolean.valueOf(SystemUtil.L(this.a));
    }
}
