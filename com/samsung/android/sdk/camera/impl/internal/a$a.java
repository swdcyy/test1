package com.samsung.android.sdk.camera.impl.internal.a$a;
import android.media.Image$Plane;
import java.nio.ByteBuffer;
import com.samsung.android.sdk.camera.impl.internal.a;
import java.lang.IllegalStateException;
import java.lang.String;

public class a$a extends Image$Plane	// class@000b81
{
    public a a;
    public ByteBuffer b;
    public int c;
    public int d;
    public final a e;

    public void a(){
       this.a = null;
       this.b = null;
       this.c = 0;
       this.d = 0;
    }
    public ByteBuffer getBuffer(){
       if (this.a.c == null) {
          return this.b;
       }
       throw new IllegalStateException("Image is already released");
    }
    public int getPixelStride(){
       if (this.a.c == null) {
          return this.d;
       }
       throw new IllegalStateException("Image is already released");
    }
    public int getRowStride(){
       if (this.a.c == null) {
          return this.c;
       }
       throw new IllegalStateException("Image is already released");
    }
}
