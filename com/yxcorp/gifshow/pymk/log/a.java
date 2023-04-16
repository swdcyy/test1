package com.yxcorp.gifshow.pymk.log.a;
import com.kwai.component.list.exposed.behavior.ItemExposedBehavior;
import androidx.recyclerview.widget.RecyclerView;
import g7c.d;
import java.lang.Runnable;
import android.view.ViewGroup;

public class a extends ItemExposedBehavior	// class@0016c4
{
    public static final String b = "a";

    public void a(RecyclerView p0,boolean p1){
       super();
       if (!p1) {
          p0.post(new d(this));
       }
       return;
    }
}
