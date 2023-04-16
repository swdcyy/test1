package apd.j;
import android.view.View;
import android.view.View$OnClickListener;

public class j	// class@000219
{

    public static void a(View p0,View$OnClickListener p1,int p2){
       p0 = p0.findViewById(p2);
       if (p0 != null) {
          p0.setOnClickListener(p1);
       }
       return;
    }
    public static View b(View p0,int p1){
       return p0.findViewById(p1);
    }
}
