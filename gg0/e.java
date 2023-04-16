package gg0.e;
import ok.h;
import java.lang.Object;
import com.kuaishou.android.model.mix.ExtMeta;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Long;

public final class e implements h	// class@0024d4
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public Object apply(Object p0){
       ExtMeta mVideoDurati;
       Long longx = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (longx != PatchProxyResult.class) {
       }else if(p0 != null){
          mVideoDurati = p0.mVideoDuration;
       }else {
          mVideoDurati = 0;
       }
       longx = Long.valueOf(mVideoDurati);
       return longx;
    }
}
