package nl9.l$b;
import nl9.l;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import rx.c;
import rx.c$a;
import android.app.Activity;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import erd.g;
import java.lang.Boolean;
import java.lang.Number;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import rx.b;
import kotlin.Pair;
import erd.o;
import rx.d;
import mxb.j;

public final class l$b	// class@0031be
{

    public static PresenterV2 a(l p0,int p1){
       if (PatchProxy.isSupport2(l$b.class, "1")) {
          Object obj = PatchProxy.applyTwoRefsWithListener(p0, Integer.valueOf(p1), null, l$b.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       PatchProxy.onMethodExit(l$b.class, "1");
       return c$a.a(p0, p1);
    }
    public static int b(l p0,Activity p1,AdDataWrapper p2,String p3,boolean p4,Integer p5,g p6){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4),p5,p6};
          Object obj = PatchProxy.apply(objArray, null, uob, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       a.p(p1, "activity");
       a.p(p2, "adDataWrapper");
       a.p(p3, "scene");
       return c$a.b(p0, p1, p2, p3, p4, p5, p6);
    }
    public static b c(l p0,BaseFeed p1,String p2,View p3,boolean p4){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uob, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       return c$a.d(p0, p1, p2, p3, p4);
    }
    public static d d(l p0,int p1,BaseFeed p2,String p3,Pair p4,o p5){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uob, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "baseFeed");
       a.p(p3, "scene");
       return c$a.f(p0, p1, p2, p3, p4, p5);
    }
    public static d e(l p0,int p1,j p2,String p3,Pair p4,o p5){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),p2,p3,p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uob, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p2, "adLogWrapper");
       a.p(p3, "scene");
       return c$a.g(p0, p1, p2, p3, p4, p5);
    }
    public static d f(l p0,BaseFeed p1,String p2,g p3,int p4,int p5){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Integer.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uob, "8");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       return c$a.h(p0, p1, p2, p3, p4, p5);
    }
    public static d g(l p0,BaseFeed p1,String p2,Pair p3,g p4){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uob, "9");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       return c$a.i(p0, p1, p2, p3, p4);
    }
    public static d h(l p0,BaseFeed p1,String p2,g p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, l$b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       return c$a.j(p0, p1, p2, p3);
    }
    public static d i(l p0,BaseFeed p1,String p2,Pair p3,g p4){
       l$b uob = l$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uob, "11");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       return c$a.k(p0, p1, p2, p3, p4);
    }
}
