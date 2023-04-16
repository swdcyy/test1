package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$f;
import erd.g;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;
import android.graphics.Bitmap;

public final class ForwardPicSectionFragment$f implements g	// class@001cf2
{
    public final ForwardPicSectionFragment b;

    public void ForwardPicSectionFragment$f(ForwardPicSectionFragment p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ForwardPicSectionFragment$f.class, "1")) {
       }else {
          ForwardPicSectionFragment.ji(this.b).getBitmap();
          PatchProxy.onMethodExit(ForwardPicSectionFragment$f.class, "1");
       }
       return;
    }
}
