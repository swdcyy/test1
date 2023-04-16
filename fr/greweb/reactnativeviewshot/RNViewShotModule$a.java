package fr.greweb.reactnativeviewshot.RNViewShotModule$a;
import java.io.FilenameFilter;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.io.File;
import android.content.ContextWrapper;
import java.lang.String;
import java.lang.Object;
import java.lang.Void;

public class RNViewShotModule$a extends GuardedAsyncTask implements FilenameFilter	// class@000e55
{
    public final File b;
    public final File c;

    public void RNViewShotModule$a(ReactContext p0){
       super(p0);
       this.b = p0.getCacheDir();
       this.c = p0.getExternalCacheDir();
    }
    public final void a(File p0){
       File[] uFileArray = p0.listFiles(this);
       if (uFileArray != null) {
          int len = uFileArray.length;
          int i = 0;
          while (i < len) {
             object oobject = uFileArray[i];
             if (oobject.delete()) {
                oobject.getAbsolutePath();
             }
             i = i + 1;
          }
       }
       return;
    }
    public final boolean accept(File p0,String p1){
       return p1.startsWith("ReactNative-snapshot-image");
    }
    public void doInBackgroundGuarded(Object[] p0){
       RNViewShotModule$a tb = this.b;
       if (tb != null) {
          this.a(tb);
       }
       tb = this.c;
       if (tb != null) {
          this.a(tb);
       }
       return;
    }
}
