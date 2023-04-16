package a1.a$b;
import android.view.LayoutInflater;
import java.lang.String;
import android.content.Context;
import q0.f;
import android.view.LayoutInflater$Factory;
import android.util.AttributeSet;
import android.view.View;

public class a$b extends LayoutInflater	// class@00003b
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"android.widget.","android.webkit.","android.app."};
       a$b.a = stringArray;
    }
    public void a$b(Context p0){
       super(p0);
    }
    public LayoutInflater cloneInContext(Context p0){
       a$b uob = new a$b(p0);
       uob.setFactory(new f());
       return uob;
    }
    public View onCreateView(String p0,AttributeSet p1){
       View view;
       String[] a = a$b.a;
       int len = a.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return super.onCreateView(p0, p1);
          }
          object oobject = a[i];
          try{
             view = this.createView(p0, oobject, p1);
             if (view != null) {
                break ;
             }else {
                i = i + 1;
             }
          }catch(java.lang.ClassNotFoundException e0){
          }
       }
       return view;
    }
}
