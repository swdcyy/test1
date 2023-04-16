package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo$b;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateGroupInfo;
import java.util.ArrayList;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.util.List;

public final class PicTemplateGroupInfo$b implements Parcelable$Creator	// class@001337
{

    public void PicTemplateGroupInfo$b(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       ArrayList uArrayList;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateGroupInfo$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       String str1 = p0.readString();
       if (p0.readInt()) {
          int i = p0.readInt();
          uArrayList = new ArrayList(i);
          for (; i; i = i - 1) {
             uArrayList.add(PicTemplateInfo.CREATOR.createFromParcel(p0));
          }
       }else {
          uArrayList = null;
       }
       return new PicTemplateGroupInfo(str, str1, uArrayList);
    }
    public final Object[] newArray(int p0){
       PicTemplateGroupInfo[] picTemplateG = new PicTemplateGroupInfo[p0];
       return picTemplateG;
    }
}
