package com.tencent.mm.opensdk.modelmsg.WXGameLiveObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject;
import java.lang.Object;
import java.util.HashMap;
import java.lang.String;
import com.tencent.mm.opensdk.utils.b;
import android.os.Bundle;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;

public class WXGameLiveObject implements WXMediaMessage$IMediaObject	// class@000ef6
{
    public HashMap extraInfoMap;

    public void WXGameLiveObject(){
       this.extraInfoMap = new HashMap();
    }
    public boolean checkArgs(){
       return true;
    }
    public String getExtra(String p0,String p1){
       WXGameLiveObject textraInfoMa = this.extraInfoMap;
       if (textraInfoMa == null) {
          return null;
       }
       p0 = textraInfoMa.get(p0);
       if (p0 != null) {
          p1 = p0;
       }
       return p1;
    }
    public void putExtra(String p0,String p1){
       if (this.extraInfoMap == null) {
          this.extraInfoMap = new HashMap();
       }
       if (!b.b(p0)) {
          this.extraInfoMap.put(p0, p1);
       }
       return;
    }
    public void serialize(Bundle p0){
       WXGameLiveObject textraInfoMa = this.extraInfoMap;
       if (textraInfoMa != null) {
          SerializableHook.putSerializable(p0, "_wxgame_extrainfo", textraInfoMa);
       }
       return;
    }
    public int type(){
       return 70;
    }
    public void unserialize(Bundle p0){
       this.extraInfoMap = SerializableHook.getSerializable(p0, "_wxgame_extrainfo");
    }
}
