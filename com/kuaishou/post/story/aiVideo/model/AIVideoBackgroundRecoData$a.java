package com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import java.util.ArrayList;
import java.io.Serializable;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.List;

public final class AIVideoBackgroundRecoData$a implements Parcelable$Creator	// class@000abd
{

    public void AIVideoBackgroundRecoData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AIVideoBackgroundRecoData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       String str = p0.readString();
       int i = p0.readInt();
       ArrayList uArrayList = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList.add(p0.readSerializable());
       }
       return new AIVideoBackgroundRecoData(str, uArrayList);
    }
    public final Object[] newArray(int p0){
       AIVideoBackgroundRecoData[] uAIVideoBack = new AIVideoBackgroundRecoData[p0];
       return uAIVideoBack;
    }
}
