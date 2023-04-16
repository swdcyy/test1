package com.yxcorp.gifshow.photoad.model.AdGsonAdapterFactory;
import zk.j;
import java.lang.Object;
import com.google.gson.Gson;
import el.a;
import com.google.gson.TypeAdapter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.ads.PhotoAdvertisementPlaceHolder;
import com.kuaishou.android.model.ads.PhotoAdvertisement$TypeAdapter;

public class AdGsonAdapterFactory implements j	// class@0012d1
{

    public void AdGsonAdapterFactory(){
       super();
    }
    public TypeAdapter a(Gson p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AdGsonAdapterFactory.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p1.getRawType() == PhotoAdvertisementPlaceHolder.class) {
          return new PhotoAdvertisement$TypeAdapter(p0);
       }
       return null;
    }
}
