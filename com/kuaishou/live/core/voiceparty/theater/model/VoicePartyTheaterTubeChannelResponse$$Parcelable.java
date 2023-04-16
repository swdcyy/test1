package com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse$$Parcelable$a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannelResponse;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeChannel$$Parcelable;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;

public class VoicePartyTheaterTubeChannelResponse$$Parcelable implements Parcelable, d	// class@001980
{
    public VoicePartyTheaterTubeChannelResponse voicePartyTheaterTubeChannelResponse$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VoicePartyTheaterTubeChannelResponse$$Parcelable.CREATOR = new VoicePartyTheaterTubeChannelResponse$$Parcelable$a();
    }
    public void VoicePartyTheaterTubeChannelResponse$$Parcelable(VoicePartyTheaterTubeChannelResponse p0){
       super();
       this.voicePartyTheaterTubeChannelResponse$$0 = p0;
    }
    public static VoicePartyTheaterTubeChannelResponse read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          VoicePartyTheaterTubeChannelResponse voicePartyTh = new VoicePartyTheaterTubeChannelResponse();
          p1.f(p1.g(), voicePartyTh);
          voicePartyTh.mMaxExpandChannelCount = p0.readInt();
          int i1 = p0.readInt();
          Integer integer = null;
          if (i1 < 0) {
             list = integer;
          }else {
             list = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                list.add(VoicePartyTheaterTubeChannel$$Parcelable.read(p0, p1));
             }
          }
          voicePartyTh.mTubeChannels = list;
          if (p0.readInt() >= 0) {
             integer = Integer.valueOf(p0.readInt());
          }
          voicePartyTh.mDefaultChannelId = integer;
          p1.f(i, voicePartyTh);
          return voicePartyTh;
       }
    }
    public static void write(VoicePartyTheaterTubeChannelResponse p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeInt(p0.mMaxExpandChannelCount);
          VoicePartyTheaterTubeChannelResponse mTubeChannel = p0.mTubeChannels;
          if (mTubeChannel == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTubeChannel.size());
             Iterator iterator = p0.mTubeChannels.iterator();
             while (iterator.hasNext()) {
                VoicePartyTheaterTubeChannel$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          if (p0.mDefaultChannelId == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(1);
             p1.writeInt(p0.mDefaultChannelId.intValue());
          }
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VoicePartyTheaterTubeChannelResponse getParcel(){
       return this.voicePartyTheaterTubeChannelResponse$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VoicePartyTheaterTubeChannelResponse$$Parcelable.write(this.voicePartyTheaterTubeChannelResponse$$0, p0, p1, new a());
    }
}
