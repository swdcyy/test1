package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$j;
import erd.g;
import android.app.Activity;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import java.lang.Object;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qm6.b$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;
import qm6.b;

public final class PhotoSharePresenter$j implements g	// class@0017a7
{
    public final Activity b;
    public final PhotoSharePresenter c;

    public void PhotoSharePresenter$j(Activity p0,PhotoSharePresenter p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, PhotoSharePresenter$j.class, "1")) {
       }else {
          a.p(p0, "plugin");
          PhotoSharePresenter$j tb = this.b;
          b$a uoa = new b$a(this.c.getActivity(), 0).l(7);
          PhotoSharePresenter p = this.c.P;
          if (p == null) {
             p = "";
          }
          p0.Um(tb, uoa.h0(p).f());
          PatchProxy.onMethodExit(PhotoSharePresenter$j.class, "1");
       }
       return;
    }
}
