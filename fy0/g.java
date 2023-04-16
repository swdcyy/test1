package fy0.g;
import android.view.View$OnClickListener;
import fy0.j;
import java.lang.Object;
import android.view.View;
import xl8.b;
import java.lang.Integer;

public final class g implements View$OnClickListener	// class@0023d3
{
    public final j b;

    public void g(j p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       g tb = this.b;
       if (tb.a().a().intValue() == tb.e()) {
       }else {
          tb.a().d(Integer.valueOf(tb.e()));
          tb.e.onClick(p0);
       }
       return;
    }
}
