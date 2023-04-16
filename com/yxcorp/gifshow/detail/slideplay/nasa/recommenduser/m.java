package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.lang.Object;
import com.kwai.framework.model.user.User;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.Lists;
import java.lang.Number;
import g9c.a;
import android.view.ViewGroup;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.view.RecommendUserHorizonItemHeader;
import android.content.Context;
import android.view.View;
import com.yxcorp.gifshow.detail.view.RecommendUserHorizonItemFooter;
import com.yxcorp.gifshow.detail.view.RecommendUserHorizonItemView;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.m$a;
import ml8.c;

public class m extends g	// class@00177f
{
    public BaseFragment w;

    public void m(){
       super();
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.m1(p0);
    }
    public Object N0(int p0){
       return this.r1(p0);
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       if (PatchProxy.isSupport2(m.class, "2")) {
          obj = PatchProxy.applyTwoRefsWithListener(Integer.valueOf(p0), p1, this, m.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w};
       PatchProxy.onMethodExit(m.class, "2");
       return Lists.e(obj);
    }
    public int f0(int p0){
       if (PatchProxy.isSupport2(m.class, "4")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, m.class, "4");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0) {
          PatchProxy.onMethodExit(m.class, "4");
          return 0;
       }else if(p0 == (this.getItemCount() - 1)){
          PatchProxy.onMethodExit(m.class, "4");
          return 1;
       }else {
          PatchProxy.onMethodExit(m.class, "4");
          return 2;
       }
    }
    public int getItemCount(){
       m om = m.class;
       Object obj = PatchProxy.applyWithListener(null, this, om, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       PatchProxy.onMethodExit(om, "5");
       return super.getItemCount();
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       RecommendUserHorizonItemHeader recommendUse;
       if (PatchProxy.isSupport2(m.class, "1")) {
          obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, m.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       if (!p1) {
          recommendUse = new RecommendUserHorizonItemHeader(p0.getContext());
          recommendUse.setTag(Integer.valueOf(0));
       }else if(p1 == 1){
          recommendUse = new RecommendUserHorizonItemFooter(p0.getContext());
          recommendUse.setTag(Integer.valueOf(1));
       }else {
          recommendUse = new RecommendUserHorizonItemView(p0.getContext());
          recommendUse.setTag(Integer.valueOf(2));
          obj.U7(new m$a());
       }
       PatchProxy.onMethodExit(m.class, "1");
       return new f(recommendUse, obj);
    }
    public void m1(f p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, m.class, "3")) {
          return;
       }
       p0.itemView.setTag(R.id.item_view_bind_data, null);
       p0.itemView.setTag(R.id.item_view_position, null);
       p0.b.unbind();
       PatchProxy.onMethodExit(m.class, "3");
       return;
    }
    public User r1(int p0){
       if (PatchProxy.isSupport2(m.class, "6")) {
          Object obj = PatchProxy.applyOneRefsWithListener(Integer.valueOf(p0), this, m.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(m.class, "6");
       return super.N0(p0);
    }
}
