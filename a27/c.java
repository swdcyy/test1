package a27.c;
import android.content.Context;
import android.content.res.Resources;
import cw9.c;
import android.content.SharedPreferences;
import a27.b;
import java.lang.String;
import java.lang.Math;
import android.view.View;
import java.lang.Object;
import android.view.inputmethod.InputMethodManager;
import android.os.IBinder;
import com.yxcorp.utility.n;

public class c	// class@000030
{
    public static int a;
    public static int b;
    public static int c;
    public static int d;

    public static int a(Context p0){
       if (!c.d) {
          c.d = c.b(p0.getResources(), 0x7f070aa0);
       }
       return c.d;
    }
    public static int b(Resources p0){
       if (!c.c) {
          c.c = c.b(p0, 0x7f070aa1);
       }
       return c.c;
    }
    public static int c(Context p0){
       Resources resources = p0.getResources();
       if (!c.b) {
          c.b = c.b(resources, 0x7f070a8c);
       }
       int b = c.b;
       int i = c.b(p0.getResources());
       if (!c.a) {
          c.a = b.a(p0).getInt("mSharedPreferences.key.keyboard.height", c.b(p0.getResources()));
       }
       return Math.min(b, Math.max(i, c.a));
    }
    public static void d(View p0){
       p0.getContext().getSystemService("input_method").hideSoftInputFromWindow(p0.getWindowToken(), 0);
    }
    public static void e(View p0){
       p0.requestFocus();
       n.a0(p0.getContext(), p0, 20);
    }
}
