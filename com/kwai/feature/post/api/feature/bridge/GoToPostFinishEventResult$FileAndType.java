package com.kwai.feature.post.api.feature.bridge.GoToPostFinishEventResult$FileAndType;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class GoToPostFinishEventResult$FileAndType implements Serializable	// class@001319
{
    public final String mFilePath;
    public final String mType;
    public static final long serialVersionUID = 0x2baf5f151085d930;

    public void GoToPostFinishEventResult$FileAndType(String p0,String p1){
       super();
       this.mFilePath = p0;
       this.mType = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, GoToPostFinishEventResult$FileAndType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "FileAndType{mFilePath=\'"+this.mFilePath+'''+", mType=\'"+this.mType+'''+'}';
    }
}
