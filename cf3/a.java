package cf3.a;
import java.lang.Object;
import com.kuaishou.live.locallife.model.LocalLifeLiveExplainMessage;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a	// class@0004fe
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public static final String a(LocalLifeLiveExplainMessage p0){
       String mBizId;
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          mBizId = p0.getMBizId();
          if (mBizId != null) {
          label_001b :
             return mBizId;
          }
       }
       mBizId = "";
       goto label_001b ;
    }
    public static final String b(LocalLifeLiveExplainMessage p0){
       String str;
       String obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = "";
       if (p0 != null) {
          int mSignalType = p0.getMSignalType();
          if (mSignalType != 1) {
             if (mSignalType == 2) {
                str = "2";
             }
          }else {
             str = "1";
          }
          obj = str;
       }
       return obj;
    }
    public static final boolean c(LocalLifeLiveExplainMessage p0){
       boolean b = (p0 != null)? true: false;
       return b;
    }
}
