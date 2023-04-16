package a3d.a$a;
import com.kwai.feature.api.social.login.model.LoginParams;
import java.lang.Object;
import android.os.Bundle;
import java.lang.String;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class a$a	// class@000075
{
    public final Bundle a;

    public void a$a(LoginParams p0){
       super();
       Bundle uBundle = new Bundle();
       this.a = uBundle;
       if (p0 != null) {
          SerializableHook.putSerializable(uBundle, "KEY_LOGIN_PARAM", p0);
       }
       return;
    }
}
