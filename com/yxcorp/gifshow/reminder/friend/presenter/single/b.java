package com.yxcorp.gifshow.reminder.friend.presenter.single.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import brd.a0;
import java.util.concurrent.TimeUnit;
import t45.d;
import brd.z;
import ydc.f;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.view.View;
import ekd.m1;
import android.widget.ImageView;
import com.yxcorp.gifshow.reminder.friend.presenter.single.b$a;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class b extends PresenterV2	// class@001ad8
{
    public BaseFragment p;
    public ImageView q;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.X7(a0.B(Boolean.TRUE).l(100, TimeUnit.MILLISECONDS).G(d.a).R(new f(this), Functions.d()));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       ImageView imageView = m1.f(p0, R.id.more_actions);
       this.q = imageView;
       imageView.setVisibility(0);
       m1.a(p0, new b$a(this), R.id.more_actions);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
