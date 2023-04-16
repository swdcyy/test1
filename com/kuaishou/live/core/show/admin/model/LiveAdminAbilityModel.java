package com.kuaishou.live.core.show.admin.model.LiveAdminAbilityModel;
import java.io.Serializable;
import java.lang.Object;
import com.kuaishou.live.core.show.admin.model.LiveAdminAbilityExtInfo;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class LiveAdminAbilityModel implements Serializable	// class@0009b4
{
    public LiveAdminAbilityExtInfo mExtInfo;
    public int mType;
    public static final long serialVersionUID = 0x6c3cbac42573f7ca;

    public void LiveAdminAbilityModel(){
       super();
    }
    public void LiveAdminAbilityModel(int p0,LiveAdminAbilityExtInfo p1){
       super();
       this.mType = p0;
       this.mExtInfo = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LiveAdminAbilityModel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LiveAdminAbilityModel{mType="+this.mType+", mExtInfo="+this.mExtInfo+'}';
    }
}
