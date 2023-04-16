package com.yxcorp.gifshow.homepage.presenter.r;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.os.Handler;
import android.os.Looper;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.android.model.mix.CommonMeta;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.yxcorp.gifshow.homepage.presenter.r$a;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import yta.k1;
import java.lang.Runnable;
import yta.i1;
import android.view.View$OnClickListener;
import yta.j1;
import ekd.m1;

public class r extends PresenterV2	// class@0017d7
{
    public CommonMeta p;
    public User q;
    public ViewStub r;
    public View s;
    public View t;
    public View u;
    public TextView v;
    public TextView w;
    public Handler x;
    public b y;

    public void r(){
       super();
       this.x = new Handler(Looper.getMainLooper());
       this.y = null;
    }
    public void E8(){
       r tr;
       if (PatchProxy.applyVoid(null, this, r.class, "3")) {
          return;
       }
       if (TextUtils.n(this.q.getId(), QCurrentUser.ME.getId()) && this.p.mProductsNeedBoostFansTop != null) {
          tr = this.r;
          if (tr != null) {
             if (this.u == null) {
                View view = tr.inflate();
                this.u = view.findViewById(0x7f0a305d);
                this.v = view.findViewById(0x7f0a305c);
                this.t = this.u.findViewById(0x7f0a305b);
                this.w = this.u.findViewById(0x7f0a305e);
             }
             this.y = new r$a(this);
             a.b().registerActivityLifecycleCallbacks(this.y);
             this.x.post(new k1(this));
             this.t.setOnClickListener(new i1(this));
             this.v.setOnClickListener(new j1(this));
             return;
          }
       }
       tr = this.u;
       if (tr != null) {
          tr.setVisibility(8);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, r.class, "4")) {
          return;
       }
       if (this.y != null) {
          a.b().unregisterActivityLifecycleCallbacks(this.y);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "2")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a305d);
       this.s = m1.f(p0, 0x7f0a3105);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r.class, "1")) {
          return;
       }
       this.p = this.q8(CommonMeta.class);
       this.q = this.q8(User.class);
       return;
    }
}
