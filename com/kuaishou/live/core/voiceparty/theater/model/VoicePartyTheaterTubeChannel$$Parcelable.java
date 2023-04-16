package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel$$Parcelable$a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;

public class VoicePartyTheaterTubeChannel$$Parcelable implements Parcelable, d	// class@00197d
{
    public VoicePartyTheaterTubeChannel voicePartyTheaterTubeChannel$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VoicePartyTheaterTubeChannel$$Parcelable.CREATOR = new VoicePartyTheaterTubeChannel$$Parcelable$a();
    }
    public void VoicePartyTheaterTubeChannel$$Parcelable(VoicePartyTheaterTubeChannel p0){
       super();
       this.voicePartyTheaterTubeChannel$$0 = p0;
    }
    public static VoicePartyTheaterTubeChannel read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          VoicePartyTheaterTubeChannel voicePartyTh = new VoicePartyTheaterTubeChannel();
          p1.f(p1.g(), voicePartyTh);
          voicePartyTh.mColor = p0.readString();
          voicePartyTh.mChannelId = p0.readInt();
          voicePartyTh.mName = p0.readString();
          p1.f(i, voicePartyTh);
          return voicePartyTh;
       }
    }
    public static void write(VoicePartyTheaterTubeChannel p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mColor);
          p1.writeInt(p0.mChannelId);
          p1.writeString(p0.mName);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VoicePartyTheaterTubeChannel getParcel(){
       return this.voicePartyTheaterTubeChannel$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VoicePartyTheaterTubeChannel$$Parcelable.write(this.voicePartyTheaterTubeChannel$$0, p0, p1, new a());
    }
}
