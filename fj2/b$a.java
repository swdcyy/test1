package fj2.b$a;
import k51.c;
import fj2.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.screencast.ScreencastDeviceInfo;
import java.lang.CharSequence;
import android.widget.TextView;
import wkd.b;
import com.kuaishou.screencast.c;
import com.yxcorp.utility.TextUtils;
import android.widget.ImageView;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import fj2.a;
import android.view.View$OnClickListener;
import ekd.m1;

public class b$a extends c	// class@002968
{
    public TextView p;
    public TextView q;
    public ImageView r;
    public ScreencastDeviceInfo s;
    public final b t;
    public static String sLivePresenterClassName = "LiveAudienceScreencastBrowserAdapter$LiveGzoneAudienceScreencastItemPresenter";

    public void b$a(b p0){
       this.t = p0;
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "3")) {
          return;
       }
       this.p.setText(this.s.mDeviceName);
       ScreencastDeviceInfo screencastDe = b.a(-1851168653).a();
       int i = 0;
       if (screencastDe != null && (!TextUtils.x(screencastDe.mDeviceName) && (screencastDe.mDeviceName).equals(this.s.mDeviceName))) {
          this.r.setVisibility(i);
       }else {
          this.r.setVisibility(8);
       }
       String str = a.a.getString(b.d("user")+"lastUsedScreencastDeviceName", "");
       b.e0(LiveLogTag.LIVE_AUDIENCE_SCREENCAST, "LiveAudienceScreencastBrowserAdapter - onBind", "lastUsedDeviceName", str, "currentCastDeviceInfo", screencastDe, "mDeviceInfo.mDeviceName", this.s.mDeviceName);
       if (!TextUtils.x(this.s.mDeviceName) && (this.s.mDeviceName).equals(str)) {
          this.q.setVisibility(i);
       }else {
          this.q.setVisibility(8);
       }
       this.m8().setOnClickListener(new a(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a19d8);
       this.q = m1.f(p0, 0x7f0a19da);
       this.r = m1.f(p0, 0x7f0a19d7);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       this.s = this.q8(ScreencastDeviceInfo.class);
       return;
    }
}
