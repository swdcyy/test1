package b7c.a;
import im8.g;
import y8c.g;
import java.lang.Object;
import y8c.f;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import ekd.j;
import b7c.d;
import java.util.Map;
import java.util.HashMap;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.pymk.element.e;
import ml8.c;
import com.kwai.framework.model.user.RecoUser;

public class a extends g implements g	// class@0003c2
{
    public final Object w;
    public RecoUser x;

    public void a(Object p0){
       super();
       this.w = p0;
    }
    public void Z0(){
    }
    public ArrayList a1(int p0,f p1){
       Object[] obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new Object[]{this.w,this};
       return j.a(obj);
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new d();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new d());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public f h1(ViewGroup p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new f(a.i(p0, 0x7f0d06b3), new e());
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       super.Z0();
       return;
    }
    public void r1(RecoUser p0){
       this.x = p0;
    }
}
