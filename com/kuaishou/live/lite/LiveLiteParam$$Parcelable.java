package com.kuaishou.live.lite.LiveLiteParam$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.live.lite.LiveLiteParam$$Parcelable$a;
import com.kuaishou.live.lite.LiveLiteParam;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import java.lang.Class;
import org.parceler.a;
import java.lang.Integer;
import java.util.HashMap;
import xwd.b;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed$$Parcelable;
import java.lang.Boolean;
import org.parceler.a$c;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;

public class LiveLiteParam$$Parcelable implements Parcelable, d	// class@001d66
{
    public LiveLiteParam liveLiteParam$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       LiveLiteParam$$Parcelable.CREATOR = new LiveLiteParam$$Parcelable$a();
    }
    public void LiveLiteParam$$Parcelable(LiveLiteParam p0){
       super();
       this.liveLiteParam$$0 = p0;
    }
    public static LiveLiteParam read(Parcel p0,a p1){
       HashMap hashMap;
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
          LiveLiteParam liveLitePara = a.a(LiveLiteParam.class, uClassArray, objArray);
          p1.f(p1.g(), liveLitePara);
          a.d(LiveLiteParam.class, liveLitePara, "mSourceType", Integer.valueOf(p0.readInt()));
          a.d(LiveLiteParam.class, liveLitePara, "mStartPlaySourceType", Integer.valueOf(p0.readInt()));
          int i2 = p0.readInt();
          if (i2 < 0) {
             hashMap = null;
          }else {
             HashMap hashMap1 = new HashMap(b.a(i2));
             for (int i3 = 0; i3 < i2; i3 = i3 + 1) {
                hashMap1.put(p0.readString(), p0.readString());
             }
             hashMap = hashMap1;
          }
          a.d(LiveLiteParam.class, liveLitePara, "mPageUrlParamMap", hashMap);
          a.d(LiveLiteParam.class, liveLitePara, "mLiveStreamFeed", LiveStreamFeed$$Parcelable.read(p0, p1));
          a.d(LiveLiteParam.class, liveLitePara, "mLivePlayPageSessionId", p0.readString());
          a.d(LiveLiteParam.class, liveLitePara, "mPage", p0.readString());
          if (p0.readInt() == 1) {
             i1 = true;
          }
          a.d(LiveLiteParam.class, liveLitePara, "mAdaptBottomBar", Boolean.valueOf(i1));
          a.d(LiveLiteParam.class, liveLitePara, "mSourceUrl", p0.readString());
          a.d(LiveLiteParam.class, liveLitePara, "mPageType", Integer.valueOf(p0.readInt()));
          a.d(LiveLiteParam.class, liveLitePara, "mInnerCustomSourceType", Integer.valueOf(p0.readInt()));
          p1.f(i, liveLitePara);
          return liveLitePara;
       }
    }
    public static void write(LiveLiteParam p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       int i1 = -1;
       if (i != i1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          Class tYPE = Integer.TYPE;
          p1.writeInt(a.b(tYPE, LiveLiteParam.class, p0, "mSourceType").intValue());
          p1.writeInt(a.b(tYPE, LiveLiteParam.class, p0, "mStartPlaySourceType").intValue());
          String str = "mPageUrlParamMap";
          if (a.c(new a$c(), LiveLiteParam.class, p0, str) == null) {
             p1.writeInt(i1);
          }else {
             p1.writeInt(a.c(new a$c(), LiveLiteParam.class, p0, str).size());
             Iterator iterator = a.c(new a$c(), LiveLiteParam.class, p0, str).entrySet().iterator();
             while (iterator.hasNext()) {
                Map$Entry uEntry = iterator.next();
                p1.writeString(uEntry.getKey());
                p1.writeString(uEntry.getValue());
             }
          }
          LiveStreamFeed$$Parcelable.write(a.b(LiveStreamFeed.class, LiveLiteParam.class, p0, "mLiveStreamFeed"), p1, p2, p3);
          p1.writeString(a.b(String.class, LiveLiteParam.class, p0, "mLivePlayPageSessionId"));
          p1.writeString(a.b(String.class, LiveLiteParam.class, p0, "mPage"));
          p1.writeInt(a.b(Boolean.TYPE, LiveLiteParam.class, p0, "mAdaptBottomBar").booleanValue());
          p1.writeString(a.b(String.class, LiveLiteParam.class, p0, "mSourceUrl"));
          Class tYPE1 = Integer.TYPE;
          p1.writeInt(a.b(tYPE1, LiveLiteParam.class, p0, "mPageType").intValue());
          p1.writeInt(a.b(tYPE1, LiveLiteParam.class, p0, "mInnerCustomSourceType").intValue());
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public LiveLiteParam getParcel(){
       return this.liveLiteParam$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       LiveLiteParam$$Parcelable.write(this.liveLiteParam$$0, p0, p1, new a());
    }
}
