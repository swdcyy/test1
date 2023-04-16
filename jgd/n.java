package jgd.n;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import k2b.e0;
import java.lang.Boolean;
import sgd.b;
import com.yxcorp.plugin.setting.activity.AlbumSettingActivity;
import android.content.Intent;
import android.content.Context;

public class n extends m	// class@0016ea
{
    public final GifshowActivity c;
    public final String d;

    public void n(GifshowActivity p0,String p1){
       this.c = p0;
       this.d = p1;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n.class, "1")) {
          return;
       }
       b.e(this.c, this.d, null);
       n tc = this.c;
       if (!PatchProxy.applyVoidOneRefs(tc, null, AlbumSettingActivity.class, "2")) {
          tc.startActivity(new Intent(tc, AlbumSettingActivity.class));
       }
       return;
    }
}
