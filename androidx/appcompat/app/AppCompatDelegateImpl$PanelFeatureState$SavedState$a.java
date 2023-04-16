package androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import androidx.appcompat.app.AppCompatDelegateImpl$PanelFeatureState$SavedState;
import java.lang.ClassLoader;

public class AppCompatDelegateImpl$PanelFeatureState$SavedState$a implements Parcelable$ClassLoaderCreator	// class@00056d
{

    public void AppCompatDelegateImpl$PanelFeatureState$SavedState$a(){
       super();
    }
    public AppCompatDelegateImpl$PanelFeatureState$SavedState a(Parcel p0){
       return AppCompatDelegateImpl$PanelFeatureState$SavedState.a(p0, null);
    }
    public AppCompatDelegateImpl$PanelFeatureState$SavedState b(Parcel p0,ClassLoader p1){
       return AppCompatDelegateImpl$PanelFeatureState$SavedState.a(p0, p1);
    }
    public AppCompatDelegateImpl$PanelFeatureState$SavedState[] c(int p0){
       AppCompatDelegateImpl$PanelFeatureState$SavedState[] panelFeature = new AppCompatDelegateImpl$PanelFeatureState$SavedState[p0];
       return panelFeature;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object createFromParcel(Parcel p0,ClassLoader p1){
       return this.b(p0, p1);
    }
    public Object[] newArray(int p0){
       return this.c(p0);
    }
}
