package ced.w0;
import sj.k;
import com.yxcorp.plugin.search.result.hashtag.presenters.v;
import java.lang.Object;
import java.util.Objects;

public final class w0 implements k	// class@00058a
{
    public final v a;

    public void w0(v p0){
       this.a = p0;
    }
    public final void a(int p0,float p1,int p2){
       w0 ta = this.a;
       Objects.requireNonNull(ta);
       if (p0 == 1) {
       }else if(p0 == 2){
          if (p1 - 0x3e4ccccd > 0) {
             ta.w = true;
          }else if(ta.w != null && !p2){
             ta.w = false;
          }
       }
       return;
    }
}
