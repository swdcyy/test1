package nc1.e;
import io.reactivex.g;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.service.g;
import java.util.List;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import java.util.Iterator;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeInfo;
import java.lang.Integer;
import java.util.HashMap;
import java.util.HashSet;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.RuntimeException;
import lc1.d;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import brd.g;

public final class e implements g	// class@0032d2
{
    public final g b;
    public final List c;

    public void e(g p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void subscribe(v p0){
       d uod;
       LiveCommentNoticeBaseInfo liveCommentN1;
       e tb = this.b;
       Objects.requireNonNull(tb);
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          LiveCommentNoticeInfo liveCommentN = iterator.next();
          HashSet hashSet = tb.d.get(Integer.valueOf(liveCommentN.mLiveCommentNoticeType));
          if (hashSet == null || hashSet.isEmpty()) {
             continue ;
          }else {
             JsonObject jsonObject = PatchProxy.applyOneRefs(liveCommentN, tb, g.class, "10");
             if (jsonObject != PatchProxyResult.class) {
             }else {
                jsonObject = 0;
                try{
                   jsonObject = new Gson().x(liveCommentN);
                }catch(com.google.gson.JsonParseException e4){
                   e4.printStackTrace();
                }
             }
          }
       }
       p0.onComplete();
       return;
    }
}
