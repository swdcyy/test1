package com.kwai.framework.model.user.RichTextMeta$Param$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.framework.model.user.RichTextMeta$Param$$Parcelable$a;
import com.kwai.framework.model.user.RichTextMeta$Param;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kwai.framework.model.user.QUserContactName;
import com.kwai.framework.model.user.QUserContactName$$Parcelable;

public class RichTextMeta$Param$$Parcelable implements Parcelable, d	// class@001724
{
    public RichTextMeta$Param param$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       RichTextMeta$Param$$Parcelable.CREATOR = new RichTextMeta$Param$$Parcelable$a();
    }
    public void RichTextMeta$Param$$Parcelable(RichTextMeta$Param p0){
       super();
       this.param$$0 = p0;
    }
    public static RichTextMeta$Param read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          RichTextMeta$Param param = new RichTextMeta$Param();
          p1.f(p1.g(), param);
          param.mTextValue = p0.readString();
          param.mFontName = p0.readString();
          param.mUserId = p0.readLong();
          param.mContactName = QUserContactName$$Parcelable.read(p0, p1);
          param.mFontSize = p0.readInt();
          param.mKeyName = p0.readString();
          param.mTruncationThreshold = p0.readInt();
          boolean b = true;
          if (p0.readInt() != b) {
             b = false;
          }
          param.mEnableAlias = b;
          param.mTextColor = p0.readString();
          param.mLinkUrl = p0.readString();
          param.mTextType = p0.readInt();
          p1.f(i, param);
          return param;
       }
    }
    public static void write(RichTextMeta$Param p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mTextValue);
          p1.writeString(p0.mFontName);
          p1.writeLong(p0.mUserId);
          QUserContactName$$Parcelable.write(p0.mContactName, p1, p2, p3);
          p1.writeInt(p0.mFontSize);
          p1.writeString(p0.mKeyName);
          p1.writeInt(p0.mTruncationThreshold);
          p1.writeInt(p0.mEnableAlias);
          p1.writeString(p0.mTextColor);
          p1.writeString(p0.mLinkUrl);
          p1.writeInt(p0.mTextType);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public RichTextMeta$Param getParcel(){
       return this.param$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       RichTextMeta$Param$$Parcelable.write(this.param$$0, p0, p1, new a());
    }
}
