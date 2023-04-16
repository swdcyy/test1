package com.yxcorp.gifshow.relation.explore.presenter.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import eac.b;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import hac.r0;
import android.view.View$OnClickListener;
import hac.s0;
import com.kwai.framework.preference.startup.FriendSource;
import dac.b;
import java.util.Objects;
import com.yxcorp.plugin.login.TencentPlatform;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import com.kwai.framework.activitycontext.ActivityContext;
import kotlin.jvm.internal.a;
import android.app.Activity;
import dac.c;
import r4d.a;
import n3d.a;
import xwb.c;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import ekd.m1;

public class k extends PresenterV2	// class@001853
{
    public ImageView p;
    public TextView q;
    public TextView r;
    public Button s;
    public b t;
    public b u;

    public void k(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       this.p.setImageResource(this.t.d);
       this.q.setText(this.t.b);
       this.r.setText(this.t.c);
       this.s.setText(this.t.e);
       this.m8().setOnClickListener(new r0(this));
       this.s.setOnClickListener(new s0(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, k.class, "3")) {
          return;
       }
       b uob = new b(FriendSource.CONTACTS, 0x7f105070, 0x7f10507d, 0x7f10506e, 0x7f0822a9);
       this.t = v0;
       return;
    }
    public final void P8(){
       k tu;
       b a;
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "5")) {
          return;
       }
       if (this.t.a == FriendSource.QQ) {
          tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, uob, "6")) {
             TencentPlatform tencentPlatf = new TencentPlatform(tu.d.getActivity());
             ActivityContext uActivityCon = ActivityContext.g();
             a.o(uActivityCon, "ActivityContext.getInstance\(\)");
             tencentPlatf.login(uActivityCon.e(), new c(tu, tencentPlatf));
          }
       }else {
          a = this.u.a;
          Objects.requireNonNull(a);
          if (!PatchProxy.applyVoid(objArray, a, c.class, "15")) {
             a.e(a.c(1, 0x7540), objArray);
          }
          tu = this.u;
          Objects.requireNonNull(tu);
          if (!PatchProxy.applyVoid(objArray, tu, uob, "3")) {
             b.d(tu, false, 1, objArray);
          }
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a30b7);
       this.r = m1.f(p0, 0x7f0a30b8);
       this.p = m1.f(p0, 0x7f0a30b9);
       this.q = m1.f(p0, 0x7f0a30bc);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.u = this.q8(b.class);
       return;
    }
}
