package com.yxcorp.gifshow.detail.comment.limitcomment.k;
import erd.g;
import com.yxcorp.gifshow.detail.comment.limitcomment.j;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e17.i;
import com.kwai.library.widget.button.SlipSwitchButton$b;
import com.kwai.library.widget.button.SlipSwitchButton;

public class k implements g	// class@001384
{
    public final boolean b;
    public final j c;

    public void k(j p0,boolean p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "1")) {
       }else {
          i.a(R.style.arg_RES_7f110668, 0x7f1038e7);
          this.c.p.setOnSwitchChangeListener(null);
          this.c.p.setSwitch((this.b ^ 0x01));
          p0 = this.c;
          p0.p.setOnSwitchChangeListener(p0.s);
       }
       return;
    }
}
