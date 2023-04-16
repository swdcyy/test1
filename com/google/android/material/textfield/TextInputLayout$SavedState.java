package com.google.android.material.textfield.TextInputLayout$SavedState;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.textfield.TextInputLayout$SavedState$a;
import android.os.Parcel;
import java.lang.ClassLoader;
import android.text.TextUtils;
import java.lang.Object;
import android.os.Parcelable$Creator;
import java.lang.CharSequence;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;

public class TextInputLayout$SavedState extends AbsSavedState	// class@0016e0
{
    public CharSequence d;
    public boolean e;
    public static final Parcelable$Creator CREATOR;

    static {
       TextInputLayout$SavedState.CREATOR = new TextInputLayout$SavedState$a();
    }
    public void TextInputLayout$SavedState(Parcel p0,ClassLoader p1){
       super(p0, p1);
       this.d = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(p0);
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.e = b;
       return;
    }
    public void TextInputLayout$SavedState(Parcelable p0){
       super(p0);
    }
    public String toString(){
       return "TextInputLayout.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" error="+this.d+"}";
    }
    public void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       TextUtils.writeToParcel(this.d, p0, p1);
       p0.writeInt(this.e);
    }
}
