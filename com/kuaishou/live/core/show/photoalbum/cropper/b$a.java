package com.kuaishou.live.core.show.photoalbum.cropper.b$a;
import android.net.Uri;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.Exception;

public final class b$a	// class@000d6a
{
    public final Uri a;
    public final Bitmap b;
    public final int c;
    public final int d;
    public final Exception e;

    public void b$a(Uri p0,Bitmap p1,int p2,int p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = null;
    }
    public void b$a(Uri p0,Exception p1){
       super();
       this.a = p0;
       this.b = null;
       this.c = 0;
       this.d = 0;
       this.e = p1;
    }
}
