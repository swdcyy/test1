package com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.NewTextElementData;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTextStyleInfo;
import com.yxcorp.gifshow.v3.editor.text.model.TextDrawConfigParam;
import java.io.Serializable;
import com.yxcorp.gifshow.v3.editor.text.dynamic.model.DynamicTextParams;
import com.yxcrop.gifshow.v3.editor.text_v2_share.model.DraftTTSInfo;
import com.yxcorp.gifshow.decoration.widget.BaseDrawerData$CustomButtonMode;
import java.lang.Enum;
import java.lang.ClassLoader;
import android.os.Parcelable;
import android.graphics.RectF;

public final class NewTextElementData$b implements Parcelable$Creator	// class@000bd2
{

    public void NewTextElementData$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, NewTextElementData$b.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "in");
       boolean b = (p0.readInt())? true: false;
       String str = p0.readString();
       Object obj2 = DraftTextStyleInfo.CREATOR.createFromParcel(obj);
       int i = p0.readInt();
       BaseDrawerData$CustomButtonMode uCustomButto = null;
       TextDrawConfigParam textDrawConf = (p0.readInt())? TextDrawConfigParam.CREATOR.createFromParcel(obj): uCustomButto;
       Serializable serializable = p0.readSerializable();
       String str1 = p0.readString();
       DraftTTSInfo uDraftTTSInf = (p0.readInt())? DraftTTSInfo.CREATOR.createFromParcel(obj): uCustomButto;
       NewTextElementData newTextEleme = new NewTextElementData(b, str, obj2, i, textDrawConf, serializable, str1, uDraftTTSInf, p0.readString(), p0.readInt(), Enum.valueOf(BaseDrawerData$CustomButtonMode.class, p0.readString()), obj.readParcelable(NewTextElementData.class.getClassLoader()), p0.readInt());
       return obj1;
    }
    public final Object[] newArray(int p0){
       NewTextElementData[] newTextEleme = new NewTextElementData[p0];
       return newTextEleme;
    }
}
