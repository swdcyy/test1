package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.TextView;
import android.widget.EditText;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zqa.b$c;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$c$a;
import android.view.View$OnClickListener;
import msd.a;
import java.lang.CharSequence;

public final class GrowthTestViewHolder$c extends GrowthTestViewHolder	// class@001572
{
    public final GrowthTestViewHolderEnum a;
    public final TextView b;
    public final EditText c;
    public final View d;

    public void GrowthTestViewHolder$c(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Edit;
       this.b = p0.findViewById(0x7f0a3de9);
       this.c = p0.findViewById(0x7f0a3dd8);
       this.d = p0.findViewById(0x7f0a3de6);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$c.class, "1")) {
          return;
       }
       if (!p0 instanceof b$c) {
          return;
       }
       GrowthTestViewHolder$c td = this.d;
       if (td != null) {
          td.setOnClickListener(new GrowthTestViewHolder$c$a(this, p0));
       }
       td = this.c;
       if (td != null) {
          td.setText(p0.e.invoke());
       }
       td = this.b;
       if (td != null) {
          td.setText(p0.c());
       }
       return;
    }
}
