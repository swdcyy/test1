package com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundData;
import java.util.ArrayList;
import com.kuaishou.post.story.aiVideo.model.AIVideoBackgroundRecoData;
import java.util.List;

public final class AIVideoBackgroundData$a implements Parcelable$Creator	// class@000aba
{

    public void AIVideoBackgroundData$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AIVideoBackgroundData$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       ArrayList uArrayList = p0.createStringArrayList();
       int i = p0.readInt();
       ArrayList uArrayList1 = new ArrayList(i);
       for (; i; i = i - 1) {
          uArrayList1.add(AIVideoBackgroundRecoData.CREATOR.createFromParcel(p0));
       }
       AIVideoBackgroundData uAIVideoBack = new AIVideoBackgroundData(uArrayList, uArrayList1, p0.readInt(), p0.readInt(), p0.readString());
       return obj;
    }
    public final Object[] newArray(int p0){
       AIVideoBackgroundData[] uAIVideoBack = new AIVideoBackgroundData[p0];
       return uAIVideoBack;
    }
}
