package etb.h0;
import msd.l;
import etb.i0;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem$CardPhotoInfo;
import java.util.List;
import java.lang.Boolean;

public final class h0 implements l	// class@0027f6
{
    public final i0 b;
    public final int c;

    public void h0(i0 p0,int p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(Object p0){
       h0 tb = this.b;
       h0 tc = this.c;
       Objects.requireNonNull(tb);
       p0 = p0.getPhotoId();
       boolean b = (p0 != null && p0.equals(tb.t.mCardPhotoInfo.mPhotoIds.get(tc)))? true: false;
       return Boolean.valueOf(b);
    }
}
