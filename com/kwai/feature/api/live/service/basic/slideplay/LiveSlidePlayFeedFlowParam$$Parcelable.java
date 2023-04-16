package com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam$$Parcelable$a;
import com.kwai.feature.api.live.service.basic.slideplay.LiveSlidePlayFeedFlowParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.util.ArrayList;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.entity.QPhoto$$Parcelable;
import java.util.List;
import java.util.Iterator;

public class LiveSlidePlayFeedFlowParam$$Parcelable implements Parcelable, d	// class@00100e
{
    public LiveSlidePlayFeedFlowParam liveSlidePlayFeedFlowParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveSlidePlayFeedFlowParam$$Parcelable.CREATOR = new LiveSlidePlayFeedFlowParam$$Parcelable$a();
    }
    public void LiveSlidePlayFeedFlowParam$$Parcelable(LiveSlidePlayFeedFlowParam p0){
       super();
       this.liveSlidePlayFeedFlowParam$$0 = p0;
    }
    public static LiveSlidePlayFeedFlowParam read(Parcel p0,a p1){
       List list1;
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }else {
             throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
          }
       }else {
          int i1 = 0;
          Class[] uClassArray = new Class[i1];
          Object[] objArray = new Object[i1];
          LiveSlidePlayFeedFlowParam liveSlidePla = a.a(LiveSlidePlayFeedFlowParam.class, uClassArray, objArray);
          p1.f(p1.g(), liveSlidePla);
          liveSlidePla.mPcursor = p0.readString();
          liveSlidePla.mLiveStreamId = p0.readString();
          liveSlidePla.mPath = p0.readString();
          liveSlidePla.mConstantLiveStreamId = p0.readString();
          liveSlidePla.mExtraInfo = p0.readString();
          int i2 = p0.readInt();
          List list = null;
          if (i2 < 0) {
             list1 = list;
          }else {
             list1 = new ArrayList(i2);
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                list1.add(LiveStreamFeed$$Parcelable.read(p0, p1));
             }
          }
          liveSlidePla.mLiveStreamFeedList = list1;
          i2 = p0.readInt();
          if (i2 >= 0) {
             list = new ArrayList(i2);
             for (; i1 < i2; i1 = i1 + 1) {
                list.add(QPhoto$$Parcelable.read(p0, p1));
             }
          }
          liveSlidePla.mPhotoList = list;
          liveSlidePla.mRecoStreamId = p0.readString();
          liveSlidePla.mLiveSlidePlaySource = p0.readInt();
          p1.f(i, liveSlidePla);
          return liveSlidePla;
       }
    }
    public static void write(LiveSlidePlayFeedFlowParam p0,Parcel p1,int p2,a p3){
       Iterator iterator;
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          p1.writeString(p0.mPcursor);
          p1.writeString(p0.mLiveStreamId);
          p1.writeString(p0.mPath);
          p1.writeString(p0.mConstantLiveStreamId);
          p1.writeString(p0.mExtraInfo);
          LiveSlidePlayFeedFlowParam mLiveStreamF = p0.mLiveStreamFeedList;
          if (mLiveStreamF == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLiveStreamF.size());
             iterator = p0.mLiveStreamFeedList.iterator();
             while (iterator.hasNext()) {
                LiveStreamFeed$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          mLiveStreamF = p0.mPhotoList;
          if (mLiveStreamF == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(mLiveStreamF.size());
             iterator = p0.mPhotoList.iterator();
             while (iterator.hasNext()) {
                QPhoto$$Parcelable.write(iterator.next(), p1, p2, p3);
             }
          }
          p1.writeString(p0.mRecoStreamId);
          p1.writeInt(p0.mLiveSlidePlaySource);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveSlidePlayFeedFlowParam getParcel(){
       return this.liveSlidePlayFeedFlowParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveSlidePlayFeedFlowParam$$Parcelable.write(this.liveSlidePlayFeedFlowParam$$0, p0, p1, new a());
    }
}
