package com.yxcorp.gifshow.homepage.krn.b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.homepage.krn.b$a;
import com.yxcorp.gifshow.homepage.krn.network.SchoolDanmakuResponse$DanmakuData;
import java.lang.CharSequence;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import hta.b;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.content.Context;
import android.view.LayoutInflater;
import ag6.a;

public class b extends RecyclerView$Adapter	// class@001767
{
    public int e;
    public final ArrayList f;

    public void b(List p0,int p1){
       super();
       this.e = 0;
       ArrayList uArrayList = new ArrayList();
       this.f = uArrayList;
       this.e = p1;
       if (p0 != null) {
          uArrayList.addAll(p0);
       }
       uArrayList.add(0, null);
       uArrayList.add(null);
       return;
    }
    public void B0(RecyclerView$ViewHolder p0){
       boolean b;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       ViewGroup$LayoutParams layoutParams = p0.itemView.getLayoutParams();
       if (layoutParams instanceof StaggeredGridLayoutManager$LayoutParams) {
          b = true;
          if (this.f0(p0.getLayoutPosition()) && this.f0(p0.getLayoutPosition()) != b) {
             b = false;
          }
          layoutParams.c(b);
       }
       return;
    }
    public int f0(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          return 0;
       }else if(p0 == (this.getItemCount() - 1)){
          return 1;
       }else {
          return 2;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          return;
       }
       if (this.f0(p1) == 2 && (p0 instanceof b$a && this.f.get(p1) != null)) {
          p0.a.setText(this.f.get(p1).content);
          if (this.f.get(p1).imgUrls != null) {
             p0.b.P(this.f.get(p1).imgUrls);
          }
          p0.a.setOnClickListener(new b(this, p1));
       }
    label_005e :
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 1;
       if (!p1 || p1 == i) {
          return new b$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d1338, p0, false), i);
       }else {
          return new b$a(a.c(LayoutInflater.from(p0.getContext()), 0x7f0d1339, p0, false), false);
       }
    }
}
