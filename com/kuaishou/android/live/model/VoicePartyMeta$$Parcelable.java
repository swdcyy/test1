package com.kuaishou.android.live.model.VoicePartyMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.live.model.VoicePartyMeta$$Parcelable$a;
import com.kuaishou.android.live.model.VoicePartyMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.io.Serializable;
import com.kuaishou.android.live.model.VoicePartyMeta$VoicePartyPicture;
import com.kuaishou.android.live.model.VoicePartyMeta$VoicePartyFeedBackgroundColor;
import com.kuaishou.android.live.model.VoicePartyChannel;
import java.util.List;
import java.util.Iterator;

public class VoicePartyMeta$$Parcelable implements Parcelable, d	// class@000839
{
    public VoicePartyMeta voicePartyMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       VoicePartyMeta$$Parcelable.CREATOR = new VoicePartyMeta$$Parcelable$a();
    }
    public void VoicePartyMeta$$Parcelable(VoicePartyMeta p0){
       super();
       this.voicePartyMeta$$0 = p0;
    }
    public static VoicePartyMeta read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          VoicePartyMeta voicePartyMe = new VoicePartyMeta();
          p1.f(p1.g(), voicePartyMe);
          int i1 = p0.readInt();
          List list = null;
          int i2 = 0;
          if (i1 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i1);
             for (int i3 = 0; i3 < i1; i3 = i3 + 1) {
                list1.add(User$$Parcelable.read(p0, p1));
             }
          }
          voicePartyMe.mVoicePartyTopUsers = list1;
          voicePartyMe.mVoicePartyPic = p0.readSerializable();
          voicePartyMe.mVoicePartyLabel = p0.readString();
          voicePartyMe.mDisplayDistance = p0.readString();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          voicePartyMe.mIsNearBy = b;
          voicePartyMe.mBackgroundColor = p0.readSerializable();
          voicePartyMe.mVoicePartyTag = p0.readString();
          voicePartyMe.mVoicePartyChannel = p0.readSerializable();
          voicePartyMe.mVoicePartyUserAge = p0.readInt();
          voicePartyMe.mMusicStatus = p0.readInt();
          i1 = p0.readInt();
          if (i1 >= 0) {
             list = new ArrayList(i1);
             for (; i2 < i1; i2 = i2 + 1) {
                list.add(User$$Parcelable.read(p0, p1));
             }
          }
          voicePartyMe.mUsers = list;
          voicePartyMe.mVoicePartyContent = p0.readString();
          voicePartyMe.mVoicePartyTitle = p0.readString();
          voicePartyMe.mVoicePartyPlayType = p0.readInt();
          voicePartyMe.mVoicePartyId = p0.readString();
          p1.f(i, voicePartyMe);
          return voicePartyMe;
       }
    }
    public static void write(VoicePartyMeta p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          VoicePartyMeta mVoicePartyT = p0.mVoicePartyTopUsers;
          if (mVoicePartyT == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mVoicePartyT.size());
             iterator = p0.mVoicePartyTopUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeSerializable(p0.mVoicePartyPic);
          p1.writeString(p0.mVoicePartyLabel);
          p1.writeString(p0.mDisplayDistance);
          p1.writeInt(p0.mIsNearBy);
          p1.writeSerializable(p0.mBackgroundColor);
          p1.writeString(p0.mVoicePartyTag);
          p1.writeSerializable(p0.mVoicePartyChannel);
          p1.writeInt(p0.mVoicePartyUserAge);
          p1.writeInt(p0.mMusicStatus);
          mVoicePartyT = p0.mUsers;
          if (mVoicePartyT == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mVoicePartyT.size());
             iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mVoicePartyContent);
          p1.writeString(p0.mVoicePartyTitle);
          p1.writeInt(p0.mVoicePartyPlayType);
          p1.writeString(p0.mVoicePartyId);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public VoicePartyMeta getParcel(){
       return this.voicePartyMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       VoicePartyMeta$$Parcelable.write(this.voicePartyMeta$$0, p0, p1, new a());
    }
}
