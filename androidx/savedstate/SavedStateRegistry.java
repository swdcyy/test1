package androidx.savedstate.SavedStateRegistry;
import java.lang.Object;
import y0.b;
import java.lang.String;
import android.os.Bundle;
import java.lang.IllegalStateException;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.SavedStateRegistry$1;
import androidx.lifecycle.LifecycleObserver;
import y0.b$d;
import java.util.Map$Entry;
import androidx.savedstate.SavedStateRegistry$b;
import java.lang.IllegalArgumentException;

public final class SavedStateRegistry	// class@000989
{
    public b a;
    public Bundle b;
    public boolean c;
    public Recreator$a d;
    public boolean e;

    public void SavedStateRegistry(){
       super();
       this.a = new b();
       this.e = true;
    }
    public Bundle a(String p0){
       if (this.c == null) {
          throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
       }
       SavedStateRegistry tb = this.b;
       if (tb == null) {
          return null;
       }
       Bundle bundle = tb.getBundle(p0);
       this.b.remove(p0);
       if (this.b.isEmpty()) {
          this.b = null;
       }
       return bundle;
    }
    public void b(Lifecycle p0,Bundle p1){
       if (this.c != null) {
          throw new IllegalStateException("SavedStateRegistry was already restored.");
       }
       if (p1 != null) {
          this.b = p1.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
       }
       p0.addObserver(new SavedStateRegistry$1(this));
       this.c = true;
       return;
    }
    public void c(Bundle p0){
       String key;
       Bundle uBundle = new Bundle();
       SavedStateRegistry tb = this.b;
       if (tb != null) {
          uBundle.putAll(tb);
       }
       b$d uod = this.a.l();
       while (uod.hasNext()) {
          Map$Entry uEntry = uod.next();
          key = uEntry.getKey();
          uBundle.putBundle(key, uEntry.getValue().g());
       }
       p0.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", uBundle);
       return;
    }
    public void d(String p0,SavedStateRegistry$b p1){
       if (this.a.p(p0, p1) == null) {
          return;
       }
       throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
    }
}
