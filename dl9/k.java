package dl9.k;
import erd.g;
import dl9.m;
import com.kuaishou.android.model.mix.QComment;
import android.widget.TextView;
import java.lang.CharSequence;
import android.text.SpannableStringBuilder;
import java.util.List;
import java.lang.Object;
import java.util.Map;

public final class k implements g	// class@001f75
{
    public final m b;
    public final QComment c;
    public final TextView d;
    public final CharSequence e;
    public final SpannableStringBuilder f;
    public final List g;
    public final boolean h;

    public void k(m p0,QComment p1,TextView p2,CharSequence p3,SpannableStringBuilder p4,List p5,boolean p6){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
    }
    public final void accept(Object p0){
       k tb = this.b;
       tb.Y8(this.c, this.d, this.e, this.f);
       tb.b9(this.g, this.h);
    }
}
