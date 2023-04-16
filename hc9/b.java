package hc9.b;
import com.yxcorp.gifshow.camera.record.base.b$a;
import hc9.e;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ic9.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import ic9.a;
import java.util.Iterator;
import java.util.List;
import hc9.f;
import ee9.m;
import ic9.c;
import ee9.a;

public final class b implements b$a	// class@002583
{
    public final e a;
    public final e b;

    public void b(e p0,e p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object getData(){
       MagicEmoji$MagicFace magicFace;
       m om;
       String str1;
       MagicEmoji$MagicFace magicFace2;
       MagicEmoji$MagicFace magicFace4;
       String str3;
       b ta = this.a;
       b tb = this.b;
       String str = null;
       if (ta.h() instanceof MagicEmoji$MagicFace) {
          magicFace = ta.h();
       }else if(tb.h() instanceof MagicEmoji$MagicFace){
          magicFace = tb.h();
       }else if(ta.h() instanceof b){
          b uob = ta.h();
          String str4 = "magicface";
          Objects.requireNonNull(uob);
          a uoa1 = PatchProxy.applyOneRefs(str4, uob, b.class, "3");
          if (uoa1 != PatchProxyResult.class) {
          }else {
             Iterator iterator = uob.a.iterator();
             do {
                if (iterator.hasNext()) {
                }else {
                   uoa1 = str;
                   break ;
                }
                uoa1 = iterator.next();
             } while (str4.equals(uoa1.c()));
          }
          if (uoa1 != null && uoa1.b() instanceof MagicEmoji$MagicFace) {
             magicFace = uoa1.b();
          }
       }
    label_0075 :
       MagicEmoji$MagicFace magicFace1 = str;
    label_0076 :
       if (ta.a() instanceof m) {
          om = ta.a();
          str1 = om.d();
          magicFace2 = om.c();
       }else if(ta.a() instanceof c){
          c s = ta.a().s;
          if (s instanceof m) {
             str1 = s.d();
             magicFace2 = s.c();
          }
       }
       MagicEmoji$MagicFace magicFace3 = str;
       String str2 = magicFace3;
    label_00b4 :
       if (tb.a() instanceof m) {
          om = tb.a();
          str = om.d();
          magicFace4 = om.c();
          str3 = str;
       }else {
          magicFace4 = str;
          str3 = magicFace4;
       }
       a uoa = new a(magicFace1, magicFace4, magicFace3, str3, str2);
       return om;
       magicFace3 = magicFace2;
       str2 = str1;
       goto label_00b4 ;
       magicFace1 = magicFace;
       goto label_0076 ;
    }
}
