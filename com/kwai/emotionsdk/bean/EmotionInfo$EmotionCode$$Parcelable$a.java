package com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode$$Parcelable;
import xwd.a;
import com.kwai.emotionsdk.bean.EmotionInfo$EmotionCode;

public class EmotionInfo$EmotionCode$$Parcelable$a implements Parcelable$Creator	// class@000d7a
{

    public void EmotionInfo$EmotionCode$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new EmotionInfo$EmotionCode$$Parcelable(EmotionInfo$EmotionCode$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       EmotionInfo$EmotionCode$$Parcelable[] uEmotionCode = new EmotionInfo$EmotionCode$$Parcelable[p0];
       return uEmotionCode;
    }
}
