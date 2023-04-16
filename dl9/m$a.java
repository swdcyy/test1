package dl9.m$a;
import tyc.s4$a;
import dl9.m;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CaptionSearchInfo;
import com.yxcorp.gifshow.entity.QPhoto;
import android.content.Context;
import androidx.fragment.app.Fragment;

public class m$a implements s4$a	// class@001f7a
{
    public final m a;

    public void m$a(m p0){
       this.a = p0;
       super();
    }
    public String a(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a.t.getCaptionSearchInfo().mCaptionSearchType == 2) {
          return "search_entrance_capcomm_keyword";
       }
       return "search_entrance_capcommtail_keyword";
    }
    public Context getContext(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.u.getContext();
    }
    public long getPlayDuration(){
       return -1;
    }
}
