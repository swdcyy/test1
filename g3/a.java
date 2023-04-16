package g3.a;
import java.lang.Object;
import android.os.Parcelable;
import g3.c;
import androidx.versionedparcelable.ParcelImpl;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.os.Bundle;
import java.lang.ClassLoader;
import java.lang.Class;

public class a	// class@00203e
{

    public void a(){
       super();
    }
    public static c a(Parcelable p0){
       if (p0 instanceof ParcelImpl) {
          return p0.a();
       }
       throw new IllegalArgumentException("Invalid parcel");
    }
    public static c b(Bundle p0,String p1){
       c uoc = null;
       try{
          p0 = p0.getParcelable(p1);
          if (p0 == null) {
             return uoc;
          }
          p0.setClassLoader(a.class.getClassLoader());
          return a.a(p0.getParcelable("a"));
       }catch(java.lang.RuntimeException e0){
          return e0;
       }
    }
    public static void c(Bundle p0,String p1,c p2){
       if (p2 == null) {
          return;
       }
       Bundle uBundle = new Bundle();
       uBundle.putParcelable("a", a.d(p2));
       p0.putParcelable(p1, uBundle);
       return;
    }
    public static Parcelable d(c p0){
       return new ParcelImpl(p0);
    }
}
