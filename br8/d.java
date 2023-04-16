package br8.d;
import androidx.recyclerview.widget.RecyclerView$q;
import androidx.recyclerview.widget.RecyclerView;
import br8.c;
import java.lang.Object;
import android.view.GestureDetector;
import android.content.Context;
import android.view.ViewGroup;
import br8.d$b;
import android.view.GestureDetector$OnGestureListener;
import android.view.MotionEvent;

public class d implements RecyclerView$q	// class@00044a
{
    public final GestureDetector b;
    public final RecyclerView c;
    public final c d;
    public d$a e;

    public void d(RecyclerView p0,c p1){
       super();
       this.b = new GestureDetector(p0.getContext(), new d$b(this));
       this.c = p0;
       this.d = p1;
    }
    public boolean a(RecyclerView p0,MotionEvent p1){
       boolean b = false;
       if (this.e != null) {
          if (this.b.onTouchEvent(p1)) {
             return true;
          }else if(!p1.getAction() && this.d.f((int)p1.getX(), (int)p1.getY()) != -1){
             b = true;
          }
       }
       return b;
    }
    public void onRequestDisallowInterceptTouchEvent(boolean p0){
    }
    public void onTouchEvent(RecyclerView p0,MotionEvent p1){
    }
}
