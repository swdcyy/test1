package com.yxcorp.gifshow.magic.data.db.MagicFaceDatabase_Impl$a;
import androidx.room.d0$a;
import com.yxcorp.gifshow.magic.data.db.MagicFaceDatabase_Impl;
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

public class MagicFaceDatabase_Impl$a extends d0$a	// class@001b88
{
    public final MagicFaceDatabase_Impl b;

    public void MagicFaceDatabase_Impl$a(MagicFaceDatabase_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDatabase_Impl$a.class, "1")) {
          return;
       }
       p0.execSQL("CREATE TABLE IF NOT EXISTS `magicgroup` \(`businessId` INTEGER NOT NULL, `groupId` TEXT NOT NULL, `groupName` TEXT NOT NULL, `groupType` INTEGER NOT NULL, `groupPosition` INTEGER NOT NULL, PRIMARY KEY\(`businessId`, `groupId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `magicemoji_brief` \(`businessId` INTEGER NOT NULL, `groupId` TEXT NOT NULL, `magicFaceId` TEXT NOT NULL, `magicPosition` INTEGER NOT NULL, PRIMARY KEY\(`businessId`, `groupId`, `magicFaceId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `magicface` \(`id` TEXT NOT NULL, `checksum` INTEGER NOT NULL, `checkList` TEXT NOT NULL, `jsonStr` TEXT NOT NULL, PRIMARY KEY\(`id`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'d91859a69012d3dad23e8ed60da01807\'\)");
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDatabase_Impl$a.class, "2")) {
          return;
       }
       p0.execSQL("DROP TABLE IF EXISTS `magicgroup`");
       p0.execSQL("DROP TABLE IF EXISTS `magicemoji_brief`");
       p0.execSQL("DROP TABLE IF EXISTS `magicface`");
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
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDatabase_Impl$a.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDatabase_Impl$a.class, "4")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicFaceDatabase_Impl$a.class, "5")) {
          return;
       }
       c.a(p0);
       return;
    }
    public d0$b g(b p0){
       g obj = p0;
       HashMap obj1 = PatchProxy.applyOneRefs(obj, this, MagicFaceDatabase_Impl$a.class, "6");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       obj1 = new HashMap(5);
       g$a uoa = new g$a("businessId", "INTEGER", true, 1, null, 1);
       String str = "businessId";
       obj1.put(str, v2);
       g$a uoa1 = new g$a("groupId", "TEXT", 1, 2, null, 1);
       String str1 = "groupId";
       obj1.put(str1, v2);
       g$a uoa2 = new g$a("groupName", "TEXT", true, 0, null, 1);
       obj1.put("groupName", v2);
       boolean b = true;
       boolean i = 0;
       String str2 = null;
       int i1 = 1;
       g$a uoa3 = new g$a("groupType", "INTEGER", b, i, str2, i1);
       obj1.put("groupType", v2);
       uoa3 = new g$a("groupPosition", "INTEGER", b, i, str2, i1);
       obj1.put("groupPosition", v2);
       String str3 = "magicgroup";
       g og = new g(str3, obj1, new HashSet(0), new HashSet(0));
       g og1 = g.a(obj, str3);
       if (!og.equals(og1)) {
          return new d0$b(0, "magicgroup\(com.yxcorp.gifshow.magic.data.db.MagicGroupEntity\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       int i2 = 4;
       obj1 = new HashMap(i2);
       i = true;
       String str4 = null;
       int i3 = 1;
       g$a uoa4 = new g$a("businessId", "INTEGER", i, 1, str4, i3);
       obj1.put(str, v15);
       g$a uoa5 = new g$a("groupId", "TEXT", true, 2, null, 1);
       obj1.put(str1, str);
       uoa4 = new g$a("magicFaceId", "TEXT", i, 3, str4, i3);
       obj1.put("magicFaceId", str);
       uoa4 = new g$a("magicPosition", "INTEGER", i, 0, str4, i3);
       obj1.put("magicPosition", str);
       str3 = "magicemoji_brief";
       og = new g(str3, obj1, new HashSet(0), new HashSet(0));
       og1 = g.a(obj, str3);
       if (!og.equals(og1)) {
          return new d0$b(0, "magicemoji_brief\(com.yxcorp.gifshow.magic.data.db.MagicEmojiBriefEntity\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       obj1 = new HashMap(i2);
       uoa4 = new g$a("id", "TEXT", true, 1, null, 1);
       obj1.put("id", i2);
       uoa4 = new g$a("checksum", "INTEGER", true, 0, null, 1);
       obj1.put("checksum", i2);
       uoa4 = new g$a("checkList", "TEXT", true, 0, null, 1);
       obj1.put("checkList", i2);
       uoa4 = new g$a("jsonStr", "TEXT", true, 0, null, 1);
       obj1.put("jsonStr", i2);
       g og2 = new g("magicface", obj1, new HashSet(0), new HashSet(0));
       obj = g.a(obj, "magicface");
       if (!og2.equals(obj)) {
          return new d0$b(0, "magicface\(com.yxcorp.gifshow.magic.data.db.MagicFaceEntity\).\n Expected:\n"+og2+"\n Found:\n"+obj);
       }
       return new d0$b(true, null);
    }
}
