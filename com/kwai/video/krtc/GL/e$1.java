package com.kwai.video.krtc.GL.e$1;
import com.kwai.video.krtc.GL.TextureBuffer$Type;
import java.lang.Enum;

public class e$1	// class@00075d
{
    public static final int[] a;

    static {
       int[] ointArray = new int[TextureBuffer$Type.values().length];
       try{
          e$1.a = ointArray;
          ointArray[TextureBuffer$Type.OES.ordinal()] = 1;
          try{
             e$1.a[TextureBuffer$Type.RGB.ordinal()] = 2;
          }catch(java.lang.NoSuchFieldError e0){
          }
       }catch(java.lang.NoSuchFieldError e0){
       }
    }
}
