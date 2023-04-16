package com.yxcorp.gifshow.prettify.v4.magic.filter.q;
import g9c.a;
import java.util.List;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterGroup$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import xyb.a;
import java.lang.StringBuilder;
import q87.c;
import o0c.e;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import o1c.x0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$MoreInfoPackageV2;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import com.yxcorp.gifshow.prettify.v4.magic.filter.q$a;
import java.lang.CharSequence;
import android.widget.TextView;
import android.graphics.Typeface;
import o1c.v0;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import i2b.a;

public class q extends a	// class@0011ce
{
    public final List g;
    public e h;
    public BaseFragment i;
    public int j;
    public static String k = "FilterAdapter";

    public void q(List p0,BaseFragment p1){
       super();
       this.j = -1;
       this.g = p0;
       this.i = p1;
    }
    public Object N0(int p0){
       return this.X0(p0);
    }
    public FilterGroup$a X0(int p0){
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, oq, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.g.get(p0);
    }
    public FilterGroup$a Y0(){
       Object obj = PatchProxy.apply(null, this, q.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.X0(this.j);
    }
    public int Z0(){
       return this.j;
    }
    public boolean a1(int p0,boolean p1){
       FilterGroup$a obj;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, oq, "6");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (this.j == p0) {
          return b;
       }else if(p0 >= this.g.size()){
          return b;
       }else {
          Object[] objArray = new Object[b];
          a.D().s(q.k, "selectItem "+p0+", "+this.X0(p0), objArray);
          oq = this.j;
          this.j = p0;
          if (p1) {
             q th = this.h;
             if (th != null) {
                th.a(p0);
             }
          }
          Boolean fALSE = Boolean.FALSE;
          this.m0(oq, fALSE);
          this.m0(this.j, fALSE);
          obj = this.X0(this.j).a;
          FilterGroup$a b1 = this.X0(this.j).b;
          p0 = p0 + 1;
          q ti = this.i;
          x0 ox0 = x0.class;
          int i = 5;
          if (PatchProxy.isSupport(ox0)) {
             Object[] objArray1 = new Object[i];
             objArray1[b] = Integer.valueOf(obj);
             objArray1[1] = b1;
             objArray1[2] = Integer.valueOf(p0);
             objArray1[3] = Boolean.valueOf(p1);
             objArray1[4] = ti;
             if (PatchProxy.applyVoid(objArray1, null, ox0, "3")) {
             label_00e0 :
                return 1;
             }
          }
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FILTER_TAB";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          ClientContent$MoreInfoPackageV2 moreInfoPack = new ClientContent$MoreInfoPackageV2();
          moreInfoPack.id = String.valueOf(obj);
          moreInfoPack.name = b1;
          moreInfoPack.index = String.valueOf(p0);
          uContentPack.moreInfoPackage = moreInfoPack;
          int i1 = (p1)? 1: 5;
          u1.M("2014680", ti, i1, uElementPack, uContentPack, null);
          goto label_00e0 ;
       }
    }
    public int getItemCount(){
       Object obj = PatchProxy.apply(null, this, q.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.g.size();
    }
    public void v0(RecyclerView$ViewHolder p0,int p1){
       q oq = q.class;
       if (!PatchProxy.isSupport(oq) || !PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, oq, "4")) {
          p0.a.setText(this.X0(p1).b);
          q$a a = p0.a;
          boolean b = (p1 == this.j)? true: false;
          a.setSelected(b);
          Typeface typeface = null;
          if (p0.a.isSelected()) {
             p0.a.setTypeface(typeface, 1);
          }else {
             p0.a.setTypeface(typeface, 0);
          }
          p0.itemView.setOnClickListener(new v0(this, p0));
       }
       return;
    }
    public RecyclerView$ViewHolder y0(ViewGroup p0,int p1){
       q$a uoa;
       q oq = q.class;
       if (PatchProxy.isSupport(oq)) {
          uoa = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, oq, "3");
          if (uoa != PatchProxyResult.class) {
          label_002a :
             return uoa;
          }
       }
       uoa = new q$a(a.d(p0.getContext(), 0x7f0d11a1, p0, false));
       goto label_002a ;
    }
}
