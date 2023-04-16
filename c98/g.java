package c98.g;
import java.lang.Runnable;
import com.mini.guide.GuideMiniManagerImpl;
import c98.i;
import java.lang.Object;
import java.util.List;
import n88.a;
import zh8.g;
import n88.b;
import com.mini.runtime.HostEnvInfo;
import android.os.Bundle;
import com.mini.guide.model.NewGuideModel;
import java.lang.String;
import com.mini.pms.packagemanager.model.MiniAppInfo;
import android.os.Parcelable;
import w78.b;
import com.mini.channel.b;

public final class g implements Runnable	// class@0003ca
{
    public final GuideMiniManagerImpl b;
    public final i c;

    public void g(GuideMiniManagerImpl p0,i p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       g tb = this.b;
       g tc = this.c;
       if (tc != null) {
          tb.c.add(tc);
       }
       Bundle uBundle = new Bundle();
       NewGuideModel newGuideMode = new NewGuideModel(tb.mCF.i0().b5().b);
       MiniAppInfo j = tb.mCF.i0().M5().J;
       if (j != null) {
          newGuideMode.c = j.contains("favoritePage") ^ 0x01;
          newGuideMode.d = j.contains("shortcut") ^ 0x01;
          newGuideMode.e = j.contains("videoPublish") ^ 0x01;
       }
       uBundle.putParcelable("key_channel_param", newGuideMode);
       tb.mCF.i().getChannel().d("key_channel_new_feature_check", uBundle);
       return;
    }
}
