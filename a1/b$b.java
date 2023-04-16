package a1.b$b;
import android.view.LayoutInflater;
import java.lang.String;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class b$b extends LayoutInflater	// class@000041
{
    public static final String[] a;

    static {
       String[] stringArray = new String[]{"android.widget.","android.webkit.","android.app."};
       b$b.a = stringArray;
    }
    public void b$b(Context p0){
       super(p0);
    }
    public LayoutInflater cloneInContext(Context p0){
       return new b$b(p0);
    }
    public View onCreateView(String p0,AttributeSet p1){
       View view;
       String[] a = b$b.a;
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
