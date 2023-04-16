package f69.z;
import erd.g;
import f69.b0;
import java.lang.Object;
import java.lang.Boolean;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import qyb.a;
import com.yxcorp.gifshow.plugin.impl.setting.SettingPluginHelper;

public final class z implements g	// class@0022cb
{
    public final b0 b;

    public void z(b0 p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       SettingPluginHelper.b(this.b.c.getActivity(), null);
    }
}
