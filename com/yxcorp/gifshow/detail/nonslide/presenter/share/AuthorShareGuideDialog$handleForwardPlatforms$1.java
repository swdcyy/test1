package com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$handleForwardPlatforms$1;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog;
import java.util.List;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import msd.a;
import yhc.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$handleForwardPlatforms$1$1;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import com.kwai.sharelib.a;
import com.yxcorp.gifshow.detail.nonslide.presenter.share.AuthorShareGuideDialog$a;
import mhc.o2;

public final class AuthorShareGuideDialog$handleForwardPlatforms$1 implements View$OnClickListener	// class@0015d6
{
    public final AuthorShareGuideDialog b;
    public final List c;

    public void AuthorShareGuideDialog$handleForwardPlatforms$1(AuthorShareGuideDialog p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AuthorShareGuideDialog$handleForwardPlatforms$1.class, "1")) {
          return;
       }
       this.b.c.invoke();
       a.a.c(this.b.c(), this.b.d(), null, new AuthorShareGuideDialog$handleForwardPlatforms$1$1(this)).c(o2.a(true, this.c.get(0).a()));
       return;
    }
}
