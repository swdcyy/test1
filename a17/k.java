package a17.k;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import a17.c$a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import a17.l;
import a17.g;
import android.view.View;
import android.widget.TextView;
import android.content.Context;
import a17.i;
import a17.m;
import j17.a;
import j17.b;
import java.lang.CharSequence;
import a17.c;
import a17.b$c;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import ag6.a;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.Drawable;
import a17.j;
import android.view.View$OnClickListener;

public final class k extends RecyclerView$Adapter	// class@00001a
{
    public final c$a e;

    public void k(c$a p0){
       a.p(p0, "mBuilder");
       super();
       this.e = p0;
    }
    public final c$a J0(){
       return this.e;
    }
    public int getItemCount(){
       return this.e.N.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       g og;
       a.p(p0, "holder");
       int itemCount = this.getItemCount();
       if (p1 < 0) {
       }else if(itemCount > p1){
          og = this.e.N.get(p1);
       label_001c :
          if (og != null) {
             TextView textView = p0.itemView.findViewById(R.id.item);
             a.o(textView, "textView");
             Context context = textView.getContext();
             a.o(context, "textView.context");
             textView.setTextColor(a.a(context, og.a().getItemTextColor(this.e.T)));
             c$a t = this.e.T;
             if (t != null) {
                b.a(t.q, textView);
             }
             textView.setText(og.b());
             RecyclerView$ViewHolder itemView = p0.itemView;
             a.o(itemView, "holder.itemView");
             itemView.setEnabled(og.a().isEnableClick());
             k te = this.e;
             c$a s = te.S;
             if (s != null) {
                c uoc = te.c0();
                a.o(uoc, "mBuilder.sheet");
                p0 = p0.itemView;
                a.o(p0, "holder.itemView");
                s.a(uoc, p0, p1);
             }
          }
          return;
       }
       og = null;
       goto label_001c ;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a.p(p0, "parent");
       View view = a.c(LayoutInflater.from(p0.getContext()), this.e.J, p0, false);
       a.o(view, "LayoutInflater.from\(pare¡­      parent, false\n    \)");
       c$a t = this.e.T;
       if (t != null) {
          Context context = view.getContext();
          a.o(context, "view.context");
          a.p(context, "context");
          StateListDrawable stateListDra = new StateListDrawable();
          int[] ointArray = new int[]{0x10100a7};
          stateListDra.addState(ointArray, new ColorDrawable(a.a(context, t.k)));
          ointArray = new int[false];
          stateListDra.addState(ointArray, new ColorDrawable(a.a(context, t.j)));
          view.setBackground(stateListDra);
       }
       l ol = new l(view);
       if (this.e.Q != null) {
          view.setOnClickListener(new j(this, ol));
       }
       return ol;
    }
}
