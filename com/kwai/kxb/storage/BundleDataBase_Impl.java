package com.kwai.kxb.storage.BundleDataBase_Impl;
import com.kwai.kxb.storage.BundleDataBase;
import tu6.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import tu6.c;
import androidx.room.RoomDatabase;
import a3.c;
import a3.b;
import android.database.Cursor;
import androidx.room.w;
import java.util.HashMap;
import java.util.Map;
import androidx.room.t;
import androidx.room.d0;
import com.kwai.kxb.storage.BundleDataBase_Impl$a;
import androidx.room.d0$a;
import android.content.Context;
import a3.c$b$a;
import a3.c$b;
import a3.c$a;
import a3.c$c;
import java.util.List;
import java.util.Collections;

public final class BundleDataBase_Impl extends BundleDataBase	// class@0007f0
{
    public a n;

    public void BundleDataBase_Impl(){
       super();
    }
    public a E(){
       Object obj = PatchProxy.apply(null, this, BundleDataBase_Impl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.n != null) {
          return this.n;
       }
       _monitor_enter(this);
       if (this.n == null) {
          this.n = new c(this);
       }
       _monitor_exit(this);
       return this.n;
    }
    public void f(){
       String str = "PRAGMA wal_checkpoint\(FULL\)";
       if (PatchProxy.applyVoid(null, this, BundleDataBase_Impl.class, "3")) {
          return;
       }
       this.c();
       b uob = this.n().e0();
       this.e();
       uob.execSQL("DELETE FROM `bundle`");
       this.C();
       this.k();
       uob.G(str).close();
       if (!uob.inTransaction()) {
          uob.execSQL("VACUUM");
       }
       return;
    }
    public w i(){
       Object obj = PatchProxy.apply(null, this, BundleDataBase_Impl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"bundle"};
       return new w(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public c j(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, BundleDataBase_Impl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$b$a uob$a = c$b.a(p0.b);
       uob$a.c(p0.c);
       uob$a.b(new d0(p0, new BundleDataBase_Impl$a(this, 4), "fad1c34c9962ce1e945243f390c25c9b", "86527f787ddb9f161ffd31dffff3cde3"));
       return p0.a.a(uob$a.a());
    }
    public Map p(){
       Object[] objArray = null;
       HashMap obj = PatchProxy.apply(objArray, this, BundleDataBase_Impl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       List list = PatchProxy.apply(objArray, objArray, c.class, "6");
       if (list != PatchProxyResult.class) {
       }else {
          list = Collections.emptyList();
       }
       obj.put(a.class, list);
       return obj;
    }
}
