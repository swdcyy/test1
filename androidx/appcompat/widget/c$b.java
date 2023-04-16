package androidx.appcompat.widget.c$b;
import androidx.appcompat.widget.c$a;
import android.text.StaticLayout$Builder;
import android.widget.TextView;
import android.text.TextDirectionHeuristic;

public class c$b extends c$a	// class@000641
{

    public void c$b(){
       super();
    }
    public void a(StaticLayout$Builder p0,TextView p1){
       p0.setTextDirection(p1.getTextDirectionHeuristic());
    }
    public boolean b(TextView p0){
       return p0.isHorizontallyScrollable();
    }
}
