package c82.a;
import ok.o;
import java.lang.Object;
import java.lang.String;
import c82.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import java.util.List;

public final class a implements o	// class@0004ea
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, null, b.class, "3");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(!TextUtils.x(p0) && b.a.contains(Uri.parse(p0).getScheme())){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
}
