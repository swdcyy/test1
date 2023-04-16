package ogd.c;
import java.lang.Runnable;
import com.yxcorp.plugin.setting.fragment.PushSettingsListFragment;
import java.lang.Object;
import android.widget.ScrollView;

public final class c implements Runnable	// class@001f1b
{
    public final PushSettingsListFragment b;

    public void c(PushSettingsListFragment p0){
       this.b = p0;
    }
    public final void run(){
       this.b.t.fullScroll(130);
    }
}
