package androidx.fragment.app.Fragment$SavedState;
import android.os.Parcelable;
import androidx.fragment.app.Fragment$SavedState$a;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;

public class Fragment$SavedState implements Parcelable	// class@000779
{
    public final Bundle b;
    public static final Parcelable$Creator CREATOR;

    static {
       Fragment$SavedState.CREATOR = new Fragment$SavedState$a();
    }
    public void Fragment$SavedState(Bundle p0){
       super();
       this.b = p0;
    }
    public void Fragment$SavedState(Parcel p0,ClassLoader p1){
       super();
       Bundle uBundle = p0.readBundle();
       this.b = uBundle;
       if (p1 != null && uBundle != null) {
          uBundle.setClassLoader(p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeBundle(this.b);
    }
}
