package com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData;
import java.io.Serializable;
import com.kwai.yoda.function.webview.GetPageLoadDataFunction$PerfDataResultParams$TimeData$a;
import nsd.u;
import java.lang.Object;
import java.util.Map;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class GetPageLoadDataFunction$PerfDataResultParams$TimeData implements Serializable	// class@001250
{
    public long mCreated;
    public long mDidEndLoad;
    public long mDidStartLoad;
    public long mPageShow;
    public long mPageStart;
    public long mPreCreate;
    public long mStartLoad;
    public long mUserStart;
    public static final GetPageLoadDataFunction$PerfDataResultParams$TimeData$a Companion;
    public static final long serialVersionUID;

    static {
       GetPageLoadDataFunction$PerfDataResultParams$TimeData.Companion = new GetPageLoadDataFunction$PerfDataResultParams$TimeData$a(null);
    }
    public void GetPageLoadDataFunction$PerfDataResultParams$TimeData(){
       super();
    }
    public static final GetPageLoadDataFunction$PerfDataResultParams$TimeData fromSessionStampMap(Map p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, GetPageLoadDataFunction$PerfDataResultParams$TimeData.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return GetPageLoadDataFunction$PerfDataResultParams$TimeData.Companion.a(p0);
    }
    public final long getMCreated(){
       return this.mCreated;
    }
    public final long getMDidEndLoad(){
       return this.mDidEndLoad;
    }
    public final long getMDidStartLoad(){
       return this.mDidStartLoad;
    }
    public final long getMPageShow(){
       return this.mPageShow;
    }
    public final long getMPageStart(){
       return this.mPageStart;
    }
    public final long getMPreCreate(){
       return this.mPreCreate;
    }
    public final long getMStartLoad(){
       return this.mStartLoad;
    }
    public final long getMUserStart(){
       return this.mUserStart;
    }
    public final void setMCreated(long p0){
       this.mCreated = p0;
    }
    public final void setMDidEndLoad(long p0){
       this.mDidEndLoad = p0;
    }
    public final void setMDidStartLoad(long p0){
       this.mDidStartLoad = p0;
    }
    public final void setMPageShow(long p0){
       this.mPageShow = p0;
    }
    public final void setMPageStart(long p0){
       this.mPageStart = p0;
    }
    public final void setMPreCreate(long p0){
       this.mPreCreate = p0;
    }
    public final void setMStartLoad(long p0){
       this.mStartLoad = p0;
    }
    public final void setMUserStart(long p0){
       this.mUserStart = p0;
    }
}
