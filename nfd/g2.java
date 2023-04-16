package nfd.g2;
import e9c.e;
import androidx.recyclerview.widget.RecyclerView;
import qvb.i;
import y8c.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import g9c.a;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import com.yxcorp.plugin.search.entity.SearchItem;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.plugin.search.entity.SearchItem$SearchItemType;
import java.lang.StringBuilder;
import uy5.b;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import x6d.e;
import cdd.f;

public class g2 extends e	// class@001dad
{
    public int d;
    public int e;
    public RecyclerView f;

    public void g2(RecyclerView p0){
       super(p0);
       this.d = 6;
       this.e = 6;
    }
    public void b(i p0,g p1,int p2){
       int this;
       boolean b;
       g2 og2 = g2.class;
       if (PatchProxy.isSupport(og2) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, g2.class, "1")) {
          return;
       }
       if (this.c() == null || (p1 != null && this.c().getLayoutManager() != null)) {
          RecyclerView$LayoutManager layoutManage = this.c().getLayoutManager();
          if (layoutManage.getChildCount() > 0 && this.a(p0)) {
             int itemCount = p1.getItemCount();
             layoutManage = layoutManage.getChildAt((layoutManage.getChildCount() - 1)).getLayoutParams().getViewAdapterPosition();
             int i = 0;
             this = 0;
             int i1 = 0;
             while (i < itemCount) {
                if (p1.N0(i) instanceof SearchItem) {
                   SearchItem searchItem = p1.N0(i);
                   Object obj = PatchProxy.applyOneRefs(searchItem, this, og2, "2");
                   if (obj != PatchProxyResult.class) {
                      b = obj.booleanValue();
                   }else if(searchItem != null && searchItem.mItemType.isSearch()){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (b) {
                      this++;
                   }else if(i < layoutManage){
                      i1 = i1 + 1;
                   }
                }
                i = i + 1;
             }
             b.k("realCount = "+this+"localCount = "+i1+"lastIndex = "+layoutManage);
             Activity uActivity = ActivityContext.g().e();
             b.k("curActivity = "+uActivity);
             og2 = (uActivity instanceof e || p1 instanceof f)? this.d: this.e;
             if ((((this - layoutManage) + i1) - 1) <= og2 && !p1.e1()) {
                p0.load();
             }
          }
       }
    label_00f4 :
       return;
    }
    public RecyclerView c(){
       e ta = this.a;
       if (ta != null) {
          return ta;
       }
       return this.f;
    }
}
