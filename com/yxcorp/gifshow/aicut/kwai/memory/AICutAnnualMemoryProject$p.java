package com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject$p;
import erd.o;
import com.yxcorp.gifshow.aicut.kwai.memory.AICutAnnualMemoryProject;
import com.yxcorp.gifshow.aicut.KwaiAICutStyle;
import java.lang.Object;
import o69.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.Workspace$Source;
import tkd.b;
import tkd.d;
import ra0.d;
import java.util.List;
import o69.c;
import java.util.ArrayList;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import brd.t;
import com.yxcorp.gifshow.aicut.kwai.memory.b;
import h69.h;
import com.yxcorp.gifshow.aicut.api.AICutStyle;

public final class AICutAnnualMemoryProject$p implements o	// class@001960
{
    public final AICutAnnualMemoryProject b;
    public final KwaiAICutStyle c;

    public void AICutAnnualMemoryProject$p(AICutAnnualMemoryProject p0,KwaiAICutStyle p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, AICutAnnualMemoryProject$p.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "downloadTask");
          if (this.b.Z0() == Workspace$Source.ANNUAL_ALBUM_2022_LOCAL) {
             d uod = d.a(0x1bf6ff1d);
             List list = this.b.M();
             ArrayList uArrayList = new ArrayList(u.Y(list, 10));
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                uArrayList.add(iterator.next().path);
             }
             ot = uod.Mm(uArrayList).map(new b(this, p0));
          }else {
             AICutStyle mLocalDir = this.c.mLocalDir;
             a.o(mLocalDir, "style.mLocalDir");
             d.a(-1595266550).KW(this.b.W0(), mLocalDir);
             AICutStyle mLocalDir1 = this.c.mLocalDir;
             a.o(mLocalDir1, "style.mLocalDir");
             d.a(-1595266550).O8(this.b.W0(), mLocalDir1);
             ot = t.just(p0);
          }
       }
       return ot;
    }
}
