package cg8.c$n;
import v2.p;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import com.mini.packagemanager.model.MainPackageModel;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;

public class c$n extends p	// class@000413
{
    public final c d;

    public void c$n(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "DELETE FROM `MainPackageModel` WHERE `appId` = ? AND `releaseCode` = ? AND `buildEnv` = ?";
    }
    public void g(f p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$n.class, "1")) {
       }else {
          MainPackageModel appId = p1.appId;
          int i = 1;
          if (appId == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, appId);
          }
          p0.bindLong(2, (long)p1.releaseCode);
          p1 = p1.buildEnv;
          if (p1 == null) {
             p0.bindNull(3);
          }else {
             p0.bindString(3, p1);
          }
       }
       return;
    }
}
