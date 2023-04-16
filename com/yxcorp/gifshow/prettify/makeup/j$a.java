package com.yxcorp.gifshow.prettify.makeup.j$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.prettify.makeup.j;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.prettify.v4.magic.filter.PrettifyConfigView;
import g9c.a;
import com.kwai.feature.post.api.componet.prettify.makeup.model.MakeupSuite;
import java.lang.CharSequence;
import android.text.TextUtils;

public final class j$a extends RecyclerView$r	// class@001186
{
    public boolean a;
    public final j b;

    public void j$a(j p0){
       this.b = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       j$a uoa = j$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (!p1) {
          this.a = false;
       }else if(p1 == 1){
          this.a = true;
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(j$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, j$a.class, "2")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (this.a == null) {
          return;
       }
       int firstItemVis = this.b.b.getFirstItemVisible();
       p1 = this.b.b.getLastItemVisible();
       if (firstItemVis >= 0 && p1 < this.b.c.getItemCount()) {
          MakeupSuite makeupSuite = ((p1 + 1) == this.b.c.getItemCount())? this.b.c.N0(p1): this.b.c.N0(firstItemVis);
          if (makeupSuite == null || makeupSuite.isDivider()) {
             firstItemVis++;
             makeupSuite = this.b.c.N0(firstItemVis);
          }
          String groupName = (makeupSuite != null)? makeupSuite.getGroupName(): null;
          if (TextUtils.isEmpty(groupName)) {
             return;
          }else {
             a.m(makeupSuite);
             String groupName1 = makeupSuite.getGroupName();
             a.o(groupName1, "config.groupName");
             this.b.b(makeupSuite.getGroupId(), groupName1);
          }
       }
       return;
    }
}
