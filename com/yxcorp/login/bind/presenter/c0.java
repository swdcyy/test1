package com.yxcorp.login.bind.presenter.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e1d.n0;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;

public class c0 extends PresenterV2	// class@001a68
{
    public ImageView p;
    public BaseDialogFragment q;

    public void c0(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new n0(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c0.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0785);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c0.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
