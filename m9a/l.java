package m9a.l;
import m9a.l$c;
import java.lang.Object;
import m9a.l$d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import fg6.a;
import m9a.l$a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import java.util.concurrent.TimeUnit;
import java.lang.System;
import java.lang.Boolean;

public class l	// class@002f89
{
    public final int a;
    public final int b;
    public final l$c c;

    public void l(int p0,int p1,l$c p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final l$d a(){
       String obj = PatchProxy.apply(null, this, l.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get();
       if (obj == null) {
          return new l$d();
       }
       String str = " get StorageInfo"+obj;
       String str1 = "chensenhua";
       try{
          Log.d(str1, str);
          return a.a.i(obj, new l$a(this).getType());
       }catch(java.lang.Exception e0){
          return new l$d();
       }
    }
    public final String b(){
       Object obj = PatchProxy.apply(null, this, l.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return String.valueOf(TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis()));
    }
    public void c(){
       l ol = l.class;
       if (PatchProxy.applyVoid(null, this, ol, "4")) {
          return;
       }
       l$d uod = this.a();
       uod.mTodayCount = (this.d(uod))? 1: uod.mTodayCount + 1;
       uod.mTotalCount = uod.mTotalCount + 1;
       uod.mTodayId = this.b();
       if (!PatchProxy.applyVoidOneRefs(uod, this, ol, "6")) {
          String str = a.a.q(uod);
          Log.d("chensenhua", " put  StorageInfo"+str);
          this.c.a(str);
       }
       return;
    }
    public final boolean d(l$d p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return ((this.b()).equals(p0.mTodayId) ^ 0x01);
    }
    public boolean e(){
       l$d obj = PatchProxy.apply(null, this, l.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.a();
       boolean b = (obj.mTotalCount < this.a && (this.d(obj) || obj.mTodayCount < this.b))? true: false;
       return b;
    }
}
