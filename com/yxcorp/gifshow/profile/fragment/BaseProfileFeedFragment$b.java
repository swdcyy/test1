package com.yxcorp.gifshow.profile.fragment.BaseProfileFeedFragment$b;
import androidx.recyclerview.widget.RecyclerView$n;
import g9c.d;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class BaseProfileFeedFragment$b extends RecyclerView$n	// class@001304
{
    public d a;
    public final int b;
    public final int c;

    public void BaseProfileFeedFragment$b(int p0,int p1,d p2){
       super();
       this.c = p0;
       this.b = p1;
       this.a = p2;
    }
    public void c(Rect p0,View p1,RecyclerView p2,RecyclerView$y p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, BaseProfileFeedFragment$b.class, "1")) {
          return;
       }
       super.c(p0, p1, p2, p3);
       int childAdapter = p2.getChildAdapterPosition(p1);
       BaseProfileFeedFragment$b ta = this.a;
       if (ta != null && ta.e1(childAdapter)) {
          return;
       }
       ta = this.a;
       int i = (ta != null)? ta.b1(): 0;
       childAdapter = childAdapter - i;
       if (childAdapter < 0) {
          return;
       }else {
          ta = this.c;
          p0.bottom = ta / 2;
          BaseProfileFeedFragment$b tb = this.b;
          if (childAdapter >= tb) {
             p0.top = ta / 2;
          }
          p0.left = (!(childAdapter % tb))? 0: ta / 2;
          p0.right = ((childAdapter % tb) == (tb - 1))? 0: ta / 2;
          return;
       }
    }
}
