package com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.util.ArrayList;
import java.lang.Integer;
import java.util.List;

public final class TextStyleAttrs$a implements Parcelable$Creator	// class@00146b
{

    public void TextStyleAttrs$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextStyleAttrs$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       boolean b = true;
       boolean b1 = (p0.readInt())? true: false;
       boolean b2 = (p0.readInt())? true: false;
       if (!p0.readInt()) {
          b = false;
       }
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(Integer.valueOf(p0.readInt()));
       }
       return new TextStyleAttrs(b1, b2, b, uArrayList);
    }
    public final Object[] newArray(int p0){
       TextStyleAttrs[] textStyleAtt = new TextStyleAttrs[p0];
       return textStyleAtt;
    }
}
