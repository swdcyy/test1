package ap6.t2;
import erd.o;
import com.kwai.imsdk.group.g;
import java.util.List;
import java.lang.Object;
import java.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.lang.String;
import dp6.b;
import hp6.b;
import xp6.x;
import lh0.a$z1;
import lh0.a$a2;
import yp6.c;
import java.util.Collection;
import com.kwai.imsdk.group.KwaiGroupGeneralInfo;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import cp6.o;
import java.lang.Throwable;
import l85.b;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;
import com.kwai.imsdk.internal.entity.KwaiGroupMember;
import brd.t;

public final class t2 implements o	// class@000374
{
    public final g b;
    public final List c;

    public void t2(g p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       t2 tb = this.b;
       t2 tc = this.c;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       HashMap hashMap = new HashMap();
       p0 = p0.iterator();
       while (p0.hasNext()) {
          b uob = b.i(tb.c).k(p0.next());
          if (x.b(uob) && uob.b() != null) {
             uArrayList1.addAll(c.d(uob.b().a));
             Iterator iterator = uArrayList1.iterator();
             while (iterator.hasNext()) {
                KwaiGroupGeneralInfo kwaiGroupGen = iterator.next();
                if (kwaiGroupGen != null && (kwaiGroupGen.getGroupInfo() != null && !TextUtils.isEmpty(kwaiGroupGen.getGroupInfo().getGroupId()))) {
                   uArrayList.addAll(kwaiGroupGen.getGroupMembers());
                   hashMap.put(kwaiGroupGen.getGroupInfo().getGroupId(), new ArrayList());
                }else {
                   continue ;
                }
             }
          }
       }
       o.a(tb.c).g(uArrayList);
       WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()))};
       p0 = d.a(tb.c).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.in(tc), whereConditi).list();
       if (uArrayList1.size() > 0) {
          p0 = p0.iterator();
          while (p0.hasNext()) {
             KwaiGroupMember kwaiGroupMem = p0.next();
             if (kwaiGroupMem != null && (!TextUtils.isEmpty(kwaiGroupMem.getGroupId()) && hashMap.containsKey(kwaiGroupMem.getGroupId()))) {
                hashMap.get(kwaiGroupMem.getGroupId()).add(kwaiGroupMem);
             }else {
                continue ;
             }
          }
       }
       p0 = uArrayList1.iterator();
       while (p0.hasNext()) {
          KwaiGroupGeneralInfo kwaiGroupGen1 = p0.next();
          if (kwaiGroupGen1 != null && (kwaiGroupGen1.getGroupInfo() != null && !TextUtils.isEmpty(kwaiGroupGen1.getGroupInfo().getGroupId()))) {
             String groupId = kwaiGroupGen1.getGroupInfo().getGroupId();
             if (hashMap.containsKey(groupId) && (hashMap.get(groupId) != null && hashMap.get(groupId).size() > 0)) {
                kwaiGroupGen1.setGroupMembers(hashMap.get(groupId));
             }else {
                continue ;
             }
          }else {
             continue ;
          }
       }
       return t.just(uArrayList1);
    }
}
