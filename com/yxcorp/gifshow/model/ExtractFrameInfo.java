package com.yxcorp.gifshow.model.ExtractFrameInfo;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class ExtractFrameInfo	// class@001e0b
{
    public ExtractFrameAttribute mAttribute;
    public String mKey;
    public String mLuaScript;
    public ExtractFrameVerify mVerify;

    public void ExtractFrameInfo(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, ExtractFrameInfo.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "ExtractFrameInfo{mKey="+this.mKey+"mAttribute="+this.mAttribute+", mVerify="+this.mVerify+", mLuaScript=\'"+this.mLuaScript+'''+'}';
    }
}
