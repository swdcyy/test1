package com.kuaishou.live.core.voiceparty.music.m$a;
import java.lang.String;
import com.kuaishou.android.model.music.Music;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class m$a	// class@0017df
{
    public final String a;
    public final String b;
    public final String c;
    public final Music d;

    public void m$a(String p0,String p1,String p2,Music p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, m$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OrderMusicParams{mLiveStreamId=\'"+this.a+'''+", mVoicePartyId=\'"+this.b+'''+", mKtvId=\'"+this.c+'''+", mMusic="+this.d+'}';
    }
}
