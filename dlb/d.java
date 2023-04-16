package dlb.d;
import erd.g;
import java.lang.String;
import java.lang.Object;
import njd.a;
import com.yxcorp.gifshow.mockphoto.EncodeResultResponse;
import com.yxcorp.gifshow.mockphoto.EncodeResultResponse$EncodeResult;
import com.yxcorp.retrofit.model.KwaiException;

public final class d implements g	// class@0024c1
{

    public void d(String p0){
       super();
    }
    public final void accept(Object p0){
       if (p0.a().mEncodeResult != null && p0.a().mEncodeResult != EncodeResultResponse$EncodeResult.PROCESSING) {
          return;
       }
       throw new KwaiException(p0);
    }
}
