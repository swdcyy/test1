package com.yxcorp.gifshow.widget.adpter.bottomSheet.d;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.widget.adpter.bottomSheet.f$d;

public class d implements View$OnClickListener	// class@0018f1
{
    public final f b;

    public void d(f p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "1")) {
          return;
       }
       f c = this.b.c;
       if (c != null) {
          c.A6();
       }
       return;
    }
}
