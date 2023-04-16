package ap6.m1;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.b;
import java.lang.Object;
import java.lang.String;
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
import java.util.List;

public final class m1 implements Callable	// class@000350
{
    public final b b;

    public void m1(b p0){
       this.b = p0;
    }
    public final Object call(){
       WhereCondition[] whereConditi = new WhereCondition[]{KwaiGroupInfoDao$Properties.AppId.eq(Integer.valueOf(f.e().b().a()))};
       return d.a(this.b.b).e().queryBuilder().where(KwaiGroupInfoDao$Properties.GroupId.isNotNull(), whereConditi).list();
    }
}
