package bq6.j1;
import erd.o;
import bq6.p2;
import l85.c;
import java.lang.Object;
import eq6.b;
import java.lang.String;
import org.greenrobot.greendao.AbstractDao;
import cp6.w;
import org.greenrobot.greendao.query.QueryBuilder;
import com.kwai.imsdk.model.conversationfolder.KwaiConversationFolderReferenceDao$Properties;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import java.lang.Integer;
import org.greenrobot.greendao.query.Query;
import cp6.d;
import cp6.e;
import io.reactivex.g;
import brd.t;
import bq6.j0;

public final class j1 implements o	// class@000592
{
    public final p2 b;
    public final c c;

    public void j1(p2 p0,c p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       p2 c = this.b.c;
       WhereCondition[] whereConditi = new WhereCondition[0];
       WhereCondition[] whereConditi1 = new WhereCondition[0];
       WhereCondition[] whereConditi2 = new WhereCondition[0];
       return t.create(new d(c, c.b().queryBuilder().where(KwaiConversationFolderReferenceDao$Properties.FolderId.eq(p0.d()), whereConditi).where(KwaiConversationFolderReferenceDao$Properties.ConversationId.eq(p0.a()), whereConditi1).where(KwaiConversationFolderReferenceDao$Properties.ConversationType.eq(Integer.valueOf(p0.b())), whereConditi2).build())).onErrorReturn(new j0(this.c, p0));
    }
}
