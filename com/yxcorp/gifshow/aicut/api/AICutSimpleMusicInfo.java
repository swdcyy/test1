package com.yxcorp.gifshow.aicut.api.AICutSimpleMusicInfo;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class AICutSimpleMusicInfo implements Serializable	// class@001949
{
    public String mMusicID;
    public int mMusicType;

    public void AICutSimpleMusicInfo(){
       super();
       this.mMusicID = "";
    }
    public final String getMMusicID(){
       return this.mMusicID;
    }
    public final int getMMusicType(){
       return this.mMusicType;
    }
    public final void setMMusicID(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AICutSimpleMusicInfo.class, "1")) {
          return;
       }
       a.p(p0, "<set-?>");
       this.mMusicID = p0;
       return;
    }
    public final void setMMusicType(int p0){
       this.mMusicType = p0;
    }
}
