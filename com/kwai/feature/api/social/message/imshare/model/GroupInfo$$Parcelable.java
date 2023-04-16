package com.kwai.feature.api.social.message.imshare.model.GroupInfo$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo$$Parcelable$a;
import com.kwai.feature.api.social.message.imshare.model.GroupInfo;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class GroupInfo$$Parcelable implements Parcelable, d	// class@00114d
{
    public GroupInfo groupInfo$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       GroupInfo$$Parcelable.CREATOR = new GroupInfo$$Parcelable$a();
    }
    public void GroupInfo$$Parcelable(GroupInfo p0){
       super();
       this.groupInfo$$0 = p0;
    }
    public static GroupInfo read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          GroupInfo groupInfo = new GroupInfo();
          p1.f(p1.g(), groupInfo);
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(p0.readString());
             }
             list = uArrayList;
          }
          groupInfo.mTopMembers = list;
          groupInfo.mSecondLetter = p0.readString();
          groupInfo.mPinYinName = p0.readString();
          groupInfo.mGroupName = p0.readString();
          groupInfo.mGroupId = p0.readString();
          groupInfo.mAliasPinYinName = p0.readString();
          groupInfo.mFirstLetter = p0.readString();
          groupInfo.mAliasName = p0.readString();
          groupInfo.mGroupMemberCount = p0.readInt();
          groupInfo.mHeadUrl = p0.readString();
          groupInfo.mGroupType = p0.readInt();
          p1.f(i, groupInfo);
          return groupInfo;
       }
    }
    public static void write(GroupInfo p0,Parcel p1,int p2,a p3){
       p2 = p3.c(p0);
       if (p2 != -1) {
          p1.writeInt(p2);
       }else {
          p1.writeInt(p3.e(p0));
          GroupInfo mTopMembers = p0.mTopMembers;
          if (mTopMembers == null) {
             p1.writeInt(-1);
          }else {
             p1.writeInt(mTopMembers.size());
             Iterator iterator = p0.mTopMembers.iterator();
             while (iterator.hasNext()) {
                p1.writeString(iterator.next());
             }
          }
          p1.writeString(p0.mSecondLetter);
          p1.writeString(p0.mPinYinName);
          p1.writeString(p0.mGroupName);
          p1.writeString(p0.mGroupId);
          p1.writeString(p0.mAliasPinYinName);
          p1.writeString(p0.mFirstLetter);
          p1.writeString(p0.mAliasName);
          p1.writeInt(p0.mGroupMemberCount);
          p1.writeString(p0.mHeadUrl);
          p1.writeInt(p0.mGroupType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public GroupInfo getParcel(){
       return this.groupInfo$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       GroupInfo$$Parcelable.write(this.groupInfo$$0, p0, p1, new a());
    }
}
