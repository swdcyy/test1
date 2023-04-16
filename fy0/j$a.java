package fy0.j$a;
import xl8.b;
import android.view.View$OnClickListener;
import java.lang.Object;
import fy0.j;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class j$a	// class@0023d8
{
    public int a;
    public int b;
    public b c;
    public View$OnClickListener d;
    public String e;
    public int f;
    public LivePayBulletTag g;
    public Drawable h;
    public Drawable i;

    public void j$a(int p0,int p1,b p2,View$OnClickListener p3){
       super();
       this.a = p0;
       this.c = p2;
       this.b = p1;
       this.d = p3;
    }
    public j a(){
       j obj = PatchProxy.apply(null, this, j$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new j(this.a, this.b, this.c, this.d);
       obj.g = this.f;
       obj.h = this.g;
       obj.i = this.h;
       obj.j = this.i;
       obj.f = this.e;
       return obj;
    }
    public j$a b(int p0){
       this.f = p0;
       return this;
    }
    public j$a c(String p0){
       this.e = p0;
       return this;
    }
}
