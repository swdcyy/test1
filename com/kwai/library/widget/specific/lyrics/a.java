package com.kwai.library.widget.specific.lyrics.a;
import android.view.GestureDetector$SimpleOnGestureListener;
import com.kwai.library.widget.specific.lyrics.LyricsView;
import android.view.MotionEvent;
import com.kwai.library.widget.specific.lyrics.LyricsView$a;
import android.view.View;
import java.lang.Object;
import java.util.List;
import com.kwai.library.widget.specific.lyrics.LyricsLine;

public class a extends GestureDetector$SimpleOnGestureListener	// class@000a00
{
    public final LyricsView b;

    public void a(LyricsView p0){
       this.b = p0;
       super();
    }
    public boolean onDoubleTap(MotionEvent p0){
       LyricsView d = this.b.D;
       boolean b = (d == null || (d.b() || super.onDoubleTap(p0)))? true: false;
       return b;
    }
    public boolean onSingleTapConfirmed(MotionEvent p0){
       a tb = this.b;
       boolean b = false;
       if (tb.F != null) {
          return b;
       }
       if (tb.A != null) {
          tb.i(tb.d((int)((p0.getY() - (float)(tb.getHeight() / 2)) + (float)tb.getScrollY())));
          tb.a();
          LyricsView d = tb.D;
          if (d != null) {
             d.c(tb.N.get(tb.I).a);
          }
          b = true;
       }
       return b;
    }
}
