package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$b;
import java.lang.CharSequence;
import android.widget.TextView;

public final class GrowthTestViewHolder$b$a implements View$OnClickListener	// class@00156e
{
    public final GrowthTestViewHolder$b b;
    public final b c;

    public void GrowthTestViewHolder$b$a(GrowthTestViewHolder$b p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$b$a.class, "1")) {
          return;
       }
       GrowthTestViewHolder$b$a tc = this.c;
       tc.e = tc.e() ^ 0x01;
       GrowthTestViewHolder$b c = this.b.c;
       if (c != null) {
          String str = (this.c.e())? "收起": "展开";
          c.setText(str);
       }
       tc = this.b;
       GrowthTestViewHolder$b d = tc.d;
       if (d != null) {
          int i = (tc.e != null && this.c.e())? 0: 8;
          d.setVisibility(i);
       }
       return;
    }
}
