package com.yxcorp.plugin.search.result.widget.SearchResultLayoutManager;
import com.yxcorp.gifshow.autoplay.widget.a;
import androidx.recyclerview.widget.ItemDecorStaggeredLayoutManager;
import android.content.Context;
import android.util.AttributeSet;
import com.yxcorp.gifshow.autoplay.widget.a$a;
import ba9.b;
import androidx.recyclerview.widget.RecyclerView$y;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.graphics.Rect;

public class SearchResultLayoutManager extends ItemDecorStaggeredLayoutManager implements a	// class@000762
{
    public a$a c;

    public void SearchResultLayoutManager(int p0,int p1){
       super(p0, p1);
    }
    public void SearchResultLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
    }
    public void C(a$a p0){
       this.c = p0;
    }
    public void K(a$a p0){
       b.a(this, p0);
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SearchResultLayoutManager.class, "1")) {
          return;
       }
       super.onLayoutCompleted(p0);
       SearchResultLayoutManager tc = this.c;
       if (tc != null) {
          tc.a(p0);
       }
       return;
    }
    public boolean requestChildRectangleOnScreen(RecyclerView p0,View p1,Rect p2,boolean p3,boolean p4){
       return false;
    }
    public void t(a$a p0){
       b.b(this, p0);
    }
}
