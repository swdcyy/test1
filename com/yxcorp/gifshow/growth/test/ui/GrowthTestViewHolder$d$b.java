package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d$b;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d;
import zqa.b;
import android.widget.TextView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zqa.b$h;
import android.text.TextPaint;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.Context;
import android.content.res.Resources;
import msd.l;
import java.lang.Boolean;

public final class GrowthTestViewHolder$d$b implements View$OnClickListener	// class@001574
{
    public final GrowthTestViewHolder$d b;
    public final b c;
    public final TextView d;

    public void GrowthTestViewHolder$d$b(GrowthTestViewHolder$d p0,b p1,TextView p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$d$b.class, "1")) {
          return;
       }
       int i = this.c.e() ^ 0x01;
       TextPaint paint = this.d.getPaint();
       a.o(paint, "content.paint");
       paint.setStrikeThruText(i);
       GrowthTestViewHolder$d$b td = this.d;
       RecyclerView$ViewHolder itemView = this.b.itemView;
       a.o(itemView, "itemView");
       Context context = itemView.getContext();
       a.o(context, "itemView.context");
       Resources resources = context.getResources();
       int i1 = (i)? 0x7f060ac4: 0x7f061f7d;
       td.setTextColor(resources.getColor(i1));
       this.c.f(i);
       this.c.d().invoke(Boolean.valueOf(i));
       return;
    }
}
