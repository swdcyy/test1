package com.yxcorp.plugin.setting.entries.holder.m0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.plugin.setting.startup.MessagePrivacySettingsDialogConfig;
import java.lang.String;
import java.lang.reflect.Type;
import xgc.b;
import android.app.Activity;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import oe6.b;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import com.yxcorp.plugin.setting.entries.holder.m0$a;
import android.view.View;

public class m0 implements c	// class@000876
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;
    public int e;
    public PublishSubject f;
    public final MessagePrivacySettingsDialogConfig g;

    public void m0(GifshowActivity p0){
       super();
       this.e = QCurrentUser.me().getMessagePrivacy();
       this.g = a.t().getValue("messagePrivacySettingsDialogCopy", MessagePrivacySettingsDialogConfig.class, new MessagePrivacySettingsDialogConfig());
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1034dd);
       p0.b = 0x7f08051c;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, m0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, m0.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return b.b();
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          obj = new PresenterV2();
          this.c = obj;
          obj.add(new a());
          this.c.add(new m0$a(this));
       }
       return this.c;
    }
    public void r(View p0){
       b.b(this, p0);
    }
    public int y0(){
       return 0x7f0d11ae;
    }
}
