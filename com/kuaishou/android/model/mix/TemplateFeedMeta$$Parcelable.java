package com.kuaishou.android.model.mix.TemplateFeedMeta$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.mix.TemplateFeedMeta$$Parcelable$a;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.util.ArrayList;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.User$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class TemplateFeedMeta$$Parcelable implements Parcelable, d	// class@000e1a
{
    public TemplateFeedMeta templateFeedMeta$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       TemplateFeedMeta$$Parcelable.CREATOR = new TemplateFeedMeta$$Parcelable$a();
    }
    public void TemplateFeedMeta$$Parcelable(TemplateFeedMeta p0){
       super();
       this.templateFeedMeta$$0 = p0;
    }
    public static TemplateFeedMeta read(Parcel p0,a p1){
       List list;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          TemplateFeedMeta templateFeed = new TemplateFeedMeta();
          p1.f(p1.g(), templateFeed);
          templateFeed.mBottomTitle = p0.readString();
          templateFeed.mSubCaption = p0.readString();
          templateFeed.mTemplateType = p0.readInt();
          int i1 = p0.readInt();
          if (i1 < 0) {
             list = null;
          }else {
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.add(User$$Parcelable.read(p0, p1));
             }
             list = uArrayList;
          }
          templateFeed.mUsers = list;
          templateFeed.mTemplateId = p0.readString();
          templateFeed.mRightDownTip = p0.readString();
          templateFeed.mJumpUrl = p0.readString();
          templateFeed.mShowCount = p0.readLong();
          p1.f(i, templateFeed);
          return templateFeed;
       }
    }
    public static void write(TemplateFeedMeta p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mBottomTitle);
          p1.writeString(p0.mSubCaption);
          p1.writeInt(p0.mTemplateType);
          TemplateFeedMeta mUsers = p0.mUsers;
          if (mUsers == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mUsers.size());
             Iterator iterator = p0.mUsers.iterator();
             while (iterator.hasNext()) {
                User$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mTemplateId);
          p1.writeString(p0.mRightDownTip);
          p1.writeString(p0.mJumpUrl);
          p1.writeLong(p0.mShowCount);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public TemplateFeedMeta getParcel(){
       return this.templateFeedMeta$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       TemplateFeedMeta$$Parcelable.write(this.templateFeedMeta$$0, p0, p1, new a());
    }
}
