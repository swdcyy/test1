package com.yxcorp.gifshow.relation.explore.presenter.gallery.h;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import com.yxcorp.gifshow.pymk.log.a;
import java.lang.String;
import java.lang.Class;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import iac.a0;
import java.lang.Runnable;
import android.view.ViewGroup;

public class h extends ItemExposedBehavior	// class@001844
{
    public static final String b;

    static {
       h.b = a.class.getSimpleName();
    }
    public void h(RecyclerView p0,RecyclerView$Adapter p1){
       super();
       if (p1.getItemCount()) {
          p0.post(new a0(this));
       }
       return;
    }
}
