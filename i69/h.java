package i69.h;
import brd.v;
import android.graphics.Bitmap;
import java.lang.String;
import com.yxcorp.gifshow.aicut.api.AICutErrorCode;

public interface abstract h	// class@002641
{

    void a(v p0);
    void b(Bitmap p0);
    void c();
    void d(String p0,int p1);
    void e(String p0,AICutErrorCode p1);
    void f(AICutErrorCode p0);
    void g(int p0);
    void h(String p0);
    void i(String p0,String p1);
    void j();
    void onFrameResult(Bitmap p0);
    void onStart();
}
