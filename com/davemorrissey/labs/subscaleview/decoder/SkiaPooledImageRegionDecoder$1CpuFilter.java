package com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder$1CpuFilter;
import java.io.FileFilter;
import com.davemorrissey.labs.subscaleview.decoder.SkiaPooledImageRegionDecoder;
import java.lang.Object;
import java.io.File;
import java.lang.String;
import java.lang.CharSequence;
import java.util.regex.Pattern;

public class SkiaPooledImageRegionDecoder$1CpuFilter implements FileFilter	// class@000fc3
{
    public final SkiaPooledImageRegionDecoder this$0;

    public void SkiaPooledImageRegionDecoder$1CpuFilter(SkiaPooledImageRegionDecoder p0){
       this.this$0 = p0;
       super();
    }
    public boolean accept(File p0){
       return Pattern.matches("cpu[0-9]+", p0.getName());
    }
}
