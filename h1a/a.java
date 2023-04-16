package h1a.a;
import vo5.c;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.keyword.activity.BlockKeywordActivity;
import android.content.Intent;
import android.content.Context;

public class a implements c	// class@00253d
{

    public void a(){
       super();
    }
    public void PG(Activity p0){
       String str = "1";
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, str)) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, BlockKeywordActivity.class, str)) {
          p0.startActivity(new Intent(p0, BlockKeywordActivity.class));
       }
       return;
    }
    public boolean isAvailable(){
       return true;
    }
}
