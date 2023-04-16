package com.kuaishou.android.vader.persistent.LogRecordDatabase_Impl$a;
import androidx.room.d0$a;
import com.kuaishou.android.vader.persistent.LogRecordDatabase_Impl;
import a3.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.room.RoomDatabase;
import java.util.List;
import androidx.room.RoomDatabase$b;
import java.util.Objects;
import java.util.HashMap;
import x2.g$a;
import java.util.HashSet;
import x2.g;
import java.util.Map;
import java.util.Set;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;

public class LogRecordDatabase_Impl$a extends d0$a	// class@00071d
{
    public final LogRecordDatabase_Impl b;

    public void LogRecordDatabase_Impl$a(LogRecordDatabase_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase_Impl$a.class, "1")) {
          return;
       }
       p0.execSQL("CREATE TABLE IF NOT EXISTS `LogRecord` \(`seqId` INTEGER NOT NULL, `channelType` INTEGER, `channelSeqId` INTEGER NOT NULL, `customType` TEXT, `customSeqId` INTEGER NOT NULL, `clientTimestamp` INTEGER NOT NULL, `payload` BLOB, `compressAlgorithm` INTEGER NOT NULL, PRIMARY KEY\(`seqId`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \"4c09005c4b7b5d256c98a4fefa210334\"\)");
       return;
    }
    public void b(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase_Impl$a.class, "2")) {
          return;
       }
       p0.execSQL("DROP TABLE IF EXISTS `LogRecord`");
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase_Impl$a.class, "3")) {
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
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase_Impl$a.class, "4")) {
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
    public void h(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LogRecordDatabase_Impl$a.class, "5")) {
          return;
       }
       HashMap hashMap = new HashMap(8);
       hashMap.put("seqId", new g$a("seqId", "INTEGER", true, true));
       hashMap.put("channelType", new g$a("channelType", "INTEGER", false, false));
       hashMap.put("channelSeqId", new g$a("channelSeqId", "INTEGER", true, false));
       hashMap.put("customType", new g$a("customType", "TEXT", false, false));
       hashMap.put("customSeqId", new g$a("customSeqId", "INTEGER", true, false));
       hashMap.put("clientTimestamp", new g$a("clientTimestamp", "INTEGER", true, false));
       hashMap.put("payload", new g$a("payload", "BLOB", false, false));
       hashMap.put("compressAlgorithm", new g$a("compressAlgorithm", "INTEGER", true, false));
       g og = new g("LogRecord", hashMap, new HashSet(false), new HashSet(false));
       g og1 = g.a(p0, "LogRecord");
       if (og.equals(og1)) {
          return;
       }
       throw new IllegalStateException("Migration didn\'t properly handle LogRecord\(com.kuaishou.android.vader.persistent.LogRecord\).\n Expected:\n"+og+"\n Found:\n"+og1);
    }
}
