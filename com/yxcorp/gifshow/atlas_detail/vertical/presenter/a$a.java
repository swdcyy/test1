package com.yxcorp.gifshow.atlas_detail.vertical.presenter.a$a;
import foc.r;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.a;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.yxcorp.gifshow.comment.fragment.CommentsFragment;
import uw9.b;
import g9c.d;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;

public class a$a implements r	// class@001bd9
{
    public final a a;

    public void a$a(a p0){
       this.a = p0;
       super();
    }
    public Rect a(){
       a$a obj = PatchProxy.apply(null, this, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       if (obj.x == null) {
          obj.x = new Rect();
       }
       return this.a.x;
    }
    public int getCurrentIndex(){
       Object obj = PatchProxy.apply(null, this, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       int i = this.a.r.b().ia().b1();
       LinearLayoutManager layoutManage = this.a.r.d().getLayoutManager();
       int i1 = layoutManage.h();
       if (i1 == -1) {
          i1 = layoutManage.i0();
       }
       if (i1 < i) {
          return i1;
       }else {
          return -1;
       }
    }
}
