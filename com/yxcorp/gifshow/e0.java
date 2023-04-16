package com.yxcorp.gifshow.e0;
import ng9.e;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.video.api.prettify.filter.FilterVideoPlugin$FilterEntranceType;
import brd.t;
import com.yxcorp.gifshow.prettify.v4.magic.filter.Filters;
import uv8.c2;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import com.kwai.video.westeros.models.BeautifyVersion;
import com.kwai.robust.PatchProxyResult;
import q0c.y1;
import l0c.c;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import com.yxcorp.gifshow.camera.record.base.b;
import ng9.c;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.prettify.beauty.d;

public class e0 implements e	// class@001df1
{

    public void e0(){
       super();
    }
    public void V10(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, e0.class, "3")) {
          return;
       }
       Filters.updateFilterConfig(FilterVideoPlugin$FilterEntranceType.VIDEO).subscribe(new c2(p0), Functions.d());
       return;
    }
    public BeautifyVersion getBeautifyVersion(){
       Object obj = PatchProxy.apply(null, this, e0.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return y1.h().f().a();
    }
    public boolean isAvailable(){
       return true;
    }
    public d xP(CameraPageType p0,b p1,c p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, e0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new d(p0, p1, p2);
    }
}
