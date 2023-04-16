package com.kwai.feature.api.live.service.basic.model.LivePlaybackParam$a;
import java.lang.Object;
import com.kwai.feature.api.live.service.basic.model.LivePlaybackParam;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.entity.QPhoto;

public class LivePlaybackParam$a	// class@001007
{
    public QPhoto a;
    public String b;
    public int c;
    public QPreInfo d;
    public long e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;

    public void LivePlaybackParam$a(){
       super();
       this.c = 0;
       this.e = -1;
       this.f = false;
    }
    public LivePlaybackParam a(){
       LivePlaybackParam obj = PatchProxy.apply(null, this, LivePlaybackParam$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LivePlaybackParam();
       obj.mPhoto = this.a;
       obj.mPhotoId = this.b;
       obj.mSource = this.c;
       obj.mPreInfo = this.d;
       obj.mOpenedTimeStamp = this.e;
       obj.mIsFromPlaybackList = this.f;
       obj.mFromH5Page = this.g;
       obj.mFromUtmSource = this.h;
       obj.mSearchSessionId = this.i;
       obj.mPhotoSearchParams = this.j;
       obj.mCommodityId = this.k;
       return obj;
    }
    public LivePlaybackParam$a b(boolean p0){
       this.f = p0;
       return this;
    }
    public LivePlaybackParam$a c(long p0){
       this.e = p0;
       return this;
    }
    public LivePlaybackParam$a d(QPhoto p0){
       this.a = p0;
       return this;
    }
}
