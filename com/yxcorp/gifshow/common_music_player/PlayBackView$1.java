package com.yxcorp.gifshow.common_music_player.PlayBackView$1;
import androidx.appcompat.widget.AppCompatImageView;
import com.yxcorp.gifshow.common_music_player.PlayBackView;
import android.content.Context;
import com.yxcorp.gifshow.common_music_player.PlayBackView$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.widget.ImageView;

public class PlayBackView$1 extends AppCompatImageView	// class@00118d
{
    public final PlayBackView$a d;
    public final PlayBackView e;

    public void PlayBackView$1(PlayBackView p0,Context p1,PlayBackView$a p2){
       this.e = p0;
       this.d = p2;
       super(p1);
    }
    public void setVisibility(int p0){
       if (PatchProxy.isSupport(PlayBackView$1.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, PlayBackView$1.class, "1")) {
          return;
       }
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
