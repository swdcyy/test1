package com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList;
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
import zqa.b$d;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.content.Context;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.CharSequence;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$a;
import android.view.View$OnClickListener;
import java.lang.StringBuilder;
import msd.a;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import qrd.l1;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$3;
import com.yxcorp.gifshow.growth.test.ui.GrowthTestViewHolder$EditList$onBind$4;

public final class GrowthTestViewHolder$EditList extends GrowthTestViewHolder	// class@001568
{
    public final GrowthTestViewHolderEnum a;
    public final TextView b;
    public final EditText c;
    public final TextView d;
    public final View e;
    public final TextView f;
    public final TextView g;
    public final TextView h;

    public void GrowthTestViewHolder$EditList(View p0){
       a.p(p0, "itemView");
       super(p0, null);
       this.a = GrowthTestViewHolderEnum.EditList;
       this.b = p0.findViewById(0x7f0a3de9);
       this.c = p0.findViewById(0x7f0a3dd8);
       this.d = p0.findViewById(0x7f0a3ddb);
       this.e = p0.findViewById(0x7f0a3de0);
       this.f = p0.findViewById(0x7f0a3de2);
       this.g = p0.findViewById(0x7f0a3ddf);
       this.h = p0.findViewById(0x7f0a3de1);
    }
    public GrowthTestViewHolderEnum a(){
       return this.a;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, GrowthTestViewHolder$EditList.class, "1")) {
          return;
       }
       if (!p0 instanceof b$d) {
          return;
       }
       RecyclerView$ViewHolder titemView = this.itemView;
       a.o(titemView, "itemView");
       Context context = titemView.getContext();
       if (!context instanceof GifshowActivity) {
          return;
       }
       GrowthTestViewHolder$EditList tb = this.b;
       if (tb != null) {
          tb.setText(p0.c());
       }
       tb = this.d;
       if (tb != null) {
          tb.setOnClickListener(new GrowthTestViewHolder$EditList$a(this, p0));
       }
       tb = this.e;
       if (tb != null) {
          tb.setVisibility(0);
       }
       tb = this.h;
       if (tb != null) {
          StringBuilder str = "";
          Iterator iterator = p0.e().invoke().entrySet().iterator();
          while (iterator.hasNext()) {
             Map$Entry uEntry = iterator.next();
             str = str+uEntry.getKey()+" = "+uEntry.getValue()+10;
          }
          tb.setText(str);
       }
       tb = this.f;
       if (tb != null) {
          tb.setOnClickListener(new GrowthTestViewHolder$EditList$onBind$3(this, p0, context));
       }
       tb = this.g;
       if (tb != null) {
          tb.setOnClickListener(new GrowthTestViewHolder$EditList$onBind$4(this, p0, context));
       }
       return;
    }
}
