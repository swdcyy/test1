package com.yxcorp.gifshow.aicut.api.AICutGroup;
import java.io.Serializable;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class AICutGroup implements Serializable	// class@001946
{
    public String mGroupId;
    public String mGroupName;
    public List mStyleCheckSums;
    public static final long serialVersionUID = 0xe154060f6c4d2019;

    public void AICutGroup(){
       super();
       this.mGroupId = "";
       this.mGroupName = "";
       this.mStyleCheckSums = new ArrayList();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, AICutGroup.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "AICutGroup mGroupId="+this.mGroupId+" mGroupName="+this.mGroupName;
    }
}
