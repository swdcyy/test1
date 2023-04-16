package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$h;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.TextView;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;

public final class GrowthTestViewHolder$h extends GrowthTestViewHolder	// class@00157c
{
    public final GrowthTestViewHolderEnum a;
    public final TextView b;

    public void GrowthTestViewHolder$h(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Title;
       this.b = p0.findViewById(0x7f0a3de9);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$h.class, "1")) {
          return;
       }
       GrowthTestViewHolder$h tb = this.b;
       if (tb != null) {
          tb.setText(p0.c());
       }
       return;
    }
}
