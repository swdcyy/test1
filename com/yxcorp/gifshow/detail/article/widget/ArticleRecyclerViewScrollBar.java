package com.yxcorp.gifshow.detail.article.widget.ArticleRecyclerViewScrollBar;
import android.view.View;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.detail.article.widget.ArticleRecyclerViewScrollBar$a;
import androidx.recyclerview.widget.RecyclerView$r;

public class ArticleRecyclerViewScrollBar extends View	// class@00136d
{
    public View b;

    public void ArticleRecyclerViewScrollBar(Context p0){
       super(p0);
    }
    public void ArticleRecyclerViewScrollBar(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public void ArticleRecyclerViewScrollBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
    }
    public static boolean a(ArticleRecyclerViewScrollBar p0){
       return p0.awakenScrollBars();
    }
    public int computeVerticalScrollExtent(){
       Object obj = PatchProxy.apply(null, this, ArticleRecyclerViewScrollBar.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getHeight();
    }
    public int computeVerticalScrollOffset(){
       ArticleRecyclerViewScrollBar obj = PatchProxy.apply(null, this, ArticleRecyclerViewScrollBar.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj == null) {
          return 0;
       }
       return (- obj.getTop());
    }
    public int computeVerticalScrollRange(){
       ArticleRecyclerViewScrollBar obj = PatchProxy.apply(null, this, ArticleRecyclerViewScrollBar.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.b;
       if (obj == null) {
          return 0;
       }
       return obj.getHeight();
    }
    public void setRecyclerView(RecyclerView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ArticleRecyclerViewScrollBar.class, "1")) {
          return;
       }
       p0.addOnScrollListener(new ArticleRecyclerViewScrollBar$a(this));
       return;
    }
}
