package com.kwai.components.feedmodel.AiScriptSection$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kwai.components.feedmodel.AiScriptSection$$Parcelable;
import xwd.a;
import com.kwai.components.feedmodel.AiScriptSection;

public class AiScriptSection$$Parcelable$a implements Parcelable$Creator	// class@000c0b
{

    public void AiScriptSection$$Parcelable$a(){
       super();
    }
    public Object createFromParcel(Parcel p0){
       return new AiScriptSection$$Parcelable(AiScriptSection$$Parcelable.read(p0, new a()));
    }
    public Object[] newArray(int p0){
       AiScriptSection$$Parcelable[] $ParcelableA = new AiScriptSection$$Parcelable[p0];
       return $ParcelableA;
    }
}
