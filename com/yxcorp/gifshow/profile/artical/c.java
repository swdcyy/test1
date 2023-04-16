package com.yxcorp.gifshow.profile.artical.c;
import erd.g;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.ProfileFeedResponse;
import com.yxcorp.gifshow.profile.artical.d;
import java.util.List;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.component.feedstaggercard.model.ArticleModel;
import java.lang.Class;
import tl8.d;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.String;
import kp.r1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.profile.util.o;

public final class c implements g	// class@00121c
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void accept(Object p0){
       if (p0 != null) {
          Iterator iterator = p0.getItems().iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             if (qPhoto.mEntity.a(ArticleModel.class) == null || TextUtils.x(r1.p0(qPhoto.mEntity))) {
                p0.getItems().remove(qPhoto);
             }
          }
          o.t(p0.getItems(), 5, p0.getLlsid());
       }
       return;
    }
}
