package com.kwai.yoda.store.db.YodaDatabase_Impl$a;
import androidx.room.d0$a;
import com.kwai.yoda.store.db.YodaDatabase_Impl;
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

public class YodaDatabase_Impl$a extends d0$a	// class@0012ed
{
    public final YodaDatabase_Impl b;

    public void YodaDatabase_Impl$a(YodaDatabase_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaDatabase_Impl$a.class, "1")) {
          return;
       }
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_preload_file` \(`md5` TEXT NOT NULL, `url` TEXT NOT NULL, `filepath` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY\(`name`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_biz_info` \(`bizName` TEXT NOT NULL, `version` INTEGER NOT NULL, `url` TEXT NOT NULL, `data` TEXT, `launchOptions` TEXT, `bizId` TEXT NOT NULL, PRIMARY KEY\(`bizId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_offline_package_request_info` \(`version` INTEGER NOT NULL, `isImportant` INTEGER NOT NULL, `loadType` INTEGER NOT NULL, `packageType` INTEGER NOT NULL, `packageUrl` TEXT NOT NULL, `checksum` TEXT NOT NULL, `status` TEXT NOT NULL, `updateMode` INTEGER NOT NULL, `domainFileJson` TEXT NOT NULL, `downloadCostTime` INTEGER NOT NULL, `throttled` INTEGER NOT NULL, `hyId` TEXT NOT NULL, `patch_sourceVersion` INTEGER, `patch_url` TEXT, `patch_md5` TEXT, PRIMARY KEY\(`hyId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_offline_package_match_info` \(`version` INTEGER NOT NULL, `size` INTEGER NOT NULL, `loadType` INTEGER NOT NULL, `packageType` INTEGER NOT NULL, `installMode` INTEGER NOT NULL, `fileCount` INTEGER NOT NULL, `contentJson` TEXT NOT NULL, `domainFileJson` TEXT NOT NULL, `isImportant` INTEGER NOT NULL, `hyId` TEXT NOT NULL, PRIMARY KEY\(`hyId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_loading_config_info` \(`loadingText` TEXT, `loadingTextColor` TEXT, `bgColor` TEXT, `timeout` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `offsetTop` INTEGER NOT NULL, `resMd5` TEXT, `id` TEXT NOT NULL, PRIMARY KEY\(`id`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `yoda_loading_res_info` \(`newResUrl` TEXT, `animationType` TEXT, `state` TEXT NOT NULL, `md5` TEXT NOT NULL, PRIMARY KEY\(`md5`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'380278a1ecdbb06ba24b8971ed1fa9ad\'\)");
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaDatabase_Impl$a.class, "2")) {
          return;
       }
       p0.execSQL("DROP TABLE IF EXISTS `yoda_preload_file`");
       p0.execSQL("DROP TABLE IF EXISTS `yoda_biz_info`");
       p0.execSQL("DROP TABLE IF EXISTS `yoda_offline_package_request_info`");
       p0.execSQL("DROP TABLE IF EXISTS `yoda_offline_package_match_info`");
       p0.execSQL("DROP TABLE IF EXISTS `yoda_loading_config_info`");
       p0.execSQL("DROP TABLE IF EXISTS `yoda_loading_res_info`");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaDatabase_Impl$a.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaDatabase_Impl$a.class, "4")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, YodaDatabase_Impl$a.class, "5")) {
          return;
       }
       c.a(p0);
       return;
    }
    public d0$b g(b p0){
       g obj = p0;
       HashMap obj1 = PatchProxy.applyOneRefs(obj, this, YodaDatabase_Impl$a.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new HashMap(4);
       g$a uoa = new g$a("md5", "TEXT", true, 0, null, 1);
       String str = "md5";
       obj1.put(str, v11);
       g$a uoa1 = new g$a("url", "TEXT", true, 0, null, 1);
       String str1 = "url";
       obj1.put(str1, v5);
       g$a uoa2 = new g$a("filepath", "TEXT", 1, 0, null, 1);
       obj1.put("filepath", v5);
       g$a uoa3 = new g$a("name", "TEXT", true, 1, null, 1);
       obj1.put("name", v5);
       String str2 = "yoda_preload_file";
       g og = new g(str2, obj1, new HashSet(0), new HashSet(0));
       g og1 = g.a(obj, str2);
       if (!og.equals(og1)) {
          return new d0$b(0, "yoda_preload_file\(com.kwai.yoda.hybrid.db.PreloadFileItemDB\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(6);
       g$a uoa4 = new g$a("bizName", "TEXT", true, 0, null, 1);
       obj1.put("bizName", v5);
       String str3 = null;
       int i = 1;
       g$a uoa5 = new g$a("version", "INTEGER", true, 0, str3, i);
       String str4 = "version";
       obj1.put(str4, v5);
       uoa5 = new g$a("url", "TEXT", true, 0, str3, i);
       obj1.put(str1, v5);
       g$a uoa6 = new g$a("data", "TEXT", false, 0, null, 1);
       obj1.put("data", v5);
       uoa5 = new g$a("launchOptions", "TEXT", false, 0, str3, i);
       obj1.put("launchOptions", v5);
       uoa5 = new g$a("bizId", "TEXT", true, 1, str3, i);
       obj1.put("bizId", v5);
       String str5 = "yoda_biz_info";
       g og2 = new g(str5, obj1, new HashSet(0), new HashSet(0));
       og1 = g.a(obj, str5);
       if (!og2.equals(og1)) {
          return new d0$b(0, "yoda_biz_info\(com.kwai.yoda.hybrid.db.BizInfoDB\).\n Expected:\n"+og2+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(15);
       uoa5 = new g$a("version", "INTEGER", true, 0, null, 1);
       obj1.put(str4, v5);
       uoa6 = new g$a("isImportant", "INTEGER", true, 0, null, 1);
       str1 = "isImportant";
       obj1.put(str1, v5);
       uoa5 = new g$a("loadType", "INTEGER", true, 0, null, 1);
       str2 = "loadType";
       obj1.put(str2, v5);
       g$a uoa7 = new g$a("packageType", "INTEGER", true, 0, null, 1);
       str5 = "packageType";
       obj1.put(str5, v5);
       uoa1 = new g$a("packageUrl", "TEXT", true, 0, null, 1);
       obj1.put("packageUrl", v5);
       g$a uoa8 = new g$a("checksum", "TEXT", true, 0, null, 1);
       obj1.put("checksum", v5);
       uoa8 = new g$a("status", "TEXT", true, 0, null, 1);
       obj1.put("status", v5);
       uoa8 = new g$a("updateMode", "INTEGER", true, 0, null, 1);
       obj1.put("updateMode", v5);
       uoa8 = new g$a("domainFileJson", "TEXT", true, 0, null, 1);
       String str6 = "domainFileJson";
       obj1.put(str6, v5);
       uoa8 = new g$a("downloadCostTime", "INTEGER", true, 0, null, 1);
       obj1.put("downloadCostTime", v5);
       g$a uoa9 = new g$a("throttled", "INTEGER", true, 0, null, true);
       obj1.put("throttled", v5);
       uoa9 = new g$a("hyId", "TEXT", true, 1, null, true);
       String str7 = "hyId";
       obj1.put(str7, v5);
       int i1 = 0;
       uoa9 = new g$a("patch_sourceVersion", "INTEGER", false, i1, null, true);
       obj1.put("patch_sourceVersion", v5);
       int i2 = 0;
       String str8 = null;
       int i3 = 1;
       g$a uoa10 = new g$a("patch_url", "TEXT", i1, i2, str8, i3);
       obj1.put("patch_url", v5);
       uoa10 = new g$a("patch_md5", "TEXT", i1, i2, str8, i3);
       obj1.put("patch_md5", v5);
       g og3 = new g("yoda_offline_package_request_info", obj1, new HashSet(0), new HashSet(0));
       og1 = g.a(obj, "yoda_offline_package_request_info");
       if (!og3.equals(og1)) {
          return new d0$b(0, "yoda_offline_package_request_info\(com.kwai.yoda.store.db.offline.OfflinePackageRequestInfoDB\).\n Expected:\n"+og3+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(10);
       uoa6 = new g$a("version", "INTEGER", true, 0, null, 1);
       obj1.put(str4, v2);
       g$a uoa11 = new g$a("size", "INTEGER", true, 0, null, 1);
       obj1.put("size", v2);
       uoa6 = new g$a("loadType", "INTEGER", true, 0, null, 1);
       obj1.put(str2, v2);
       uoa11 = new g$a("packageType", "INTEGER", true, 0, null, 1);
       obj1.put(str5, v2);
       uoa6 = new g$a("installMode", "INTEGER", true, 0, null, 1);
       obj1.put("installMode", v2);
       uoa6 = new g$a("fileCount", "INTEGER", true, 0, null, 1);
       obj1.put("fileCount", v2);
       uoa6 = new g$a("contentJson", "TEXT", true, 0, null, 1);
       obj1.put("contentJson", v2);
       uoa6 = new g$a("domainFileJson", "TEXT", true, 0, null, 1);
       obj1.put(str6, v2);
       uoa11 = new g$a("isImportant", "INTEGER", true, 0, null, 1);
       obj1.put(str1, v2);
       uoa6 = new g$a("hyId", "TEXT", true, 1, null, 1);
       obj1.put(str7, v2);
       str4 = "yoda_offline_package_match_info";
       g og4 = new g(str4, obj1, new HashSet(0), new HashSet(0));
       og1 = g.a(obj, str4);
       if (!og4.equals(og1)) {
          return new d0$b(0, "yoda_offline_package_match_info\(com.kwai.yoda.store.db.offline.OfflinePackageMatchInfoDB\).\n Expected:\n"+og4+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(9);
       String str9 = null;
       int i4 = 1;
       uoa4 = new g$a("loadingText", "TEXT", false, 0, str9, i4);
       obj1.put("loadingText", v2);
       uoa4 = new g$a("loadingTextColor", "TEXT", false, 0, str9, i4);
       obj1.put("loadingTextColor", v2);
       uoa4 = new g$a("bgColor", "TEXT", false, 0, str9, i4);
       obj1.put("bgColor", v2);
       uoa4 = new g$a("timeout", "INTEGER", true, 0, str9, i4);
       obj1.put("timeout", v2);
       uoa4 = new g$a("width", "INTEGER", true, 0, str9, i4);
       obj1.put("width", v2);
       uoa4 = new g$a("height", "INTEGER", true, 0, str9, i4);
       obj1.put("height", v2);
       uoa4 = new g$a("offsetTop", "INTEGER", true, 0, str9, i4);
       obj1.put("offsetTop", v2);
       uoa4 = new g$a("resMd5", "TEXT", false, 0, str9, i4);
       obj1.put("resMd5", v2);
       uoa4 = new g$a("id", "TEXT", true, 1, str9, i4);
       obj1.put("id", v2);
       str4 = "yoda_loading_config_info";
       og4 = new g(str4, obj1, new HashSet(0), new HashSet(0));
       og1 = g.a(obj, str4);
       if (!og4.equals(og1)) {
          return new d0$b(0, "yoda_loading_config_info\(com.kwai.yoda.kernel.store.db.loading.LoadingConfigInfoDB\).\n Expected:\n"+og4+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(4);
       uoa4 = new g$a("newResUrl", "TEXT", false, 0, null, 1);
       obj1.put("newResUrl", v2);
       uoa4 = new g$a("animationType", "TEXT", false, 0, null, 1);
       obj1.put("animationType", v2);
       uoa4 = new g$a("state", "TEXT", true, 0, null, 1);
       obj1.put("state", v2);
       uoa4 = new g$a("md5", "TEXT", true, 1, null, 1);
       obj1.put(str, v2);
       g og5 = new g("yoda_loading_res_info", obj1, new HashSet(0), new HashSet(0));
       obj = g.a(obj, "yoda_loading_res_info");
       if (!og5.equals(obj)) {
          return new d0$b(0, "yoda_loading_res_info\(com.kwai.yoda.kernel.store.db.loading.LoadingResInfoDB\).\n Expected:\n"+og5+"\n Found:\n"+obj);
       }
       return new d0$b(true, null);
    }
}
