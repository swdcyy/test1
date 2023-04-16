package com.kwai.feature.component.searchhistory.d$c;
import com.kwai.feature.component.searchhistory.a$a;
import com.kwai.feature.component.searchhistory.d;
import com.kwai.feature.component.searchhistory.a;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import android.widget.ImageView;
import com.kwai.feature.component.searchhistory.SearchHistoryData;

public class d$c extends a$a	// class@0012a5
{
    public ImageView c;
    public final d d;

    public void d$c(d p0){
       this.d = p0;
       super(p0);
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$c.class, "1")) {
          return;
       }
       this.c = m1.f(p0, 0x7f0a129e);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d$c.class, "2")) {
          return;
       }
       if (this.a.mHeaderId == 1) {
          this.c.setImageResource(R.drawable.arg_RES_7f0824c9);
       }else {
          this.c.setImageResource(R.drawable.arg_RES_7f081e91);
       }
       return;
    }
}
