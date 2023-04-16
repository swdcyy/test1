package com.yxcorp.gifshow.prettify.v4.magic.filter.h;
import com.kwai.feature.post.api.widget.PrettifyLoadingView$a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import o1c.w0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j$c;
import android.widget.ImageView;
import p0c.c;
import android.widget.TextView;

public class h implements PrettifyLoadingView$a	// class@0011be
{
    public final w0 a;
    public final j$e b;
    public final j c;

    public void h(j p0,w0 p1,j$e p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       if (this.a.h() < 0) {
          this.b.a.setVisibility(4);
          j m = this.c.m;
          if (m != null && m.a()) {
             this.b.d.setVisibility(4);
          }
       }
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       this.b.a.setVisibility(0);
       this.b.d.setVisibility(0);
       return;
    }
}
