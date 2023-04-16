package com.kwai.component.photo.reduce.i$a;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import com.kwai.component.photo.reduce.model.ReduceMode;
import com.kwai.component.photo.reduce.i;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.graphics.Rect;
import com.kwai.component.photo.reduce.i$b;
import java.util.List;

public class i$a	// class@000aeb
{
    public QPhoto a;
    public int b;
    public Rect c;
    public Rect d;
    public boolean e;
    public boolean f;
    public int g;
    public View$OnClickListener h;
    public i$b i;
    public List j;
    public ReduceMode k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public String p;
    public GifshowActivity q;
    public Fragment r;

    public void i$a(QPhoto p0){
       super();
       this.k = new ReduceMode();
       this.a = p0;
    }
    public i a(){
       i obj = PatchProxy.apply(null, this, i$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new i();
       obj.b = this.a;
       obj.c = this.b;
       obj.d = this.c;
       obj.e = this.d;
       obj.f = this.e;
       obj.i = this.h;
       obj.j = this.i;
       obj.k = this.j;
       obj.l = this.k;
       obj.t = this.l;
       obj.u = this.m;
       obj.w = this.n;
       obj.v = this.o;
       obj.g = this.f;
       obj.h = this.g;
       obj.m = this.p;
       obj.n = this.q;
       obj.o = this.r;
       return obj;
    }
    public i$a b(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       p0.getLocationInWindow(obj);
       this.c = new Rect(obj[0], obj[1], (obj[0] + p0.getWidth()), (obj[1] + p0.getHeight()));
       return this;
    }
    public i$a c(i$b p0){
       this.i = p0;
       return this;
    }
    public i$a d(boolean p0){
       this.m = p0;
       return this;
    }
    public i$a e(boolean p0){
       this.l = p0;
       return this;
    }
    public i$a f(boolean p0){
       this.e = p0;
       return this;
    }
    public i$a g(List p0){
       this.j = p0;
       return this;
    }
    public i$a h(ReduceMode p0){
       if (p0 != null) {
          this.k = p0;
       }
       return this;
    }
    public i$a i(String p0){
       this.p = p0;
       return this;
    }
    public i$a j(int p0){
       this.b = p0;
       return this;
    }
    public i$a k(View p0){
       int[] obj = PatchProxy.applyOneRefs(p0, this, i$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new int[2];
       p0.getLocationInWindow(obj);
       this.d = new Rect(obj[0], obj[1], (obj[0] + p0.getWidth()), (obj[1] + p0.getHeight()));
       return this;
    }
}
