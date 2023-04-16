package com.yxcorp.gifshow.prettify.beauty.t$a;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import com.yxcorp.gifshow.prettify.beauty.t;
import com.yxcorp.gifshow.prettify.beauty.r$d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.beauty.r$c;
import android.widget.ImageView;

public class t$a implements PrettifyLoadingView$a	// class@00111e
{
    public final r$d a;
    public final t b;

    public void t$a(t p0,r$d p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, t$a.class, "1")) {
          return;
       }
       this.a.a.setVisibility(4);
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, t$a.class, "2")) {
          return;
       }
       this.a.a.setVisibility(0);
       return;
    }
}
