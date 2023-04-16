package gha.b;
import ok.h;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.HashMap;
import com.google.common.collect.Maps;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.PhotoType;
import kp.r1;
import java.lang.Integer;
import com.yxcorp.utility.TextUtils;

public final class b implements h	// class@002ad2
{
    public final String b;

    public void b(String p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       HashMap hashMap = Maps.s();
       hashMap.put("photoType", Integer.valueOf(r1.S1(p0.mEntity).toInt()));
       hashMap.put("photoId", r1.t1(p0.mEntity));
       hashMap.put("llsid", TextUtils.k(this.b));
       return hashMap;
    }
}
