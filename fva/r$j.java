package fva.r$j;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.android.model.mix.CommonMeta;

public final class r$j extends Accessor	// class@002a23
{
    public final QPhoto c;

    public void r$j(QPhoto p0){
       this.c = p0;
       super();
    }
    public Object get(){
       CommonMeta uCommonMeta = PatchProxy.apply(null, this, r$j.class, "1");
       if (uCommonMeta != PatchProxyResult.class) {
       }else {
          uCommonMeta = this.c.getCommonMeta();
          if (uCommonMeta == null) {
             uCommonMeta = new CommonMeta();
          }
       }
       return uCommonMeta;
    }
}
