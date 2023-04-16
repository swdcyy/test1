package kgd.y1;
import wgc.c;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Object;
import xgc.b;
import java.lang.String;
import android.app.Activity;
import wgc.b;
import wgc.a;
import wgc.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import lnc.t3;
import ml8.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ghc.a;
import android.view.View;
import android.content.Intent;
import java.lang.StringBuilder;
import o56.a;
import android.app.Application;
import android.net.Uri;
import ekd.w0;

public class y1 implements c	// class@0017c9
{
    public b a;
    public c b;
    public GifshowActivity c;
    public d d;

    public void y1(GifshowActivity p0){
       super();
       this.c = p0;
       b uob = new b();
       this.a = uob;
       uob.c = p0.getString(0x7f1040d7);
    }
    public void a(){
       b.a(this);
    }
    public a getModel(){
       return this.a;
    }
    public d h(){
       Object obj = PatchProxy.apply(null, this, y1.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.d == null) {
          this.d = new d();
       }
       return this.d;
    }
    public boolean isAvailable(){
       Object obj = PatchProxy.apply(null, this, y1.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return t3.a();
    }
    public c q(){
       PresenterV2 obj = PatchProxy.apply(null, this, y1.class, "1");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, y1.class, "4")) {
          return;
       }
       try{
          y1 tc = this.c;
          if (tc != null && !tc.isFinishing()) {
             this.c.startActivity(new Intent("android.intent.action.VIEW", w0.f("market://details?id="+a.B.getPackageName())));
          }
       label_003d :
          return;
       }catch(android.content.ActivityNotFoundException e0){
       }
    }
    public int y0(){
       return 0x7f0d14cc;
    }
}
