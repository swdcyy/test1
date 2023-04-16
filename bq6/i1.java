package bq6.i1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import eq6.a;
import java.util.Objects;
import java.lang.String;
import l85.b;
import org.greenrobot.greendao.AbstractDao;
import cp6.w;
import org.greenrobot.greendao.query.QueryBuilder;
import com.kwai.imsdk.model.conversationfolder.KwaiConversationFolderReferenceDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Boolean;
import org.greenrobot.greendao.query.Query;
import brd.t;
import cp6.e;
import com.kuaishou.gifshow.kuaishan.logic.s0;
import bq6.j2;
import brd.a0;
import bq6.n0;
import bq6.w0;
import bq6.z0;
import bq6.z1;
import bq6.h0;

public final class i1 implements o	// class@00058e
{
    public final p2 b;
    public final c c;

    public void i1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       i1 tb = this.b;
       i1 tc = this.c;
       Objects.requireNonNull(tb);
       if (p0.h()) {
          c uoc = new c("KwaiIMConversationFolderManager#deleteFolderReferenceInFolder");
          b.a(uoc.c());
          p2 c = tb.c;
          WhereCondition[] whereConditi = new WhereCondition[0];
          WhereCondition[] whereConditi1 = new WhereCondition[0];
          t ot = c.e(c.b().queryBuilder().where(KwaiConversationFolderReferenceDao$Properties.FolderId.eq(p0.c()), whereConditi).where(KwaiConversationFolderReferenceDao$Properties.Deleted.eq(Boolean.FALSE), whereConditi1).build());
          p0 = ot.flatMap(s0.b).map(j2.b).toList().w(new n0(tb)).flatMap(new w0(tb)).flatMap(new z0(tb, uoc)).map(new z1(p0)).onErrorReturn(new h0(tc, p0));
       }else {
          p0 = t.just(p0);
       }
       return p0;
    }
}
