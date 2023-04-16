package g41.a;
import s99.d;
import g41.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import t99.w;
import com.yxcorp.gifshow.autoplay.widget.FrameAutoPlayCard;

public final class a implements d	// class@002418
{
    public final c a;

    public void a(c p0){
       this.a = p0;
    }
    public final boolean a(String p0){
       a ta = this.a;
       boolean b = true;
       if (!ta.j.booleanValue()) {
          ta.f.onNext("disable");
       }else if(r1.t2(ta.b.mEntity)){
          ta.f.onNext("disable");
       }else if(w.b(ta.b.mEntity)){
          ta.f.onNext("closeLive");
       }else if(!p0.equals("focus_dispatch") && !ta.o.g()){
          ta.f.onNext("noVisionFocus");
       }else {
          c k = ta.k;
          if (k != null && k.a(p0)) {
             ta.f.onNext("bizCustom");
          }else {
             b = false;
          }
       }
       return b;
    }
}
