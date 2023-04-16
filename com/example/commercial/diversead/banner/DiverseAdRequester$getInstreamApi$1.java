package com.example.commercial.diversead.banner.DiverseAdRequester$getInstreamApi$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse;
import java.lang.Boolean;
import com.yxcorp.gifshow.ad.response.InstreamAdResponse$EApiData;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.entity.QPhoto;

public final class DiverseAdRequester$getInstreamApi$1 extends Lambda implements l	// class@00102e
{
    public static final DiverseAdRequester$getInstreamApi$1 INSTANCE;

    static {
       DiverseAdRequester$getInstreamApi$1.INSTANCE = new DiverseAdRequester$getInstreamApi$1();
    }
    public void DiverseAdRequester$getInstreamApi$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return Boolean.valueOf(this.invoke(p0));
    }
    public final boolean invoke(InstreamAdResponse p0){
       QPhoto qPhoto;
       InstreamAdResponse$EApiData uEApiData = p0.a();
       if (uEApiData != null) {
          List mFeeds = uEApiData.getMFeeds();
          if (mFeeds != null) {
             qPhoto = CollectionsKt___CollectionsKt.p2(mFeeds);
          label_0014 :
             boolean b = (qPhoto != null)? true: false;
             return b;
          }
       }
       qPhoto = null;
       goto label_0014 ;
    }
}
