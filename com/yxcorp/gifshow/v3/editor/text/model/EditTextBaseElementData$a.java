package com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.text.model.EditTextBaseElementData;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextChangeParam;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;

public final class EditTextBaseElementData$a implements Parcelable$Creator	// class@001463
{

    public void EditTextBaseElementData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditTextBaseElementData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       EditTextBaseElementData uEditTextBas = new EditTextBaseElementData(TextDrawConfigParam.CREATOR.createFromParcel(p0), p0.readString(), TextChangeParam.CREATOR.createFromParcel(p0), p0.readInt(), p0.readInt(), p0.readInt(), TextStyleValue.CREATOR.createFromParcel(p0));
       return obj;
    }
    public final Object[] newArray(int p0){
       EditTextBaseElementData[] uEditTextBas = new EditTextBaseElementData[p0];
       return uEditTextBas;
    }
}
