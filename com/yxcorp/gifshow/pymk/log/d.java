package com.yxcorp.gifshow.pymk.log.d;
import java.lang.Object;
import com.yxcorp.gifshow.pymk.log.d$a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.recyclerview.widget.RecyclerView;
import e7c.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class d	// class@0016c8
{
    public boolean a;
    public boolean b;
    public RecyclerView c;
    public BaseFragment d;
    public b e;
    public final ViewTreeObserver$OnGlobalLayoutListener f;
    public static final String g = "d";

    public void d(){
       super();
       this.a = false;
       this.b = false;
       this.f = new d$a(this);
    }
    public void a(BaseFragment p0,RecyclerView p1,b p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d.class, "1")) {
          return;
       }
       if (this.b != null) {
          return;
       }
       this.b = true;
       this.d = p0;
       this.c = p1;
       this.e = p2;
       p1.getViewTreeObserver().addOnGlobalLayoutListener(this.f);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, d.class, "4")) {
          return;
       }
       d tc = this.c;
       if (tc != null) {
          tc.getViewTreeObserver().removeOnGlobalLayoutListener(this.f);
       }
       return;
    }
}
