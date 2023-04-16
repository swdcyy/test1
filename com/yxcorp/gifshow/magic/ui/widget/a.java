package com.yxcorp.gifshow.magic.ui.widget.a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import android.content.Context;
import java.util.ArrayList;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.magic.ui.widget.a$a;
import java.lang.Integer;
import java.lang.CharSequence;
import android.widget.TextView;
import p5b.c;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import i2b.a;

public abstract class a extends RecyclerView$Adapter	// class@001c55
{
    public Context e;
    public List f;

    public void a(Context p0){
       super();
       this.f = new ArrayList();
       this.e = p0;
    }
    public abstract int J0();
    public abstract void K0(String p0,int p1);
    public void L0(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       this.f = p0;
       this.k0();
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.f.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a uoa = a.class;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          p0.a.setText(this.f.get(p1));
          p0.itemView.setOnClickListener(new c(this, p1));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$a uoa1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          uoa1 = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (uoa1 != PatchProxyResult.class) {
          label_0029 :
             return uoa1;
          }
       }
       uoa1 = new a$a(a.d(this.e, this.J0(), p0, false));
       goto label_0029 ;
    }
}
