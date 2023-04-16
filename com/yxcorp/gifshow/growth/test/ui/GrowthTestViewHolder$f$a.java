package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$f$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$f;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$j;
import zqa.b$e;
import android.widget.ImageView;
import java.lang.Boolean;
import msd.l;
import qrd.l1;

public final class GrowthTestViewHolder$f$a implements View$OnClickListener	// class@001578
{
    public final GrowthTestViewHolder$f b;
    public final b c;

    public void GrowthTestViewHolder$f$a(GrowthTestViewHolder$f p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$f$a.class, "1")) {
          return;
       }
       GrowthTestViewHolder$f$a tc = this.c;
       GrowthTestViewHolder$f$a uof$a = tc;
       uof$a.k((tc.i() ^ 0x01));
       if (this.c.i() != this.c.i()) {
          GrowthTestViewHolder$f c = this.b.c;
          if (c != null) {
             int i = (this.c.i())? 0x7f080dfe: 0x7f080e00;
             c.setImageResource(i);
          }
          c = this.b.d;
          if (c != null) {
             c.invoke(Boolean.valueOf(this.c.i()));
          }
       }
       return;
    }
}
