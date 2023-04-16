package com.kuaishou.live.core.voiceparty.ktv.singersetting.LiveVoicePartyKtvSingerSettingDialog$b;
import java.lang.Cloneable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.AssertionError;

public class LiveVoicePartyKtvSingerSettingDialog$b implements Cloneable	// class@001532
{
    public int b;
    public float c;
    public float d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public void LiveVoicePartyKtvSingerSettingDialog$b(){
       super();
    }
    public LiveVoicePartyKtvSingerSettingDialog$b a(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyKtvSingerSettingDialog$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          return super.clone();
       }catch(java.lang.CloneNotSupportedException e0){
          throw new AssertionError(e0);
       }
    }
    public boolean b(){
       boolean b = (this.e != null || this.f != null)? true: false;
       return b;
    }
    public Object clone(){
       return this.a();
    }
}
