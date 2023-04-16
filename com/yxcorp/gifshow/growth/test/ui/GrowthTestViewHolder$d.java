package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d;
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
import zqa.b$h;
import java.lang.CharSequence;
import android.text.TextPaint;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.Context;
import android.content.res.Resources;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d$c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d$b;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$d$a;

public final class GrowthTestViewHolder$d extends GrowthTestViewHolder	// class@001576
{
    public final GrowthTestViewHolderEnum a;
    public TextView b;
    public View c;

    public void GrowthTestViewHolder$d(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.Select;
       this.b = p0.findViewById(0x7f0a3dd8);
       this.c = p0.findViewById(0x7f0a3da3);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       TextPaint paint;
       Context context;
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$d.class, "1")) {
          return;
       }
       if (!p0 instanceof b$h) {
          return;
       }
       GrowthTestViewHolder$d tb = this.b;
       if (tb != null) {
          GrowthTestViewHolder$d tc = this.c;
          if (tc != null) {
             tb.setText(p0.c());
             b$h oh = p0;
             b$h f = oh.f;
             int i = 0x7f061f7d;
             if (f != null) {
                if (f != 1) {
                   tc.setVisibility(8);
                   paint = tb.getPaint();
                   a.o(paint, "content.paint");
                   paint.setStrikeThruText(false);
                   paint = tb.getPaint();
                   a.o(paint, "content.paint");
                   paint.setFakeBoldText(false);
                   RecyclerView$ViewHolder titemView = this.itemView;
                   a.o(titemView, "itemView");
                   context = titemView.getContext();
                   a.o(context, "itemView.context");
                   tb.setTextColor(context.getResources().getColor(i));
                   this.itemView.setOnClickListener(GrowthTestViewHolder$d$c.b);
                }else {
                   tc.setVisibility(8);
                   TextPaint paint1 = tb.getPaint();
                   a.o(paint1, "content.paint");
                   paint1.setStrikeThruText(oh.e());
                   paint1 = tb.getPaint();
                   a.o(paint1, "content.paint");
                   paint1.setFakeBoldText(oh.e());
                   RecyclerView$ViewHolder titemView1 = this.itemView;
                   a.o(titemView1, "itemView");
                   Context context1 = titemView1.getContext();
                   a.o(context1, "itemView.context");
                   Resources resources = context1.getResources();
                   if (oh.e()) {
                      i = 0x7f060ac4;
                   }
                   tb.setTextColor(resources.getColor(i));
                   this.itemView.setOnClickListener(new GrowthTestViewHolder$d$b(this, p0, tb));
                }
             }else {
                tc.setVisibility(false);
                tc.setSelected(oh.e());
                TextPaint paint2 = tb.getPaint();
                a.o(paint2, "content.paint");
                paint2.setStrikeThruText(false);
                paint2 = tb.getPaint();
                a.o(paint2, "content.paint");
                paint2.setFakeBoldText(false);
                RecyclerView$ViewHolder titemView2 = this.itemView;
                a.o(titemView2, "itemView");
                Context context2 = titemView2.getContext();
                a.o(context2, "itemView.context");
                tb.setTextColor(context2.getResources().getColor(i));
                this.itemView.setOnClickListener(new GrowthTestViewHolder$d$a(tc, p0));
             }
          }
       }
       return;
    }
}
