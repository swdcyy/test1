package jg9.l0;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import j8c.a;
import q87.c;
import jg9.z0;
import com.yxcorp.gifshow.camera.record.base.d;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.concurrent.CopyOnWriteArrayList;
import jg9.t0;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictrueItem;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import java.lang.Integer;
import java.lang.Number;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import java.util.ArrayList;
import jg9.f0;
import java.util.Comparator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Collection;
import lnc.a1;
import java.lang.CharSequence;
import e17.i;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$1;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$2;
import com.yxcorp.gifshow.camera.record.photo.multitake.MultiTakePictureController$onNextBtnClick$3;
import msd.l;
import msd.a;

public final class l0 implements View$OnClickListener	// class@002aa2
{
    public final MultiTakePictureController b;

    public void l0(MultiTakePictureController p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       z0 a;
       CopyOnWriteArrayList uCopyOnWrite;
       Iterator obj;
       char c;
       if (PatchProxy.applyVoidOneRefs(p0, this, l0.class, "1")) {
          return;
       }
       l0 tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, MultiTakePictureController.class, "25")) {
          int i = 0;
          Object[] objArray = new Object[i];
          a.D().w(MultiTakePictureController.U, "onNextBtnClick", objArray);
          a = z0.a;
          d d = tb.d;
          a.o(d, "mCallerContext");
          BaseFragment uBaseFragmen = d.f();
          a.o(uBaseFragmen, "mCallerContext.fragment");
          MultiTakePictureController x = tb.x;
          if (x != null) {
             uCopyOnWrite = x.K0();
             if (uCopyOnWrite != null) {
             label_004c :
                Objects.requireNonNull(a);
                if (!PatchProxy.applyVoidTwoRefs(uBaseFragmen, uCopyOnWrite, a, z0.class, "6")) {
                   a.p(uBaseFragmen, "page");
                   a.p(uCopyOnWrite, "all");
                   char[] uocharArray = new char[uCopyOnWrite.size()];
                   obj = uCopyOnWrite.iterator();
                   int i1 = 0;
                   int i2 = 0;
                   int i3 = 0;
                   while (obj.hasNext()) {
                      Object obj2 = obj.next();
                      int i4 = i3 + 1;
                      if (i3 < 0) {
                         CollectionsKt__CollectionsKt.W();
                      }
                      if (obj2.d() && obj2.f()) {
                         i2 = i2 + 1;
                         i1 = i1 + 1;
                         c = '3';
                      }else if(obj2.d() && !obj2.f()){
                         i2 = i2 + 1;
                         c = '2';
                      }else if(!obj2.d() && obj2.f()){
                         i1 = i1 + 1;
                         c = '1';
                      }else {
                         c = '0';
                      }
                      uocharArray[i3] = c;
                      i3 = i4;
                   }
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "NEXT_STEP_BUTTON";
                   i3 oi3 = i3.f();
                   oi3.c("picture_num", Integer.valueOf(uCopyOnWrite.size()));
                   oi3.c("check_num", Integer.valueOf(i1));
                   oi3.c("ai_num", Integer.valueOf(i2));
                   oi3.d("picture_check_stauts", new String(uocharArray));
                   uElementPack.params = oi3.e();
                   u1.M("", uBaseFragmen, 1, uElementPack, null, null);
                }
                MultiTakePictureController x1 = tb.x;
                if (x1 != null) {
                   CopyOnWriteArrayList uCopyOnWrite1 = x1.K0();
                   if (uCopyOnWrite1 != null) {
                      ArrayList uArrayList = new ArrayList();
                      Iterator iterator = uCopyOnWrite1.iterator();
                      while (iterator.hasNext()) {
                         obj = iterator.next();
                         Object obj1 = (obj.b() > -1)? 1: null;
                         if (obj1) {
                            uArrayList.add(obj);
                         }
                      }
                      List list = CollectionsKt___CollectionsKt.f5(uArrayList, new f0());
                      if (list != null) {
                         i = list.size();
                      }
                   }
                }
                if (i <= 0) {
                   i.d(R.style.arg_RES_7f11066a, a1.p(R.string.arg_RES_7f104619));
                }else {
                   tb.D2(new MultiTakePictureController$onNextBtnClick$1(tb), new MultiTakePictureController$onNextBtnClick$2(tb), new MultiTakePictureController$onNextBtnClick$3(tb));
                }
             }
          }
          uCopyOnWrite = CollectionsKt__CollectionsKt.E();
          goto label_004c ;
       }
       return;
    }
}
