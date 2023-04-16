package com.kuaishou.live.lite.guidance.a$a$a;
import ok.x;
import com.kuaishou.live.lite.guidance.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import java.util.HashSet;
import com.kuaishou.live.core.show.startup.LiveConfigStartupResponse$LiveLiteCommonGuideConfig;
import java.lang.Integer;
import java.util.Map;

public class a$a$a implements x	// class@00099e
{
    public final a$a b;

    public void a$a$a(a$a p0){
       this.b = p0;
       super();
    }
    public Object get(){
       HashSet hashSet = PatchProxy.apply(null, this, a$a$a.class, "1");
       if (hashSet != PatchProxyResult.class) {
       }else {
          hashSet = new HashSet();
          a$a a = this.b.a;
          if (a != null) {
             LiveConfigStartupResponse$LiveLiteCommonGuideConfig mCommonGuide = a.mCommonGuideSubBizTypeMap;
             if (mCommonGuide != null) {
                hashSet.add(mCommonGuide.get(Integer.toString(1)));
             }
          }
       }
       return hashSet;
    }
}
