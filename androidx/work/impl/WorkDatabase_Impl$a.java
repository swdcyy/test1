package androidx.work.impl.WorkDatabase_Impl$a;
import androidx.room.d0$a;
import androidx.work.impl.WorkDatabase_Impl;
import a3.b;
import java.lang.String;
import androidx.room.RoomDatabase;
import java.util.List;
import java.lang.Object;
import androidx.room.RoomDatabase$b;
import java.util.Objects;
import x2.c;
import androidx.room.d0$b;
import java.util.HashMap;
import x2.g$a;
import java.util.HashSet;
import x2.g$b;
import java.util.Arrays;
import x2.g$d;
import x2.g;
import java.util.Map;
import java.util.Set;
import java.lang.StringBuilder;

public class WorkDatabase_Impl$a extends d0$a	// class@000a65
{
    public final WorkDatabase_Impl b;

    public void WorkDatabase_Impl$a(WorkDatabase_Impl p0,int p1){
       this.b = p0;
       super(p1);
    }
    public void a(b p0){
       p0.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` \(`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY\(`work_spec_id`, `prerequisite_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY\(`prerequisite_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` \(`work_spec_id`\)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` \(`prerequisite_id`\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` \(`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY\(`id`\)\)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` \(`schedule_requested_at`\)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` \(`period_start_time`\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` \(`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY\(`tag`, `work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` \(`work_spec_id`\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` \(`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` \(`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY\(`name`, `work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` \(`work_spec_id`\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` \(`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY\(`work_spec_id`\), FOREIGN KEY\(`work_spec_id`\) REFERENCES `WorkSpec`\(`id`\) ON UPDATE CASCADE ON DELETE CASCADE \)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS `Preference` \(`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY\(`key`\)\)");
       p0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table \(id INTEGER PRIMARY KEY,identity_hash TEXT\)");
       p0.execSQL("INSERT OR REPLACE INTO room_master_table \(id,identity_hash\) VALUES\(42, \'cf029002fffdcadf079e8d0a1c9a70ac\'\)");
    }
    public void b(b p0){
       p0.execSQL("DROP TABLE IF EXISTS `Dependency`");
       p0.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
       p0.execSQL("DROP TABLE IF EXISTS `WorkTag`");
       p0.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
       p0.execSQL("DROP TABLE IF EXISTS `WorkName`");
       p0.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
       p0.execSQL("DROP TABLE IF EXISTS `Preference`");
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
       this.b.a = p0;
       p0.execSQL("PRAGMA foreign_keys = ON");
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
       c.a(p0);
    }
    public d0$b g(b p0){
       b uob = p0;
       int i = 2;
       HashMap hashMap = new HashMap(i);
       g$a uoa = new g$a("work_spec_id", "TEXT", true, 1, null, 1);
       String str = "work_spec_id";
       hashMap.put(str, v10);
       g$a uoa1 = new g$a("prerequisite_id", "TEXT", true, 2, null, 1);
       hashMap.put("prerequisite_id", v4);
       HashSet hashSet = new HashSet(i);
       String[] stringArray = new String[]{str};
       String str1 = "id";
       stringArray = new String[]{str1};
       g$b uob1 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray), Arrays.asList(stringArray));
       hashSet.add(v12);
       String[] stringArray1 = new String[]{"prerequisite_id"};
       stringArray1 = new String[]{str1};
       g$b uob2 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray1), Arrays.asList(stringArray1));
       hashSet.add(uob1);
       HashSet hashSet1 = new HashSet(i);
       String[] stringArray2 = new String[]{str};
       hashSet1.add(new g$d("index_Dependency_work_spec_id", false, Arrays.asList(stringArray2)));
       String[] stringArray3 = new String[]{"prerequisite_id"};
       hashSet1.add(new g$d("index_Dependency_prerequisite_id", false, Arrays.asList(stringArray3)));
       String str2 = "Dependency";
       g og = new g(str2, hashMap, hashSet, hashSet1);
       g og1 = g.a(uob, str2);
       if (!og.equals(og1)) {
          return new d0$b(false, "Dependency\(androidx.work.impl.model.Dependency\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(24);
       String str3 = null;
       int i1 = 1;
       g$a uoa2 = new g$a("id", "TEXT", true, 1, str3, i1);
       hashMap.put(str1, hashSet);
       g$a uoa3 = new g$a("state", "INTEGER", true, 0, null, 1);
       hashMap.put("state", hashSet);
       int i2 = 0;
       uoa2 = new g$a("worker_class_name", "TEXT", true, i2, str3, i1);
       hashMap.put("worker_class_name", hashSet);
       uoa2 = new g$a("input_merger_class_name", "TEXT", false, i2, str3, i1);
       hashMap.put("input_merger_class_name", hashSet);
       uoa2 = new g$a("input", "BLOB", true, i2, str3, i1);
       hashMap.put("input", hashSet);
       uoa2 = new g$a("output", "BLOB", true, i2, str3, i1);
       hashMap.put("output", hashSet);
       uoa2 = new g$a("initial_delay", "INTEGER", true, i2, str3, i1);
       hashMap.put("initial_delay", hashSet);
       uoa2 = new g$a("interval_duration", "INTEGER", true, i2, str3, i1);
       hashMap.put("interval_duration", hashSet);
       uoa2 = new g$a("flex_duration", "INTEGER", true, i2, str3, i1);
       hashMap.put("flex_duration", hashSet);
       uoa2 = new g$a("run_attempt_count", "INTEGER", true, i2, str3, i1);
       hashMap.put("run_attempt_count", hashSet);
       uoa2 = new g$a("backoff_policy", "INTEGER", true, i2, str3, i1);
       hashMap.put("backoff_policy", hashSet);
       uoa2 = new g$a("backoff_delay_duration", "INTEGER", true, i2, str3, i1);
       hashMap.put("backoff_delay_duration", hashSet);
       uoa2 = new g$a("period_start_time", "INTEGER", true, i2, str3, i1);
       hashMap.put("period_start_time", hashSet);
       uoa2 = new g$a("minimum_retention_duration", "INTEGER", true, i2, str3, i1);
       hashMap.put("minimum_retention_duration", hashSet);
       uoa2 = new g$a("schedule_requested_at", "INTEGER", true, i2, str3, i1);
       hashMap.put("schedule_requested_at", hashSet);
       uoa2 = new g$a("run_in_foreground", "INTEGER", true, i2, str3, i1);
       hashMap.put("run_in_foreground", hashSet);
       uoa2 = new g$a("required_network_type", "INTEGER", false, i2, str3, i1);
       hashMap.put("required_network_type", hashSet);
       uoa2 = new g$a("requires_charging", "INTEGER", true, i2, str3, i1);
       hashMap.put("requires_charging", hashSet);
       uoa2 = new g$a("requires_device_idle", "INTEGER", true, i2, str3, i1);
       hashMap.put("requires_device_idle", hashSet);
       uoa2 = new g$a("requires_battery_not_low", "INTEGER", true, i2, str3, i1);
       hashMap.put("requires_battery_not_low", hashSet);
       uoa2 = new g$a("requires_storage_not_low", "INTEGER", true, i2, str3, i1);
       hashMap.put("requires_storage_not_low", hashSet);
       uoa2 = new g$a("trigger_content_update_delay", "INTEGER", true, i2, str3, i1);
       hashMap.put("trigger_content_update_delay", hashSet);
       uoa2 = new g$a("trigger_max_content_delay", "INTEGER", true, i2, str3, i1);
       hashMap.put("trigger_max_content_delay", hashSet);
       uoa2 = new g$a("content_uri_triggers", "BLOB", false, i2, str3, i1);
       hashMap.put("content_uri_triggers", hashSet);
       HashSet hashSet2 = new HashSet(i);
       stringArray1 = new String[]{"schedule_requested_at"};
       hashSet2.add(new g$d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(stringArray1)));
       stringArray3 = new String[]{"period_start_time"};
       hashSet2.add(new g$d("index_WorkSpec_period_start_time", false, Arrays.asList(stringArray3)));
       str2 = "WorkSpec";
       og = new g(str2, hashMap, new HashSet(false), hashSet2);
       og1 = g.a(uob, str2);
       if (!og.equals(og1)) {
          return new d0$b(false, "WorkSpec\(androidx.work.impl.model.WorkSpec\).\n Expected:\n"+og+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(i);
       i1 = 1;
       uoa2 = new g$a("tag", "TEXT", true, 1, null, i1);
       hashMap.put("tag", hashSet);
       uoa2 = new g$a("work_spec_id", "TEXT", true, 2, null, i1);
       hashMap.put(str, hashSet);
       hashSet = new HashSet(1);
       stringArray2 = new String[]{str};
       stringArray2 = new String[]{str1};
       uob2 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray2), Arrays.asList(stringArray2));
       hashSet.add(str2);
       HashSet hashSet3 = new HashSet(1);
       String[] stringArray4 = new String[]{str};
       hashSet3.add(new g$d("index_WorkTag_work_spec_id", false, Arrays.asList(stringArray4)));
       String str4 = "WorkTag";
       g og2 = new g(str4, hashMap, hashSet, hashSet3);
       og1 = g.a(uob, str4);
       if (!og2.equals(og1)) {
          return new d0$b(false, "WorkTag\(androidx.work.impl.model.WorkTag\).\n Expected:\n"+og2+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(i);
       uoa2 = new g$a("work_spec_id", "TEXT", true, 1, null, 1);
       hashMap.put(str, hashSet);
       uoa3 = new g$a("system_id", "INTEGER", true, 0, null, 1);
       hashMap.put("system_id", hashSet);
       hashSet = new HashSet(1);
       stringArray2 = new String[]{str};
       stringArray2 = new String[]{str1};
       uob2 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray2), Arrays.asList(stringArray2));
       hashSet.add(hashSet3);
       str4 = "SystemIdInfo";
       og2 = new g(str4, hashMap, hashSet, new HashSet(false));
       og1 = g.a(uob, str4);
       if (!og2.equals(og1)) {
          return new d0$b(false, "SystemIdInfo\(androidx.work.impl.model.SystemIdInfo\).\n Expected:\n"+og2+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(i);
       i1 = 1;
       uoa2 = new g$a("name", "TEXT", true, 1, null, i1);
       hashMap.put("name", hashSet);
       uoa2 = new g$a("work_spec_id", "TEXT", true, 2, null, i1);
       hashMap.put(str, hashSet);
       hashSet = new HashSet(1);
       stringArray2 = new String[]{str};
       stringArray2 = new String[]{str1};
       uob2 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray2), Arrays.asList(stringArray2));
       hashSet.add(hashSet3);
       hashSet3 = new HashSet(1);
       stringArray4 = new String[]{str};
       hashSet3.add(new g$d("index_WorkName_work_spec_id", false, Arrays.asList(stringArray4)));
       og2 = new g("WorkName", hashMap, hashSet, hashSet3);
       og1 = g.a(uob, "WorkName");
       if (!og2.equals(og1)) {
          return new d0$b(false, "WorkName\(androidx.work.impl.model.WorkName\).\n Expected:\n"+og2+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(i);
       uoa2 = new g$a("work_spec_id", "TEXT", true, 1, null, 1);
       hashMap.put(str, hashSet);
       uoa3 = new g$a("progress", "BLOB", true, 0, null, 1);
       hashMap.put("progress", hashSet);
       hashSet = new HashSet(1);
       String[] stringArray5 = new String[]{str};
       stringArray5 = new String[]{str1};
       uob2 = new g$b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(stringArray5), Arrays.asList(stringArray5));
       hashSet.add(hashSet3);
       g og3 = new g("WorkProgress", hashMap, hashSet, new HashSet(false));
       og1 = g.a(uob, "WorkProgress");
       if (!og3.equals(og1)) {
          return new d0$b(false, "WorkProgress\(androidx.work.impl.model.WorkProgress\).\n Expected:\n"+og3+"\n Found:\n"+og1);
       }
       hashMap = new HashMap(i);
       uoa1 = new g$a("key", "TEXT", true, 1, null, 1);
       hashMap.put("key", i);
       uoa1 = new g$a("long_value", "INTEGER", false, 0, null, 1);
       hashMap.put("long_value", i);
       g og4 = new g("Preference", hashMap, new HashSet(false), new HashSet(false));
       g og5 = g.a(uob, "Preference");
       if (!og4.equals(og5)) {
          return new d0$b(false, "Preference\(androidx.work.impl.model.Preference\).\n Expected:\n"+og4+"\n Found:\n"+og5);
       }
       return new d0$b(1, null);
    }
}
