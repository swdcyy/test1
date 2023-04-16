package com.yxcorp.gifshow.follow.stagger.HomeFollowItemLayoutManager;
import com.yxcorp.gifshow.autoplay.widget.a;
import com.yxcorp.gifshow.listcomponent.layoutmanager.VirtualLayoutManager;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import com.yxcorp.gifshow.autoplay.widget.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;

public class HomeFollowItemLayoutManager extends VirtualLayoutManager implements a	// class@001146
{
    public a$a i1;
    public final List j1;

    public void HomeFollowItemLayoutManager(Context p0){
       super(p0);
       this.j1 = new CopyOnWriteArrayList();
    }
    public void C(a$a p0){
       this.i1 = p0;
    }
    public void K(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowItemLayoutManager.class, "1")) {
          return;
       }
       if (!this.j1.contains(p0)) {
          this.j1.add(p0);
       }
       return;
    }
    public void onLayoutCompleted(RecyclerView$y p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowItemLayoutManager.class, "3")) {
          return;
       }
       super.onLayoutCompleted(p0);
       HomeFollowItemLayoutManager ti1 = this.i1;
       if (ti1 != null) {
          ti1.a(p0);
       }
       Iterator iterator = this.j1.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void t(a$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowItemLayoutManager.class, "2")) {
          return;
       }
       if (this.j1.contains(p0)) {
          this.j1.remove(p0);
       }
       return;
    }
}
