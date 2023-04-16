package com.yxcorp.gifshow.widget.adv.ITimelineView$d;
import java.lang.Cloneable;
import java.lang.Object;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import cw9.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;

public class ITimelineView$d implements Cloneable	// class@00190a
{
    public double b;
    public int c;
    public int d;
    public int e;
    public int f;
    public ITimelineView$b g;
    public View h;
    public byte[] i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public float o;

    public void ITimelineView$d(){
       super();
       this.l = false;
       this.n = c.b(a.a().a().getResources(), 0x7f070d67);
    }
    public ITimelineView$d a(){
       ITimelineView$d obj = PatchProxy.apply(null, this, ITimelineView$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ITimelineView$d();
       obj.b = this.b;
       obj.c = this.c;
       obj.d = this.d;
       obj.e = this.e;
       obj.f = this.f;
       obj.i = this.i;
       obj.k = this.k;
       obj.m = this.m;
       obj.n = this.n;
       obj.o = this.o;
       obj.j = this.j;
       return obj;
    }
    public void b(View p0,byte[] p1){
       this.h = p0;
       this.i = null;
    }
    public Object clone(){
       return this.a();
    }
}
