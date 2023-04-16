package com.yxcorp.login.debuglogin.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.RelativeLayout;
import java.lang.CharSequence;
import com.yxcorp.gifshow.widget.KwaiActionBar;
import j1d.f;
import android.view.View$OnClickListener;
import android.view.View;
import ekd.m1;

public class g extends PresenterV2	// class@001ab3
{
    public KwaiActionBar p;

    public void g(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, g.class, "2")) {
          return;
       }
       this.p.setBackgroundResource(R.color.arg_RES_7f061c5e);
       this.p.e(R.drawable.arg_RES_7f08006e, -1, "ук╨е").h(new f(this));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3f6a);
       return;
    }
}
