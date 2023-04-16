package com.yxcorp.gifshow.base.fragment.IPreviewViewBinder$a;
import com.yxcorp.gifshow.base.fragment.IPreviewViewBinder;
import ec7.a;
import java.util.List;
import androidx.lifecycle.ViewModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import ga9.b;
import ga9.b$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import j79.l0;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class IPreviewViewBinder$a	// class@001c4e
{

    public static void a(IPreviewViewBinder p0,a p1,int p2,List p3,ViewModel p4){
       IPreviewViewBinder$a uoa = IPreviewViewBinder$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
             return;
          }
       }
       a.q(p1, "adapter");
       a.q(p3, "payloads");
       b$a.a(p0, p1, p2, p3, p4);
       return;
    }
    public static boolean b(IPreviewViewBinder p0,ViewModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, IPreviewViewBinder$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p1 instanceof l0) {
          p1 = null;
       }
       return p0.b(p1);
    }
    public static void c(IPreviewViewBinder p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, IPreviewViewBinder$a.class, "2")) {
          return;
       }
       a.q(p1, "viewHolder");
       b$a.b(p0, p1);
       return;
    }
}
