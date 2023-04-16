package com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.v3.widget.ExpandFoldHelperView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.m;

public class ExpandFoldHelperView$a implements View$OnClickListener	// class@001643
{
    public final ExpandFoldHelperView b;

    public void ExpandFoldHelperView$a(ExpandFoldHelperView p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExpandFoldHelperView$a.class, "1")) {
          return;
       }
       this.b.r.a(p0);
       return;
    }
}
