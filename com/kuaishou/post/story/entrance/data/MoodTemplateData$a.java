package com.kuaishou.post.story.entrance.data.MoodTemplateData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.entrance.data.MoodTemplateData;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.v3.editor.PostTaskManager$PostTaskState;
import java.lang.Enum;
import java.util.List;

public final class MoodTemplateData$a implements Parcelable$Creator	// class@000b34
{

    public void MoodTemplateData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = p0;
       Object obj1 = PatchProxy.applyOneRefs(obj, this, MoodTemplateData$a.class, "1");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       a.p(obj, "in");
       String str = p0.readString();
       String str1 = p0.readString();
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(p0.readSerializable());
       }
       i = p0.readInt();
       ArrayList uArrayList1 = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList1.add(p0.readSerializable());
       }
       String str2 = p0.readString();
       String str3 = p0.readString();
       int i1 = p0.readInt();
       int i2 = p0.readInt();
       double d = p0.readDouble();
       double d1 = p0.readDouble();
       String str4 = p0.readString();
       String str5 = p0.readString();
       Enum uEnum = Enum.valueOf(PostTaskManager$PostTaskState.class, p0.readString());
       String str6 = p0.readString();
       String str7 = p0.readString();
       int i3 = p0.readInt();
       int i4 = p0.readInt();
       int i5 = p0.readInt();
       int i6 = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       MoodTemplateData moodTemplate = new MoodTemplateData(str, str1, uArrayList, uArrayList1, str2, str3, i1, i2, d, d1, str4, str5, uEnum, str6, str7, i3, i4, i5, i6, b);
       return obj1;
    }
    public final Object[] newArray(int p0){
       MoodTemplateData[] moodTemplate = new MoodTemplateData[p0];
       return moodTemplate;
    }
}
