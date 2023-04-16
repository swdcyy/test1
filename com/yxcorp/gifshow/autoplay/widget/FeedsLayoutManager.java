package com.yxcorp.gifshow.autoplay.widget.FeedsLayoutManager;
import com.yxcorp.gifshow.autoplay.widget.a;
import com.kwai.library.widget.recyclerview.layoutmanager.NpaLinearLayoutManager;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import android.util.AttributeSet;
import com.yxcorp.gifshow.autoplay.widget.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

public class FeedsLayoutManager extends NpaLinearLayoutManager implements a	// class@001c43
{
    public a$a r;
    public final List s;

    public void FeedsLayoutManager(Context p0){
       super(p0);
       this.s = new CopyOnWriteArrayList();
    }
    public void FeedsLayoutManager(Context p0,int p1,boolean p2){
       super(p0, p1, p2);
       this.s = new CopyOnWriteArrayList();
    }
    public void FeedsLayoutManager(Context p0,AttributeSet p1,int p2,int p3){
       super(p0, p1, p2, p3);
       this.s = new CopyOnWriteArrayList();
    }
    public void C(a$a p0){
       this.r = p0;
    }
    public void K(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedsLayoutManager.class, "1")) {
          return;
       }
       if (!this.s.contains(p0)) {
          this.s.add(p0);
       }
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedsLayoutManager.class, "3")) {
          return;
       }
       super.onLayoutCompleted(p0);
       FeedsLayoutManager tr = this.r;
       if (tr != null) {
          tr.a(p0);
       }
       Iterator iterator = this.s.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void t(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FeedsLayoutManager.class, "2")) {
          return;
       }
       if (this.s.contains(p0)) {
          this.s.remove(p0);
       }
       return;
    }
}
