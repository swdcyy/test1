package com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;

public final class TextStyleValue$a implements Parcelable$Creator	// class@001471
{

    public void TextStyleValue$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleValue$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = p0.readInt();
       String str = p0.readString();
       String str1 = p0.readString();
       String str2 = p0.readString();
       String str3 = p0.readString();
       int i1 = p0.readInt();
       String str4 = p0.readString();
       boolean b = (p0.readInt())? true: false;
       TextStyleValue textStyleVal = new TextStyleValue(i, str, str1, str2, str3, i1, str4, b);
       return obj;
    }
    public final Object[] newArray(int p0){
       TextStyleValue[] textStyleVal = new TextStyleValue[p0];
       return textStyleVal;
    }
}
