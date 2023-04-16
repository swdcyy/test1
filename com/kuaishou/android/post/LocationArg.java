package com.kuaishou.android.post.LocationArg;
import com.kuaishou.android.post.SerialArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.util.Map;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.post.PostPageArg;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;
import com.kuaishou.android.model.mix.Location;
import lnc.o5;
import java.lang.Double;
import android.content.Intent;
import lnc.p3;
import q87.c;
import android.net.Uri;
import ekd.x0;

public final class LocationArg extends SerialArg	// class@000ea1
{

    public void LocationArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2);
    }
    public final void readFromMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationArg.class, "2")) {
          return;
       }
       StringBuilder str = null;
       String str1 = (p0 == null || p0.isEmpty())? 1: null;
       if (str1) {
          return;
       }else {
          str1 = p0.get(this.getSchemeJsKey());
          String str2 = (str1 == null || !str1.length())? 1: null;
          if (str2) {
             return;
          }else {
             str2 = p0.get("title");
             if (str2 == null || !str2.length()) {
                str = 1;
             }
             if (str) {
                PostUtils.D("PostArgType", "LocationArg readFromMap\(\)", new IllegalArgumentException("poi title is empty "+str2+" poi id="+str1));
                return;
             }else {
                Location location = new Location();
                location.mId = o5.c(str1);
                location.mTitle = str2;
                location.mCity = p0.get("city");
                str1 = p0.get("address");
                try{
                   location.mAddress = str1;
                   str1 = p0.get("latitude");
                   double d = 0;
                   double d1 = (str1 != null)? Double.parseDouble(str1): d;
                   location.latitude = d1;
                   String str3 = p0.get("longitude");
                   if (str3 != null) {
                      d = Double.parseDouble(str3);
                   }
                   location.longitude = d;
                }catch(java.lang.NumberFormatException e8){
                   PostUtils.D("PostArgType", "readFromMap\(\)", e8);
                }
                this.setValue(location);
                return;
             }
          }
       }
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationArg.class, "3")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void readScheme(Intent p0){
       String str;
       Location value;
       String title;
       if (PatchProxy.applyVoidOneRefs(p0, this, LocationArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       int i = 0;
       if (this.getValue() != null) {
          p3 op3 = p3.D();
          str = "LocationArg readScheme value has been set ";
          value = this.getValue();
          title = (value != null)? value.getTitle(): null;
          Object[] objArray = new Object[i];
          op3.A("PostArgType", str+title, objArray);
          return;
       }else {
          str = x0.a(p0.getData(), this.getSchemeJsKey());
          Uri uri = (str == null || !str.length())? 1: null;
          if (uri) {
             return;
          }else {
             String str1 = x0.a(p0.getData(), "title");
             if (str1 == null || !str1.length()) {
                i = 1;
             }
             if (i) {
                PostUtils.D("PostArgType", "LocationArg readScheme\(\)", new IllegalArgumentException("poi title is empty "+str1+" poi id="+str));
                return;
             }else {
                Location location = new Location();
                location.mId = o5.c(str);
                location.mTitle = str1;
                location.mCity = x0.a(p0.getData(), "city");
                str = x0.a(p0.getData(), "address");
                try{
                   location.mAddress = str;
                   str = x0.a(p0.getData(), "latitude");
                   double d = 0;
                   double d1 = (str != null)? Double.parseDouble(str): d;
                   location.latitude = d1;
                   String str2 = x0.a(p0.getData(), "longitude");
                   if (str2 != null) {
                      d = Double.parseDouble(str2);
                   }
                   location.longitude = d;
                }catch(java.lang.NumberFormatException e8){
                   PostUtils.D("PostArgType", "readScheme\(\)", e8);
                }
                this.setValue(location);
                return;
             }
          }
       }
    }
}
