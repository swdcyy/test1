package ced.i;
import gic.f;
import com.yxcorp.plugin.search.result.hashtag.presenters.e;
import java.lang.Object;
import uo7.k;
import com.kwai.feature.api.social.message.imshare.model.IMShareObject;
import com.yxcorp.gifshow.entity.MultiImageLinkInfo;
import java.lang.String;
import mhc.o2;
import com.kwai.feature.api.social.message.imshare.model.IMShareMultiImageLinkInfoObject;

public final class i implements f	// class@00055e
{
    public final e a;

    public void i(e p0){
       this.a = p0;
    }
    public final IMShareObject a(k p0){
       return IMShareMultiImageLinkInfoObject.ofShare(this.a.V8(), o2.j(p0));
    }
}
