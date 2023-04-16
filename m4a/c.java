package m4a.c;
import com.yxcorp.gifshow.detail.plc.mix.f$b;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import com.kwai.framework.player.core.b;
import com.kuaishou.android.model.mix.PlcEntryStyleInfo$PageType;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import h4a.k;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import m4a.d;

public final class c implements f$b	// class@002f2b
{
    public final PhotoDetailLogger a;
    public final b b;
    public final PlcEntryStyleInfo$PageType c;

    public void c(PhotoDetailLogger p0,b p1,PlcEntryStyleInfo$PageType p2){
       a.p(p2, "pageType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public PlcEntryStyleInfo$PageType a(){
       return this.c;
    }
    public long b(){
       c obj = PatchProxy.apply(null, this, c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       obj = this.b;
       long currentPosit = (obj != null)? obj.getCurrentPosition(): k.a(this);
       return currentPosit;
    }
    public ClientContent$ContentPackage c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       ClientContent$ContentPackage uContentPack = d.b(p0, this.a);
       a.o(uContentPack, "PlcLogUtils.buildContent¡­photo, photoDetailLogger\)");
       return uContentPack;
    }
}
