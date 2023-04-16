package com.yxcorp.gifshow.prettify.makeup.c0;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import com.yxcorp.gifshow.prettify.makeup.b0;
import com.kwai.feature.post.api.componet.prettify.makeup.model.RecoSuiteGroup;
import com.yxcorp.gifshow.prettify.makeup.b0$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.makeup.a$b;
import android.widget.ImageView;
import com.yxcorp.gifshow.prettify.makeup.a;
import p0c.f;
import android.widget.TextView;

public class c0 implements PrettifyLoadingView$a	// class@001170
{
    public final RecoSuiteGroup a;
    public final b0$d b;
    public final b0 c;

    public void c0(b0 p0,RecoSuiteGroup p1,b0$d p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       if (this.a.getRecoIndex() < 0) {
          this.b.b.setVisibility(4);
          if (this.c.i.b()) {
             this.b.d.setVisibility(4);
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, c0.class, "2")) {
          return;
       }
       this.b.b.setVisibility(0);
       this.b.d.setVisibility(0);
       return;
    }
}
