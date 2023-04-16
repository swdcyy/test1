package gha.c;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import gha.b;
import ok.h;
import com.google.common.collect.Lists;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import yga.b;
import yga.c;

public class c	// class@002ad3
{

    public void c(){
       super();
    }
    public static void a(List p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, c.class, "2")) {
          return;
       }
       c.j(KsLogFollowTag.FOLLOW_STAGGER.appendTag("FollowRequestLogUtils"), "logResponse", "photoIdList", Lists.h(p0, new b(p1)).toString());
       return;
    }
}
