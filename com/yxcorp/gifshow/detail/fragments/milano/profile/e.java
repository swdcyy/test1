package com.yxcorp.gifshow.detail.fragments.milano.profile.e;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView;

public class e implements SelfAdaptiveImageView$b	// class@001549
{
    public final f$a a;

    public void e(f$a p0){
       this.a = p0;
       super();
    }
    public void onFail(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.a.g.setVisibility(8);
       this.a.d();
       return;
    }
    public void onSuccess(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       e ta = this.a;
       ta.c(ta.b(false), this.a.a());
       return;
    }
}
