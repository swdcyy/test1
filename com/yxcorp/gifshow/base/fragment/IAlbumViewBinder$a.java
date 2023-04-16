package com.yxcorp.gifshow.base.fragment.IAlbumViewBinder$a;
import com.yxcorp.gifshow.base.fragment.IAlbumViewBinder;
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
import q79.d;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;

public final class IAlbumViewBinder$a	// class@001c4c
{

    public static void a(IAlbumViewBinder p0,a p1,int p2,List p3,ViewModel p4){
       IAlbumViewBinder$a uoa = IAlbumViewBinder$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "4")) {
             return;
          }
       }
       a.q(p1, "adapter");
       a.q(p3, "payloads");
       b$a.a(p0, p1, p2, p3, p4);
       return;
    }
    public static boolean b(IAlbumViewBinder p0,ViewModel p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, IAlbumViewBinder$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!p1 instanceof d) {
          p1 = null;
       }
       return p0.g(p1);
    }
    public static void c(IAlbumViewBinder p0,View p1,int p2){
       if (PatchProxy.isSupport(IAlbumViewBinder$a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), null, IAlbumViewBinder$a.class, "2")) {
          return;
       }
       a.q(p1, "itemView");
       return;
    }
    public static void d(IAlbumViewBinder p0,RecyclerView$ViewHolder p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, IAlbumViewBinder$a.class, "3")) {
          return;
       }
       a.q(p1, "viewHolder");
       b$a.b(p0, p1);
       return;
    }
}
