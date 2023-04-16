package com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditLyricElementData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.music_v2.ui.lyric.element.EditLyricElementData;

public final class EditLyricElementData$a implements Parcelable$Creator	// class@0010db
{

    public void EditLyricElementData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, EditLyricElementData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new EditLyricElementData(p0.readString());
    }
    public final Object[] newArray(int p0){
       EditLyricElementData[] uEditLyricEl = new EditLyricElementData[p0];
       return uEditLyricEl;
    }
}
