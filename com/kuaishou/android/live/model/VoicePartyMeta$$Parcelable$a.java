package com.kuaishou.android.live.model.VoicePartyMeta$$Parcelable$a;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import com.kuaishou.android.live.model.VoicePartyMeta$$Parcelable;
import xwd.a;
import com.kuaishou.android.live.model.VoicePartyMeta;

public class VoicePartyMeta$$Parcelable$a implements Parcelable$Creator	// class@000838
{

    public void VoicePartyMeta$$Parcelable$a(){
       super();
    }
    public VoicePartyMeta$$Parcelable a(Parcel p0){
       return new VoicePartyMeta$$Parcelable(VoicePartyMeta$$Parcelable.read(p0, new a()));
    }
    public VoicePartyMeta$$Parcelable[] b(int p0){
       VoicePartyMeta$$Parcelable[] $ParcelableA = new VoicePartyMeta$$Parcelable[p0];
       return $ParcelableA;
    }
    public Object createFromParcel(Parcel p0){
       return this.a(p0);
    }
    public Object[] newArray(int p0){
       return this.b(p0);
    }
}
