package oa.a;
import nl9.o;
import oa.a$a;
import nsd.u;
import java.lang.Object;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import nl9.o$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import rx.c;
import rx.c$a;
import com.kwai.framework.model.feed.BaseFeed;
import msd.l;
import erd.g;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import erd.o;
import rx.d;
import android.app.Activity;
import yl9.a;
import ql9.e;
import pa.j;
import com.yxcorp.gifshow.photoad.model.AdDataWrapper;
import java.lang.Boolean;
import java.lang.Number;
import android.view.View;
import rx.b;
import mxb.j;

public class a implements o	// class@002775
{
    public static final a$a b;

    static {
       a.b = new a$a(null);
    }
    public void a(){
       super();
    }
    public PresenterV2 D1(int p0){
       PresenterV2 presenterV2;
       if (PatchProxy.isSupport2(o$a.class, "1")) {
          presenterV2 = PatchProxy.applyTwoRefsWithListener(this, Integer.valueOf(p0), null, o$a.class, "1");
          if (presenterV2 != PatchProxyResult.class) {
          label_0021 :
             return presenterV2;
          }
       }
       presenterV2 = c$a.a(this, p0);
       PatchProxy.onMethodExit(o$a.class, "1");
       goto label_0021 ;
    }
    public void F1(BaseFeed p0,String p1,l p2,Integer p3,g p4){
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       a.p(p2, "convert");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3,p4};
          if (PatchProxy.applyVoid(objArray, null, uoa, "3")) {
          label_0042 :
             return;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       a.p(p2, "convert");
       c$a.c(this, p0, p1, p2, p3, p4);
       goto label_0042 ;
    }
    public d H0(int p0,BaseFeed p1,String p2,Pair p3,o p4){
       d uod;
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,Integer.valueOf(p0),p1,p2,p3,p4};
          uod = PatchProxy.apply(objArray, null, uoa, "6");
          if (uod != PatchProxyResult.class) {
          label_0043 :
             return uod;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       uod = c$a.f(this, p0, p1, p2, p3, p4);
       goto label_0043 ;
    }
    public e Ho(Activity p0,a p1){
       a.p(p0, "activity");
       a.p(p1, "adParamsConfig");
       return new j(p0, p1);
    }
    public d L0(BaseFeed p0,String p1,Pair p2,g p3){
       d uod;
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uod = PatchProxy.apply(objArray, null, uoa, "9");
          if (uod != PatchProxyResult.class) {
          label_003c :
             return uod;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       uod = c$a.i(this, p0, p1, p2, p3);
       goto label_003c ;
    }
    public int S(Activity p0,AdDataWrapper p1,String p2,boolean p3,Integer p4,g p5){
       int i;
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       a.p(p2, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,Boolean.valueOf(p3),p4,p5};
          Object obj = PatchProxy.apply(objArray, null, uoa, "2");
          if (obj != PatchProxyResult.class) {
             i = obj.intValue();
          label_0052 :
             return i;
          }
       }
       a.p(p0, "activity");
       a.p(p1, "adDataWrapper");
       a.p(p2, "scene");
       i = c$a.b(this, p0, p1, p2, p3, p4, p5);
       goto label_0052 ;
    }
    public b T0(BaseFeed p0,String p1,View p2,boolean p3){
       b uob;
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,Boolean.valueOf(p3)};
          uob = PatchProxy.apply(objArray, null, uoa, "4");
          if (uob != PatchProxyResult.class) {
          label_0040 :
             return uob;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       uob = c$a.d(this, p0, p1, p2, p3);
       goto label_0040 ;
    }
    public d X0(BaseFeed p0,String p1,g p2,int p3,int p4){
       d uod;
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,Integer.valueOf(p3),Integer.valueOf(p4)};
          uod = PatchProxy.apply(objArray, null, uoa, "8");
          if (uod != PatchProxyResult.class) {
          label_0047 :
             return uod;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       uod = c$a.h(this, p0, p1, p2, p3, p4);
       goto label_0047 ;
    }
    public d g0(BaseFeed p0,String p1,Pair p2,g p3){
       d uod;
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,p0,p1,p2,p3};
          uod = PatchProxy.apply(objArray, null, uoa, "11");
          if (uod != PatchProxyResult.class) {
          label_003c :
             return uod;
          }
       }
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       uod = c$a.k(this, p0, p1, p2, p3);
       goto label_003c ;
    }
    public boolean isAvailable(){
       return true;
    }
    public d n(int p0,j p1,String p2,Pair p3,o p4){
       d uod;
       a.p(p1, "adLogWrapper");
       a.p(p2, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,Integer.valueOf(p0),p1,p2,p3,p4};
          uod = PatchProxy.apply(objArray, null, uoa, "7");
          if (uod != PatchProxyResult.class) {
          label_0043 :
             return uod;
          }
       }
       a.p(p1, "adLogWrapper");
       a.p(p2, "scene");
       uod = c$a.g(this, p0, p1, p2, p3, p4);
       goto label_0043 ;
    }
    public d q0(BaseFeed p0,String p1,g p2){
       a.p(p0, "baseFeed");
       a.p(p1, "scene");
       d this = PatchProxy.applyFourRefs(this, p0, p1, p2, null, o$a.class, "10");
       if (this != PatchProxyResult.class) {
       }else {
          a.p(p0, "baseFeed");
          a.p(p1, "scene");
          this = c$a.j(this, p0, p1, p2);
       }
       return this;
    }
    public d z0(int p0,BaseFeed p1,String p2,Pair p3,g p4){
       d uod;
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{this,Integer.valueOf(p0),p1,p2,p3,p4};
          uod = PatchProxy.apply(objArray, null, uoa, "5");
          if (uod != PatchProxyResult.class) {
          label_0043 :
             return uod;
          }
       }
       a.p(p1, "baseFeed");
       a.p(p2, "scene");
       uod = c$a.e(this, p0, p1, p2, p3, p4);
       goto label_0043 ;
    }
}
