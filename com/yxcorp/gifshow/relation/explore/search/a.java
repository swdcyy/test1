package com.yxcorp.gifshow.relation.explore.search.a;
import java.lang.Object;
import com.yxcorp.gifshow.relation.explore.search.ExploreSearchResponse$a;
import java.lang.String;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import fg6.a;
import com.yxcorp.gifshow.relation.explore.search.a$a;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.gson.Gson;

public class a	// class@001874
{
    public static String a;
    public static String b;

    public void a(){
       super();
    }
    public static ClientEvent$ElementPackage a(ExploreSearchResponse$a p0,String p1){
       ClientEvent$ElementPackage obj = PatchProxy.applyTwoRefs(p0, p1, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ClientEvent$ElementPackage();
       obj.action2 = p1;
       obj.params = a.a.q(new a$a(p0, a.b, (TextUtils.equals("USER_USER_FOLLOW_SUBCARD", p1) ^ 0x01)));
       return obj;
    }
}
