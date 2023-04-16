package bca.a$t;
import erd.o;
import bca.a;
import java.util.ArrayList;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import java.lang.Iterable;
import trd.u;
import java.util.Iterator;
import com.yxcorp.gifshow.models.QMedia;
import java.lang.Double;
import kotlin.Pair;
import java.lang.Number;
import java.lang.Long;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import lnc.g7;
import com.yxcorp.gifshow.edit.draft.DraftUtils;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import brd.t;
import h69.b;

public final class a$t implements o	// class@00045d
{
    public final a b;
    public final ArrayList c;
    public final int d;

    public void a$t(a p0,ArrayList p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       double d;
       ArrayList obj1;
       Object obj2;
       Object obj = p0;
       p0 = PatchProxy.applyOneRefs(obj, this, a$t.class, "1");
       if (p0 != PatchProxyResult.class) {
       }else {
          a.p(obj, "medias");
          int i = 10;
          ArrayList uArrayList = new ArrayList(u.Y(obj, i));
          Iterator iterator = obj.iterator();
          int i1 = 0;
          QMedia qMedia = null;
          ArrayList uArrayList1 = 1;
          while (iterator.hasNext()) {
             QMedia qMedia1 = iterator.next();
             if (qMedia1.type == null) {
                d = 0xbff0000000000000;
                i1 = 1;
             }else {
                double d1 = (double)qMedia1.duration * 0x3ff0000000000000;
                d = d1 / (double)1000;
                qMedia = 1;
             }
             uArrayList.add(Double.valueOf(d));
          }
          if (i1 && qMedia != null) {
             i1 = 3;
          }else if(qMedia != null){
             i1 = 2;
          }else {
             i1 = 1;
          }
          ArrayList uArrayList2 = new ArrayList();
          iterator = this.c.iterator();
          while (iterator.hasNext()) {
             obj1 = iterator.next();
             obj2 = (!obj1.getFirst().intValue())? 1: null;
             if (obj2) {
                uArrayList2.add(obj1);
             }
          }
          obj1 = new ArrayList(u.Y(uArrayList2, i));
          iterator = uArrayList2.iterator();
          while (iterator.hasNext()) {
             obj1.add(Long.valueOf(iterator.next().getSecond().longValue()));
          }
          uArrayList2 = new ArrayList();
          iterator = this.c.iterator();
          while (iterator.hasNext()) {
             obj2 = iterator.next();
             Object obj3 = (obj2.getFirst().intValue() == uArrayList1)? 1: null;
             if (obj3) {
                uArrayList2.add(obj2);
             }
          }
          uArrayList1 = new ArrayList(u.Y(uArrayList2, i));
          i = uArrayList2.iterator();
          while (i.hasNext()) {
             uArrayList1.add(Long.valueOf(i.next().getSecond().longValue()));
          }
          i = this.b;
          i = i.a.kT(obj, i1, uArrayList, uArrayList1, obj1, g7.a(i.j), DraftUtils.S(this.b.j), this.b.k, this.d);
       }
       return p0;
    }
}
