package cg8.c$l;
import v2.q;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.mini.packagemanager.model.MainPackageModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.mini.packagemanager.model.BaseFileModel;
import a3.d;
import java.util.List;
import gg8.b;

public class c$l extends q	// class@000411
{
    public final c d;

    public void c$l(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "INSERT OR REPLACE INTO `MainPackageModel` \(`versionCode`,`versionName`,`size`,`md5`,`desc`,`updateTime`,`url`,`cdnURLs`,`appId`,`buildEnv`,`frameworkVersionCode`,`releaseCode`,`compilerVersion`,`ws`\) VALUES \(?,?,?,?,?,?,?,?,?,?,?,?,?,?\)";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$l.class, "1")) {
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
          i = 8;
          if (str == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, str);
          }
          MainPackageModel appId = p1.appId;
          i = 9;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.buildEnv;
          i = 10;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p0.bindLong(11, (long)p1.frameworkVersionCode);
          p0.bindLong(12, (long)p1.releaseCode);
          appId = p1.compilerVersion;
          if (appId == null) {
             p0.bindNull(13);
          }else {
             p0.bindString(13, appId);
          }
          p1 = p1.ws;
          if (p1 == null) {
             p0.bindNull(14);
          }else {
             p0.bindString(14, p1);
          }
       }
       return;
    }
}
