package com.kwai.video.clipkit.config.EditorEncodeConfig$AudioEncodeConfig;
import java.lang.Cloneable;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.clipkit.config.EditorEncodeConfig$AudioEncodeConfig$1;
import java.lang.reflect.Type;
import el.a;
import com.kwai.video.clipkit.ClipKitUtils;
import com.google.gson.Gson;
import java.lang.CloneNotSupportedException;

public class EditorEncodeConfig$AudioEncodeConfig implements Cloneable	// class@001a62
{
    public int audioBitrate;
    public int audioCutOff;
    public String audioProfile;
    public int type;

    public void EditorEncodeConfig$AudioEncodeConfig(){
       super();
    }
    public static List defaultAudioEncodeConfigs(){
       Object obj = PatchProxy.apply(null, null, EditorEncodeConfig$AudioEncodeConfig.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ClipKitUtils.COMMON_GSON.i("[{\"type\":1,\"audioBitrate\":96000,\"audioCutOff\":20000,\"audioProfile\":\"aac_he\"}]", new EditorEncodeConfig$AudioEncodeConfig$1().getType());
    }
    public EditorEncodeConfig$AudioEncodeConfig clone(){
       CloneNotSupportedException uCloneNotSup;
       Object[] objArray1;
       Object[] objArray = null;
       EditorEncodeConfig$AudioEncodeConfig obj = PatchProxy.apply(objArray, this, EditorEncodeConfig$AudioEncodeConfig.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = super.clone();
          try{
             obj.audioProfile = this.audioProfile;
          label_0024 :
             return objArray1;
          }catch(java.lang.CloneNotSupportedException e1){
          }
          uCloneNotSup.printStackTrace();
          goto label_0024 ;
       }catch(java.lang.CloneNotSupportedException e0){
          uCloneNotSup = e0;
          objArray1 = objArray;
          goto label_0021 ;
       }
    }
    public Object clone(){
       return this.clone();
    }
}
