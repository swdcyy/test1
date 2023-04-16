package kgd.b;
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
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import ekd.w0;

public class b implements c	// class@00177b
{
    public final b a;
    public c b;
    public GifshowActivity c;
    public d d;
    public final AboutUsEntryConfig e;

    public void b(GifshowActivity p0,AboutUsEntryConfig p1){
       super();
       this.c = p0;
       b uob = new b();
       this.a = uob;
       this.e = p1;
       uob.c = p1.getName();
       uob.d = p1.mSubtitle;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (!TextUtils.x(this.e.getName()) && !TextUtils.x(this.e.mExtParam))? true: false;
       return b;
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, b.class, "1");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "4")) {
          return;
       }
       if (!TextUtils.x(this.e.mExtParam)) {
          b tc = this.c;
          if (tc != null && !tc.isFinishing()) {
             Intent intent = new Intent("android.intent.action.DIAL");
             intent.setData(w0.f("tel:"+this.e.mExtParam));
             this.c.startActivity(intent);
          }
       }
       return;
    }
    public int y0(){
       return 0x7f0d14cd;
    }
}
