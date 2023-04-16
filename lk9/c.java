package lk9.c;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import lk9.f;
import lk9.a;
import java.lang.Object;
import com.kwai.emotionsdk.bean.EmotionInfo;

public class c extends Accessor	// class@002df7
{
    public final a c;
    public final f d;

    public void c(f p0,a p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.b;
    }
    public void set(Object p0){
       this.c.b = p0;
    }
}
