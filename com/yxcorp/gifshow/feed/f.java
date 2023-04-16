package com.yxcorp.gifshow.feed.f;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.feed.response.PhotoResponse;
import com.google.common.collect.ImmutableMap$b;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.String;

public final class f implements o	// class@000ff5
{
    public static final f b;

    static {
       f.b = new f();
    }
    public void f(){
       super();
    }
    public final Object apply(Object p0){
       String photoId;
       ImmutableMap$b uob = ImmutableMap.builder();
       if (p0.getItems() != null) {
          p0 = p0.getItems().iterator();
          while (p0.hasNext()) {
             QPhoto qPhoto = p0.next();
             PhotoMeta photoMeta = r1.u1(qPhoto.mEntity);
             photoMeta = (photoMeta != null && !TextUtils.x(photoMeta.mOriginalPhotoId))? photoMeta.mOriginalPhotoId: qPhoto.getPhotoId();
             uob.c(photoMeta, qPhoto);
          }
       }
       return uob.a();
    }
}
