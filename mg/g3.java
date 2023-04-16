package mg.g3;
import erd.g;
import com.feature.post.bridge.y;
import com.kwai.feature.post.api.feature.bridge.JsMerchantPublishFromDraftIdParams;
import java.lang.Object;
import r16.d;
import java.util.Objects;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import mg.l3;
import r16.d$a;

public final class g3 implements g	// class@002601
{
    public final y b;
    public final JsMerchantPublishFromDraftIdParams c;

    public void g3(y p0,JsMerchantPublishFromDraftIdParams p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       g3 tb = this.b;
       g3 tc = this.c;
       Objects.requireNonNull(tb);
       p0.KY(TextUtils.k(tc.mCommentId), tc.mDraftId, (tc.mIsNormalPublish ^ 0x01), new l3(tb));
    }
}
