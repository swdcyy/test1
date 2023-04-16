package com.kuaishou.merchant.live.basic.widget.popmenu.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import com.kuaishou.merchant.live.basic.widget.popmenu.a$a;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.kuaishou.merchant.live.basic.widget.popmenu.b$a;
import java.lang.Integer;
import com.kuaishou.merchant.live.basic.widget.popmenu.a$b;
import java.util.Objects;
import com.kuaishou.merchant.live.basic.widget.popmenu.PopupMenuItemView;
import l24.b;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

public class b extends RecyclerView$Adapter	// class@0018da
{
    public a$a e;
    public List f;

    public void b(List p0,a$a p1){
       super();
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       this.e = p1;
       uArrayList.clear();
       this.f.addAll(p0);
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b uob = b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          a$b uob1 = this.f.get(p1);
          if (uob1 != null) {
             Objects.requireNonNull(p0);
             b$a uoa = b$a.class;
             if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(uob1, Integer.valueOf(p1), p0, uoa, "1")) {
                p0.itemView.setData(uob1);
                p0.itemView.setOnClickListener(new b(p0, p1, uob1));
                b e = p0.a.e;
                if (e != null) {
                   e.a(p1, uob1);
                }
             }
          }
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b$a uoa;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (uoa != PatchProxyResult.class) {
          label_0027 :
             return uoa;
          }
       }
       uoa = new b$a(this, new PopupMenuItemView(p0.getContext()));
       goto label_0027 ;
    }
}
