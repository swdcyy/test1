package cg8.c$m;
import v2.p;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.mini.packagemanager.model.SubPackageModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;

public class c$m extends p	// class@000412
{
    public final c d;

    public void c$m(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM `SubPackageModel` WHERE `appId` = ? AND `root` = ? AND `releaseCode` = ? AND `buildEnv` = ?";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$m.class, "1")) {
       }else {
          SubPackageModel appId = p1.appId;
          int i = 1;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          appId = p1.root;
          i = 2;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p0.bindLong(3, (long)p1.releaseCode);
          p1 = p1.buildEnv;
          if (p1 == null) {
             p0.bindNull(4);
          }else {
             p0.bindString(4, p1);
          }
       }
       return;
    }
}
