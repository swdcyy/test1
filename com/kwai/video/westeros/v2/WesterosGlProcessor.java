package com.kwai.video.westeros.v2.WesterosGlProcessor;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import l65.a;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import com.kwai.video.westeros.v2.WesterosGlProcessor$WesterosDaenerysGlProcessor;

public abstract class WesterosGlProcessor	// class@0010c3
{
    public a daenerysProcessor;
    public long nativeProcessor;
    public boolean released;

    public void WesterosGlProcessor(){
       super();
       this.nativeProcessor = 0;
       this.released = false;
       this.daenerysProcessor = null;
       this.nativeProcessor = this.createNativeProcessor();
    }
    public abstract long createNativeProcessor();
    public native final long nativeGetDaenerysGlProcessor(long p0);
    public native final void nativeReleaseWesterosGlProcessor(long p0);
    public void release(){
       if (PatchProxy.applyVoid(null, this, WesterosGlProcessor.class, "3")) {
          return;
       }
       if (this.released == null) {
          this.released = true;
          this.releaseNativeProcessor(this.nativeProcessor);
          WesterosGlProcessor tdaenerysPro = this.daenerysProcessor;
          if (tdaenerysPro != null) {
             tdaenerysPro.release();
          }
       }
       return;
    }
    public final void releaseNativeProcessor(long p0){
       WesterosGlProcessor westerosGlPr = WesterosGlProcessor.class;
       if (PatchProxy.isSupport(westerosGlPr) && PatchProxy.applyVoidOneRefs(Long.valueOf(p0), this, westerosGlPr, "2")) {
          return;
       }
       WesterosGlProcessor tnativeProce = this.nativeProcessor;
       if (tnativeProce) {
          this.nativeReleaseWesterosGlProcessor(tnativeProce);
       }
       return;
    }
    public boolean released(){
       return this.released;
    }
    public a toDaenerysProcessor(){
       Object obj = PatchProxy.apply(null, this, WesterosGlProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.daenerysProcessor == null) {
          this.daenerysProcessor = new WesterosGlProcessor$WesterosDaenerysGlProcessor(this.nativeGetDaenerysGlProcessor(this.nativeProcessor));
       }
       return this.daenerysProcessor;
    }
}
