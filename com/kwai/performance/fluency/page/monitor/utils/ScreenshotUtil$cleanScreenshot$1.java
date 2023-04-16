package com.kwai.performance.fluency.page.monitor.utils.ScreenshotUtil$cleanScreenshot$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.io.File;
import java.lang.Object;
import qrd.l1;
import java.util.Iterator;
import nsd.h;
import java.lang.System;

public final class ScreenshotUtil$cleanScreenshot$1 extends Lambda implements a	// class@0010d1
{
    public final File $dir;

    public void ScreenshotUtil$cleanScreenshot$1(File p0){
       this.$dir = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       File[] uFileArray = this.$dir.listFiles();
       if (uFileArray != null) {
          Iterator iterator = h.a(uFileArray);
          if (iterator != null && iterator.hasNext()) {
             File uFile = iterator.next();
             if (uFile != null && (uFile.isFile() && (System.currentTimeMillis() - uFile.lastModified()) - 0x5265c00 > 0)) {
                uFile.delete();
             }
          }
       }
       return;
    }
}
