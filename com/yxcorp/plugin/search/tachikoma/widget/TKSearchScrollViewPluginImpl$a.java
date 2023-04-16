package com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$a;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl;
import android.view.ViewGroup;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.Map;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.widget.FrameLayout$LayoutParams;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import com.tkruntime.v8.V8Object;
import tx4.y;
import com.tkruntime.v8.V8Function;
import android.content.Context;
import com.yxcorp.plugin.search.tachikoma.widget.TKSearchScrollViewPluginImpl$a$a;

public class TKSearchScrollViewPluginImpl$a extends RecyclerView$Adapter	// class@000774
{
    public final ViewGroup e;
    public final TKSearchScrollViewPluginImpl f;

    public void TKSearchScrollViewPluginImpl$a(TKSearchScrollViewPluginImpl p0,ViewGroup p1){
       this.f = p0;
       this.e = p1;
       super();
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, TKSearchScrollViewPluginImpl$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = (this.f.b.get(this.e) != null)? this.f.b.get(this.e).size(): 0;
       return i;
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       TKSearchScrollViewPluginImpl$a uoa = TKSearchScrollViewPluginImpl$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       p0 = p0.itemView;
       p0.removeAllViews();
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
       TKSearchScrollViewPluginImpl$a tf = this.f;
       TKSearchScrollViewPluginImpl e = (!p1)? tf.e: tf.f;
       layoutParams.leftMargin = e.get(this.e).intValue();
       int i = 1;
       e = (p1 == (this.f.b.get(this.e).size() - i))? this.f.e: this.f.f;
       layoutParams.rightMargin = e.get(this.e).intValue();
       View view = this.f.b.get(this.e).get(p1);
       ViewParent parent = view.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(view);
       }
       p0.addView(view, layoutParams);
       if (y.a(this.f.p.get(this.e))) {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(p1);
          this.f.p.get(this.e).call(null, objArray);
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       TKSearchScrollViewPluginImpl$a uoa = TKSearchScrollViewPluginImpl$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new TKSearchScrollViewPluginImpl$a$a(this, new FrameLayout(p0.getContext()));
    }
}
