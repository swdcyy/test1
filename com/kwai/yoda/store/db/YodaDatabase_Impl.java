package com.kwai.yoda.store.db.YodaDatabase_Impl;
import com.kwai.yoda.store.db.YodaDatabase;
import iy7.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import iy7.c;
import androidx.room.RoomDatabase;
import zy7.b;
import zy7.c;
import zy7.e;
import zy7.f;
import wz7.b;
import wz7.c;
import wz7.e;
import wz7.f;
import iy7.d;
import iy7.e;
import a3.c;
import a3.b;
import android.database.Cursor;
import androidx.room.w;
import java.util.HashMap;
import java.util.Map;
import androidx.room.t;
import androidx.room.d0;
import com.kwai.yoda.store.db.YodaDatabase_Impl$a;
import androidx.room.d0$a;
import android.content.Context;
import a3.c$b$a;
import a3.c$b;
import a3.c$a;
import a3.c$c;

public final class YodaDatabase_Impl extends YodaDatabase	// class@0012ee
{
    public d p;
    public b q;
    public e r;
    public b s;
    public b t;
    public e u;

    public void YodaDatabase_Impl(){
       super();
    }
    public b E(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.q != null) {
          return this.q;
       }
       _monitor_enter(this);
       if (this.q == null) {
          this.q = new c(this);
       }
       _monitor_exit(this);
       return this.q;
    }
    public b F(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.t != null) {
          return this.t;
       }
       _monitor_enter(this);
       if (this.t == null) {
          this.t = new c(this);
       }
       _monitor_exit(this);
       return this.t;
    }
    public e G(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.u != null) {
          return this.u;
       }
       _monitor_enter(this);
       if (this.u == null) {
          this.u = new f(this);
       }
       _monitor_exit(this);
       return this.u;
    }
    public b H(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.s != null) {
          return this.s;
       }
       _monitor_enter(this);
       if (this.s == null) {
          this.s = new c(this);
       }
       _monitor_exit(this);
       return this.s;
    }
    public e I(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.r != null) {
          return this.r;
       }
       _monitor_enter(this);
       if (this.r == null) {
          this.r = new f(this);
       }
       _monitor_exit(this);
       return this.r;
    }
    public d J(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.p != null) {
          return this.p;
       }
       _monitor_enter(this);
       if (this.p == null) {
          this.p = new e(this);
       }
       _monitor_exit(this);
       return this.p;
    }
    public void f(){
       String str = "PRAGMA wal_checkpoint\(FULL\)";
       if (PatchProxy.applyVoid(null, this, YodaDatabase_Impl.class, "3")) {
          return;
       }
       this.c();
       b uob = this.n().e0();
       this.e();
       uob.execSQL("DELETE FROM `yoda_preload_file`");
       uob.execSQL("DELETE FROM `yoda_biz_info`");
       uob.execSQL("DELETE FROM `yoda_offline_package_request_info`");
       uob.execSQL("DELETE FROM `yoda_offline_package_match_info`");
       uob.execSQL("DELETE FROM `yoda_loading_config_info`");
       uob.execSQL("DELETE FROM `yoda_loading_res_info`");
       this.C();
       this.k();
       uob.G(str).close();
       if (!uob.inTransaction()) {
          uob.execSQL("VACUUM");
       }
       return;
    }
    public w i(){
       Object obj = PatchProxy.apply(null, this, YodaDatabase_Impl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"yoda_preload_file","yoda_biz_info","yoda_offline_package_request_info","yoda_offline_package_match_info","yoda_loading_config_info","yoda_loading_res_info"};
       return new w(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public c j(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, YodaDatabase_Impl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$b$a uob$a = c$b.a(p0.b);
       uob$a.c(p0.c);
       uob$a.b(new d0(p0, new YodaDatabase_Impl$a(this, 12), "380278a1ecdbb06ba24b8971ed1fa9ad", "393048568c3eee3bfc36e1e3aca78f0f"));
       return p0.a.a(uob$a.a());
    }
}
