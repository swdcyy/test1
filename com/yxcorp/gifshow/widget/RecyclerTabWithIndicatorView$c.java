package com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$f;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.feature.post.api.widget.PostGroupWithIndicator;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.List;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$d;
import android.widget.TextView;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.RecyclerTabWithIndicatorView$e;
import android.view.View;
import com.yxcorp.gifshow.widget.e0;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import java.util.Objects;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.ViewGroup$LayoutParams;

public final class RecyclerTabWithIndicatorView$c extends RecyclerView$Adapter	// class@0018af
{
    public final RecyclerTabWithIndicatorView e;

    public void RecyclerTabWithIndicatorView$c(RecyclerTabWithIndicatorView p0){
       this.e = p0;
       super();
    }
    public void E0(RecyclerView$ViewHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RecyclerTabWithIndicatorView$c.class, "3")) {
       }else {
          a.p(p0, "holder");
          if (a.g(p0.itemView, this.e.o)) {
             this.e.setIndicatorVisible(8);
             p0.o = null;
          }
       }
       return;
    }
    public int f0(int p0){
       RecyclerTabWithIndicatorView$c uoc = RecyclerTabWithIndicatorView$c.class;
       if (PatchProxy.isSupport(uoc)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoc, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       return (this.e.s.get(p0).d()).length();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, RecyclerTabWithIndicatorView$c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.e.s.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       RecyclerView$ViewHolder itemView;
       RecyclerTabWithIndicatorView$c uoc = RecyclerTabWithIndicatorView$c.class;
       if (!PatchProxy.isSupport(uoc) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoc, "2")) {
          a.p(p0, "holder");
          p0.a().setText(this.e.s.get(p1).d());
          uoc = this.e;
          String str = "holder.itemView";
          boolean b = true;
          if (p1 == uoc.q) {
             uoc.x.a(p0.a(), b);
             itemView = p0.itemView;
             a.o(itemView, str);
             this.e.t(itemView, p1, false, false);
          }else {
             RecyclerTabWithIndicatorView x = uoc.x;
             TextView textView = p0.a();
             boolean b1 = (p1 == this.e.p)? true: false;
             x.a(textView, b1);
             uoc = this.e;
             if (p1 == uoc.p) {
                uoc.o = p0.itemView;
                uoc.setIndicatorVisible(false);
                uoc = this.e;
                itemView = p0.itemView;
                a.o(itemView, str);
                if (this.e.p == -1) {
                   b = false;
                }
                uoc.o(itemView, b);
             }
          }
          p0.itemView.setOnClickListener(new e0(this, p1, p0));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       RecyclerTabWithIndicatorView$f uof;
       FrameLayout uFrameLayout;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RecyclerTabWithIndicatorView$c uoc = RecyclerTabWithIndicatorView$c.class;
       String str = "1";
       if (PatchProxy.isSupport(uoc)) {
          uof = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoc, str);
          if (uof != patchProxyRe) {
          label_0085 :
             return uof;
          }
       }
       a.p(p0, "parent");
       RecyclerTabWithIndicatorView x = this.e.x;
       Objects.requireNonNull(x);
       RecyclerTabWithIndicatorView$e uoe = RecyclerTabWithIndicatorView$e.class;
       if (PatchProxy.isSupport(uoe)) {
          uFrameLayout = PatchProxy.applyOneRefs(Integer.valueOf(p1), x, uoe, str);
          if (uFrameLayout != patchProxyRe) {
          label_0082 :
             uof = new RecyclerTabWithIndicatorView$f(uFrameLayout);
             goto label_0085 ;
          }
       }
       uFrameLayout = new FrameLayout(x.a);
       TextView textView = new TextView(x.a);
       textView.setId(1);
       textView.setTextSize(0, (float)x.b);
       textView.setTextColor(x.d);
       textView.setSingleLine();
       textView.setGravity(17);
       textView.setLayoutParams(new ViewGroup$LayoutParams(x.f, x.g));
       if (p1 > 2) {
          textView.getLayoutParams().width = x.f + ((p1 - 2) * x.b);
       }
       uFrameLayout.addView(textView);
       goto label_0082 ;
    }
}
