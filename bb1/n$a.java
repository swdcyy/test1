package bb1.n$a;
import erd.g;
import bb1.n;
import androidx.fragment.app.Fragment;
import java.lang.Object;
import com.kuaishou.live.common.core.component.admin.model.AssistantsResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.framework.model.user.UserExtraInfo;
import androidx.collection.SimpleArrayMap;

public class n$a implements g	// class@00033a
{
    public final Fragment b;
    public final n c;

    public void n$a(n p0,Fragment p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n$a.class, "1")) {
       }else if(!this.b.isAdded()){
          this.c.c.clear();
          this.c.d.clear();
          p0 = p0.getItems().iterator();
          while (p0.hasNext()) {
             UserInfo userInfo = p0.next();
             UserExtraInfo mPrivilege = userInfo.mExtraInfo.mPrivilege;
             if (mPrivilege != null) {
                this.c.e.put(userInfo.mId, mPrivilege);
             }
             if (userInfo.getAssistantType() == 1) {
                if (!this.c.d.contains(userInfo.mId)) {
                   this.c.d.add(userInfo.mId);
                }
             }else if(!this.c.c.contains(userInfo.mId)){
                this.c.c.add(userInfo.mId);
             }
          }
       }
       return;
    }
}
