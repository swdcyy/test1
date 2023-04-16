package g99.h;
import msd.a;
import com.yxcorp.gifshow.atlas_detail.common.presenter.toolbar.a;
import java.lang.Object;
import java.util.Objects;
import o76.b;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;

public final class h implements a	// class@002444
{
    public final a b;

    public void h(a p0){
       this.b = p0;
    }
    public final Object invoke(){
       h tb = this.b;
       Objects.requireNonNull(tb);
       b uob = new b(tb.v.getPhotoId(), null, null, -1, 810, null);
       return v8;
    }
}
