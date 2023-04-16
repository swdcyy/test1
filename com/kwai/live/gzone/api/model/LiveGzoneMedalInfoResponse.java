package com.kwai.live.gzone.api.model.LiveGzoneMedalInfoResponse;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import com.kwai.live.gzone.api.model.LiveGzoneMedalInfoResponse$Data;
import java.util.List;

public class LiveGzoneMedalInfoResponse implements Serializable	// class@000c5d
{
    public LiveGzoneMedalInfoResponse$Data mData;
    public static final long serialVersionUID = 0x383af6ff5a7b3d74;

    public void LiveGzoneMedalInfoResponse(){
       super();
    }
    public String getChooseId(){
       LiveGzoneMedalInfoResponse tmData = this.mData;
       if (tmData != null) {
          return tmData.mChooseId;
       }
       return null;
    }
    public List getMedalOptions(){
       LiveGzoneMedalInfoResponse tmData = this.mData;
       if (tmData != null) {
          return tmData.mOptions;
       }
       return null;
    }
}
