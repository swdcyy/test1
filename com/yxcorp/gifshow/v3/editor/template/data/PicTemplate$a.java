package com.yxcorp.gifshow.v3.editor.template.data.PicTemplate$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplate;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;

public final class PicTemplate$a implements Parcelable$Creator	// class@001323
{

    public void PicTemplate$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplate$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return new PicTemplate(PicTemplateInfo.CREATOR.createFromParcel(p0), PicTemplateGroupInfo.CREATOR.createFromParcel(p0), p0.readString());
    }
    public final Object[] newArray(int p0){
       PicTemplate[] picTemplateA = new PicTemplate[p0];
       return picTemplateA;
    }
}
