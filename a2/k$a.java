package a2.k$a;
import android.view.Window;
import android.view.View;

public class k$a	// class@000076
{

    public static void a(Window p0,boolean p1){
       View decorView = p0.getDecorView();
       int systemUiVisi = decorView.getSystemUiVisibility();
       int i = (p1)? systemUiVisi & 0xf8ff: systemUiVisi | 0x0700;
       decorView.setSystemUiVisibility(i);
       return;
    }
}
