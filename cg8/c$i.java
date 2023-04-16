package cg8.c$i;
import v2.q;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.mini.packagemanager.model.FrameworkModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.mini.packagemanager.model.BaseFileModel;
import a3.d;
import java.util.List;
import gg8.b;

public class c$i extends q	// class@00040e
{
    public final c d;

    public void c$i(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "INSERT OR REPLACE INTO `FrameworkModel` \(`versionCode`,`versionName`,`size`,`md5`,`desc`,`updateTime`,`url`,`cdnURLs`,`downloadPriority`\) VALUES \(?,?,?,?,?,?,?,?,?\)";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$i.class, "1")) {
       }else {
          p0.bindLong(1, (long)p1.versionCode);
          BaseFileModel versionName = p1.versionName;
          int i = 2;
          if (versionName == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, versionName);
          }
          p0.bindLong(3, p1.size);
          versionName = p1.md5;
          i = 4;
          if (versionName == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, versionName);
          }
          versionName = p1.desc;
          i = 5;
          if (versionName == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, versionName);
          }
          p0.bindLong(6, p1.updateTime);
          versionName = p1.url;
          i = 7;
          if (versionName == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, versionName);
          }
          String str = this.d.c.a(p1.cdnUrls);
          if (str == null) {
             p0.bindNull(8);
          }else {
             p0.bindString(8, str);
          }
          p1 = p1.downloadPriority;
          if (p1 == null) {
             p0.bindNull(9);
          }else {
             p0.bindString(9, p1);
          }
       }
       return;
    }
}
