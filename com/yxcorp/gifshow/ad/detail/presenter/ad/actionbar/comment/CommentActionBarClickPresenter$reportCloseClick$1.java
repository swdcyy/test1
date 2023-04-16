package com.yxcorp.gifshow.ad.detail.presenter.ad.actionbar.comment.CommentActionBarClickPresenter$reportCloseClick$1;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper$AdLogParamAppender;
import java.lang.Object;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import vq4.d;

public final class CommentActionBarClickPresenter$reportCloseClick$1 implements AdDataWrapper$AdLogParamAppender	// class@001559
{
    public static final CommentActionBarClickPresenter$reportCloseClick$1 INSTANCE;

    static {
       CommentActionBarClickPresenter$reportCloseClick$1.INSTANCE = new CommentActionBarClickPresenter$reportCloseClick$1();
    }
    public void CommentActionBarClickPresenter$reportCloseClick$1(){
       super();
    }
    public final void appendAdLogParam(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CommentActionBarClickPresenter$reportCloseClick$1.class, "1")) {
          return;
       }
       a.p(p0, "clientAdLog");
       p0.c = 13;
       return;
    }
}
