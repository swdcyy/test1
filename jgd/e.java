package jgd.e;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import k2b.e0;
import java.lang.Boolean;
import sgd.b;
import com.yxcorp.plugin.setting.activity.UpdatesSettingPrivacyActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Intent;
import android.content.Context;

public final class e implements View$OnClickListener	// class@0016e1
{
    public final GifshowActivity b;

    public void e(GifshowActivity p0,String p1){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       b.e(tb, "NEWS_PRIVACY_BUTTON", null);
       if (PatchProxy.applyVoidOneRefs(tb, null, UpdatesSettingPrivacyActivity.class, "2")) {
       }else {
          tb.startActivity(new Intent(tb, UpdatesSettingPrivacyActivity.class));
       }
       return;
    }
}
