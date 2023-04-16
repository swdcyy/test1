package com.yxcorp.gifshow.relation.select.v;
import y8c.g;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.util.List;
import zu5.b;
import com.yxcorp.gifshow.model.SelectUsersBundle;
import java.util.ArrayList;
import xl8.b;
import java.lang.Object;
import java.util.Collection;
import ekd.q;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import org.json.JSONObject;
import org.json.JSONException;
import java.util.Set;
import com.yxcorp.gifshow.util.rx.RxBus;
import zu5.c;
import brd.t;
import t45.d;
import brd.z;
import rbc.m;
import erd.g;
import crd.b;
import java.lang.Integer;
import com.kwai.framework.model.user.User;
import java.lang.CharSequence;
import android.text.TextUtils;
import y8c.f;
import com.yxcorp.gifshow.relation.select.v$a;
import ml8.c;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import vbc.p;
import vbc.q;
import vbc.o;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public class v extends g	// class@0019c7
{
    public int A;
    public int B;
    public b C;
    public String D;
    public final b E;
    public Collection F;
    public final List w;
    public boolean x;
    public b y;
    public SelectUsersBundle z;
    public static final int G;

    static {
       v.G = a.t().a("atPanelShowItemCount", 20);
    }
    public void v(List p0,b p1,SelectUsersBundle p2,int p3){
       int i;
       JSONObject jSONObject;
       super();
       ArrayList uArrayList = new ArrayList();
       this.w = uArrayList;
       this.E = new b(new ArrayList());
       if (!q.f(p0)) {
          uArrayList.addAll(p0);
          this.z = p2;
          this.y = p1;
          this.B = p3;
          String str = "KEY_SELECT_LIMIT_NUM";
          p1 = PatchProxy.apply(null, this, v.class, "6");
          if (p1 != PatchProxyResult.class) {
             i = p1.intValue();
          }else {
             try{
                jSONObject = new JSONObject();
                jSONObject = (this.z.getLimitConditions() == null)? new JSONObject().put(str, v.G): new JSONObject(String.valueOf(this.z.getLimitConditions()));
             }catch(org.json.JSONException e6){
                e6.printStackTrace();
             }
             i = jSONObject.optInt(str, -1);
          }
          this.A = i;
          this.E.d(this.z.getCheckedUsers());
          this.x = q.f(this.z.getCheckedUsers()) ^ 0x01;
       }
       this.C = RxBus.f.f(c.class).observeOn(d.a).subscribe(new m(this));
       return;
    }
    public int f0(int p0){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, ov, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (TextUtils.isEmpty(this.w.get(0).getId())) {
          return 2;
       }else if(p0 == (this.getItemCount() - 1) && TextUtils.isEmpty(this.w.get(p0).getId())){
          return 1;
       }else {
          return 0;
       }
    }
    public void g1(f p0,int p1,List p2){
       if (PatchProxy.isSupport(v.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, v.class, "2")) {
          return;
       }
       v$a uoa = new v$a();
       uoa.c = p1;
       uoa.b = this.w.get(p1);
       uoa.f = this.y;
       uoa.d = this;
       uoa.e = this.E;
       uoa.g = this.D;
       Object[] objArray = new Object[]{uoa};
       p0.b.i(objArray);
       return;
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, v.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.w.size();
    }
    public f h1(ViewGroup p0,int p1){
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, ov, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       View view = a.k(p0, R.layout.arg_RES_7f0d14ad, false);
       if (p1) {
          if (p1 != 1) {
             if (p1 != 2) {
                return null;
             }else {
                return new f(view, new p());
             }
          }else {
             return new f(view, new q(this.z));
          }
       }else {
          return new f(view, new o(this.z, this.A));
       }
    }
    public void x0(RecyclerView$ViewHolder p0,int p1,List p2){
       this.g1(p0, p1, p2);
    }
}
