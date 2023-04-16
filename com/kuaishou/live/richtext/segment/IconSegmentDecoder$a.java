package com.kuaishou.live.richtext.segment.IconSegmentDecoder$a;
import android.util.LruCache;
import java.lang.Object;
import java.lang.String;
import android.graphics.drawable.BitmapDrawable;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import android.graphics.Bitmap;

public class IconSegmentDecoder$a extends LruCache	// class@000f72
{
    public static SoftReference a;

    public void IconSegmentDecoder$a(){
       super(0x500000);
    }
    public int sizeOf(Object p0,Object p1){
       int i;
       p0 = PatchProxy.applyTwoRefs(p0, p1, this, IconSegmentDecoder$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          i = p0.intValue();
       }else {
          p0 = p1.getBitmap();
          p1 = PatchProxy.applyOneRefs(p0, this, IconSegmentDecoder$a.class, "3");
          if (p1 != PatchProxyResult.class) {
             i = p1.intValue();
          }else if(p0 == null){
             i = 0;
          }else {
             i = p0.getAllocationByteCount();
          }
       }
       return i;
    }
}
