package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.Button;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zqa.b$a;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$a$a;
import android.view.View$OnClickListener;
import java.lang.CharSequence;

public final class GrowthTestViewHolder$a extends GrowthTestViewHolder	// class@00156d
{
    public final GrowthTestViewHolderEnum a;
    public Button b;

    public void GrowthTestViewHolder$a(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Action;
       this.b = p0.findViewById(0x7f0a3da5);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$a.class, "1")) {
          return;
       }
       if (!p0 instanceof b$a) {
          return;
       }
       GrowthTestViewHolder$a tb = this.b;
       if (tb != null) {
          tb.setOnClickListener(new GrowthTestViewHolder$a$a(p0));
       }
       tb = this.b;
       if (tb != null) {
          tb.setText(p0.c());
       }
       return;
    }
}
