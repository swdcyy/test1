package ced.w1;
import z3b.f;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import ced.x1;
import java.lang.Object;
import com.yxcorp.gifshow.model.MagicBaseConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import uy5.a;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import q87.c;
import ced.v1$b;
import ced.v1;
import io.reactivex.subjects.PublishSubject;
import java.lang.Throwable;
import z3b.e;
import java.lang.Integer;

public final class w1 implements f	// class@00058b
{
    public final MagicEmoji$MagicFace a;
    public final x1 b;

    public void w1(MagicEmoji$MagicFace p0,x1 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void b(MagicBaseConfig p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, w1.class, "3")) {
          return;
       }
       a.p(p0, "magicFaceOnCompleted");
       Object[] objArray = new Object[0];
       a.C().w("TagMagicFacePreDownloadPresenter", "pre download tag magicFace onCompleted "+this.a.mName, objArray);
       v1 q = this.b.b.b.q;
       a.m(q);
       q.onNext("success");
       PatchProxy.onMethodExit(w1.class, "3");
       return;
    }
    public void d(MagicBaseConfig p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefsWithListener(p0, p1, this, w1.class, "2")) {
          return;
       }
       a.p(p0, "magicFaceOnError");
       a.p(p1, "e");
       Object[] objArray = new Object[0];
       a.C().w("TagMagicFacePreDownloadPresenter", "pre download tag magicFace onFailed "+this.a.mName, objArray);
       v1 q = this.b.b.b.q;
       a.m(q);
       q.onNext("fail");
       PatchProxy.onMethodExit(w1.class, "2");
       return;
    }
    public void e(MagicBaseConfig p0){
       e.a(this, p0);
    }
    public void g(MagicBaseConfig p0,int p1,int p2){
       if (PatchProxy.isSupport2(w1.class, "1") && PatchProxy.applyVoidThreeRefsWithListener(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, w1.class, "1")) {
          return;
       }
       a.p(p0, "magicFace1");
       PatchProxy.onMethodExit(w1.class, "1");
       return;
    }
}
