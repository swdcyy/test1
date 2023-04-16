package com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode;
import android.os.Parcelable;
import java.lang.Enum;
import java.lang.String;
import com.kuaishou.post.story.aiVideo.MoodAIVideoErrorCode$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.os.Parcel;
import java.lang.Integer;
import kotlin.jvm.internal.a;

public final class MoodAIVideoErrorCode extends Enum implements Parcelable	// class@000aac
{
    public static final MoodAIVideoErrorCode[] $VALUES;
    public static final Parcelable$Creator CREATOR;
    public static final MoodAIVideoErrorCode EMPTY_DATA;
    public static final MoodAIVideoErrorCode FILE_NOT_EXIST;
    public static final MoodAIVideoErrorCode NETWORK_ERROR;
    public static final MoodAIVideoErrorCode NO_ERROR;
    public static final MoodAIVideoErrorCode OTHER;
    public static final MoodAIVideoErrorCode TIME_OUT;

    static {
       MoodAIVideoErrorCode moodAIVideoE1;
       MoodAIVideoErrorCode[] moodAIVideoE = new MoodAIVideoErrorCode[]{moodAIVideoE1,moodAIVideoE1,moodAIVideoE1,moodAIVideoE1,moodAIVideoE1,moodAIVideoE1};
       moodAIVideoE1 = new MoodAIVideoErrorCode("NO_ERROR", 0);
       MoodAIVideoErrorCode.NO_ERROR = moodAIVideoE1;
       moodAIVideoE1 = new MoodAIVideoErrorCode("NETWORK_ERROR", 1);
       MoodAIVideoErrorCode.NETWORK_ERROR = moodAIVideoE1;
       moodAIVideoE1 = new MoodAIVideoErrorCode("EMPTY_DATA", 2);
       MoodAIVideoErrorCode.EMPTY_DATA = moodAIVideoE1;
       moodAIVideoE1 = new MoodAIVideoErrorCode("FILE_NOT_EXIST", 3);
       MoodAIVideoErrorCode.FILE_NOT_EXIST = moodAIVideoE1;
       moodAIVideoE1 = new MoodAIVideoErrorCode("TIME_OUT", 4);
       MoodAIVideoErrorCode.TIME_OUT = moodAIVideoE1;
       moodAIVideoE1 = new MoodAIVideoErrorCode("OTHER", 5);
       MoodAIVideoErrorCode.OTHER = moodAIVideoE1;
       MoodAIVideoErrorCode.$VALUES = moodAIVideoE;
       MoodAIVideoErrorCode.CREATOR = new MoodAIVideoErrorCode$a();
    }
    public void MoodAIVideoErrorCode(String p0,int p1){
       super(p0, p1);
    }
    public static MoodAIVideoErrorCode valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MoodAIVideoErrorCode.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MoodAIVideoErrorCode.class, p0);
    }
    public static MoodAIVideoErrorCode[] values(){
       Object obj = PatchProxy.apply(null, null, MoodAIVideoErrorCode.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MoodAIVideoErrorCode.$VALUES.clone();
    }
    public int describeContents(){
       return 0;
    }
    public void writeToParcel(Parcel p0,int p1){
       if (PatchProxy.isSupport(MoodAIVideoErrorCode.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, MoodAIVideoErrorCode.class, "3")) {
          return;
       }
       a.p(p0, "parcel");
       p0.writeString(this.name());
       return;
    }
}
