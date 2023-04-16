package com.kwai.library.widget.specific.misc.PlayBackView$1;
import androidx.appcompat.widget.AppCompatImageView;
import com.kwai.library.widget.specific.misc.PlayBackView;
import android.content.Context;
import com.kwai.library.widget.specific.misc.PlayBackView$a;
import android.widget.ImageView;

public class PlayBackView$1 extends AppCompatImageView	// class@000a15
{
    public final PlayBackView$a d;
    public final PlayBackView e;

    public void PlayBackView$1(PlayBackView p0,Context p1,PlayBackView$a p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       if (p0 != this.getVisibility()) {
          PlayBackView$1 td = this.d;
          if (td != null) {
             boolean b = (!p0)? true: false;
             td.a(b);
          }
       }
       return;
    }
}
