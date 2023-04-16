package btb.f;
import oec.j;
import btb.e;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import android.net.Uri;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;

public class f extends j	// class@00046d
{
    public final NoticeBoxTextOnlyItem a;
    public final e b;

    public void f(e p0,NoticeBoxTextOnlyItem p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void f(Uri p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "1")) {
          return;
       }
       f ta = this.a;
       if (ta.mUnread != null) {
          ta.mUnread = false;
          ta.notifyChanged();
       }
       return;
    }
}
