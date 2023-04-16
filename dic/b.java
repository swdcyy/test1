package dic.b;
import vo5.s;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.history.ShareHistoryActivity;
import android.content.Intent;

public class b implements s	// class@0021cd
{

    public void b(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public void ph(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, ShareHistoryActivity.class, "2")) {
          p0.startActivity(new Intent(p0, ShareHistoryActivity.class));
       }
       return;
    }
}
