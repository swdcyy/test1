package com.yxcorp.gifshow.edit.previewer.loaderv2.b;
import com.kwai.video.minecraft.model.Timeline$FontResolveHandler;
import java.lang.Object;
import java.lang.String;
import tkd.b;
import tkd.d;
import r16.a;
import r16.d;

public final class b implements Timeline$FontResolveHandler	// class@001b2f
{
    public static final b a;

    static {
       b.a = new b();
    }
    public void b(){
       super();
    }
    public final String resolvePathByFontId(String p0){
       if (("-1").equals(p0)) {
          p0 = d.a(0x14d6f666).A1();
       }
       return p0;
    }
}
