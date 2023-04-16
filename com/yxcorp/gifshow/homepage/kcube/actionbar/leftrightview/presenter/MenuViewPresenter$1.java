package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.MenuViewPresenter$1;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.MenuViewPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import tkd.b;
import tkd.d;
import nl9.d;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;

public class MenuViewPresenter$1 implements LifecycleObserver	// class@001702
{
    public final MenuViewPresenter b;

    public void MenuViewPresenter$1(MenuViewPresenter p0){
       this.b = p0;
       super();
    }
    public void onHostResume(){
       if (PatchProxy.applyVoid(null, this, MenuViewPresenter$1.class, "1")) {
          return;
       }
       d.a(0x4bd38ddd).YN(this.b.getContext(), this.b.q);
       return;
    }
}
