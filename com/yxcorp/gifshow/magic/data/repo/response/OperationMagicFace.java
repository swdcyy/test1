package com.yxcorp.gifshow.magic.data.repo.response.OperationMagicFace;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import com.yxcorp.gifshow.model.MagicBaseConfig;

public class OperationMagicFace extends MagicEmoji$MagicFace	// class@001b9c
{
    public int mIndex;
    public static final long serialVersionUID = 0xe7d12c98521f0b00;

    public void OperationMagicFace(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, OperationMagicFace.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "OperationMagicFace{mIndex="+this.mIndex+", mId=\'"+this.mId+'''+", mName=\'"+this.mName+'''+", mGroupId=\'"+this.mGroupId+'''+'}';
    }
}
