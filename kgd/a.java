package kgd.a;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.plugin.setting.config.AboutUsEntryConfig;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import android.view.View;
import android.app.Activity;
import wkd.b;
import nf6.i;
import android.net.Uri;
import android.content.Context;
import android.content.Intent;

public class a implements c	// class@001777
{
    public final b a;
    public c b;
    public GifshowActivity c;
    public d d;
    public final AboutUsEntryConfig e;

    public void a(GifshowActivity p0,AboutUsEntryConfig p1){
       super();
       this.c = p0;
       b uob = new b();
       this.a = uob;
       this.e = p1;
       uob.c = p1.getName();
       uob.h = p1.mLinkUrl;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!TextUtils.x(this.e.getName()) && !TextUtils.x(this.e.mLinkUrl))? true: false;
       return b;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b == null) {
          obj = new PresenterV2();
          this.b = obj;
          obj.add(new a());
       }
       return this.b;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (!TextUtils.x(this.a.h)) {
          a tc = this.c;
          if (tc != null && !tc.isFinishing()) {
             this.c.startActivity(b.a(0x66dce92a).a(this.c, Uri.parse(this.a.h)));
          }
       }
       return;
    }
    public int y0(){
       return 0x7f0d14cc;
    }
}
