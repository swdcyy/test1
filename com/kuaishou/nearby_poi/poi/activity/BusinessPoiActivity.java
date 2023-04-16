package com.kuaishou.nearby_poi.poi.activity.BusinessPoiActivity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.res.Resources;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.ContextThemeWrapper;
import android.app.Activity;
import com.kwai.plugin.dva.feature.core.loader.AssetManagerHook;
import android.os.Bundle;
import ekd.i;
import android.content.Intent;
import android.net.Uri;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ekd.x0;
import zn4.a;
import java.lang.Long;
import com.kwai.framework.model.user.AdBusinessInfo$Location;
import com.kuaishou.nearby_poi.poi.model.PoiModel;
import com.kwai.framework.model.user.QCurrentUser;
import java.lang.System;
import tkd.b;
import tkd.d;
import vw5.h;
import com.kuaishou.tuna_logger.KsLogTunaCoreTag;
import java.util.List;
import on4.a;
import java.lang.Exception;
import msd.a;
import c15.b;
import java.io.Serializable;
import ekd.j0;
import com.kuaishou.android.model.mix.Location;
import com.kuaishou.nearby_poi.poi.logger.POILoggerHelper;
import e17.i;

public class BusinessPoiActivity extends GifshowActivity	// class@000a14
{
    public PoiModel y;
    public Uri z;

    public void BusinessPoiActivity(){
       super();
    }
    public Resources getResources(){
       Object obj = PatchProxy.apply(null, this, BusinessPoiActivity.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       AssetManagerHook.loadSplitResourcesIfResourceOpening(this, super.getResources());
       return super.getResources();
    }
    public boolean isCustomImmersiveMode(){
       return true;
    }
    public void onCreate(Bundle p0){
       int i;
       String str;
       AdBusinessInfo$Location location;
       BusinessPoiActivity uBusinessPoi = BusinessPoiActivity.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uBusinessPoi, "1")) {
          return;
       }
       this.overridePendingTransition(0, 0);
       super.onCreate(p0);
       i.h(this, 0, 0);
       if (!PatchProxy.applyVoid(null, this, uBusinessPoi, "2")) {
          Intent intent = this.getIntent();
          i = -686893323;
          if (intent != null && !PatchProxy.applyVoidOneRefs(intent, this, uBusinessPoi, "3")) {
             Uri data = intent.getData();
             if (data != null) {
                Log.b("tachikoma", "businesspoi::"+data.toString());
                this.z = data;
                String str1 = "_";
                if (!PatchProxy.applyVoidOneRefs(data, this, uBusinessPoi, "4")) {
                   try{
                      long l = Long.parseLong(x0.a(data, "poiId"));
                      location = new AdBusinessInfo$Location();
                      location.mId = l;
                      location.mLatitude = a.a(x0.a(data, "latitude"), 0);
                      location.mLongitude = a.a(x0.a(data, "longitude"), 0);
                      location.mTitle = x0.a(data, "title");
                      location.mAddress = x0.a(data, "address");
                      this.y = new PoiModel(l, location);
                      d.a(i).G7(this.y.getPoiId()+str1+QCurrentUser.ME.getId()+str1+System.currentTimeMillis(), this.y.getPoiId(), this.z);
                   }catch(java.lang.Exception e12){
                      b.d(KsLogTunaCoreTag.TUNA_CLOG.appendTag("parseIntentUri"), new a(e12));
                   }
                }
             }else {
                Serializable serializable = j0.e(intent, "ARG_KEY_LOCATION");
                if (serializable instanceof Location) {
                   location = new AdBusinessInfo$Location();
                   Location mId = serializable.mId;
                   location.mId = mId;
                   location.mLatitude = serializable.latitude;
                   location.mLongitude = serializable.longitude;
                   location.mTitle = serializable.mTitle;
                   location.mAddress = serializable.mAddress;
                   this.y = new PoiModel(mId, location);
                }
             }
          }
       }
       return;
    }
}
