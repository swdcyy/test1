package com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import java.lang.Enum;

public final class MoodAIVideoErrorCode$a implements Parcelable$Creator	// class@000aab
{

    public void MoodAIVideoErrorCode$a(){
       super();
    }
    public final Object createFromParcel(Parcel p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MoodAIVideoErrorCode$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "in");
       return Enum.valueOf(MoodAIVideoErrorCode.class, p0.readString());
    }
    public final Object[] newArray(int p0){
       MoodAIVideoErrorCode[] moodAIVideoE = new MoodAIVideoErrorCode[p0];
       return moodAIVideoE;
    }
}
