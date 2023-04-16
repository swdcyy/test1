package com.kwai.library.widget.pageindicator.HorizontalPageIndicator$a;
import android.view.View$OnClickListener;
import com.kwai.library.widget.pageindicator.HorizontalPageIndicator;
import java.lang.Object;
import android.view.View;
import java.lang.Integer;

public class HorizontalPageIndicator$a implements View$OnClickListener	// class@000969
{
    public final HorizontalPageIndicator b;

    public void HorizontalPageIndicator$a(HorizontalPageIndicator p0){
       this.b = p0;
       super();
    }
    public void onClick(View p0){
       if (this.b.l == null) {
          return;
       }
       if (p0.getTag() != null && p0.getTag() instanceof Integer) {
          this.b.b(p0.getTag().intValue());
       }
       return;
    }
}
