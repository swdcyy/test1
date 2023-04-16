package com.yxcorp.gifshow.pymk.element.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.pymk.element.a;
import erd.o;
import t45.d;
import brd.z;
import b7c.g;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.text.TextPaint;
import android.widget.TextView;
import android.content.res.Resources;
import lnc.a1;
import android.content.res.Configuration;
import android.view.View;
import ekd.m1;
import b7c.e;
import android.view.View$OnClickListener;
import b7c.f;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.RecoUser;
import f7c.c;
import y8c.g;

public class b extends PresenterV2	// class@0016bd
{
    public g p;
    public User q;
    public RecoUser r;
    public c s;
    public TextView t;
    public TextView u;
    public View v;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.X7(this.q.observable().distinctUntilChanged(a.b).observeOn(d.a).subscribe(new g(this), Functions.d()));
       return;
    }
    public void F8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       b tt = this.t;
       b = true;
       if (tt != null) {
          tt.getPaint().setFakeBoldText(b);
       }
       if (this.u != null) {
          if (a1.m().getConfiguration().fontScale - 0x3f800000 > 0) {
             this.u.setMaxLines(b);
          }else {
             this.u.setMaxLines(2);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a2d10);
       this.u = m1.f(p0, 0x7f0a3deb);
       this.v = m1.f(p0, 0x7f0a0fb1);
       m1.a(p0, new e(this), R.id.close);
       m1.a(p0, new f(this), R.id.follower_layout);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.q8(RecoUser.class);
       this.s = this.r8("PYMK_ACCESS_IDSITEM_CLICK_LISTENER");
       this.p = this.t8("PYMK_ADAPTER");
       return;
    }
}
