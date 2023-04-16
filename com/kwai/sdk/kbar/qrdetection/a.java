package com.kwai.sdk.kbar.qrdetection.a;
import android.graphics.Bitmap;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$DecodeStatus;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$CodeType;
import java.lang.Object;
import com.google.gson.JsonObject;
import java.lang.Boolean;
import java.lang.String;
import com.google.gson.JsonArray;
import java.lang.Integer;
import java.lang.Number;
import com.google.gson.JsonElement;
import com.kwai.sdk.kbar.qrdetection.DecodeRet$Builder;
import com.kwai.sdk.kbar.qrdetection.DecodeRet;

public class a	// class@001627
{
    public JsonObject a;
    public Bitmap b;

    public void a(boolean p0,Bitmap p1,DecodeRet$DecodeStatus[] p2,DecodeRet$CodeType[] p3,int[] p4){
       JsonObject jsonObject;
       super();
       this.b = p1;
       if (p2.length != p3.length) {
          jsonObject = null;
       }else {
          JsonObject jsonObject1 = new JsonObject();
          jsonObject1.H("is_camera", Boolean.valueOf(p0));
          int i = 4;
          if (p4 == null || p4.length < i) {
             p4 = new int[i]{0,0,0,0};
          }
          int i1 = p4.length / i;
          JsonArray jsonArray = new JsonArray();
          int i2 = 0;
          for (int i3 = 0; i3 < i1; i3 = i4) {
             JsonObject jsonObject2 = new JsonObject();
             jsonObject2.a0("x", Integer.valueOf(p4[i3]));
             int i4 = i3 + 1;
             jsonObject2.a0("y", Integer.valueOf(p4[i4]));
             int i5 = i3 + 2;
             jsonObject2.a0("w", Integer.valueOf(p4[i5]));
             i3 = i3 + 3;
             jsonObject2.a0("h", Integer.valueOf(p4[i3]));
             jsonArray.G(jsonObject2);
          }
          jsonObject1.G("detect_result", jsonArray);
          jsonArray = new JsonArray();
          for (int i6 = 0; i6 < p2.length; i6++) {
             JsonObject jsonObject3 = new JsonObject();
             jsonObject3.a0("status", Integer.valueOf(new DecodeRet$Builder().setStatus(p2[i6]).build().transDecodeStatus()));
             jsonArray.G(jsonObject3);
          }
          jsonObject1.G("decodes_status", jsonArray);
          jsonArray = new JsonArray();
          for (; i2 < p3.length; i2 = i2 + 1) {
             JsonObject jsonObject4 = new JsonObject();
             jsonObject4.a0("type", Integer.valueOf(new DecodeRet$Builder().setType(p3[i2]).build().transDecodeType()));
             jsonArray.G(jsonObject4);
          }
          jsonObject1.G("code_type", jsonArray);
          jsonObject = jsonObject1;
       }
       this.a = jsonObject;
       return;
    }
    public JsonObject a(){
       return this.a;
    }
    public Bitmap b(){
       return this.b;
    }
}
