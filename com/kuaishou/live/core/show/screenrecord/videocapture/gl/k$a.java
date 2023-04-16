package com.kuaishou.live.core.show.screenrecord.videocapture.gl.k$a;
import com.kuaishou.live.core.show.screenrecord.videocapture.gl.TextureBuffer$Type;
import java.lang.Enum;

public class k$a	// class@001002
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextureBuffer$Type.values().length];
       try{
          k$a.a = ointArray;
          ointArray[TextureBuffer$Type.OES.ordinal()] = 1;
          try{
             k$a.a[TextureBuffer$Type.RGB.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
