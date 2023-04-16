package cic.c;
import yic.u0;
import cic.c$a;
import nsd.u;
import uo7.k;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.share.OperationModel;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import yic.u0$a;
import java.lang.Number;
import android.net.Uri;

public abstract class c implements u0	// class@0005a7
{
    public final k b;
    public final QPhoto c;
    public static final c$a d;

    static {
       c.d = new c$a(null);
    }
    public void c(k p0,QPhoto p1){
       a.p(p0, "conf");
       a.p(p1, "photo");
       super();
       this.b = p0;
       this.c = p1;
    }
    public t F(String p0,String p1,GifshowActivity p2,OperationModel p3,String p4){
       if (PatchProxy.isSupport2(c.class, "6")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, c.class, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "packageName");
       a.p(p1, "activityName");
       a.p(p2, "activity");
       a.p(p3, "model");
       a.p(p4, "text");
       PatchProxy.onMethodExit(c.class, "6");
       return u0$a.d(this, p0, p1, p2, p3, p4);
    }
    public int T(){
       Object obj = PatchProxy.apply(null, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return 2456;
    }
    public String V(){
       Object obj = PatchProxy.apply(null, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u0$a.b(this);
    }
    public abstract void a();
    public final k b(){
       return this.b;
    }
    public final QPhoto c(){
       return this.c;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       c.d.a(this.b, this.c);
       return;
    }
    public String getPlatform(){
       return "wechat_moments";
    }
    public t h0(String p0,String p1,GifshowActivity p2,OperationModel p3,Uri p4){
       if (PatchProxy.isSupport2(c.class, "2")) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, this, c.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "packageName");
       a.p(p1, "activityName");
       a.p(p2, "activity");
       a.p(p3, "model");
       a.p(p4, "uri");
       PatchProxy.onMethodExit(c.class, "2");
       return u0$a.c(this, p0, p1, p2, p3, p4);
    }
    public String z0(){
       Object obj = PatchProxy.apply(null, this, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return u0$a.a(this);
    }
}
