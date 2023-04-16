package com.kwai.video.kstmf.KSTMFCustomEvent;
import r97.p;
import java.lang.String;
import r97.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.kstmf.KSTMFCustomEvent$1;
import r97.p$a;

public class KSTMFCustomEvent extends p	// class@00093c
{
    public String reportContent;

    public void KSTMFCustomEvent(String p0){
       super();
       this.reportContent = p0;
    }
    public String biz(){
       return "VIDEO";
    }
    public o commonParams(){
       Object obj = PatchProxy.apply(null, this, KSTMFCustomEvent.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new KSTMFCustomEvent$1(this);
    }
    public String key(){
       return "VIDEO_TMF";
    }
    public p$a toBuilder(){
       return null;
    }
    public String value(){
       return this.reportContent;
    }
}
