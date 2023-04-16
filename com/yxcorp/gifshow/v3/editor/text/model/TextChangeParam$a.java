package com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;

public final class TextChangeParam$a implements Parcelable$Creator	// class@001465
{

    public void TextChangeParam$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TextChangeParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       TextChangeParam textChangePa = new TextChangeParam(p0.readFloat(), p0.readString(), p0.readString(), p0.createStringArray(), p0.readInt(), p0.readInt(), p0.readInt(), p0.readFloat(), p0.readInt(), p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       TextChangeParam[] textChangePa = new TextChangeParam[p0];
       return textChangePa;
    }
}
