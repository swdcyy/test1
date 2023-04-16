package btb.a;
import ok.o;
import java.lang.Object;
import ctb.a;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxVideoCardItem;

public final class a implements o	// class@000467
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final boolean apply(Object p0){
       int i;
       p0 = p0.b;
       if (p0 instanceof NoticeBoxTextOnlyItem) {
          p0 = p0.mUnread;
       }else if(p0 instanceof NoticeBoxVideoCardItem){
          p0 = p0.mUnread;
       }else {
          i = false;
       label_0019 :
          return i;
       }
       i = p0 ^ 0x01;
       goto label_0019 ;
    }
}
