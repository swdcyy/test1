package kgd.f0;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import ra6.a;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ml8.c;
import ghc.a;
import android.view.View;
import com.yxcorp.plugin.setting.activity.LanguageSettingsActivity;
import android.content.Intent;
import android.content.Context;

public class f0 implements c	// class@00178b
{
    public GifshowActivity a;
    public b b;
    public c c;
    public d d;

    public void f0(GifshowActivity p0){
       super();
       this.a = p0;
       b uob = new b();
       this.b = uob;
       uob.c = p0.getString(0x7f1046e7);
       this.b.f = 0x7f081084;
       int i = a.d();
       if (i == 2) {
          this.b.d = p0.getString(0x7f1046e9);
       }else if(i == 3){
          this.b.d = p0.getString(0x7f1046e6);
       }else {
          this.b.d = p0.getString(0x7f1046e8);
       }
       return;
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.b;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, f0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       return true;
    }
    public c q(){
       Object obj = PatchProxy.apply(null, this, f0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.c == null) {
          this.c = new a();
       }
       return this.c;
    }
    public void r(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f0.class, "3")) {
          return;
       }
       f0 ta = this.a;
       if (ta != null && !ta.isFinishing()) {
          ta = this.a;
          if (!PatchProxy.applyVoidOneRefs(ta, null, LanguageSettingsActivity.class, "1")) {
             ta.startActivity(new Intent(ta, LanguageSettingsActivity.class));
          }
       }
       return;
    }
    public int y0(){
       return 0x7f0d14ca;
    }
}
