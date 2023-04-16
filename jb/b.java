package jb.b;
import java.io.InputStream;
import android.graphics.Rect;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import java.io.FileDescriptor;
import jb.b$a;
import jb.a;
import java.lang.String;

public interface abstract b	// class@0023d2
{

    Bitmap a(InputStream p0,Rect p1,BitmapFactory$Options p2);
    Bitmap b(FileDescriptor p0,Rect p1,BitmapFactory$Options p2);
    void c(b$a p0);
    void d(a p0);
    Bitmap e(String p0,BitmapFactory$Options p1);
    Bitmap f(byte[] p0,int p1,int p2,BitmapFactory$Options p3);
}
