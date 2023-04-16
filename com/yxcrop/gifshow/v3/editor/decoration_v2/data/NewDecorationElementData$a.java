package com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.decoration_v2.data.NewDecorationElementData;
import java.util.ArrayList;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.graphics.RectF;
import java.util.List;

public final class NewDecorationElementData$a implements Parcelable$Creator	// class@000a2f
{

    public void NewDecorationElementData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, NewDecorationElementData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new NewDecorationElementData(p0.createStringArrayList(), p0.readInt(), p0.readParcelable(NewDecorationElementData.class.getClassLoader()));
    }
    public final Object[] newArray(int p0){
       NewDecorationElementData[] newDecoratio = new NewDecorationElementData[p0];
       return newDecoratio;
    }
}
