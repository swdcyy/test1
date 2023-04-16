package com.kwai.video.kstmf.KSTMFCustomEvent$1;
import r97.o;
import com.kwai.video.kstmf.KSTMFCustomEvent;
import java.lang.String;
import com.google.gson.JsonObject;
import r97.o$a;

public class KSTMFCustomEvent$1 extends o	// class@00093b
{
    public final KSTMFCustomEvent this$0;

    public void KSTMFCustomEvent$1(KSTMFCustomEvent p0){
       this.this$0 = p0;
       super();
    }
    public String container(){
       return "NATIVE";
    }
    public JsonObject feedLogCtx(){
       return null;
    }
    public String h5ExtraAttr(){
       return null;
    }
    public boolean needEncrypt(){
       return false;
    }
    public boolean realtime(){
       return false;
    }
    public float sampleRatio(){
       return 0x3f800000;
    }
    public String sdkName(){
       return "TMF";
    }
    public String subBiz(){
       return "TMF";
    }
    public o$a toBuilder(){
       return null;
    }
}
