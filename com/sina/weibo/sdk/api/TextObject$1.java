package com.sina.weibo.sdk.api.TextObject$1;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.sina.weibo.sdk.api.TextObject;

public final class TextObject$1 implements Parcelable$Creator	// class@000ba3
{

    public void TextObject$1(){
       super();
    }
    public final TextObject createFromParcel(Parcel p0){
       return new TextObject(p0);
    }
    public final Object createFromParcel(Parcel p0){
       return this.createFromParcel(p0);
    }
    public final TextObject[] newArray(int p0){
       TextObject[] textObjectAr = new TextObject[p0];
       return textObjectAr;
    }
    public final Object[] newArray(int p0){
       return this.newArray(p0);
    }
}
