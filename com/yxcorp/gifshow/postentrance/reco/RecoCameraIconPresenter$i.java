package com.yxcorp.gifshow.postentrance.reco.RecoCameraIconPresenter$i;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.yxcorp.gifshow.postentrance.reco.a;
import java.lang.reflect.Type;
import el.a;
import com.google.gson.Gson;
import com.yxcorp.gifshow.model.CDNUrl;

public final class RecoCameraIconPresenter$i implements Callable	// class@001064
{
    public final String b;

    public void RecoCameraIconPresenter$i(String p0){
       this.b = p0;
       super();
    }
    public Object call(){
       CDNUrl[] uCDNUrlArray = PatchProxy.apply(null, this, RecoCameraIconPresenter$i.class, "1");
       if (uCDNUrlArray != PatchProxyResult.class) {
       }else {
          uCDNUrlArray = a.a.i(this.b, new a().getType());
       }
       return uCDNUrlArray;
    }
}
