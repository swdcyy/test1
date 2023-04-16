package mxb.j;
import pkd.a;
import java.lang.Boolean;
import java.lang.Object;
import vq4.c;
import vq4.d;
import vq4.h;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import android.content.res.Resources;
import android.content.res.Configuration;
import brd.a0;
import com.yxcorp.gifshow.photoad.c;
import erd.g;
import crd.b;
import java.util.List;
import com.kwai.framework.model.feed.BaseFeed;
import o35.b;
import com.kwai.sdk.switchconfig.a;
import ekd.e;
import com.yxcorp.gifshow.commercial.adsdk.model.AdLogAltData;
import com.kuaishou.android.model.feed.k;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Iterator;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import org.json.JSONObject;
import java.lang.RuntimeException;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

public abstract class j	// class@003636
{
    public BaseFeed a;
    public c b;
    public d c;
    public h d;
    public boolean e;
    public Map f;
    public JSONObject g;
    public List h;
    public WeakReference i;
    public int j;
    public static final Boolean k;

    static {
       j.k = Boolean.valueOf(a.a);
    }
    public void j(){
       super();
       this.b = new c();
       this.c = new d();
       this.d = new h();
       this.h = new ArrayList();
       this.j = 1;
    }
    public static int d(int p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), null, oj, "6");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (p0) {
          return p0;
       }else {
          Resources resources = a.b().getResources();
          resources = (resources != null && (resources.getConfiguration() != null && resources.getConfiguration().orientation == 2))? 1: 0;
          if (resources) {
             return 1;
          }else {
             return 2;
          }
       }
    }
    public static void i(a0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, j.class, "5")) {
          return;
       }
       if (j.k.booleanValue() && p0 != null) {
          p0.Q(c.b);
       }
       return;
    }
    public j a(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.h.add(p0);
       return this;
    }
    public BaseFeed b(){
       return this.a;
    }
    public abstract long c();
    public abstract int e();
    public List f(){
       return null;
    }
    public abstract List g();
    public abstract boolean h();
    public abstract a0 j(int p0);
    public void k(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       String str = "AdLogWrapper";
       if (this.e != null) {
          Object[] objArray = new Object[0];
          b.g().u(str, "有异步提交，不可重复build，会影响actionType", objArray);
       }
       this.e = true;
       this.b.r0 = a.t().a("adLogTraceUser", 0);
       j tb = this.b;
       if (tb.F == null) {
          j tc = this.c;
          tb.F = tc;
          tc.u2 = e.a();
       }
       tb = this.b;
       if (tb.K == null) {
          tb.K = this.d;
       }
       if (k.x(this.a) != null && !TextUtils.x(k.x(this.a).logExtData)) {
          this.b.s0 = k.x(this.a).logExtData;
       }
       if (!this.h.isEmpty()) {
          Iterator iterator = this.h.iterator();
          while (iterator.hasNext()) {
             g og = iterator.next();
             try{
                og.accept(this.b);
             }catch(java.lang.Exception e3){
                Object[] objArray1 = new Object[0];
                b.g().e(str, e3, objArray1);
                ExceptionHandler.handleCaughtException(e3);
                goto label_0079 ;
             }
          }
       }
       if (this.g != null) {
          if (TextUtils.x(this.b.E)) {
             this.b.E = this.g.toString();
          }else if(!a.a){
             throw new RuntimeException("clientAdLog.clientExtData conflict");
          }
       }
       return;
    }
    public j l(String p0,Object p1){
       Object[] obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == null) {
          this.g = new JSONObject();
       }
       try{
          this.g.put(p0, p1);
       }catch(org.json.JSONException e3){
          obj = new Object[0];
          b.g().e("AdLogWrapper", e3, obj);
          ExceptionHandler.handleCaughtException(e3);
       }
       return this;
    }
    public j m(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return this;
       }
       this.i = new WeakReference(p0);
       return this;
    }
    public j n(int p0){
       this.j = p0;
       return this;
    }
    public void o(Map p0){
       this.f = p0;
    }
}
