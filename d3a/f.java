package d3a.f;
import ok.h;
import d3a.h;
import java.lang.Object;
import com.kwai.feature.api.feed.detail.router.biz.normal.NormalDetailBizParam;
import java.util.Objects;
import java.lang.Integer;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import uhc.a;
import java.lang.Boolean;

public final class f implements h	// class@001e6a
{
    public final h b;

    public void f(h p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       f tb = this.b;
       Objects.requireNonNull(tb);
       return Boolean.valueOf(a.h(Integer.valueOf(p0.mPopSharePanelStyle), p0.mFansGuidePhotoId, tb.a));
    }
}
