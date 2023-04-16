package com.yxcorp.gifshow.prettify.makeup.a$a;
import l16.b;
import com.yxcorp.gifshow.prettify.makeup.a;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ProgressBar;
import android.widget.ImageView;
import java.lang.Float;

public class a$a implements b	// class@001162
{
    public final a$b a;
    public final b b;
    public final a c;

    public void a$a(a p0,a$b p1,b p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onComplete(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "2")) {
          return;
       }
       this.a.f.setVisibility(8);
       a$a tb = this.b;
       if (tb != null) {
          tb.onComplete();
       }
       return;
    }
    public void onError(){
       if (PatchProxy.applyVoid(null, this, a$a.class, "3")) {
          return;
       }
       this.a.f.setVisibility(8);
       this.a.e.setVisibility(0);
       a$a tb = this.b;
       if (tb != null) {
          tb.onError();
       }
       return;
    }
    public void onProgress(float p0){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "1")) {
          return;
       }
       a$b f = this.a.f;
       f.setProgress((int)((float)f.getMax() * p0));
       uoa = this.b;
       if (uoa != null) {
          uoa.onProgress(p0);
       }
       return;
    }
}
