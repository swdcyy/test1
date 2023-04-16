package com.kwai.nearby.local.utils.a;
import e9c.e;
import androidx.recyclerview.widget.RecyclerView;
import com.kwai.nearby.local.HomeLocalFragment;
import qvb.i;
import y8c.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import ekd.p0;
import y8c.t;
import ld7.b;
import java.lang.Runnable;
import android.view.ViewGroup;

public class a extends e	// class@001006
{
    public HomeLocalFragment d;
    public boolean e;

    public void a(RecyclerView p0){
       super(p0);
    }
    public void a(HomeLocalFragment p0,RecyclerView p1){
       super(p1);
       this.d = p0;
    }
    public void b(i p0,g p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "1")) {
          return;
       }
       if (!p0.C(a.a().a())) {
          a td = this.d;
          if (td != null && (td.bi() != null && this.e == null)) {
             this.d.bi().d(false);
             this.e = true;
             this.a.postDelayed(new b(this), 1000);
          }
       label_004f :
          return;
       }else {
          super.b(p0, p1, p2);
          return;
       }
    }
}
