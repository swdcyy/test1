package com.yxcorp.gifshow.prettify.v4.magic.filter.z$b;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.yxcorp.gifshow.prettify.v4.magic.filter.z;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import o1c.o1;
import java.lang.Runnable;

public class z$b implements ViewTreeObserver$OnGlobalLayoutListener	// class@0011d8
{
    public final RecyclerView b;
    public final z c;

    public void z$b(z p0,RecyclerView p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onGlobalLayout(){
       if (PatchProxy.applyVoid(null, this, z$b.class, "1")) {
          return;
       }
       if (this.b.getWidth() && (this.b.getHeight() && this.b.getChildCount())) {
          this.b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
          this.b.postDelayed(new o1(this), 200);
       }
    label_0039 :
       return;
    }
}
