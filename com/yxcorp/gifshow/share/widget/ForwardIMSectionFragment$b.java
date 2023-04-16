package com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment$b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardIMSectionFragment;
import androidx.recyclerview.widget.RecyclerView$n;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment;
import uo7.j0;
import android.view.View;
import com.kwai.sharelib.model.ShareInitResponse$ThemeAreaElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView;
import android.widget.TextView;
import lnc.a1;
import java.lang.CharSequence;
import java.lang.Number;

public final class ForwardIMSectionFragment$b extends ForwardGridSectionFragment$d	// class@001ce4
{
    public final RecyclerView$n d;
    public final ForwardIMSectionFragment e;

    public void ForwardIMSectionFragment$b(ForwardIMSectionFragment p0,RecyclerView$n p1){
       this.e = p0;
       super(p0);
       this.d = p1;
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       RecyclerView obj;
       ForwardIMSectionFragment$b uob = ForwardIMSectionFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       if (this.d != null && (a.g(p0.c(), "FANS_BANNER") ^ 1)) {
          obj = p1.findViewById(R.id.recyclerView);
          if (obj != null) {
             obj.addItemDecoration(this.d);
          }
       }
       return super.a(p0, p1, p2, p3, p4);
    }
    public void d(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       ForwardIMSectionFragment$b uob = ForwardIMSectionFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, uob, "3")) {
             return;
          }
       }
       a.p(p0, "bundle");
       a.p(p1, "v");
       super.d(p0, p1, p2, p3, p4);
       View view = p1.findViewById(R.id.forward_panel_item_cancel);
       a.o(view, "v.findViewById<View>\(R.i¡­orward_panel_item_cancel\)");
       view.setVisibility(8);
       view = p1.findViewById(R.id.textTitle);
       a.o(view, "v.findViewById<TextView>\(R.id.textTitle\)");
       String str = (this.e.X0 != null)? a1.p(R.string.arg_RES_7f103c3d): a1.p(R.string.arg_RES_7f103c3e);
       view.setText(str);
       return;
    }
    public int h(j0 p0,int p1){
       ForwardIMSectionFragment$b uob = ForwardIMSectionFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p0, "op");
       return -1;
    }
    public int i(int p0){
       p0 = (p0 != 1)? 0x7f0d0616: 0x7f0d0615;
       return p0;
    }
}
