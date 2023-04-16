package com.google.android.material.textfield.TextInputLayout$SavedState$a;
import android.os.Parcelable$ClassLoaderCreator;
import java.lang.Object;
import android.os.Parcel;
import com.google.android.material.textfield.TextInputLayout$SavedState;
import java.lang.ClassLoader;

public final class TextInputLayout$SavedState$a implements Parcelable$ClassLoaderCreator	// class@0016df
{

    public void TextInputLayout$SavedState$a(){
       super();
    }
    public TextInputLayout$SavedState a(Parcel p0){
       return new TextInputLayout$SavedState(p0, null);
    }
    public TextInputLayout$SavedState b(Parcel p0,ClassLoader p1){
       return new TextInputLayout$SavedState(p0, p1);
    }
    public TextInputLayout$SavedState[] c(int p0){
       TextInputLayout$SavedState[] savedStateAr = new TextInputLayout$SavedState[p0];
       return savedStateAr;
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
