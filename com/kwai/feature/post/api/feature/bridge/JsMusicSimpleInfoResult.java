package com.kwai.feature.post.api.feature.bridge.JsMusicSimpleInfoResult;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class JsMusicSimpleInfoResult implements Serializable	// class@00135c
{
    public String mMusicId;
    public int mMusicType;
    public static final long serialVersionUID = 0x270a908d7f3bf3cc;

    public void JsMusicSimpleInfoResult(String p0,int p1){
       super();
       this.mMusicId = p0;
       this.mMusicType = p1;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, JsMusicSimpleInfoResult.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "JsMusicSimpleInfoResult{mMusicId=\'"+this.mMusicId+'''+", mMusicType="+this.mMusicType+'}';
    }
}
