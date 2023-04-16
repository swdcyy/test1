package com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed$$Parcelable;
import android.os.Parcelable;
import xwd.d;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed$$Parcelable$a;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardFeed;
import java.lang.Object;
import android.os.Parcel;
import xwd.a;
import org.parceler.ParcelerRuntimeException;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta;
import com.yxcorp.gifshow.detail.slideplay.nasa.surveycard.entity.SurveyBigCardMeta$$Parcelable;
import com.kuaishou.android.model.mix.CommonMeta;
import com.kuaishou.android.model.mix.CommonMeta$$Parcelable;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Class;
import org.parceler.a;
import com.kwai.framework.model.decompose.api.SyncableProviderContainer;
import ga6.c;
import java.util.Map;
import ywd.j;
import org.parceler.a$c;

public class SurveyBigCardFeed$$Parcelable implements Parcelable, d	// class@0017c4
{
    public SurveyBigCardFeed surveyBigCardFeed$$0;
    public static final Parcelable$Creator CREATOR;

    static {
       SurveyBigCardFeed$$Parcelable.CREATOR = new SurveyBigCardFeed$$Parcelable$a();
    }
    public void SurveyBigCardFeed$$Parcelable(SurveyBigCardFeed p0){
       super();
       this.surveyBigCardFeed$$0 = p0;
    }
    public static SurveyBigCardFeed read(Parcel p0,a p1){
       int i = p0.readInt();
       if (p1.a(i)) {
          if (!p1.d(i)) {
             return p1.b(i);
          }
          throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
       }else {
          SurveyBigCardFeed surveyBigCar = new SurveyBigCardFeed();
          p1.f(p1.g(), surveyBigCar);
          surveyBigCar.mSurveyBigCardMeta = SurveyBigCardMeta$$Parcelable.read(p0, p1);
          surveyBigCar.mCommonMeta = CommonMeta$$Parcelable.read(p0, p1);
          a.d(BaseFeed.class, surveyBigCar, "mGrootId", p0.readString());
          a.d(SyncableProviderContainer.class, surveyBigCar, "dataMap", new c().d(p0));
          p1.f(i, surveyBigCar);
          return surveyBigCar;
       }
    }
    public static void write(SurveyBigCardFeed p0,Parcel p1,int p2,a p3){
       int i = p3.c(p0);
       if (i != -1) {
          p1.writeInt(i);
       }else {
          p1.writeInt(p3.e(p0));
          SurveyBigCardMeta$$Parcelable.write(p0.mSurveyBigCardMeta, p1, p2, p3);
          CommonMeta$$Parcelable.write(p0.mCommonMeta, p1, p2, p3);
          p1.writeString(a.b(String.class, BaseFeed.class, p0, "mGrootId"));
          new c().i(a.c(new a$c(), SyncableProviderContainer.class, p0, "dataMap"), p1);
       }
       return;
    }
    public int describeContents(){
       return 0;
    }
    public SurveyBigCardFeed getParcel(){
       return this.surveyBigCardFeed$$0;
    }
    public Object getParcel(){
       return this.getParcel();
    }
    public void writeToParcel(Parcel p0,int p1){
       SurveyBigCardFeed$$Parcelable.write(this.surveyBigCardFeed$$0, p0, p1, new a());
    }
}
