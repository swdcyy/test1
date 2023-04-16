package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b	// class@00152b
{
    public List a;

    public void b(){
       super();
       this.a = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveVoicePartyEmptyRecommendData{mEmptyRecommendItems="+this.a+'}';
    }
}
