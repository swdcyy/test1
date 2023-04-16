package com.yxcorp.gifshow.notice.box.detail.widget.a$b;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.List;
import com.kwai.library.widget.popup.bubble.a$c;
import com.yxcorp.gifshow.notice.box.detail.widget.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.notice.box.detail.widget.a$c;
import java.lang.Integer;
import ctb.g;
import java.lang.CharSequence;
import android.widget.TextView;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import k07.h;
import gtb.a;
import android.view.View$OnClickListener;

public final class a$b extends RecyclerView$Adapter	// class@00217c
{
    public final List e;
    public final a$c f;

    public void a$b(List p0,a$c p1,a$a p2){
       super();
       this.e = p0;
       this.f = p1;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, a$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       a$b uob = a$b.class;
       if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "3")) {
          p0.a.setText(this.e.get(p1).mMenuName);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       a$c uoc;
       a$b uob = a$b.class;
       if (PatchProxy.isSupport(uob)) {
          uoc = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "2");
          if (uoc != PatchProxyResult.class) {
          }else {
          label_0019 :
             View view = a.i(p0, R.layout.arg_RES_7f0d10b0);
             uoc = new a$c(view);
             if (this.f.k0() != null) {
                view.setOnClickListener(new a(this, uoc));
             }
          }
       }else {
          goto label_0019 ;
       }
       return uoc;
    }
}
