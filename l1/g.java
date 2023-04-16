package l1.g;
import java.lang.Iterable;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import android.content.Intent;
import android.app.Activity;
import l1.g$a;
import androidx.core.app.b;
import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import java.lang.IllegalStateException;
import java.lang.String;

public final class g implements Iterable	// class@0024f6
{
    public final ArrayList b;
    public final Context c;

    public void g(Context p0){
       super();
       this.b = new ArrayList();
       this.c = p0;
    }
    public static g m(Context p0){
       return new g(p0);
    }
    public g b(Intent p0){
       this.b.add(p0);
       return this;
    }
    public g d(Activity p0){
       Intent supportParen = p0.getSupportParentActivityIntent();
       if (supportParen == null) {
          supportParen = b.a(p0);
       }
       if (supportParen != null) {
          ComponentName component = supportParen.getComponent();
          if (component == null) {
             component = supportParen.resolveActivity(this.c.getPackageManager());
          }
          this.l(component);
          this.b(supportParen);
       }
       return this;
    }
    public Iterator iterator(){
       return this.b.iterator();
    }
    public g l(ComponentName p0){
       int i = this.b.size();
       try{
          for (Intent intent = b.b(this.c, p0); intent != null; intent = b.b(this.c, intent.getComponent())) {
             this.b.add(i, intent);
          }
          return this;
       }catch(android.content.pm.PackageManager$NameNotFoundException e3){
          throw new IllegalArgumentException(e3);
       }
    }
    public void n(){
       this.p(null);
    }
    public void p(Bundle p0){
       if (this.b.isEmpty()) {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
       }
       g tb = this.b;
       Intent[] intentArray = new Intent[tb.size()];
       Intent[] intentArray1 = tb.toArray(intentArray);
       intentArray1[0] = new Intent(intentArray1[0]).addFlags(0x1000c000);
       if (!ContextCompat.startActivities(this.c, intentArray1, null)) {
          Intent intent = new Intent(intentArray1[(intentArray1.length - 1)]);
          intent.addFlags(0x10000000);
          this.c.startActivity(intent);
       }
       return;
    }
}
