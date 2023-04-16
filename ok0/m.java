package ok0.m;
import ok0.n;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import qk0.b;
import ok0.b;
import androidx.lifecycle.LifecycleOwner;
import android.view.View;
import com.kuaishou.ksmvvm.command.KSCommand;
import ok0.k;
import android.view.View$OnClickListener;
import ok0.j;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import ok0.l;
import ok0.m$a;
import android.text.TextWatcher;
import java.lang.CharSequence;
import android.text.Editable;
import java.lang.String;
import java.lang.Object;
import android.text.TextUtils;

public final class m	// class@00351a
{

    public static void a(n p0,LiveData p1,Observer p2){
       if (p1 != null && p2 != null) {
          p0.z6().a(p0.j(), p1, p2);
       }
       return;
    }
    public static void b(n p0,View p1,KSCommand[] p2){
       p1.setOnClickListener(new k(p2));
    }
    public static void c(n p0,View[] p1,KSCommand[] p2){
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          p1[i].setOnClickListener(new j(p2));
       }
       return;
    }
    public static void d(n p0,Observer p1,LiveData[] p2){
       if (p2 != null && p2.length) {
          int len = p2.length;
          for (int i = 0; i < len; i = i + 1) {
             p0.z6().a(p0.j(), p2[i], p1);
          }
       }
       return;
    }
    public static void e(n p0,EditText p1,MutableLiveData p2){
       if (p1 != null && p2 != null) {
          p0.z6().a(p0.j(), p2, new l(p1));
          p1.addTextChangedListener(new m$a(p0, p2));
       }
       return;
    }
    public static void f(KSCommand[] p0,View p1){
       m.j(p0, p1);
    }
    public static void g(KSCommand[] p0,View p1){
       m.i(p0, p1);
    }
    public static void h(EditText p0,CharSequence p1){
       m.k(p0, p1);
    }
    public static void i(KSCommand[] p0,View p1){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p0[i].a();
       }
       return;
    }
    public static void j(KSCommand[] p0,View p1){
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          p0[i].a();
       }
       return;
    }
    public static void k(EditText p0,CharSequence p1){
       if (!TextUtils.equals(p0.getText().toString(), p1)) {
          p0.setText(p1);
       }
       return;
    }
}
