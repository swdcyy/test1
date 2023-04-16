package com.yxcorp.gifshow.widget.PicturesContainer$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.widget.PicturesContainer;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class PicturesContainer$a implements View$OnClickListener	// class@001892
{
    public final PicturesContainer b;

    public void PicturesContainer$a(PicturesContainer p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PicturesContainer$a.class, "1")) {
          return;
       }
       PicturesContainer$a tb = this.b;
       PicturesContainer d = tb.d;
       if (d != null) {
          d.onClick(tb);
       }
       return;
    }
}
