package dl9.h;
import com.yxcorp.gifshow.label.tag.hashtag.a$a;
import dl9.m;
import java.lang.Object;
import gya.h;
import android.view.View;
import java.lang.String;
import java.util.Objects;
import com.kuaishou.android.model.mix.TagItem;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import dkc.b;
import com.yxcorp.gifshow.model.config.ActivityInfo;
import gw8.a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.client.log.content.packages.nano.ClientContent$KsOrderInfoPackage;
import k2b.l0;
import com.yxcorp.gifshow.log.model.CommonParams;

public final class h implements a$a	// class@001f69
{
    public final m a;

    public void h(m p0){
       this.a = p0;
    }
    public final void a(h p0,View p1,String p2,String p3,String p4){
       TagItem mName;
       h ta = this.a;
       Objects.requireNonNull(ta);
       TagItem tagItem = p0.c(p2);
       if (tagItem != null) {
          mName = tagItem.mName;
          tagItem = tagItem.mCount;
       }else {
          tagItem.mTag = p2;
          int i = 0;
       }
       ClientContent$TagPackage tagPackage = b.m(mName, ta.t);
       tagPackage.photoCount = (long)tagItem;
       ActivityInfo uActivityInf = a.a(tagPackage.name);
       ClientContent$KsOrderInfoPackage ksOrderInfoP = (uActivityInf != null && !TextUtils.x(uActivityInf.mKsOrderId))? l0.a(uActivityInf.mKsOrderId): null;
       b.r(ta.t, "topic_tag", tagPackage, null, ksOrderInfoP);
       return;
    }
}
