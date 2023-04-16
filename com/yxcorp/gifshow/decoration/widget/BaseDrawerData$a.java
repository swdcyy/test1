package com.yxcorp.gifshow.decoration.widget.BaseDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.graphics.RectF;

public final class BaseDrawerData$a implements Parcelable$Creator	// class@0012b0
{

    public void BaseDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, BaseDrawerData$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "in");
       String str = p0.readString();
       int i = p0.readInt();
       float f = p0.readFloat();
       float f1 = p0.readFloat();
       float f2 = p0.readFloat();
       float f3 = p0.readFloat();
       float f4 = p0.readFloat();
       float f5 = p0.readFloat();
       float f6 = p0.readFloat();
       float f7 = p0.readFloat();
       float f8 = p0.readFloat();
       float f9 = p0.readFloat();
       int i1 = p0.readInt();
       String str1 = p0.readString();
       int i2 = p0.readInt();
       Parcelable parcelable = obj.readParcelable(BaseDrawerData.class.getClassLoader());
       Parcelable parcelable1 = obj.readParcelable(BaseDrawerData.class.getClassLoader());
       int i3 = p0.readInt();
       int i4 = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       BaseDrawerData uBaseDrawerD = new BaseDrawerData(str, i, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, i1, str1, i2, parcelable, parcelable1, i3, i4, b, p0.readFloat());
       return obj1;
    }
    public final Object[] newArray(int p0){
       BaseDrawerData[] uBaseDrawerD = new BaseDrawerData[p0];
       return uBaseDrawerD;
    }
}
