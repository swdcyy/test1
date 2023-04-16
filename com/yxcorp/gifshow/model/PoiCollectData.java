package com.yxcorp.gifshow.model.PoiCollectData;
import java.io.Serializable;
import java.lang.Object;

public class PoiCollectData implements Serializable	// class@001e71
{
    public String mPoiId;
    public int mStatus;
    public static final long serialVersionUID = 0x81c49cb298b5bf6c;

    public void PoiCollectData(){
       super();
    }
    public boolean isValid(){
       boolean b = true;
       if (this.mStatus == b) {
       }else {
          b = false;
       }
       return b;
    }
}
