package com.yxcorp.gifshow.music.util.RealTimeLogger$b;
import qvb.q;
import com.yxcorp.gifshow.music.util.RealTimeLogger;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import jqb.o;
import android.view.View;
import java.lang.Runnable;
import com.kwai.library.widget.popup.common.f;

public class RealTimeLogger$b implements q	// class@002080
{
    public RecyclerView b;
    public final RealTimeLogger c;

    public void RealTimeLogger$b(RealTimeLogger p0,RecyclerView p1){
       this.c = p0;
       super();
       this.b = p1;
    }
    public void M1(boolean p0,Throwable p1){
       p.a(this, p0, p1);
    }
    public void Z1(boolean p0,boolean p1){
       p.d(this, p0, p1);
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
       p.c(this, p0);
    }
    public void v2(boolean p0,boolean p1){
       RealTimeLogger$b uob = RealTimeLogger$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uob, "1")) {
          return;
       }
       if (p0) {
          this.c.b();
          f.F(this.b, new o(this.c));
       }
       return;
    }
}
