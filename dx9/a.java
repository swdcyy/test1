package dx9.a;
import vo5.e;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.comment.limitcomment.ProductCommentLimitActivity;
import android.content.Intent;
import android.content.Context;

public class a implements e	// class@001fe5
{

    public void a(){
       super();
    }
    public void AR(Activity p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, ProductCommentLimitActivity.class, str)) {
          p0.startActivity(new Intent(p0, ProductCommentLimitActivity.class));
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
