package com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import com.google.common.collect.Lists;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slideplay.nasa.recommenduser.g$a;
import ml8.c;

public class g extends g	// class@00176d
{
    public BaseFragment w;

    public void g(){
       super();
    }
    public void E0(RecyclerView$ViewHolder p0){
       this.m1(p0);
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       if (PatchProxy.isSupport2(g.class, "2")) {
          obj = PatchProxy.applyTwoRefsWithListener(Integer.valueOf(p0), p1, this, g.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w};
       PatchProxy.onMethodExit(g.class, "2");
       return Lists.e(obj);
    }
    public f h1(ViewGroup p0,int p1){
       PresenterV2 obj;
       if (PatchProxy.isSupport2(g.class, "1")) {
          obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), this, g.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new PresenterV2();
       obj.U7(new g$a());
       PatchProxy.onMethodExit(g.class, "1");
       return new f(a.i(p0, 0x7f0d12c4), obj);
    }
    public void m1(f p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, g.class, "3")) {
          return;
       }
       p0.itemView.setTag(R.id.item_view_bind_data, null);
       p0.itemView.setTag(R.id.item_view_position, null);
       p0.b.unbind();
       PatchProxy.onMethodExit(g.class, "3");
       return;
    }
}