package com.yxcorp.gifshow.storage.db.FolUserSearchDB_Impl;
import com.yxcorp.gifshow.storage.db.FolUserSearchDB;
import akc.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import akc.c;
import androidx.room.RoomDatabase;
import a3.c;
import a3.b;
import android.database.Cursor;
import androidx.room.w;
import java.util.HashMap;
import java.util.Map;
import androidx.room.t;
import androidx.room.d0;
import com.yxcorp.gifshow.storage.db.FolUserSearchDB_Impl$a;
import androidx.room.d0$a;
import android.content.Context;
import a3.c$b$a;
import a3.c$b;
import a3.c$a;
import a3.c$c;

public final class FolUserSearchDB_Impl extends FolUserSearchDB	// class@001d8a
{
    public b n;

    public void FolUserSearchDB_Impl(){
       super();
    }
    public b E(){
       Object obj = PatchProxy.apply(null, this, FolUserSearchDB_Impl.class, "4");
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
       if (PatchProxy.applyVoid(null, this, FolUserSearchDB_Impl.class, "3")) {
          return;
       }
       this.c();
       b uob = this.n().e0();
       this.e();
       uob.execSQL("DELETE FROM `FolUserSearch`");
       this.C();
       this.k();
       uob.G(str).close();
       if (!uob.inTransaction()) {
          uob.execSQL("VACUUM");
       }
       return;
    }
    public w i(){
       Object obj = PatchProxy.apply(null, this, FolUserSearchDB_Impl.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String[] stringArray = new String[]{"FolUserSearch"};
       return new w(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public c j(t p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FolUserSearchDB_Impl.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c$b$a uob$a = c$b.a(p0.b);
       uob$a.c(p0.c);
       uob$a.b(new d0(p0, new FolUserSearchDB_Impl$a(this, 2), "21a4f18693b012f5dd242cedb82d41a2", "1e0fbdbe9eca8052891dda16ec2124b9"));
       return p0.a.a(uob$a.a());
    }
}
