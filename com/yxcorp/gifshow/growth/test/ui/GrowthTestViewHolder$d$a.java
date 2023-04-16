package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d$a;
import android.view.View$OnClickListener;
import android.view.View;
import zqa.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$h;
import msd.l;
import java.lang.Boolean;

public final class GrowthTestViewHolder$d$a implements View$OnClickListener	// class@001573
{
    public final View b;
    public final b c;

    public void GrowthTestViewHolder$d$a(View p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$d$a.class, "1")) {
          return;
       }
       int i = this.b.isSelected() ^ 0x01;
       this.b.setSelected(i);
       this.c.f(i);
       this.c.d().invoke(Boolean.valueOf(i));
       return;
    }
}
