package com.yxcorp.gifshow.model.ContactTargetItem$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.model.ContactTargetItem$$Parcelable$a;
import com.yxcorp.gifshow.model.ContactTargetItem;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.lang.ClassLoader;
import java.lang.Class;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag;
import com.yxcorp.gifshow.model.ContactTargetItem$Tag$$Parcelable;

public class ContactTargetItem$$Parcelable implements Parcelable, d	// class@001dfa
{
    public ContactTargetItem contactTargetItem$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ContactTargetItem$$Parcelable.CREATOR = new ContactTargetItem$$Parcelable$a();
    }
    public void ContactTargetItem$$Parcelable(ContactTargetItem p0){
       super();
       this.contactTargetItem$$0 = p0;
    }
    public static ContactTargetItem read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          ContactTargetItem uContactTarg = new ContactTargetItem();
          p1.f(p1.g(), uContactTarg);
          uContactTarg.mNamePinyin = p0.readString();
          uContactTarg.mRelationType = p0.readInt();
          uContactTarg.mId = p0.readString();
          boolean b = false;
          boolean b1 = (p0.readInt() == 1)? true: false;
          uContactTarg.mShowLetter = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uContactTarg.mShowTitle = b1;
          uContactTarg.mGroupAliasName = p0.readString();
          b1 = (p0.readInt() == 1)? true: false;
          uContactTarg.mSelected = b1;
          b1 = (p0.readInt() == 1)? true: false;
          uContactTarg.mLastItem = b1;
          uContactTarg.mType = p0.readInt();
          uContactTarg.mUser = User$$Parcelable.read(p0, p1);
          uContactTarg.mSection = p0.readString();
          uContactTarg.mSecondLetter = p0.readString();
          uContactTarg.mAliasNamePinyin = p0.readString();
          uContactTarg.mGroupAliasNamePinyin = p0.readString();
          if (p0.readInt() == 1) {
             b = true;
          }
          uContactTarg.mDisableSelected = b;
          uContactTarg.mKwaiGroupInfo = p0.readParcelable(ContactTargetItem$$Parcelable.class.getClassLoader());
          uContactTarg.mFirstLetter = p0.readString();
          uContactTarg.mName = p0.readString();
          uContactTarg.mAliasName = p0.readString();
          uContactTarg.mTag = ContactTargetItem$Tag$$Parcelable.read(p0, p1);
          p1.f(i, uContactTarg);
          return uContactTarg;
       }
    }
    public static void write(ContactTargetItem p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mNamePinyin);
          p1.writeInt(p0.mRelationType);
          p1.writeString(p0.mId);
          p1.writeInt(p0.mShowLetter);
          p1.writeInt(p0.mShowTitle);
          p1.writeString(p0.mGroupAliasName);
          p1.writeInt(p0.mSelected);
          p1.writeInt(p0.mLastItem);
          p1.writeInt(p0.mType);
          User$$Parcelable.write(p0.mUser, p1, p2, p3);
          p1.writeString(p0.mSection);
          p1.writeString(p0.mSecondLetter);
          p1.writeString(p0.mAliasNamePinyin);
          p1.writeString(p0.mGroupAliasNamePinyin);
          p1.writeInt(p0.mDisableSelected);
          p1.writeParcelable(p0.mKwaiGroupInfo, p2);
          p1.writeString(p0.mFirstLetter);
          p1.writeString(p0.mName);
          p1.writeString(p0.mAliasName);
          ContactTargetItem$Tag$$Parcelable.write(p0.mTag, p1, p2, p3);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ContactTargetItem getParcel(){
       return this.contactTargetItem$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ContactTargetItem$$Parcelable.write(this.contactTargetItem$$0, p0, p1, new a());
    }
}
