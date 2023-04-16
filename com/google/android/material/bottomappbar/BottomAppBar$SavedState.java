package com.google.android.material.bottomappbar.BottomAppBar$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.bottomappbar.BottomAppBar$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class BottomAppBar$SavedState extends AbsSavedState	// class@00163c
{
    public int d;
    public boolean e;
    public static final Parcelable$Creator CREATOR;

    static {
       BottomAppBar$SavedState.CREATOR = new BottomAppBar$SavedState$a();
    }
    public void BottomAppBar$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       this.e = b;
       return;
    }
    public void BottomAppBar$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       p0.writeInt(this.e);
    }
}
