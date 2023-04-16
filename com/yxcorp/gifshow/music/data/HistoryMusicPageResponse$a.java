package com.yxcorp.gifshow.music.data.HistoryMusicPageResponse$a;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class HistoryMusicPageResponse$a	// class@002052
{
    public int a;
    public int b;
    public int c;

    public void HistoryMusicPageResponse$a(){
       super();
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, HistoryMusicPageResponse$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "PageInfo{mCurrentStartIndex="+this.a+", mCurrentEndIndex="+this.b+", mTotalSize="+this.c+'}';
    }
}
