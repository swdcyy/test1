package com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext$VideoContextTypeAdapter;
import zk.i;
import com.google.gson.b;
import java.lang.Object;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import com.google.gson.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.gifshow.post.api.core.camerasdk.model.VideoContext;
import org.json.JSONObject;
import java.lang.StringBuilder;
import org.json.JSONException;
import com.yxcorp.utility.Log;
import qr4.i;
import com.kwai.gifshow.post.api.core.camerasdk.model.b;
import zk.h;
import zk.g;

public class VideoContext$VideoContextTypeAdapter implements i, b	// class@000ce9
{

    public void VideoContext$VideoContextTypeAdapter(){
       super();
    }
    public Object deserialize(JsonElement p0,Type p1,a p2){
       VideoContext videoContext = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoContext$VideoContextTypeAdapter.class, "2");
       if (videoContext != PatchProxyResult.class) {
       }else {
          try{
             videoContext = VideoContext.h(new JSONObject(p0.w()));
          }catch(org.json.JSONException e8){
             Log.n("VideoContext", "deserialize videoContext json error: "+e8.getMessage());
             videoContext = new VideoContext(b.b(p0.w()));
          }
       }
    }
    public JsonElement serialize(Object p0,Type p1,h p2){
       g og = PatchProxy.applyThreeRefs(p0, p1, p2, this, VideoContext$VideoContextTypeAdapter.class, "3");
       if (og != PatchProxyResult.class) {
       }else {
          og = new g(b.c(p0.F()));
       }
       return og;
    }
}
