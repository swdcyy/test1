package lr1.b$a;
import androidx.lifecycle.Observer;
import lr1.b;
import java.lang.Object;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.basic.widget.LiveMultiVideoSceneAudioWidget;
import com.kwai.framework.model.user.UserInfo;

public final class b$a implements Observer	// class@00300a
{
    public final b b;

    public void b$a(b p0){
       this.b = p0;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
       }else if(p0 == null){
          this.b.V2().b(null);
       }else {
          this.b.V2().b(UserInfo.convertFromProto(p0));
       }
       return;
    }
}
