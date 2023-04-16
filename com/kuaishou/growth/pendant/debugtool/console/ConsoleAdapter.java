package com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.content.Context;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$cm$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$a;
import java.lang.Integer;
import ke0.a;
import java.util.Objects;
import android.view.View;
import android.widget.TextView;
import java.lang.CharSequence;
import ke0.b;
import android.graphics.Color;
import com.kuaishou.growth.pendant.debugtool.console.a;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ag6.a;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter$onCreateViewHolder$1;
import msd.l;

public final class ConsoleAdapter extends RecyclerView$Adapter	// class@000656
{
    public final p e;
    public final Context f;
    public final List g;

    public void ConsoleAdapter(Context p0,List p1){
       a.p(p0, "context");
       a.p(p1, "list");
       super();
       this.f = p0;
       this.g = p1;
       this.e = s.c(new ConsoleAdapter$cm$2(this));
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, ConsoleAdapter.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       ConsoleAdapter uConsoleAdap = ConsoleAdapter.class;
       if (!PatchProxy.isSupport(uConsoleAdap) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uConsoleAdap, "3")) {
          a.p(p0, "vh");
          a uoa = this.g.get(p1);
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoidOneRefs(uoa, p0, ConsoleAdapter$a.class, "1")) {
             a.p(uoa, "data");
             TextView textView = p0.a.findViewById(R.id.text);
             textView.setText(uoa.toString());
             textView.setTextColor(Color.parseColor(uoa.d.a));
             p0.a.setOnClickListener(new a(p0, uoa));
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       ConsoleAdapter$a uoa;
       ConsoleAdapter uConsoleAdap = ConsoleAdapter.class;
       if (PatchProxy.isSupport(uConsoleAdap)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uConsoleAdap, "2");
          if (uoa != PatchProxyResult.class) {
          label_003e :
             return uoa;
          }
       }
       a.p(p0, "vp");
       View view = a.c(LayoutInflater.from(p0.getContext()), R.layout.arg_RES_7f0d0214, null, false);
       a.o(view, "LayoutInflater.from\(vp.c¡­e_item_view, null, false\)");
       uoa = new ConsoleAdapter$a(view, new ConsoleAdapter$onCreateViewHolder$1(this));
       goto label_003e ;
    }
}
