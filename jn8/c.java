package jn8.c;
import ze.q0;
import jn8.d;
import com.facebook.react.bridge.ReadableMap;
import java.lang.Object;
import ze.m;
import android.view.View;
import android.view.ViewGroup;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import androidx.transition.Transition;
import jn8.e;
import androidx.transition.e;

public class c implements q0	// class@002982
{
    public final int a;
    public final ReadableMap b;
    public final d c;

    public void c(d p0,int p1,ReadableMap p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void a(m p0){
       try{
          View view = p0.p(this.a);
          if (view instanceof ViewGroup) {
             ReadableArray array = this.b.getArray("transitions");
             int i1 = array.size();
             for (int i = 0; i < i1; i = i + 1) {
                e.b(view, e.c(array.getMap(i)));
             }
          }
          return;
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e0){
       }
    }
}
