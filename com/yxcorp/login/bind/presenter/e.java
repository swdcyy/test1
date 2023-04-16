package com.yxcorp.login.bind.presenter.e;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import e1d.e;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;

public class e extends PresenterV2	// class@001a6e
{
    public ImageView p;
    public BaseDialogFragment q;

    public void e(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "3")) {
          return;
       }
       this.p.setOnClickListener(new e(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0785);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       return;
    }
}
