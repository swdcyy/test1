package com.kwai.library.widget.viewpager.VerticalViewPager$SavedState;
import android.view.View$BaseSavedState;
import com.kwai.library.widget.viewpager.VerticalViewPager$SavedState$a;
import w1.j;
import android.os.Parcelable$Creator;
import w1.i;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.Class;
import java.lang.Object;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class VerticalViewPager$SavedState extends View$BaseSavedState	// class@000a77
{
    public int b;
    public Parcelable c;
    public ClassLoader d;
    public static final Parcelable$Creator CREATOR;

    static {
       VerticalViewPager$SavedState.CREATOR = i.a(new VerticalViewPager$SavedState$a());
    }
    public void VerticalViewPager$SavedState(Parcel p0,ClassLoader p1){
       super(p0);
       if (p1 == null) {
          p1 = this.getClass().getClassLoader();
       }
       this.b = p0.readInt();
       this.c = p0.readParcelable(p1);
       this.d = p1;
       return;
    }
    public void VerticalViewPager$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "FragmentPager.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" position="+this.b+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.b);
       p0.writeParcelable(this.c, p1);
    }
}
