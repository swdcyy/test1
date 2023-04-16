package com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.graphics.RectF;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import java.util.List;

public final class TextConfigParam$a implements Parcelable$Creator	// class@001467
{

    public void TextConfigParam$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       int i4;
       ArrayList uArrayList1;
       Object obj = PatchProxy.applyOneRefs(p0, this, TextConfigParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       int i = p0.readInt();
       Parcelable parcelable = p0.readParcelable(TextConfigParam.class.getClassLoader());
       Parcelable parcelable1 = p0.readParcelable(TextConfigParam.class.getClassLoader());
       int i1 = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       int i2 = p0.readInt();
       String str = p0.readString();
       int i3 = p0.readInt();
       ArrayList uArrayList = null;
       if (p0.readInt()) {
          i4 = p0.readInt();
          uArrayList1 = new ArrayList(i4);
          for (; i4; i4 = i4 - 1) {
             uArrayList1.add(p0.readSerializable());
          }
       }else {
          uArrayList1 = uArrayList;
       }
       if (p0.readInt()) {
          i4 = p0.readInt();
          uArrayList = new ArrayList(i4);
          for (; i4; i4 = i4 - 1) {
             uArrayList.add(p0.readSerializable());
          }
       }
       TextConfigParam textConfigPa = new TextConfigParam(i, parcelable, parcelable1, i1, b, i2, str, i3, uArrayList1, uArrayList, TextDrawConfigParam.CREATOR.createFromParcel(p0));
       return obj;
    }
    public final Object[] newArray(int p0){
       TextConfigParam[] textConfigPa = new TextConfigParam[p0];
       return textConfigPa;
    }
}
