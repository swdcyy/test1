package gx8.c;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import com.yxcorp.gifshow.activity.share.model.LocationResponse;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Iterator;
import ge6.b;
import com.kuaishou.android.model.mix.Location;
import org.json.JSONObject;
import org.json.JSONArray;
import ol9.b;
import java.util.List;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import org.json.JSONException;
import com.kwai.framework.model.common.Distance;
import com.kwai.poi.service.model.KLocation;

public class c	// class@002517
{
    public static String a = "LocationPoiLocationUtil";
    public static String b = "typeList";
    public static String c = "cityName";

    public void c(){
       super();
    }
    public static LocationResponse a(ArrayList p0,String p1){
       Iterator iterator;
       String str1;
       String str = null;
       ArrayList obj = PatchProxy.applyTwoRefs(p0, p1, str, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       LocationResponse locationResp = new LocationResponse();
       if (p0 != null) {
          iterator = p0.iterator();
          while (iterator.hasNext()) {
             b uob = iterator.next();
             Location location = PatchProxy.applyTwoRefs(uob, p1, str, c.class, "4");
             if (location != PatchProxyResult.class) {
             }else {
                location = new Location();
                location.mTitle = uob.i();
                location.mCity = uob.b();
                location.mAddress = uob.a();
                location.mDistance = uob.c();
                location.mId = uob.e();
                location.latitude = uob.f();
                location.longitude = uob.h();
                location.mLinkUrl = uob.g();
                location.mExtParams = uob.d();
                if (uob.d() != null && !(uob.d()).isEmpty()) {
                   try{
                      JSONArray jSONArray = new JSONObject(uob.d()).optJSONArray(c.b);
                      if (jSONArray != null && jSONArray.length() > 0) {
                         ArrayList uArrayList = PatchProxy.applyOneRefs(jSONArray, str, b.class, "1");
                         if (uArrayList != PatchProxyResult.class) {
                         }else {
                            uArrayList = new ArrayList();
                            int i = 0;
                            while (i < jSONArray.length()) {
                               try{
                                  Object obj1 = jSONArray.get(i);
                                  if (obj1 != null) {
                                     uArrayList.add(obj1);
                                  }
                                  i = i + 1;
                               }catch(org.json.JSONException e0){
                               }
                            }
                         }
                         location.mTypeList = uArrayList;
                      }
                   }catch(org.json.JSONException e5){
                      PostUtils.D(c.a, c.b, e5);
                   }
                }
             }
             obj.add(location);
          }
       }
       locationResp.setLocations(obj);
       iterator = PatchProxy.applyOneRefs(p1, str, c.class, "3");
       if (iterator != PatchProxyResult.class) {
       }else if(p1 != null){
          str1 = new JSONObject(p1).optString(c.c);
       }else {
          str1 = "";
       }
       if (!str1.isEmpty()) {
          str = str1;
       }
       str1 = str;
       locationResp.setCityName(iterator);
       return locationResp;
    }
    public static ArrayList b(List p0){
       ArrayList obj = PatchProxy.applyOneRefs(p0, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ArrayList();
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Distance uDistance = iterator.next();
             Distance uDistance1 = (!uDistance.mLatitude - 0xbff0000000000000 && !uDistance.mLongtitude - 0xbff0000000000000)? 1: null;
             if (uDistance1) {
                continue ;
             }else {
                KLocation kLocation = PatchProxy.applyOneRefs(uDistance, null, c.class, "6");
                if (kLocation != PatchProxyResult.class) {
                }else {
                   kLocation = new KLocation(uDistance.mLatitude, uDistance.mLongtitude);
                }
                obj.add(kLocation);
             }
          }
       }
       return obj;
    }
}
