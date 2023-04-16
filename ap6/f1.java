package ap6.f1;
import erd.o;
import com.kwai.imsdk.group.b;
import java.lang.Object;
import hp6.b;
import java.util.Objects;
import xp6.x;
import lh0.a$c2;
import lh0.a$a2;
import java.util.List;
import yp6.c;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.imsdk.group.KwaiGroupGeneralInfo;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import java.util.Collection;
import java.lang.String;
import cp6.o;
import rh0.a$b;
import xp6.i;
import java.lang.Throwable;
import l85.b;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import brd.t;

public final class f1 implements o	// class@00032d
{
    public final b b;

    public void f1(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       KwaiGroupGeneralInfo kwaiGroupGen;
       f1 tb = this.b;
       Objects.requireNonNull(tb);
       if (x.b(p0) && p0.b() != null) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = c.d(p0.b().a).iterator();
          while (iterator.hasNext()) {
             kwaiGroupGen = iterator.next();
             if (kwaiGroupGen != null) {
                KwaiGroupInfo groupInfo = kwaiGroupGen.getGroupInfo();
                if (groupInfo != null) {
                   tb.U(groupInfo);
                   uArrayList.add(groupInfo);
                }
                uArrayList1.addAll(kwaiGroupGen.getGroupMembers());
             }
          }
          o.a(tb.b).f(uArrayList);
          o.a(tb.b).g(uArrayList1);
          i.d(tb.b, p0.b().b.a);
       }
    label_0079 :
       WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupInfoDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()))};
       p0 = d.a(tb.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.isNotNull(), whereConditi).list();
       ArrayList uArrayList2 = new ArrayList();
       if (p0 != null && p0.size() > 0) {
          p0 = p0.iterator();
          while (p0.hasNext()) {
             KwaiGroupInfo kwaiGroupInf = p0.next();
             if (kwaiGroupInf != null) {
                kwaiGroupGen = new KwaiGroupGeneralInfo(kwaiGroupInf);
                WhereCondition[] whereConditi1 = new WhereCondition[]{KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(kwaiGroupInf.getAppId()))};
                kwaiGroupGen.setGroupMembers(d.a(tb.b).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(kwaiGroupInf.getGroupId()), whereConditi1).list());
                uArrayList2.add(kwaiGroupGen);
             }
          }
       }
       return t.just(uArrayList2);
    }
}
