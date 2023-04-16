package m3a.s;
import m3a.s$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qvb.i;
import k2b.e0;
import m3a.a;
import msd.r;

public final class s	// class@002f20
{
    public final i a;
    public final e0 b;
    public final a c;
    public final r d;
    public final boolean e;

    public void s(s$a p0){
       s$a uoa = s$a.class;
       a.p(p0, "builder");
       Objects.requireNonNull(p0);
       Object[] objArray = null;
       s$a uoa1 = PatchProxy.apply(objArray, p0, uoa, "1");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.a;
          if (uoa1 == null) {
             a.S("mPageList");
          }
       }
       s$a uoa2 = PatchProxy.apply(objArray, p0, uoa, "5");
       if (uoa2 != PatchProxyResult.class) {
       }else {
          uoa2 = p0.c;
          if (uoa2 == null) {
             a.S("mLogPage");
          }
       }
       s$a uoa3 = PatchProxy.apply(objArray, p0, uoa, "7");
       if (uoa3 != PatchProxyResult.class) {
       }else {
          uoa3 = p0.d;
          if (uoa3 == null) {
             a.S("mCurrentPhotoInfo");
          }
       }
       uoa = PatchProxy.apply(objArray, p0, uoa, "3");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = p0.b;
          if (uoa == null) {
             a.S("mDismissListener");
          }
       }
       a.p(uoa1, "mPageList");
       a.p(uoa2, "mLogPage");
       a.p(uoa3, "mCurrentPhotoInfo");
       a.p(uoa, "mDismissListener");
       super();
       this.a = uoa1;
       this.b = uoa2;
       this.c = uoa3;
       this.d = uoa;
       this.e = p0.e;
       return;
    }
    public final a a(){
       return this.c;
    }
    public final e0 b(){
       return this.b;
    }
}
