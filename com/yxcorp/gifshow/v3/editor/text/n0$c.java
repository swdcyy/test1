package com.yxcorp.gifshow.v3.editor.text.n0$c;
import com.yxcorp.gifshow.widget.m;
import com.yxcorp.gifshow.v3.editor.text.n0;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rwc.j;
import com.yxcorp.gifshow.v3.widget.PictureSelectView$e;
import aw9.z;

public class n0$c extends m	// class@001476
{
    public final n0 c;

    public void n0$c(n0 p0){
       this.c = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, n0$c.class, "1")) {
          return;
       }
       if (this.c.C.getValue() != null) {
          this.c.C.getValue().a((int)this.c.v.g());
       }
       this.c.P8(false);
       return;
    }
}
