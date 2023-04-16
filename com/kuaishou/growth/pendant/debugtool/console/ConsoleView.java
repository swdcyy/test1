package com.kuaishou.growth.pendant.debugtool.console.ConsoleView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import ke0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.kuaishou.growth.pendant.debugtool.console.ConsoleAdapter;
import ke0.b;
import java.lang.Throwable;
import nsd.u;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.i;
import androidx.recyclerview.widget.RecyclerView$n;

public final class ConsoleView extends RecyclerView	// class@000657
{
    public ConsoleAdapter b;
    public List c;

    public void ConsoleView(Context p0){
       super(p0, null);
    }
    public void ConsoleView(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
    }
    public final void x(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConsoleView.class, "2")) {
          return;
       }
       a.p(p0, "data");
       ConsoleView tc = this.c;
       if (tc == null) {
          a.S("list");
       }
       tc.add(p0);
       tc = this.b;
       if (tc == null) {
          a.S("adapter");
       }
       ConsoleView tc1 = this.c;
       if (tc1 == null) {
          a.S("list");
       }
       tc.n0(tc1.indexOf(p0));
       ConsoleView tb = this.b;
       if (tb == null) {
          a.S("adapter");
       }
       this.scrollToPosition((tb.getItemCount() - 1));
       return;
    }
    public final void y(){
       if (PatchProxy.applyVoid(null, this, ConsoleView.class, "3")) {
          return;
       }
       ConsoleView tc = this.c;
       String str = "list";
       if (tc == null) {
          a.S(str);
       }
       tc.clear();
       tc = this.c;
       if (tc == null) {
          a.S(str);
       }
       a uoa = new a("clear", null, null, null, 14, null);
       tc.add(str);
       tc = this.b;
       if (tc == null) {
          a.S("adapter");
       }
       tc.k0();
       tc = this.b;
       if (tc == null) {
          a.S("adapter");
       }
       this.scrollToPosition((tc.getItemCount() - 1));
       return;
    }
    public final void z(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ConsoleView.class, "1")) {
          return;
       }
       a.p(p0, "list");
       this.c = p0;
       this.setLayoutManager(new LinearLayoutManager(this.getContext()));
       Context context = this.getContext();
       a.o(context, "context");
       ConsoleAdapter uConsoleAdap = new ConsoleAdapter(context, p0);
       this.b = uConsoleAdap;
       this.setAdapter(uConsoleAdap);
       this.addItemDecoration(new i(this.getContext(), 1));
       return;
    }
}
