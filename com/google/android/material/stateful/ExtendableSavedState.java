package com.google.android.material.stateful.ExtendableSavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.stateful.ExtendableSavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import java.lang.String;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcelable$Creator;
import androidx.collection.SimpleArrayMap;
import android.os.Parcelable;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class ExtendableSavedState extends AbsSavedState	// class@0016b0
{
    public final SimpleArrayMap d;
    public static final Parcelable$Creator CREATOR;

    static {
       ExtendableSavedState.CREATOR = new ExtendableSavedState$a();
    }
    public void ExtendableSavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       int i = p0.readInt();
       String[] stringArray = new String[i];
       p0.readStringArray(stringArray);
       Bundle[] uBundleArray = new Bundle[i];
       p0.readTypedArray(uBundleArray, Bundle.CREATOR);
       this.d = new SimpleArrayMap(i);
       for (int i1 = 0; i1 < i; i1++) {
          this.d.put(stringArray[i1], uBundleArray[i1]);
       }
       return;
    }
    public void ExtendableSavedState(Parcel p0,ClassLoader p1,ExtendableSavedState$a p2){
       super(p0, p1);
    }
    public void ExtendableSavedState(Parcelable p0){
       super(p0);
       this.d = new SimpleArrayMap();
    }
    public String toString(){
       return "ExtendableSavedState{"+Integer.toHexString(System.identityHashCode(this))+" states="+this.d+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p1 = this.d.size();
       p0.writeInt(p1);
       String[] stringArray = new String[p1];
       Bundle[] uBundleArray = new Bundle[p1];
       for (int i = 0; i < p1; i = i + 1) {
          stringArray[i] = this.d.keyAt(i);
          uBundleArray[i] = this.d.valueAt(i);
       }
       p0.writeStringArray(stringArray);
       p0.writeTypedArray(uBundleArray, 0);
       return;
    }
}
