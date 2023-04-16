package com.kuaishou.live.bridge.commands.migrated.LiveJsCmdGetCurrentMagicFaceId$ResultData;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;

public final class LiveJsCmdGetCurrentMagicFaceId$ResultData implements Serializable	// class@000e0d
{
    public String magicFaceId;

    public void LiveJsCmdGetCurrentMagicFaceId$ResultData(){
       super();
       this.magicFaceId = "";
    }
    public final String getMagicFaceId(){
       return this.magicFaceId;
    }
    public final void setMagicFaceId(String p0){
       this.magicFaceId = p0;
    }
}
