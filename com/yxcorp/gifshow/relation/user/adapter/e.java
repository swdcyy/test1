package com.yxcorp.gifshow.relation.user.adapter.e;
import br8.b;
import y8c.g;
import com.yxcorp.gifshow.relation.user.adapter.e$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;
import java.lang.Number;
import g9c.a;
import com.kwai.framework.model.user.User;
import y8c.f;
import java.util.ArrayList;
import ekd.j;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.relation.user.adapter.e$a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ecc.w;
import ecc.n0;
import ecc.c0;
import nu7.d;
import ml8.c;
import qvb.i;
import y8c.q;
import xac.k;
import xac.m;
import xac.g;
import android.widget.TextView;

public class e extends g implements b	// class@0019f0
{
    public boolean w;
    public final e$b x;
    public boolean y;

    public void e(e$b p0){
       super();
       this.w = false;
       this.x = p0;
    }
    public static boolean r1(){
       Object obj = PatchProxy.apply(null, null, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableBigAvatarInUserList", false);
    }
    public long E(int p0){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoe, "1");
          if (obj != PatchProxyResult.class) {
             return obj.longValue();
          }
       }
       if (this.w == null) {
          return -1;
       }else {
          User user = this.N0(p0);
          long l = (user != null && user.mNewest != null)? 2: 1;
          return l;
       }
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoe, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.x};
       return j.a(obj);
    }
    public RecyclerView$ViewHolder d(ViewGroup p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new e$a(this, a.i(p0, 0x7f0d0919));
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoe, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.i(p0, R.layout.arg_RES_7f0d0964);
       obj = new PresenterV2();
       obj.U7(new w());
       obj.U7(new n0());
       obj.U7(new c0());
       if (this.y != null) {
          obj.U7(new d());
       }
       return new f(view, obj);
    }
    public boolean s1(){
       Object obj = PatchProxy.apply(null, this, e.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!this.k.q() instanceof k || (!this.k.q().s0() && (!this.k.q() instanceof m || (!(a.t().c("enableRelationListOptimize", "0")).equals("0") || (this.k.q() instanceof g && this.k.q().s0())))))? true: false;
       return b;
    }
    public void t(RecyclerView$ViewHolder p0,int p1){
       e uoe = e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoe, "3")) {
          return;
       }
       p0 = p0.itemView;
       User user = this.N0(p1);
       if (user != null) {
          user = (user.mNewest != null)? 0x7f1034d7: 0x7f100e1f;
          p0.setText(user);
          p0.setVisibility(0);
       }else {
          p0.setVisibility(8);
       }
       return;
    }
    public void t1(boolean p0){
       this.y = p0;
    }
}
