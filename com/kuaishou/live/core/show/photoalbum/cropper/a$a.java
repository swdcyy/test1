package com.kuaishou.live.core.show.photoalbum.cropper.a$a;
import android.graphics.Bitmap;
import java.lang.Object;
import android.net.Uri;
import java.lang.Exception;

public final class a$a	// class@000d68
{
    public final Bitmap a;
    public final Uri b;
    public final Exception c;
    public final boolean d;
    public final int e;

    public void a$a(Bitmap p0,int p1){
       super();
       this.a = p0;
       this.b = null;
       this.c = null;
       this.d = false;
       this.e = p1;
    }
    public void a$a(Uri p0,int p1){
       super();
       this.a = null;
       this.b = p0;
       this.c = null;
       this.d = true;
       this.e = p1;
    }
    public void a$a(Exception p0,boolean p1){
       super();
       this.a = null;
       this.b = null;
       this.c = p0;
       this.d = p1;
       this.e = 1;
    }
}
