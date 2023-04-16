package com.yxcorp.gifshow.prettify.v4.magic.filter.p$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.v4.magic.filter.p;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import com.yxcorp.gifshow.prettify.v4.magic.filter.j;
import o1c.w0;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import java.lang.CharSequence;
import android.text.TextUtils;

public class p$a extends RecyclerView$r	// class@0011cb
{
    public boolean a;
    public final p b;

    public void p$a(p p0){
       this.b = p0;
       super();
       this.a = false;
    }
    public void a(RecyclerView p0,int p1){
       if (!p1) {
          this.a = false;
       }else if(p1 == 1){
          this.a = true;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       w0 ow0;
       if (PatchProxy.isSupport(p$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, p$a.class, "1")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       int firstItemVis = this.b.b.getFirstItemVisible();
       if (firstItemVis < 0) {
          return;
       }
       p1 = this.b.b.getLastItemVisible();
       if (p1 == (this.b.a.getItemCount() - 1)) {
          ow0 = this.b.a.g1(p1);
       }else {
          w0 ow01 = this.b.a.g1(firstItemVis);
          if (ow01.a().isDivider()) {
             firstItemVis++;
             ow0 = this.b.a.g1(firstItemVis);
          }else {
             ow0 = ow01;
          }
       }
       if (TextUtils.isEmpty(ow0.b())) {
          return;
       }else {
          this.b.a(ow0.c(), ow0.b());
          return;
       }
    }
}
