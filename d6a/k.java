package d6a.k;
import d6a.i;
import java.lang.Object;
import qvb.i;
import java.lang.String;
import com.yxcorp.gifshow.detail.slideplay.SlideMediaType;
import com.yxcorp.gifshow.entity.QPhoto;
import d6a.h;

public class k implements i	// class@001ea5
{
    public i a;
    public String b;
    public SlideMediaType c;

    public void k(){
       super();
    }
    public void k(i p0,String p1,SlideMediaType p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public SlideMediaType G1(){
       return this.c;
    }
    public boolean a(QPhoto p0,boolean p1){
       return h.a(this, p0, p1);
    }
    public String getId(){
       return this.b;
    }
    public i q(){
       return this.a;
    }
}
