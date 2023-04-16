package fw8.r$a;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.content.Intent;
import java.lang.String;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.KeyEvent;

public interface abstract r$a	// class@00169a
{

    void a(Activity p0,View p1,ViewGroup$LayoutParams p2);
    void b(Activity p0,View p1);
    String c(Intent p0);
    void d(Intent p0,View p1);
    void e(Intent p0);
    void f(FragmentActivity p0,Bundle p1);
    void g(FragmentActivity p0,Bundle p1);
    void h(FragmentActivity p0,MotionEvent p1);
    void i(FragmentActivity p0,Intent p1);
    void j(Activity p0,int p1);
    void k(FragmentActivity p0,KeyEvent p1);
    void onSaveInstanceState(Bundle p0);
}
