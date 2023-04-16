package com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter$supportFragmentManager$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.designercreation.preview.presenter.TemplatePreviewPresenter;
import androidx.fragment.app.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.util.Objects;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.a;

public final class TemplatePreviewPresenter$supportFragmentManager$2 extends Lambda implements a	// class@001319
{
    public final TemplatePreviewPresenter this$0;

    public void TemplatePreviewPresenter$supportFragmentManager$2(TemplatePreviewPresenter p0){
       this.this$0 = p0;
       super(0);
    }
    public final c invoke(){
       Activity obj = PatchProxy.apply(null, this, TemplatePreviewPresenter$supportFragmentManager$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.this$0.getActivity();
       Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       c supportFragm = obj.getSupportFragmentManager();
       a.o(supportFragm, "\(activity as FragmentAct¡­y\).supportFragmentManager");
       return supportFragm;
    }
    public Object invoke(){
       return this.invoke();
    }
}
