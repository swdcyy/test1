package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$f;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder;
import android.view.View;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import nsd.u;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolderEnum;
import android.widget.TextView;
import android.widget.ImageView;
import zqa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zqa.b$j;
import java.lang.CharSequence;
import zqa.b$e;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$f$a;
import android.view.View$OnClickListener;

public final class GrowthTestViewHolder$f extends GrowthTestViewHolder	// class@001579
{
    public final GrowthTestViewHolderEnum a;
    public final TextView b;
    public final ImageView c;
    public l d;

    public void GrowthTestViewHolder$f(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.SubTitle;
       this.b = p0.findViewById(0x7f0a3de9);
       this.c = p0.findViewById(0x7f0a3da1);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$f.class, "1")) {
          return;
       }
       if (!p0 instanceof b$j) {
          return;
       }
       GrowthTestViewHolder$f tb = this.b;
       if (tb != null) {
          tb.setText(p0.c());
       }
       tb = this.c;
       if (tb != null) {
          int i = (p0.i())? 0x7f080dfe: 0x7f080e00;
          tb.setImageResource(i);
       }
       this.itemView.setOnClickListener(new GrowthTestViewHolder$f$a(this, p0));
       return;
    }
}
