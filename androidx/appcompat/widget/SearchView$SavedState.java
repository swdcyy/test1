package androidx.appcompat.widget.SearchView$SavedState;
import androidx.customview.view.AbsSavedState;
import androidx.appcompat.widget.SearchView$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Object;
import java.lang.Boolean;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class SearchView$SavedState extends AbsSavedState	// class@000616
{
    public boolean d;
    public static final Parcelable$Creator CREATOR;

    static {
       SearchView$SavedState.CREATOR = new SearchView$SavedState$a();
    }
    public void SearchView$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readValue(null).booleanValue();
    }
    public void SearchView$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "SearchView.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" isIconified="+this.d+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeValue(Boolean.valueOf(this.d));
    }
}
