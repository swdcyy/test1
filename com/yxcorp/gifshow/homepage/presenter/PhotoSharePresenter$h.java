package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$h;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.String;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qm6.b$a;
import android.content.Context;
import qm6.b;
import android.app.Activity;

public final class PhotoSharePresenter$h implements g	// class@0017a4
{
    public final GifshowActivity b;
    public final String c;

    public void PhotoSharePresenter$h(GifshowActivity p0,String p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter$h.class, "1")) {
       }else {
          a.p(p0, "plugin");
          PhotoSharePresenter$h tb = this.b;
          b$a uoa = new b$a(tb, 0).M(this.c);
          uoa.L(0);
          p0.Um(tb, uoa.d0(true).f());
       }
       return;
    }
}
