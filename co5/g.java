package co5.g;
import com.kwai.library.widget.popup.bubble.a$c;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonObject;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;

public class g	// class@000714
{
    public final boolean a;
    public final a$c b;
    public String c;
    public int d;
    public JsonObject e;
    public boolean f;
    public int g;
    public String h;
    public boolean i;
    public WeakReference j;
    public l k;
    public int l;

    public void g(boolean p0,a$c p1){
       super();
       this.l = 0;
       this.a = p0;
       this.b = p1;
    }
    public void g(boolean p0,a$c p1,String p2,int p3){
       super(p0, p1);
       this.c = p2;
       this.d = p3;
    }
    public static g a(a$c p0,String p1,int p2,boolean p3,JsonObject p4,int p5,String p6){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object[] objArray = new Object[]{p0,p1,Integer.valueOf(p2),Boolean.valueOf(p3),p4,Integer.valueOf(p5),p6};
          Object obj = PatchProxy.apply(objArray, null, og, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       og = new g(1, p0, p1, p2);
       og.f = p3;
       og.e = p4;
       og.g = p5;
       og.h = p6;
       return og;
    }
}
