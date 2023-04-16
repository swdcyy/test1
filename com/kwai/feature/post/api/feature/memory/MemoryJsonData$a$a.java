package com.kwai.feature.post.api.feature.memory.MemoryJsonData$a$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class MemoryJsonData$a$a	// class@0013ae
{
    public String mTemplateID;
    public List mTextList;

    public void MemoryJsonData$a$a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, MemoryJsonData$a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "SubAssetJson{mTemplateID=\'"+this.mTemplateID+'''+", mTextList="+this.mTextList+'}';
    }
}
