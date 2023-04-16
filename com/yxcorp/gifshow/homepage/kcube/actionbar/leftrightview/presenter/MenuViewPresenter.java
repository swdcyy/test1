package com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.MenuViewPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.MenuViewPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import com.yxcorp.utility.Log;
import java.util.concurrent.TimeUnit;
import brd.t;
import brd.z;
import lrd.b;
import io.reactivex.android.schedulers.a;
import xsa.p;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import xsa.q;
import com.kwai.sdk.switchconfig.a;
import com.yxcorp.gifshow.homepage.kcube.actionbar.leftrightview.presenter.c;
import android.view.View$OnTouchListener;
import android.widget.ImageView;
import xsa.o;
import android.view.View$OnClickListener;
import androidx.lifecycle.Lifecycle;
import pr6.d;
import androidx.lifecycle.LifecycleObserver;
import android.view.View;
import com.yxcorp.gifshow.widget.IconifyImageButton;

public class MenuViewPresenter extends PresenterV2	// class@001703
{
    public d p;
    public IconifyImageButton q;
    public final LifecycleObserver r;

    public void MenuViewPresenter(){
       super();
       this.r = new MenuViewPresenter$1(this);
    }
    public void E8(){
       MenuViewPresenter menuViewPres = MenuViewPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, menuViewPres, "3")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, menuViewPres, "5")) {
          if (!QCurrentUser.ME.isLogined()) {
             Log.g("MenuViewPresenter", "not login, not set menu click listener.");
          }else {
             this.X7(t.timer(4000, TimeUnit.MILLISECONDS).subscribeOn(b.c()).observeOn(a.c()).subscribe(new p(this), Functions.d()));
             this.X7(q.p0(this.getActivity()).g.subscribe(new q(this)));
             if (a.t().d("mini_left_slide_panel_stategy", false)) {
                this.q.setOnTouchListener(c.b);
             }
             this.q.setOnClickListener(new o(this));
          }
       }
       this.p.getLifecycle().addObserver(this.r);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MenuViewPresenter.class, "4")) {
          return;
       }
       this.p.getLifecycle().removeObserver(this.r);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MenuViewPresenter.class, "2")) {
          return;
       }
       this.q = p0.findViewById(0x7f0a1716);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, MenuViewPresenter.class, "1")) {
          return;
       }
       this.p = this.q8(d.class);
       return;
    }
}
