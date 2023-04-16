package com.yxcorp.gifshow.reminder.widget.a$e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.reminder.widget.a$g;
import java.lang.Integer;
import com.yxcorp.gifshow.reminder.widget.a$f;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;

public final class a$e extends RecyclerView$Adapter	// class@001b01
{
    public final List e;

    public void a$e(List p0){
       super();
       this.e = p0;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$e uoe = a$e.class;
       if (!PatchProxy.isSupport(uoe) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "3")) {
          a$f uof = this.e.get(p1);
          p0.a.setImageResource(uof.a);
          p0.b.setText(uof.b);
          p0.itemView.setOnClickListener(uof.c);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$g og;
       a$e uoe = a$e.class;
       if (PatchProxy.isSupport(uoe)) {
          og = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "2");
          if (og != PatchProxyResult.class) {
          label_0025 :
             return og;
          }
       }
       og = new a$g(a.i(p0, 0x7f0d12ff));
       goto label_0025 ;
    }
}
