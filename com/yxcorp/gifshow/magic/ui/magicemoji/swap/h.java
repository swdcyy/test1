package com.yxcorp.gifshow.magic.ui.magicemoji.swap.h;
import erd.g;
import com.yxcorp.gifshow.magic.ui.magicemoji.swap.SwapPresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h implements g	// class@001c3f
{
    public final SwapPresenter b;

    public void h(SwapPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
       }else if(p0.booleanValue()){
          this.b.h9(false, 70);
       }
       return;
    }
}
