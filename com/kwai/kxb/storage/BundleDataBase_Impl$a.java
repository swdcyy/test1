package com.kwai.kxb.storage.BundleDataBase_Impl$a;
import androidx.room.d0$a;
import com.kwai.kxb.storage.BundleDataBase_Impl;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.room.RoomDatabase;
import java.util.List;
import androidx.room.RoomDatabase$b;
import java.util.Objects;
import x2.c;
import androidx.room.d0$b;
import com.kwai.robust.PatchProxyResult;
import java.util.HashMap;
import x2.g$a;
import java.util.HashSet;
import x2.g;
import java.util.Map;
import java.util.Set;
import java.lang.StringBuilder;

public class BundleDataBase_Impl$a extends d0$a	// class@0007ef
{
    public final BundleDataBase_Impl b;

    public void BundleDataBase_Impl$a(BundleDataBase_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundleDataBase_Impl$a.class, "1")) {
          return;
       }
       p0.execSQL("CREATE TABLE IF NOT EXISTS `bundle` \(`bundle_id` TEXT NOT NULL, `source` INTEGER NOT NULL, `version_code` INTEGER NOT NULL, `version_name` TEXT NOT NULL, `url` TEXT, `zip_md5` TEXT, `zip_file_path` TEXT, `install_dir_path` TEXT, `task_id` INTEGER NOT NULL, `id` TEXT NOT NULL, `diff_url` TEXT, `diff_md5` TEXT, `extra_info` TEXT, `installAppVersion` INTEGER NOT NULL, PRIMARY KEY\(`id`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'fad1c34c9962ce1e945243f390c25c9b\'\)");
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundleDataBase_Impl$a.class, "2")) {
          return;
       }
       p0.execSQL("DROP TABLE IF EXISTS `bundle`");
       RoomDatabase h = this.b.h;
       if (h != null) {
          int i1 = h.size();
          for (int i = 0; i < i1; i = i + 1) {
             this.b.h.get(i).a(p0);
          }
       }
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundleDataBase_Impl$a.class, "3")) {
          return;
       }
       RoomDatabase h = this.b.h;
       if (h != null) {
          int i1 = h.size();
          for (int i = 0; i < i1; i = i + 1) {
             Objects.requireNonNull(this.b.h.get(i));
          }
       }
       return;
    }
    public void d(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundleDataBase_Impl$a.class, "4")) {
          return;
       }
       this.b.a = p0;
       this.b.v(p0);
       RoomDatabase h = this.b.h;
       if (h != null) {
          int i1 = h.size();
          for (int i = 0; i < i1; i = i + 1) {
             this.b.h.get(i).b(p0);
          }
       }
       return;
    }
    public void e(b p0){
    }
    public void f(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BundleDataBase_Impl$a.class, "5")) {
          return;
       }
       c.a(p0);
       return;
    }
    public d0$b g(b p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, BundleDataBase_Impl$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(14);
       g$a uoa = new g$a("bundle_id", "TEXT", true, 0, null, 1);
       obj.put("bundle_id", v1);
       g$a uoa1 = new g$a("source", "INTEGER", true, 0, null, 1);
       obj.put("source", v1);
       uoa1 = new g$a("version_code", "INTEGER", true, 0, null, 1);
       obj.put("version_code", v1);
       uoa1 = new g$a("version_name", "TEXT", true, 0, null, 1);
       obj.put("version_name", v1);
       uoa1 = new g$a("url", "TEXT", false, 0, null, 1);
       obj.put("url", v1);
       uoa1 = new g$a("zip_md5", "TEXT", false, 0, null, 1);
       obj.put("zip_md5", v1);
       uoa1 = new g$a("zip_file_path", "TEXT", false, 0, null, 1);
       obj.put("zip_file_path", v1);
       uoa1 = new g$a("install_dir_path", "TEXT", false, 0, null, 1);
       obj.put("install_dir_path", v1);
       uoa1 = new g$a("task_id", "INTEGER", true, 0, null, 1);
       obj.put("task_id", v1);
       uoa1 = new g$a("id", "TEXT", true, 1, null, 1);
       obj.put("id", v1);
       uoa1 = new g$a("diff_url", "TEXT", false, 0, null, 1);
       obj.put("diff_url", v1);
       uoa1 = new g$a("diff_md5", "TEXT", false, 0, null, 1);
       obj.put("diff_md5", v1);
       uoa1 = new g$a("extra_info", "TEXT", false, 0, null, 1);
       obj.put("extra_info", v1);
       uoa1 = new g$a("installAppVersion", "INTEGER", true, 0, null, 1);
       obj.put("installAppVersion", v1);
       g og = new g("bundle", obj, new HashSet(0), new HashSet(0));
       g og1 = g.a(p0, "bundle");
       if (!og.equals(og1)) {
          return new d0$b(0, "bundle\(com.kwai.kxb.storage.BundleEntity\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       return new d0$b(true, null);
    }
}
