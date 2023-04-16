package androidx.appcompat.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import w0.s;
import w0.h;
import android.widget.AbsSeekBar;
import android.graphics.Canvas;

public class AppCompatSeekBar extends SeekBar	// class@0005eb
{
    public final h b;

    public void AppCompatSeekBar(Context p0){
       super(p0, null);
    }
    public void AppCompatSeekBar(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0407e0);
    }
    public void AppCompatSeekBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       s.a(this, this.getContext());
       h oh = new h(this);
       this.b = oh;
       oh.c(p1, p2);
    }
    public void drawableStateChanged(){
       super.drawableStateChanged();
       this.b.h();
    }
    public void jumpDrawablesToCurrentState(){
       super.jumpDrawablesToCurrentState();
       this.b.i();
    }
    public synchronized void onDraw(Canvas p0){
       super.onDraw(p0);
       this.b.g(p0);
    }
}
