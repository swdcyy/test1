package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$g$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import zqa.b;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.ImageView$ScaleType;
import vqa.k;
import java.lang.Boolean;
import pna.k;
import zqa.b$k;
import msd.l;
import qrd.l1;

public final class GrowthTestViewHolder$g$a implements View$OnClickListener	// class@00157a
{
    public final ImageView b;
    public final b c;

    public void GrowthTestViewHolder$g$a(ImageView p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$g$a.class, "1")) {
          return;
       }
       int i = this.b.isSelected() ^ 0x01;
       GrowthTestViewHolder$g$a tb = this.b;
       ImageView$ScaleType fIT_END = (i)? ImageView$ScaleType.FIT_END: ImageView$ScaleType.FIT_START;
       tb.setScaleType(fIT_END);
       k.b.c(this.c.b(), Boolean.valueOf(i));
       this.b.setSelected(i);
       b$k e = this.c.e;
       if (e != null) {
          e.invoke(Boolean.valueOf(i));
       }
       return;
    }
}
