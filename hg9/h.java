package hg9.h;
import qi9.s1;
import com.yxcorp.gifshow.camera.record.photo.e;
import java.lang.Object;

public final class h implements s1	// class@002660
{
    public final e a;

    public void h(e p0){
       this.a = p0;
    }
    public final void onLowLightDetectorResult(boolean p0){
       h ta = this.a;
       if (ta.s != null) {
       }else if(ta.k2()){
          ta.B = p0;
          ta.n2();
       }
       return;
    }
}
