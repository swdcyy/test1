package ap6.o3;
import erd.o;
import com.kwai.imsdk.group.g;
import java.lang.Object;
import java.util.List;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import com.kwai.imsdk.internal.entity.KwaiGroupInfo;
import com.kwai.imsdk.group.KwaiGroupGeneralInfo;
import java.lang.String;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupMemberDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Integer;
import brd.t;

public final class o3 implements o	// class@00035c
{
    public final g b;

    public void o3(g p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       o3 tb = this.b;
       Objects.requireNonNull(tb);
       ArrayList uArrayList = new ArrayList();
       if (p0 != null && p0.size() > 0) {
          p0 = p0.iterator();
          while (p0.hasNext()) {
             KwaiGroupInfo kwaiGroupInf = p0.next();
             if (kwaiGroupInf != null) {
                KwaiGroupGeneralInfo kwaiGroupGen = new KwaiGroupGeneralInfo(kwaiGroupInf);
                WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupMemberDao$Properties.AppId.eq(Integer.valueOf(kwaiGroupInf.getAppId()))};
                kwaiGroupGen.setGroupMembers(d.a(tb.c).f().queryBuilder().where(KwaiGroupMemberDao$Properties.GroupId.eq(kwaiGroupInf.getGroupId()), whereConditi).list());
                uArrayList.add(kwaiGroupGen);
             }
          }
       }
       return t.just(uArrayList);
    }
}