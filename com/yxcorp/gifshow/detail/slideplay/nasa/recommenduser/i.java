package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import k6a.i;
import android.view.View$OnClickListener;
import android.widget.Button;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.i$a;
import android.view.View;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.e;
import k6a.j;
import erd.g;
import crd.b;
import brd.t;
import java.util.List;
import qvb.a;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import ekd.m1;
import androidx.recyclerview.widget.RecyclerView;
import android.text.TextPaint;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.c;
import io.reactivex.subjects.PublishSubject;

public class i extends PresenterV2	// class@001771
{
    public e p;
    public c q;
    public PublishSubject r;
    public Button s;
    public Button t;
    public RecyclerView u;
    public Boolean v;
    public BaseFragment w;

    public void i(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "3")) {
          return;
       }
       i ts = this.s;
       if (ts != null) {
          ts.setOnClickListener(new i(this));
       }
       ts = this.t;
       if (ts != null) {
          ts.setOnClickListener(new i$a(this));
       }
       ts = this.p;
       if (ts != null) {
          ts.a(this.m8());
       }
       this.X7(this.r.subscribe(new j(this)));
       PatchProxy.onMethodExit(i.class, "3");
       return;
    }
    public final void P8(){
       int i;
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "4")) {
          return;
       }
       Iterator iterator = this.q.getItems().iterator();
       i = 0;
    label_0017 :
       boolean b = false;
       while (true) {
          if (iterator.hasNext()) {
             User user = iterator.next();
             if (b || !user.isFollowingOrFollowRequesting()) {
                b = true;
             }else {
                goto label_0017 ;
             }
          }else {
             i tt = this.t;
             if (tt != null) {
                tt.setEnabled(b);
                if (this.t.isEnabled()) {
                   this.t.setText(R.string.arg_RES_7f100ffd);
                   break ;
                }else {
                   this.t.setText(R.string.arg_RES_7f101021);
                   break ;
                }
             }
             break ;
          }
       }
       PatchProxy.onMethodExit(i.class, "4");
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, i.class, "2")) {
          return;
       }
       this.u = m1.f(p0, 0x7f0a34da);
       this.s = m1.f(p0, 0x7f0a348f);
       this.t = m1.f(p0, 0x7f0a3490);
       i ts = this.s;
       if (ts != null) {
          ts.getPaint().setFakeBoldText(true);
       }
       ts = this.t;
       if (ts != null) {
          ts.getPaint().setFakeBoldText(true);
       }
       PatchProxy.onMethodExit(i.class, "2");
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoidWithListener(null, this, i.class, "1")) {
          return;
       }
       this.w = this.s8(BaseFragment.class);
       this.p = this.q8(e.class);
       this.q = this.q8(c.class);
       this.r = this.r8("FOLLOW_STATUS_CHANGE");
       PatchProxy.onMethodExit(i.class, "1");
       return;
    }
}
