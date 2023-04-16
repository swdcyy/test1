package androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.WorkDatabase;
import u3.b;
import u3.c;
import androidx.room.RoomDatabase;
import u3.e;
import u3.f;
import u3.g;
import u3.h;
import u3.j;
import u3.k;
import u3.m;
import u3.n;
import u3.p;
import u3.q;
import u3.s;
import u3.t;
import u3.v;
import u3.w;
import a3.c;
import a3.b;
import java.lang.String;
import android.database.Cursor;
import androidx.room.w;
import java.util.HashMap;
import java.util.Map;
import androidx.room.t;
import androidx.room.d0;
import androidx.work.impl.WorkDatabase_Impl$a;
import androidx.room.d0$a;
import android.content.Context;
import a3.c$b$a;
import a3.c$b;
import a3.c$a;
import a3.c$c;

public final class WorkDatabase_Impl extends WorkDatabase	// class@000a66
{
    public s o;
    public b p;
    public v q;
    public j r;
    public m s;
    public p t;
    public e u;
    public g v;

    public void WorkDatabase_Impl(){
       super();
    }
    public b F(){
       if (this.p != null) {
          return this.p;
       }
       _monitor_enter(this);
       if (this.p == null) {
          this.p = new c(this);
       }
       _monitor_exit(this);
       return this.p;
    }
    public e J(){
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
    public g K(){
       if (this.v != null) {
          return this.v;
       }
       _monitor_enter(this);
       if (this.v == null) {
          this.v = new h(this);
       }
       _monitor_exit(this);
       return this.v;
    }
    public j L(){
       if (this.r != null) {
          return this.r;
       }
       _monitor_enter(this);
       if (this.r == null) {
          this.r = new k(this);
       }
       _monitor_exit(this);
       return this.r;
    }
    public m M(){
       if (this.s != null) {
          return this.s;
       }
       _monitor_enter(this);
       if (this.s == null) {
          this.s = new n(this);
       }
       _monitor_exit(this);
       return this.s;
    }
    public p N(){
       if (this.t != null) {
          return this.t;
       }
       _monitor_enter(this);
       if (this.t == null) {
          this.t = new q(this);
       }
       _monitor_exit(this);
       return this.t;
    }
    public s O(){
       if (this.o != null) {
          return this.o;
       }
       _monitor_enter(this);
       if (this.o == null) {
          this.o = new t(this);
       }
       _monitor_exit(this);
       return this.o;
    }
    public v P(){
       if (this.q != null) {
          return this.q;
       }
       _monitor_enter(this);
       if (this.q == null) {
          this.q = new w(this);
       }
       _monitor_exit(this);
       return this.q;
    }
    public void f(){
       this.c();
       b uob = this.n().e0();
       this.e();
       uob.execSQL("PRAGMA defer_foreign_keys = TRUE");
       uob.execSQL("DELETE FROM `Dependency`");
       uob.execSQL("DELETE FROM `WorkSpec`");
       uob.execSQL("DELETE FROM `WorkTag`");
       uob.execSQL("DELETE FROM `SystemIdInfo`");
       uob.execSQL("DELETE FROM `WorkName`");
       uob.execSQL("DELETE FROM `WorkProgress`");
       uob.execSQL("DELETE FROM `Preference`");
       this.C();
       this.k();
       uob.G("PRAGMA wal_checkpoint\(FULL\)").close();
       if (!uob.inTransaction()) {
          uob.execSQL("VACUUM");
       }
       return;
    }
    public w i(){
       String[] stringArray = new String[]{"Dependency","WorkSpec","WorkTag","SystemIdInfo","WorkName","WorkProgress","Preference"};
       return new w(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public c j(t p0){
       c$b$a uob$a = c$b.a(p0.b);
       uob$a.c(p0.c);
       uob$a.b(new d0(p0, new WorkDatabase_Impl$a(this, 11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e"));
       return p0.a.a(uob$a.a());
    }
}
