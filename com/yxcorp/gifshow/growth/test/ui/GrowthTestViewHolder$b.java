package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b;
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
import zqa.b$b;
import android.text.Spanned;
import android.text.Html;
import java.lang.CharSequence;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$b$b;
import android.view.View$OnLongClickListener;

public final class GrowthTestViewHolder$b extends GrowthTestViewHolder	// class@001570
{
    public final GrowthTestViewHolderEnum a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public boolean e;

    public void GrowthTestViewHolder$b(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Content;
       this.b = p0.findViewById(0x7f0a3dd8);
       this.c = p0.findViewById(0x7f0a3ddc);
       this.d = p0.findViewById(0x7f0a3de8);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       String str;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$b.class, "1")) {
          return;
       }
       if (!p0 instanceof b$b) {
          return;
       }
       GrowthTestViewHolder$b tb = this.b;
       if (tb != null) {
          Spanned spanned = (p0.g != null)? Html.fromHtml(p0.c()): p0.c();
          tb.setText(spanned);
       }
       tb = this.d;
       if (tb != null) {
          b$b uob = p0;
          str = uob.d();
          if (uob.h != null) {
             str = Html.fromHtml(str);
          }
          tb.setText(str);
       }
       b$b uob1 = p0;
       str = uob1.d();
       int i = 1;
       int i1 = 0;
       int i2 = (str == null || !str.length())? 1: 0;
       i2 = i2 ^ i;
       this.e = i2;
       GrowthTestViewHolder$b tc = this.c;
       if (tc != null) {
          i2 = (i2)? 0: 8;
          tc.setVisibility(i2);
       }
       GrowthTestViewHolder$b tc1 = this.c;
       if (tc1 != null) {
          String str1 = (uob1.e())? "收起": "展开";
          tc1.setText(str1);
       }
       tc1 = this.d;
       if (tc1 != null) {
          if (this.e == null || !uob1.e()) {
             i1 = 8;
          }
          tc1.setVisibility(i1);
       }
       this.itemView.setOnClickListener(new GrowthTestViewHolder$b$a(this, p0));
       this.itemView.setOnLongClickListener(new GrowthTestViewHolder$b$b(this, p0));
       return;
    }
}
