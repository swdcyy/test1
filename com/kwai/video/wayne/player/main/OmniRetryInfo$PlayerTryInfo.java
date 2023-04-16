package com.kwai.video.wayne.player.main.OmniRetryInfo$PlayerTryInfo;
import java.lang.Object;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import nsd.r0;
import java.util.Locale;
import java.util.Arrays;
import kotlin.jvm.internal.a;
import java.util.List;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuffer;
import java.lang.Long;
import java.util.Iterator;
import java.lang.StringBuilder;

public final class OmniRetryInfo$PlayerTryInfo	// class@000d76
{
    public final List mErrorStringList;
    public final int mInnerIndex;
    public final int mRetryCount;
    public final long mStartPlayPosition;

    public void OmniRetryInfo$PlayerTryInfo(int p0,int p1,long p2){
       super();
       this.mInnerIndex = p0;
       this.mRetryCount = p1;
       this.mStartPlayPosition = p2;
       this.mErrorStringList = new CopyOnWriteArrayList();
    }
    public final void addError(String p0,int p1){
       OmniRetryInfo$PlayerTryInfo playerTryInf = OmniRetryInfo$PlayerTryInfo.class;
       if (PatchProxy.isSupport(playerTryInf) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, playerTryInf, "1")) {
          return;
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(p1)};
       p0 = String.format(Locale.US, "%s:%d", Arrays.copyOf(objArray, 2));
       a.o(p0, "java.lang.String.format\(locale, format, *args\)");
       this.mErrorStringList.add(p0);
       return;
    }
    public final String getDescribe(){
       StringBuffer obj = PatchProxy.apply(null, this, OmniRetryInfo$PlayerTryInfo.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.mInnerIndex),Integer.valueOf(this.mRetryCount),Long.valueOf(this.mStartPlayPosition)};
       String str = String.format(Locale.US, "[%d][RetryCount:%d][startPos:%dms]", Arrays.copyOf(objArray, 3));
       a.o(str, "java.lang.String.format\(locale, format, *args\)");
       obj = str;
       if (!this.mErrorStringList.size()) {
          obj = obj+"\n    暂无错误信息";
          a.o(obj, "sb.append\(\"\\n    暂无错误信息\"\)");
       }else {
          Iterator iterator = this.mErrorStringList.iterator();
          while (iterator.hasNext()) {
             obj = obj+"\n    "+iterator.next();
          }
       }
       obj = obj;
       a.o(obj, "sb.toString\(\)");
       return obj;
    }
}
