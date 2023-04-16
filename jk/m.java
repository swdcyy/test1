package jk.m;
import android.view.View$OnTouchListener;
import com.google.android.material.tabs.TabLayout$f;
import android.view.GestureDetector;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import com.google.android.material.tabs.KCubeTabLayout;

public final class m implements View$OnTouchListener	// class@002428
{
    public final TabLayout$f b;
    public final GestureDetector c;

    public void m(TabLayout$f p0,GestureDetector p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       return KCubeTabLayout.V(this.b, this.c, p0, p1);
    }
}
