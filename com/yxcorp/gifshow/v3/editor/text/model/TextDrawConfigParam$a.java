package com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import android.graphics.Rect;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;

public final class TextDrawConfigParam$a implements Parcelable$Creator	// class@001469
{

    public void TextDrawConfigParam$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, TextDrawConfigParam$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "in");
       int i = p0.readInt();
       int i1 = p0.readInt();
       int i2 = p0.readInt();
       int i3 = p0.readInt();
       int i4 = p0.readInt();
       int i5 = p0.readInt();
       int i6 = p0.readInt();
       Object obj2 = Rect.CREATOR.createFromParcel(obj);
       int i7 = p0.readInt();
       int i8 = p0.readInt();
       String str = p0.readString();
       int i9 = p0.readInt();
       int i10 = p0.readInt();
       int i11 = p0.readInt();
       String str1 = p0.readString();
       String str2 = p0.readString();
       String str3 = p0.readString();
       String str4 = p0.readString();
       boolean b = (p0.readInt())? true: false;
       TextDrawConfigParam textDrawConf = new TextDrawConfigParam(i, i1, i2, i3, i4, i5, i6, obj2, i7, i8, str, i9, i10, i11, str1, str2, str3, str4, b, p0.readInt(), p0.readInt(), p0.readInt(), p0.readInt(), p0.readInt(), TextStyleAttrs.CREATOR.createFromParcel(obj), TextStyleValue.CREATOR.createFromParcel(obj));
       return obj1;
    }
    public final Object[] newArray(int p0){
       TextDrawConfigParam[] textDrawConf = new TextDrawConfigParam[p0];
       return textDrawConf;
    }
}
