package com.yxcorp.gifshow.widget.banner.DotsIndicator$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.banner.DotsIndicator;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.banner.DotsIndicator$c;

public class DotsIndicator$a implements View$OnClickListener	// class@001934
{
    public final int b;
    public final DotsIndicator c;

    public void DotsIndicator$a(DotsIndicator p0,int p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DotsIndicator$a.class, "1")) {
          return;
       }
       DotsIndicator$a tc = this.c;
       if (tc.l != null) {
          DotsIndicator c = tc.c;
          if (c != null && (c.isValid() && this.b < this.c.c.b())) {
             this.c.c.c(this.b);
          }
       }
       return;
    }
}
