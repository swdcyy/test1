package com.kwai.library.widget.pageindicator.PagerIndicator$a;
import com.kwai.library.widget.pageindicator.PagerIndicator$c;
import com.kwai.library.widget.pageindicator.PagerIndicator;
import java.lang.Object;
import com.kwai.library.widget.pageindicator.PagerIndicator$d;

public class PagerIndicator$a implements PagerIndicator$c	// class@00096b
{
    public final PagerIndicator a;

    public void PagerIndicator$a(PagerIndicator p0){
       this.a = p0;
       super();
    }
    public void onPageSelected(int p0){
       if (p0 >= 0 && p0 < this.a.C.b()) {
          if (p0) {
             this.a.r = true;
          }
          if (this.a.C.b() <= 0) {
             return;
          }else {
             this.a.g(p0);
          }
       }
       return;
    }
}
