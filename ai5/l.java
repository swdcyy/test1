package ai5.l;
import java.lang.Runnable;
import com.kwai.component.upgrade.UpgradeMigrationInitModule;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import vid.b;
import ai5.k;
import android.content.SharedPreferences$Editor;
import oe6.g;
import java.lang.Exception;

public final class l implements Runnable	// class@0000b0
{
    public final UpgradeMigrationInitModule b;

    public void l(UpgradeMigrationInitModule p0){
       this.b = p0;
    }
    public final void run(){
       l tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, UpgradeMigrationInitModule.class, "2")) {
       }else if(a.a().b()){
          try{
             SharedPreferences sharedPrefer = b.c(a.b(), a.w, 0);
             if (sharedPrefer.getInt("version_code", 0) != a.q) {
                k.a.a(a.b());
                g.a(sharedPrefer.edit().putInt("version_code", a.q));
             }
          }catch(java.lang.Exception e0){
             e0.printStackTrace();
          }
       }
    }
}
