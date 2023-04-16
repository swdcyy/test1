package me9.q$j;
import erd.o;
import me9.q;
import com.yxcorp.gifshow.camera.record.magic.dataConvey.model.MagicUploadFileRequestData;
import me9.q$b;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import brd.w;
import kotlin.jvm.internal.a;
import oa0.a;
import java.util.Objects;
import ln.b;
import g4b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import n46.c;
import ln.b$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collection;
import brd.t;
import com.kwai.library.rickon.c;
import java.lang.IllegalStateException;

public final class q$j implements o	// class@003015
{
    public final q b;
    public final MagicUploadFileRequestData c;
    public final q$b d;

    public void q$j(q p0,MagicUploadFileRequestData p1,q$b p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       t ot = PatchProxy.applyOneRefs(p0, this, q$j.class, "1");
       if (ot != patchProxyRe) {
       }else {
          a.p(p0, "it");
          p0 = this.c.getPath();
          String str = a.r0();
          q$j tb = this.b;
          q$b c = this.d.c;
          a.m(c);
          Objects.requireNonNull(tb);
          b uob = PatchProxy.applyOneRefs(c, tb, q.class, "2");
          if (uob != patchProxyRe) {
          }else {
             uob = new b();
             uob.a = c.mToken;
             uob.d = new ArrayList();
             Iterator iterator = c.mEndPoints.iterator();
             while (iterator.hasNext()) {
                c uoc = iterator.next();
                uob.d.add(new b$a(uoc.mHost, uoc.mPort, uoc.mProtocol));
             }
             if (TextUtils.x(c.mToken) ^ 0x01) {
                a mEndPoints = c.mEndPoints;
                a.o(mEndPoints, "prepareResponse.mEndPoints");
                if (!(mEndPoints.isEmpty() ^ 0x01)) {
                   throw new IllegalStateException("mEndPoints is empty".toString());
                }
             }else {
                throw new IllegalStateException("mToken is empty".toString());
             }
          }
          ot = c.a(p0, str, uob);
       }
       return ot;
    }
}
