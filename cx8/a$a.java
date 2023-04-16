package cx8.a$a;
import ee6.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.StringBuilder;
import ce6.a;
import jq.a;
import java.io.IOException;
import java.lang.Throwable;
import brd.g;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import java.util.ArrayList;
import brd.v;
import java.lang.Boolean;
import gx8.c;
import brd.t;
import com.kwai.robust.PatchProxyResult;
import cx8.a$a$a;
import io.reactivex.g;

public final class a$a implements a	// class@002007
{
    public a a;
    public v b;
    public final String c;

    public void a$a(String p0){
       a.p(p0, "keyword");
       super();
       this.c = p0;
    }
    public void a(int p0,String p1){
       a$a tb;
       a$a uoa = a$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       a.p(p1, "errMsg");
       StringBuilder str = "errCode="+p0+", errMsg="+p1+" page=";
       a$a ta = this.a;
       Integer integer = (ta != null)? Integer.valueOf(ta.a4()): null;
       integer = str+integer;
       Object[] objArray = new Object[0];
       a.a("LocationAPI", "onPoiQueryFailed\(\) "+integer, objArray);
       if (p0 == 100) {
          tb = this.b;
          if (tb != null) {
             tb.onError(new IOException(integer));
          }
          this.b = null;
          return;
       }else {
          tb = this.b;
          if (tb != null) {
             tb.onNext(new LocationResponse());
          }
          tb = this.b;
          if (tb != null) {
             tb.onComplete();
          }
          this.b = null;
          return;
       }
    }
    public void b(a p0,ArrayList p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a$a.class, "1")) {
          return;
       }
       a.p(p0, "poiQueryTask");
       StringBuilder str = "onPoiQuerySuccess\(\) keyword="+this.c+" poiInfos "+"size=";
       Integer integer = (p1 != null)? Integer.valueOf(p1.size()): null;
       str = str+integer+" emitter.isDisposed=";
       a$a tb = this.b;
       Boolean uBoolean = (tb != null)? Boolean.valueOf(tb.isDisposed()): null;
       Object[] objArray = new Object[0];
       a.c("LocationAPI", str+uBoolean+' '+"poiQueryTask page="+p0.a4(), objArray);
       a$a tb1 = this.b;
       if (tb1 != null && (tb1 == null || tb1.isDisposed() != true)) {
          this.a = p0;
          LocationResponse locationResp = c.a(p1, p2);
          a.o(locationResp, "response");
          locationResp.setCursor(String.valueOf(p0.a4()));
          a$a tb2 = this.b;
          if (tb2 != null) {
             tb2.onNext(locationResp);
          }
          tb2 = this.b;
          if (tb2 != null) {
             tb2.onComplete();
          }
          this.b = null;
       }
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a$a.class, "4")) {
          return;
       }
       StringBuilder str = "cancel request keyword="+this.c+" page=";
       a$a ta = this.a;
       if (ta != null) {
          objArray = Integer.valueOf(ta.a4());
       }
       objArray = new Object[0];
       a.c("LocationAPI", str+objArray, objArray);
       a$a ta1 = this.a;
       if (ta1 != null) {
          ta1.Z3();
       }
       return;
    }
    public final t d(String p0,String p1){
       Object[] objArray;
       a$a obj = PatchProxy.applyTwoRefs(p0, p1, this, a$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       t ot = null;
       if (a.g(this.c, p0) ^ 0x01) {
          objArray = new Object[0];
          a.c("LocationAPI", "requestNextPage\(\) not next page old="+this.c+" new="+p0, objArray);
          return ot;
       }else {
          a$a ta = this.a;
          if (ta == null) {
             Object[] objArray1 = new Object[0];
             a.c("LocationAPI", "requestNextPage\(\) requestTask is null", objArray1);
             return ot;
          }else {
             a.m(ta);
             int i = ta.a4();
             if (a.g(String.valueOf(i), p1) ^ 0x01) {
                objArray = new Object[0];
                a.c("LocationAPI", "requestNextPage\(\) cursor curPage="+i+" cursor="+p1, objArray);
                return ot;
             }else {
                obj = this.a;
                a.m(obj);
                if (obj.hasMore()) {
                   return t.create(new a$a$a(this));
                }
                objArray = new Object[0];
                a.c("LocationAPI", "requestNextPage\(\) no more curPage="+i+" cursor="+p1, objArray);
                LocationResponse locationResp = new LocationResponse();
                a$a ta1 = this.a;
                a.m(ta1);
                locationResp.setCursor(String.valueOf(ta1.a4()));
                return t.just(locationResp);
             }
          }
       }
    }
    public final void e(v p0){
       this.b = p0;
    }
}
