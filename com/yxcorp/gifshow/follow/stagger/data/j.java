package com.yxcorp.gifshow.follow.stagger.data.j;
import java.util.HashMap;
import java.lang.Object;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import pia.u;
import java.lang.Iterable;
import ok.o;
import qk.y;
import com.kuaishou.android.commercial.PhotoAdvertisementInterface;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import com.kuaishou.android.model.mix.ImageMeta$SinglePicture;
import java.util.Map;

public final class j	// class@001179
{
    public static final Map a;

    static {
       j.a = new HashMap();
    }
    public void j(){
       super();
    }
    public final void a(List p0,List p1,List p2,QPhoto p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, j.class, "4")) {
          return;
       }
       Object obj = PatchProxy.applyTwoRefs(p0, p3, this, j.class, "5");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): y.o(p0, new u(p3));
       if (i < 0) {
          p1.add(p3);
       }else {
          QPhoto qPhoto = p0.get(i);
          p3.updateWithServer(qPhoto);
          if (!p3.isAd() && qPhoto.isAd()) {
             p3.setAdvertisement(qPhoto.getAdvertisement());
          }
          if (qPhoto.getAtlasInfo() != null && qPhoto.getSinglePicture() != null) {
             p2.add(p3);
             j.a.remove(p3.getPhotoId());
          }else {
             p0.set(i, p3);
          }
       }
       return;
    }
}
