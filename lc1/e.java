package lc1.e;
import lc1.d;
import java.lang.Class;
import java.lang.Object;
import com.google.gson.JsonObject;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.livestream.message.nano.SCCommentNotice;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.InstantiationException;
import java.lang.IllegalAccessException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.lang.RuntimeException;

public class e implements d	// class@002ebe
{
    public final Class a;

    public void e(Class p0){
       super();
       this.a = p0;
    }
    public Object a(JsonObject p0){
       return this.c(p0);
    }
    public Object b(SCCommentNotice p0){
       LiveCommentNoticeBaseInfo liveCommentN = PatchProxy.applyOneRefs(p0, this, e.class, "2");
       if (liveCommentN != PatchProxyResult.class) {
       }else {
          try{
             liveCommentN = this.a.newInstance();
             liveCommentN.parseBaseInfo(p0);
             liveCommentN.parsePbRemains(p0);
          }catch(java.lang.IllegalAccessException e3){
             e3.printStackTrace();
          }catch(java.lang.InstantiationException e3){
             e3.printStackTrace();
          }
          liveCommentN = null;
       }
       return liveCommentN;
    }
    public final LiveCommentNoticeBaseInfo c(JsonObject p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          try{
             LiveCommentNoticeBaseInfo liveCommentN = new Gson().c(p0, this.a);
             liveCommentN.parseJsonRemains();
             return liveCommentN;
          }catch(com.google.gson.JsonParseException e3){
             e3.printStackTrace();
          }
          return null;
       }else {
          goto label_0026 ;
       }
    }
}
