package com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.decoration.model.EditBaseDrawerData;

public final class EditBaseDrawerData$a implements Parcelable$Creator	// class@000f13
{

    public void EditBaseDrawerData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditBaseDrawerData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       int i = p0.readInt();
       double d = p0.readDouble();
       double d1 = p0.readDouble();
       int i1 = p0.readInt();
       int i2 = p0.readInt();
       float f = p0.readFloat();
       boolean b = false;
       int i3 = (p0.readInt())? 1: 0;
       if (p0.readInt()) {
          b = true;
       }
       EditBaseDrawerData uEditBaseDra = new EditBaseDrawerData(str, i, d, d1, i1, i2, f, i3, b, p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       EditBaseDrawerData[] uEditBaseDra = new EditBaseDrawerData[p0];
       return uEditBaseDra;
    }
}
