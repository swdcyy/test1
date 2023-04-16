package com.kwai.library.widget.deprecated.HorizontalListView$a;
import android.view.View$OnTouchListener;
import com.kwai.library.widget.deprecated.HorizontalListView;
import java.lang.Object;
import android.view.View;
import android.view.MotionEvent;
import android.view.GestureDetector;

public class HorizontalListView$a implements View$OnTouchListener	// class@000914
{
    public final HorizontalListView b;

    public void HorizontalListView$a(HorizontalListView p0){
       this.b = p0;
       super();
    }
    public boolean onTouch(View p0,MotionEvent p1){
       return this.b.d.onTouchEvent(p1);
    }
}
