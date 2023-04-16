package lz9.o;
import msd.a;
import lz9.b0;
import java.lang.String;
import java.lang.Object;
import java.util.Objects;
import o76.b;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class o implements a	// class@002ee5
{
    public final b0 b;

    public void o(b0 p0,String p1){
       this.b = p0;
    }
    public final Object invoke(){
       o tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b(tb.t.getPhotoId(), null, null, -1, 1744, "CLICK_COMMENT_BUTTON");
       return v8;
    }
}
