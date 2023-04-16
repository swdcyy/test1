package ced.x;
import erd.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.music.Music;
import java.util.List;
import java.lang.Object;
import r16.d;

public final class x implements g	// class@00058f
{
    public final GifshowActivity b;
    public final QPhoto c;
    public final Music d;
    public final List e;

    public void x(GifshowActivity p0,QPhoto p1,Music p2,List p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void accept(Object p0){
       p0.AP(this.b, this.c, this.d, this.e);
    }
}
