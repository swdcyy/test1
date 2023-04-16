package com.yxcorp.gifshow.v3.editor.sticker.tag.recommend.TagRecommendPageList$e;
import java.util.concurrent.Callable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import com.yxcorp.utility.m;
import oq.e;
import com.kwai.framework.model.user.QCurrentUser;
import kotlin.jvm.internal.a;
import java.lang.Long;

public final class TagRecommendPageList$e implements Callable	// class@0012bb
{
    public static final TagRecommendPageList$e b;

    static {
       TagRecommendPageList$e.b = new TagRecommendPageList$e();
    }
    public void TagRecommendPageList$e(){
       super();
    }
    public Object call(){
       List list = PatchProxy.apply(null, this, TagRecommendPageList$e.class, "1");
       if (list != PatchProxyResult.class) {
       }else {
          QCurrentUser mE = QCurrentUser.ME;
          a.o(mE, "QCurrentUser.ME");
          String id = mE.getId();
          a.o(id, "QCurrentUser.ME.id");
          list = e.b().c(Long.parseLong(id), 20, "");
       }
       return list;
    }
}
