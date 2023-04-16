package com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$g;
import erd.g;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$e;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.view.ViewTreeObserver$OnPreDrawListener;
import com.yxcorp.gifshow.share.widget.ForwardPicSectionFragment$c;

public final class ForwardPicSectionFragment$g implements g	// class@001cf3
{
    public final ForwardPicSectionFragment$e b;
    public final ForwardPicSectionFragment c;

    public void ForwardPicSectionFragment$g(ForwardPicSectionFragment$e p0,ForwardPicSectionFragment p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, ForwardPicSectionFragment$g.class, "1")) {
       }else {
          ForwardPicSectionFragment.ii(this.c).getViewTreeObserver().addOnPreDrawListener(this.b);
          ForwardPicSectionFragment.ji(this.c).a(ForwardPicSectionFragment.ii(this.c));
          PatchProxy.onMethodExit(ForwardPicSectionFragment$g.class, "1");
       }
       return;
    }
}
