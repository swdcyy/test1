package com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b$b;
import java.lang.Object;
import java.util.ArrayList;
import com.kuaishou.live.core.voiceparty.ktv.emptyrecommend.b$a;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class b$b	// class@00152a
{
    public List a;

    public void b$b(){
       super();
       this.a = new ArrayList();
    }
    public void b$b(b$a p0){
       super();
       this.a = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, b$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveVoicePartyEmptyRecommendItem{mMusics="+this.a+'}';
    }
}
