package com.yxcorp.gifshow.detail.article.widget.ArticleRecyclerViewScrollBar$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.article.widget.ArticleRecyclerViewScrollBar;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import lnc.a1;

public class ArticleRecyclerViewScrollBar$a extends RecyclerView$r	// class@00136c
{
    public final ArticleRecyclerViewScrollBar a;

    public void ArticleRecyclerViewScrollBar$a(ArticleRecyclerViewScrollBar p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(ArticleRecyclerViewScrollBar$a.class)) {
          PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, ArticleRecyclerViewScrollBar$a.class, "1");
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(ArticleRecyclerViewScrollBar$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ArticleRecyclerViewScrollBar$a.class, "2")) {
          return;
       }
       ArticleRecyclerViewScrollBar.a(this.a);
       p1 = 0;
       RecyclerView$ViewHolder viewHolder = p0.findViewHolderForAdapterPosition(p1);
       if (viewHolder == null) {
          this.a.setVerticalScrollBarEnabled(p1);
          ArticleRecyclerViewScrollBar$a ta = this.a;
          ta.b = null;
          ta.invalidate();
          return;
       }else {
          viewHolder = viewHolder.itemView;
          this.a.b = viewHolder;
          if (viewHolder.getBottom() < (p0.getHeight() - a1.e(50.00f))) {
             this.a.setVerticalScrollBarEnabled(p1);
          }else {
             this.a.setVerticalScrollBarEnabled(true);
          }
          this.a.invalidate();
          return;
       }
    }
}
