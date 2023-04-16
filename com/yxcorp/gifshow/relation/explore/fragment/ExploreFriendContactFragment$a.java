package com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment$a;
import s2b.a;
import com.yxcorp.gifshow.relation.explore.fragment.ExploreFriendContactFragment;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import g7c.a;
import com.yxcorp.gifshow.pymk.log.PymkLogSender;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.framework.model.user.User;
import h7c.b;
import org.json.JSONObject;
import g7c.i;

public class ExploreFriendContactFragment$a implements a	// class@0017fc
{
    public final ExploreFriendContactFragment a;

    public void ExploreFriendContactFragment$a(ExploreFriendContactFragment p0){
       this.a = p0;
       super();
    }
    public void a(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExploreFriendContactFragment$a.class, "1")) {
          return;
       }
       PymkLogSender.reportShowUsers(85, this.a.Jh(), p0, this.a.O);
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(new b(iterator.next()));
       }
       i.e(uArrayList, 85, null);
       return;
    }
    public boolean b(Object p0){
       boolean b;
       if (p0.mShowed != null) {
          b = false;
       }else {
          p0.mShowed = true;
          b = true;
       }
       return b;
    }
}
