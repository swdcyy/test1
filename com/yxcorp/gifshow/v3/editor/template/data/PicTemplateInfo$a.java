package com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.v3.editor.template.data.PicTemplateInfo;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public final class PicTemplateInfo$a implements Parcelable$Creator	// class@001339
{

    public void PicTemplateInfo$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       int i;
       ArrayList uArrayList;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateInfo$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       String str1 = p0.readString();
       if (p0.readInt()) {
          i = p0.readInt();
          uArrayList = new ArrayList(i);
          for (; i; i = i - 1) {
             uArrayList.add(p0.readSerializable());
          }
       }else {
          uArrayList = null;
       }
       i = p0.readInt();
       ArrayList uArrayList1 = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList1.add(p0.readSerializable());
       }
       PicTemplateInfo picTemplateI = new PicTemplateInfo(str, str1, uArrayList, uArrayList1, p0.readString(), p0.readInt());
       return obj;
    }
    public final Object[] newArray(int p0){
       PicTemplateInfo[] picTemplateI = new PicTemplateInfo[p0];
       return picTemplateI;
    }
}
