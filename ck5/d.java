package ck5.d;
import java.util.concurrent.Callable;
import java.lang.String;
import java.lang.Object;
import hk5.a;
import ik5.b;
import com.kwai.emotionsdk.db.dao.EmotionPackageDao;
import org.greenrobot.greendao.AbstractDao;
import com.kwai.emotionsdk.bean.EmotionPackage;

public final class d implements Callable	// class@0006d2
{
    public final String b;

    public void d(String p0){
       this.b = p0;
    }
    public final Object call(){
       EmotionPackage uEmotionPack = a.b().a().a().load(this.b);
       if (uEmotionPack == null) {
          uEmotionPack = EmotionPackage.EMPTY_PKG;
       }
       return uEmotionPack;
    }
}
