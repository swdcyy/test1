package androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Bundle;

public class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable	// class@00056e
{
    public int b;
    public boolean c;
    public Bundle d;
    public static final Parcelable$Creator CREATOR;

    static {
       AppCompatDelegateImpl$PanelFeatureState$SavedState.CREATOR = new AppCompatDelegateImpl$PanelFeatureState$SavedState$a();
    }
    public void AppCompatDelegateImpl$PanelFeatureState$SavedState(){
       super();
    }
    public static AppCompatDelegateImpl$PanelFeatureState$SavedState a(Parcel p0,ClassLoader p1){
       AppCompatDelegateImpl$PanelFeatureState$SavedState panelFeature = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
       panelFeature.b = p0.readInt();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       panelFeature.c = b;
       if (b) {
          panelFeature.d = p0.readBundle(p1);
       }
       return panelFeature;
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       if (this.c != null) {
          p0.writeBundle(this.d);
       }
       return;
    }
}
