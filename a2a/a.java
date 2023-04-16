package a2a.a;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import a2a.c;
import com.yxcorp.gifshow.detail.model.response.CommentLimitInfo;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;

public class a extends Accessor	// class@00001c
{
    public final CommentLimitInfo c;
    public final c d;

    public void a(c p0,CommentLimitInfo p1){
       this.d = p0;
       this.c = p1;
       super();
    }
    public Object get(){
       return this.c.mPhoto;
    }
    public void set(Object p0){
       this.c.mPhoto = p0;
    }
}
