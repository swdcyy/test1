package ac4.q;
import n3d.a;
import f55.g;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public final class q implements a	// class@000083
{
    public final g b;

    public void q(g p0){
       this.b = p0;
    }
    public final void onActivityCallback(int p0,int p1,Intent p2){
       q tb = this.b;
       if (p2 != null) {
          tb.onSuccess(SerializableHook.getSerializableExtra(p2, "KEY_CALLBACK_RESULT_JSON"));
       }else {
          tb.onSuccess(null);
       }
       return;
    }
}
