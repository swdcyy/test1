package com.yxcorp.gifshow.storage.db.FolUserSearchDB_Impl$a;
import androidx.room.d0$a;
import com.yxcorp.gifshow.storage.db.FolUserSearchDB_Impl;
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
import x2.g$d;
import java.util.Arrays;
import x2.g;
import java.util.Map;
import java.util.Set;
import java.lang.StringBuilder;

public class FolUserSearchDB_Impl$a extends d0$a	// class@001d89
{
    public final FolUserSearchDB_Impl b;

    public void FolUserSearchDB_Impl$a(FolUserSearchDB_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "1")) {
          return;
       }
       p0.execSQL("CREATE TABLE IF NOT EXISTS `FolUserSearch` \(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `source_user_id` TEXT NOT NULL, `user_name` TEXT, `pinyin` TEXT, `remark_name` TEXT, `remark_pinyin` TEXT, `gender` TEXT, `is_friend` INTEGER NOT NULL, `raw` TEXT, `pinyin_start` TEXT, `remark_pinyin_start` TEXT, `insert_time` INTEGER NOT NULL\)");
       p0.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FolUserSearch_source_user_id_user_id` ON `FolUserSearch` \(`source_user_id`, `user_id`\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'21a4f18693b012f5dd242cedb82d41a2\'\)");
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "2")) {
          return;
       }
       p0.execSQL("DROP TABLE IF EXISTS `FolUserSearch`");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "4")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "5")) {
          return;
       }
       c.a(p0);
       return;
    }
    public d0$b g(b p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, FolUserSearchDB_Impl$a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap(13);
       g$a uoa = new g$a("id", "INTEGER", true, 1, null, 1);
       obj.put("id", v1);
       g$a uoa1 = new g$a("user_id", "TEXT", 1, 0, null, 1);
       obj.put("user_id", v1);
       uoa1 = new g$a("source_user_id", "TEXT", 1, 0, null, 1);
       obj.put("source_user_id", v1);
       g$a uoa2 = new g$a("user_name", "TEXT", 0, 0, null, 1);
       obj.put("user_name", v1);
       g$a uoa3 = new g$a("pinyin", "TEXT", 0, 0, null, 1);
       obj.put("pinyin", v1);
       uoa3 = new g$a("remark_name", "TEXT", 0, 0, null, 1);
       obj.put("remark_name", v1);
       uoa3 = new g$a("remark_pinyin", "TEXT", 0, 0, null, 1);
       obj.put("remark_pinyin", v1);
       uoa3 = new g$a("gender", "TEXT", 0, 0, null, 1);
       obj.put("gender", v1);
       uoa3 = new g$a("is_friend", "INTEGER", true, 0, null, 1);
       obj.put("is_friend", v1);
       uoa3 = new g$a("raw", "TEXT", false, 0, null, 1);
       obj.put("raw", v1);
       uoa3 = new g$a("pinyin_start", "TEXT", false, 0, null, 1);
       obj.put("pinyin_start", v1);
       uoa3 = new g$a("remark_pinyin_start", "TEXT", false, 0, null, 1);
       obj.put("remark_pinyin_start", v1);
       uoa3 = new g$a("insert_time", "INTEGER", true, 0, null, 1);
       obj.put("insert_time", v1);
       HashSet hashSet = new HashSet(1);
       String[] stringArray = new String[]{"source_user_id","user_id"};
       hashSet.add(new g$d("index_FolUserSearch_source_user_id_user_id", 1, Arrays.asList(stringArray)));
       String str = "FolUserSearch";
       g og = new g(str, obj, new HashSet(0), hashSet);
       g og1 = g.a(p0, str);
       if (!og.equals(og1)) {
          return new d0$b(0, "FolUserSearch\(com.yxcorp.gifshow.storage.db.FolUserSearch\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       return new d0$b(1, null);
    }
}
