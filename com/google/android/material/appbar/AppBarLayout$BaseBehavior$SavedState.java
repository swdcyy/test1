package com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.os.Parcelable;

public class AppBarLayout$BaseBehavior$SavedState extends AbsSavedState	// class@00160c
{
    public int d;
    public float e;
    public boolean f;
    public static final Parcelable$Creator CREATOR;

    static {
       AppBarLayout$BaseBehavior$SavedState.CREATOR = new AppBarLayout$BaseBehavior$SavedState$a();
    }
    public void AppBarLayout$BaseBehavior$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = p0.readInt();
       this.e = p0.readFloat();
       boolean b = (p0.readByte())? true: false;
       this.f = b;
       return;
    }
    public void AppBarLayout$BaseBehavior$SavedState(Parcelable p0){
       super(p0);
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.d);
       p0.writeFloat(this.e);
       p0.writeByte((byte)this.f);
    }
}
