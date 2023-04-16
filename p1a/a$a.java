package p1a.a$a;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.CommonParams;
import tl8.g;
import com.yxcorp.gifshow.log.model.FeedLogCtx;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import java.util.List;
import java.util.Map;
import android.view.View;

public class a$a	// class@00345f
{
    public final int a;
    public final int b;
    public final String c;
    public final int d;
    public String e;
    public double f;
    public int g;
    public int h;
    public List i;
    public Map j;
    public ClientContent$PhotoSeekBarDragPackage k;
    public ClientContent$LiveStreamPackage l;
    public String m;
    public g n;
    public ClientContent$UserPackage o;
    public String p;
    public String q;
    public View r;
    public ClientEvent$UrlPackage s;
    public boolean t;
    public ClientEvent$AreaPackage u;
    public CommonParams v;
    public FeedLogCtx w;

    public void a$a(int p0,int p1,String p2){
       super();
       this.g = 0;
       this.h = 0;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = 0;
    }
    public void a$a(int p0,int p1,String p2,int p3){
       super();
       this.g = 0;
       this.h = 0;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static a$a a(int p0,String p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a$a(1, p0, p1, 0);
    }
    public static a$a b(int p0,String p1,int p2){
       if (PatchProxy.isSupport(a$a.class)) {
          Object obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), null, a$a.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a$a(1, p0, p1, p2);
    }
    public static a$a c(String p0,String p1){
       a$a obj = PatchProxy.applyTwoRefs(p0, p1, null, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a(1, 0, p1, 0);
       obj.f(p0);
       return obj;
    }
    public static a$a s(int p0,String p1){
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, null, uoa, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new a$a(0, p0, p1, 0);
    }
    public static a$a t(String p0,String p1){
       a$a obj = PatchProxy.applyTwoRefs(p0, p1, null, a$a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a$a(0, 0, p1, 0);
       obj.f(p0);
       return obj;
    }
    public ClientContent$ContentPackage d(ClientContent$ContentPackage p0){
       return p0;
    }
    public CommonParams e(){
       return this.v;
    }
    public a$a f(String p0){
       this.e = p0;
       return this;
    }
    public a$a g(CommonParams p0){
       this.v = p0;
       return this;
    }
    public a$a h(g p0){
       this.n = p0;
       return this;
    }
    public a$a i(int p0){
       this.h = p0;
       return this;
    }
    public a$a j(FeedLogCtx p0){
       this.w = p0;
       return this;
    }
    public a$a k(String p0){
       this.q = p0;
       return this;
    }
    public a$a l(ClientContent$LiveStreamPackage p0){
       this.l = p0;
       return this;
    }
    public a$a m(String p0){
       this.p = p0;
       return this;
    }
    public a$a n(int p0){
       this.g = p0;
       return this;
    }
    public a$a o(List p0){
       this.i = p0;
       return this;
    }
    public a$a p(Map p0){
       this.j = p0;
       return this;
    }
    public a$a q(View p0){
       this.r = p0;
       return this;
    }
    public a$a r(boolean p0){
       this.t = p0;
       return this;
    }
}
