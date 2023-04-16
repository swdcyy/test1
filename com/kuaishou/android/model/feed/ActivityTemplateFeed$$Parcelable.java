package com.kuaishou.android.model.feed.ActivityTemplateFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.kuaishou.android.model.feed.ActivityTemplateFeed$$Parcelable$a;
import com.kuaishou.android.model.feed.ActivityTemplateFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.kuaishou.android.model.mix.TemplateFeedMeta;
import com.kuaishou.android.model.mix.TemplateFeedMeta$$Parcelable;
import com.kuaishou.android.model.mix.ExtMeta;
import com.kuaishou.android.model.mix.ExtMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kuaishou.android.model.mix.CoverMeta;
import com.kuaishou.android.model.mix.CoverMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class ActivityTemplateFeed$$Parcelable implements Parcelable, d	// class@000acf
{
    public ActivityTemplateFeed activityTemplateFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       ActivityTemplateFeed$$Parcelable.CREATOR = new ActivityTemplateFeed$$Parcelable$a();
    }
    public void ActivityTemplateFeed$$Parcelable(ActivityTemplateFeed p0){
       super();
       this.activityTemplateFeed$$0 = p0;
    }
    public static ActivityTemplateFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          ActivityTemplateFeed uActivityTem = new ActivityTemplateFeed();
          p1.f(p1.g(), uActivityTem);
          uActivityTem.mTemplateFeedModel = TemplateFeedMeta$$Parcelable.read(p0, p1);
          uActivityTem.mExtMeta = ExtMeta$$Parcelable.read(p0, p1);
          uActivityTem.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          uActivityTem.mCoverMeta = CoverMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, uActivityTem, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, uActivityTem, "dataMap", new c().d(p0));
          p1.f(i, uActivityTem);
          return uActivityTem;
       }
    }
    public static void write(ActivityTemplateFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          TemplateFeedMeta$$Parcelable.write(p0.mTemplateFeedModel, p1, p2, p3);
          ExtMeta$$Parcelable.write(p0.mExtMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          CoverMeta$$Parcelable.write(p0.mCoverMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public ActivityTemplateFeed getParcel(){
       return this.activityTemplateFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       ActivityTemplateFeed$$Parcelable.write(this.activityTemplateFeed$$0, p0, p1, new a());
    }
}
