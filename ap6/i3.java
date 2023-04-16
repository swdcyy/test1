package ap6.i3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import mp6.d;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.imsdk.internal.entity.KwaiGroupInfoDao$Properties;
import java.util.Collection;
import org.greenrobot.greendao.query.WhereCondition;
import org.greenrobot.greendao.Property;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Integer;

public final class i3 implements Callable	// class@00033e
{
    public final g b;
    public final List c;

    public void i3(g p0,List p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object call(){
       WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupInfoDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()))};
       return d.a(this.b.c).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.in(this.c), whereConditi).list();
    }
}
