package androidx.emoji.widget.a$a;
import android.text.TextWatcher;
import android.text.SpanWatcher;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicInteger;
import android.text.Editable;
import androidx.emoji.text.EmojiSpan;
import java.lang.CharSequence;
import android.text.Spannable;

public class a$a implements TextWatcher, SpanWatcher	// class@00076d
{
    public final Object b;
    public final AtomicInteger c;

    public void a$a(Object p0){
       super();
       this.c = new AtomicInteger(0);
       this.b = p0;
    }
    public final void a(){
       this.c.incrementAndGet();
    }
    public void afterTextChanged(Editable p0){
       this.b.afterTextChanged(p0);
    }
    public final boolean b(Object p0){
       return p0 instanceof EmojiSpan;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.b.beforeTextChanged(p0, p1, p2, p3);
    }
    public final void c(){
       this.c.decrementAndGet();
    }
    public void onSpanAdded(Spannable p0,Object p1,int p2,int p3){
       if (this.c.get() > 0 && this.b(p1)) {
          return;
       }
       this.b.onSpanAdded(p0, p1, p2, p3);
       return;
    }
    public void onSpanChanged(Spannable p0,Object p1,int p2,int p3,int p4,int p5){
       if (this.c.get() > 0 && this.b(p1)) {
          return;
       }
       this.b.onSpanChanged(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void onSpanRemoved(Spannable p0,Object p1,int p2,int p3){
       if (this.c.get() > 0 && this.b(p1)) {
          return;
       }
       this.b.onSpanRemoved(p0, p1, p2, p3);
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       this.b.onTextChanged(p0, p1, p2, p3);
    }
}
