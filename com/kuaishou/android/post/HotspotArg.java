package com.kuaishou.android.post.HotspotArg;
import com.kuaishou.android.post.SerialArg;
import java.lang.String;
import com.kuaishou.android.post.PostArguments;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.post.PostPageArg;
import com.kuaishou.android.model.mix.HotspotParams;
import java.lang.CharSequence;
import java.util.Map;
import java.lang.Integer;
import lnc.p3;
import java.lang.StringBuilder;
import q87.c;
import android.content.Intent;
import android.net.Uri;
import ekd.x0;

public final class HotspotArg extends SerialArg	// class@000e9f
{

    public void HotspotArg(String p0,String p1,PostArguments p2){
       a.p(p0, "intentKey");
       a.p(p2, "postArguments");
       super(p0, p1, p2);
    }
    public final boolean isValid(){
       String obj = PatchProxy.apply(null, this, HotspotArg.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.getValue() != null) {
          obj = this.getValue();
          a.m(obj);
          obj = obj.getId();
          Object obj1 = (obj == null || !obj.length())? 1: null;
          if (!obj1) {
             obj1 = this.getValue();
             a.m(obj1);
             obj = obj1.getName();
             obj1 = (obj == null || !obj.length())? 1: 0;
             if (!obj1) {
             label_0054 :
                return b;
             }
          }
       }
    label_0053 :
       b = false;
       goto label_0054 ;
    }
    public final void readFromMap(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotspotArg.class, "2")) {
          return;
       }
       HotspotParams hotspotParam = 1;
       int i = 0;
       String str = (p0 == null || p0.isEmpty())? 1: null;
       if (str) {
          return;
       }else {
          str = p0.get("hotspotID");
          String str1 = p0.get("hotspotTitle");
          String str2 = p0.get("hotspotConnectType");
          int i1 = (str == null || !str.length())? 1: 0;
          if (!i1) {
             i1 = (str1 == null || !str1.length())? 1: 0;
             if (!i1) {
                if (str2 != null && str2.length()) {
                   hotspotParam = null;
                }
                int i2 = (hotspotParam)? 0: Integer.parseInt(str2);
                hotspotParam = new HotspotParams();
                hotspotParam.mId = str;
                hotspotParam.mName = str1;
                hotspotParam.mConnectType = i2;
                this.setValue(hotspotParam);
                Object[] objArray = new Object[i];
                p3.D().w("PostArgType", "HotspotArg readFromMap value: "+this.getValue(), objArray);
             }
          }
          return;
       }
    }
    public void readFromStr(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotspotArg.class, "3")) {
          return;
       }
       a.p(p0, "v");
       return;
    }
    public void readScheme(Intent p0){
       String str;
       HotspotParams value;
       String id;
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, HotspotArg.class, "1")) {
          return;
       }
       a.p(p0, "intent");
       int i = 0;
       if (this.getValue() != null) {
          p3 op3 = p3.D();
          str = "HotspotArg readScheme value has been set ";
          value = this.getValue();
          id = (value != null)? value.getId(): null;
          objArray = new Object[i];
          op3.A("PostArgType", str+id, objArray);
          return;
       }else {
          str = x0.a(p0.getData(), "hotspotID");
          id = x0.a(p0.getData(), "hotspotTitle");
          String str1 = x0.a(p0.getData(), "hotspotConnectType");
          HotspotParams hotspotParam = 1;
          int i1 = (str == null || !str.length())? 1: 0;
          if (!i1) {
             i1 = (id == null || !id.length())? 1: 0;
             if (!i1) {
                if (str1 != null && str1.length()) {
                   hotspotParam = null;
                }
                int i2 = (hotspotParam)? 0: Integer.parseInt(str1);
                hotspotParam = new HotspotParams();
                hotspotParam.mId = str;
                hotspotParam.mName = id;
                hotspotParam.mConnectType = i2;
                this.setValue(hotspotParam);
                objArray = new Object[i];
                p3.D().w("PostArgType", "HotspotArg readScheme value: "+this.getValue(), objArray);
             }
          }
          return;
       }
    }
}
