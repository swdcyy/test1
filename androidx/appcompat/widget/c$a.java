package androidx.appcompat.widget.c$a;
import androidx.appcompat.widget.c$c;
import android.text.StaticLayout$Builder;
import android.widget.TextView;
import android.text.TextDirectionHeuristics;
import java.lang.Object;
import java.lang.String;
import androidx.appcompat.widget.c;
import android.text.TextDirectionHeuristic;

public class c$a extends c$c	// class@000640
{

    public void c$a(){
       super();
    }
    public void a(StaticLayout$Builder p0,TextView p1){
       p0.setTextDirection(c.o(p1, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
