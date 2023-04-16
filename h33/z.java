package h33.z;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import java.lang.Object;
import com.kwai.library.widget.button.SlipSwitchButton;
import oe6.e;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.String;
import oe6.g;

public final class z implements SlipSwitchButton$b	// class@002c37
{
    public static final z a;

    static {
       z.a = new z();
    }
    public void z(){
       super();
    }
    public final void a(SlipSwitchButton p0,boolean p1){
       SharedPreferences$Editor uEditor = e.a.edit();
       uEditor.putBoolean("hasAudienceOpenRobotSwitch", (p1 ^ 0x01));
       g.a(uEditor);
    }
}
