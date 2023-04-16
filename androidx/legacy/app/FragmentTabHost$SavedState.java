package androidx.legacy.app.FragmentTabHost$SavedState;
import android.view.View$BaseSavedState;
import androidx.legacy.app.FragmentTabHost$SavedState$a;
import android.os.Parcel;
import java.lang.String;
import android.os.Parcelable;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.System;
import java.lang.Integer;

public class FragmentTabHost$SavedState extends View$BaseSavedState	// class@0007b1
{
    public String b;
    public static final Parcelable$Creator CREATOR;

    static {
       FragmentTabHost$SavedState.CREATOR = new FragmentTabHost$SavedState$a();
    }
    public void FragmentTabHost$SavedState(Parcel p0){
       super(p0);
       this.b = p0.readString();
    }
    public void FragmentTabHost$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "FragmentTabHost.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" curTab="+this.b+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeString(this.b);
    }
}
