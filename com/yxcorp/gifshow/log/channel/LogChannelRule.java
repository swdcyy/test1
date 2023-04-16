package com.yxcorp.gifshow.log.channel.LogChannelRule;
import n2b.b;
import java.io.Serializable;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$CustomEvent$CustomEventBiz;
import java.lang.Class;
import f3b.o;
import com.kuaishou.client.log.stat.packages.nano.ClientStat$CustomStatEvent$CustomStatEventBiz;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage$Type;

public class LogChannelRule implements b, Serializable	// class@001af9
{
    public int[] mBizList;
    public int mChannel;
    public String mElementAction2;
    public String mEventType;
    public String mExceptionType;
    public String mKey;
    public String mPage2;
    public int[] mPhotoTypeList;
    public String mSource;
    public String mType;
    public static final long serialVersionUID = 0x12a046a85c8ddee7;

    public void LogChannelRule(JsonObject p0){
       super();
       this.mChannel = -1;
       JsonElement jsonElement = p0.e0("evt");
       if (jsonElement != null) {
          this.mEventType = jsonElement.w();
       }
       jsonElement = p0.e0("ea2");
       if (jsonElement != null) {
          this.mElementAction2 = jsonElement.w();
       }
       jsonElement = p0.e0("p2");
       if (jsonElement != null) {
          this.mPage2 = jsonElement.w();
       }
       jsonElement = p0.e0("exceptionType");
       if (jsonElement != null) {
          this.mExceptionType = jsonElement.w();
       }
       jsonElement = p0.e0("key");
       if (jsonElement != null) {
          this.mKey = jsonElement.w();
       }
       jsonElement = p0.e0("biz");
       int i = 0;
       if (jsonElement != null && jsonElement.B()) {
          JsonArray jsonArray = jsonElement.q();
          int i1 = jsonArray.size();
          int[] ointArray = new int[i1];
          this.mBizList = ointArray;
          int i2 = 0;
          while (i2 < i1) {
             JsonElement jsonElement1 = jsonArray.e0(i2);
             if (jsonElement1 != null) {
                this.mBizList[i2] = ((this.mEventType).equals("custom"))? o.h(ClientEvent$CustomEvent$CustomEventBiz.class, jsonElement1.w()): o.h(ClientStat$CustomStatEvent$CustomStatEventBiz.class, jsonElement1.w());
             }
          label_0097 :
             i2 = i2 + 1;
          }
       }
       jsonElement = p0.e0("type");
       if (jsonElement != null) {
          this.mType = jsonElement.w();
       }
       jsonElement = p0.e0("source");
       if (jsonElement != null) {
          this.mSource = jsonElement.w();
       }
       jsonElement = p0.e0("chan");
       if (jsonElement != null) {
          this.mChannel = jsonElement.p();
       }
       JsonElement jsonElement2 = p0.e0("ppt");
       if (jsonElement2 != null && jsonElement2.B()) {
          JsonArray jsonArray1 = jsonElement2.q();
          int i3 = jsonArray1.size();
          int[] ointArray1 = new int[i3];
          this.mPhotoTypeList = ointArray1;
          while (i < i3) {
             JsonElement jsonElement3 = jsonArray1.e0(i);
             if (jsonElement3 != null) {
                this.mPhotoTypeList[i] = o.h(ClientContent$PhotoPackage$Type.class, jsonElement3.w());
             }
             i = i + 1;
          }
       }
       return;
    }
}
