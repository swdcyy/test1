package com.yxcorp.gifshow.tube.StandardSerialInfo;
import java.io.Serializable;
import java.lang.Object;
import com.yxcorp.gifshow.tube.SerialPhoto;

public class StandardSerialInfo implements Serializable	// class@001df9
{
    public SerialInfo mSerialInfo;
    public SerialPhoto mSerialPhoto;
    public String mTubePageUrl;
    public static final long serialVersionUID = 0x1423561c53807cb0;

    public void StandardSerialInfo(){
       super();
    }
    public int getEpisodeNumber(){
       StandardSerialInfo tmSerialPhot = this.mSerialPhoto;
       if (tmSerialPhot == null) {
          return 0;
       }
       return tmSerialPhot.episodeNumber;
    }
}
