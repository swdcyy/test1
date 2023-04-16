package com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment$b;
import com.yxcorp.gifshow.share.widget.ForwardGridSectionFragment$d;
import com.yxcorp.gifshow.share.widget.ForwardPopSectionFragment;
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

public final class ForwardPopSectionFragment$b extends ForwardGridSectionFragment$d	// class@001cf6
{
    public final RecyclerView$n d;
    public final ForwardPopSectionFragment e;

    public void ForwardPopSectionFragment$b(ForwardPopSectionFragment p0,RecyclerView$n p1){
       this.e = p0;
       super(p0);
       this.d = p1;
    }
    public boolean a(j0 p0,View p1,int p2,int p3,ShareInitResponse$ThemeAreaElement p4){
       RecyclerView obj;
       ForwardPopSectionFragment$b uob = ForwardPopSectionFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Integer.valueOf(p3),p4};
          obj = PatchProxy.apply(objArray, this, uob, "1");
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
}
