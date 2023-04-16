package com.yxcorp.gifshow.comment.presenter.global.a$b$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.comment.presenter.global.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.comment.presenter.global.a;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.ViewTreeObserver;
import android.view.ViewGroup;
import com.yxcorp.gifshow.recycler.widget.CustomRecyclerView;
import g9c.d;

public class a$b$a implements ViewTreeObserver$OnGlobalLayoutListener	// class@0010eb
{
    public final a$b b;

    public void a$b$a(a$b p0){
       this.b = p0;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, a$b$a.class, "1")) {
          return;
       }
       this.b.b.p.h0().getViewTreeObserver().removeGlobalOnLayoutListener(this);
       if (this.b.b.p.h0() instanceof CustomRecyclerView) {
          this.b.b.p.h0().z(this.b.b.p.ia().b1(), 0);
       }
       return;
    }
}
