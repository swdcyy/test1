package j69.a;
import j69.a$a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j69.d;
import kotlin.jvm.internal.a;
import j69.b;
import j69.c;
import j69.e;
import j69.f;
import j69.g;

public final class a	// class@00275e
{
    public d a;
    public b b;
    public c c;
    public e d;
    public f e;
    public g f;

    public void a(a$a p0){
       a$a uoa = a$a.class;
       super();
       Objects.requireNonNull(p0);
       a$a uoa1 = PatchProxy.apply(null, p0, uoa, "1");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.a;
          if (uoa1 == null) {
             a.S("fileManager");
          }
       }
       this.a = uoa1;
       uoa1 = PatchProxy.apply(null, p0, uoa, "3");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.b;
          if (uoa1 == null) {
             a.S("logger");
          }
       }
       this.b = uoa1;
       uoa1 = PatchProxy.apply(null, p0, uoa, "5");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.c;
          if (uoa1 == null) {
             a.S("mainProcessHook");
          }
       }
       this.c = uoa1;
       uoa1 = PatchProxy.apply(null, p0, uoa, "7");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.d;
          if (uoa1 == null) {
             a.S("limit");
          }
       }
       this.d = uoa1;
       uoa1 = PatchProxy.apply(null, p0, uoa, "9");
       if (uoa1 != PatchProxyResult.class) {
       }else {
          uoa1 = p0.e;
          if (uoa1 == null) {
             a.S("transcode");
          }
       }
       this.e = uoa1;
       uoa = PatchProxy.apply(null, p0, uoa, "11");
       if (uoa != PatchProxyResult.class) {
       }else {
          uoa = p0.f;
          if (uoa == null) {
             a.S("uiConfig");
          }
       }
       this.f = uoa;
       return;
    }
    public final d a(){
       return this.a;
    }
    public final b b(){
       return this.b;
    }
    public final c c(){
       return this.c;
    }
    public final f d(){
       return this.e;
    }
}
