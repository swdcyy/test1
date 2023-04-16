package com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1;
import java.lang.Thread;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$DecoderPool;
import java.lang.System;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Exception;

public class SkiaPooledImageRegionDecoder$1 extends Thread	// class@000fc2
{
    public final SkiaPooledImageRegionDecoder this$0;

    public void SkiaPooledImageRegionDecoder$1(SkiaPooledImageRegionDecoder p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       SkiaPooledImageRegionDecoder$1 tthis$0 = this.this$0;
       SkiaPooledImageRegionDecoder decoderPool = tthis$0.decoderPool;
       while (decoderPool != null && tthis$0.allowAdditionalDecoder(decoderPool.size(), this.this$0.fileLength)) {
          try{
             if (this.this$0.decoderPool != null) {
                this.this$0.debug("Starting decoder");
                this.this$0.initialiseDecoder();
                long l = System.currentTimeMillis() - System.currentTimeMillis();
                this.this$0.debug("Started decoder, took "+l+"ms");
             }
          }catch(java.lang.Exception e0){
             this.this$0.debug("Failed to start decoder: "+e0.getMessage());
             goto label_0000 ;
          }
       }
       return;
    }
}
