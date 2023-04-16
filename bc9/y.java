package bc9.y;
import java.lang.Runnable;
import bc9.z;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.camera.record.assistant.a;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import ce9.l;
import com.yxcorp.gifshow.camera.record.base.b;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import ac9.g;
import com.yxcorp.gifshow.camera.record.assistant.model.MagicAssistantTemplate;
import com.yxcorp.gifshow.model.MagicEmoji$MagicFace;
import o4b.a0;
import java.util.ArrayList;
import java.util.Collection;
import bc9.k;
import java.util.ListIterator;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.SimpleMagicFace;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import cc9.b;
import cc9.n;
import ec9.j;
import cc9.d;
import sa6.a;
import ac9.k;
import lnc.s6;
import ec9.f1;
import cc9.l;
import ac9.i;

public final class y implements Runnable	// class@000413
{
    public final z b;

    public void y(z p0){
       this.b = p0;
       super();
    }
    public final void run(){
       l a;
       boolean b;
       int i2;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, y.class, "1")) {
          return;
       }
       y tb = this.b;
       Objects.requireNonNull(tb);
       z oz = z.class;
       if (!PatchProxy.applyVoid(objArray, tb, oz, "9") && tb.v.A()) {
          int i = 0;
          Object[] objArray1 = new Object[i];
          a.D().w("CameraAssistant", "onMagicPanelClose", objArray1);
          a = tb.d.d(l.i).a;
          List list = tb.v.k();
          if (list != null) {
             Iterator iterator = list.iterator();
             while (iterator.hasNext()) {
                g og = iterator.next();
                if (og instanceof MagicAssistantTemplate && og.getMagicFace() != null) {
                   og.setCollection(a0.f().g(og.getMagicFace()));
                }
             }
          }
          list = tb.v.k();
          if (list != null) {
             ArrayList uArrayList = new ArrayList(list);
             int i1 = -1;
             if (a != null) {
                k ok = tb.v.p();
                if (ok != null) {
                   List list1 = ok.s1();
                   if (list1 != null) {
                      ListIterator listIterator = list1.listIterator(list1.size());
                      while (true) {
                         if (listIterator.hasPrevious()) {
                            g og1 = listIterator.previous();
                            if (og1 instanceof MagicAssistantTemplate && og1.getMagicFace() != null) {
                               MagicEmoji$MagicFace magicFace = og1.getMagicFace();
                               a.m(magicFace);
                               if (TextUtils.n(magicFace.mId, a.mId)) {
                                  MagicEmoji$MagicFace magicFace1 = og1.getMagicFace();
                                  a.m(magicFace1);
                                  if (TextUtils.n(magicFace1.mChildId, a.mChildId)) {
                                     b = true;
                                  label_00dc :
                                     if (b) {
                                        i2 = listIterator.nextIndex();
                                     label_00e4 :
                                        if (i2 >= 0) {
                                           k ok1 = tb.v.p();
                                           if (ok1 != null) {
                                              RecyclerView recyclerView = ok1.h0();
                                              if (recyclerView != null) {
                                                 recyclerView.smoothScrollToPosition(i2);
                                              }
                                           }
                                           oz = tb.o;
                                           if (oz != null && !oz.j()) {
                                              oz = tb.p;
                                              if (oz != null) {
                                                 MagicEmoji$MagicFace magicFace2 = oz.c();
                                                 if (magicFace2 != null) {
                                                    objArray = magicFace2.mChildId;
                                                 }
                                              }
                                              if (objArray == null || !objArray.length()) {
                                                 i = 1;
                                              }
                                              if (i) {
                                                 tb.v.g().w0(new d(9, true));
                                                 break ;
                                              }
                                           }
                                        }else if(tb.v.k() != null){
                                           MagicAssistantTemplate magicAssista = new MagicAssistantTemplate();
                                           magicAssista.setMagicFace(a);
                                           magicAssista.setCollection(a0.f().g(a));
                                           listIterator = uArrayList.listIterator(uArrayList.size());
                                           while (true) {
                                              if (listIterator.hasPrevious()) {
                                                 if (listIterator.previous() instanceof k) {
                                                    i2 = listIterator.nextIndex();
                                                 }else {
                                                    continue ;
                                                 }
                                              }else {
                                                 i2 = -1;
                                              }
                                              if (i2 <= 0) {
                                                 i2 = uArrayList.size() + i1;
                                              }
                                              if (s6.u() == 2 && !tb.v.E()) {
                                                 i2 = 1;
                                              }
                                              uArrayList.add(i2, magicAssista);
                                              tb.v.r().w0(new l(uArrayList, i2, i, true));
                                              break ;
                                           }
                                        }
                                     }
                                  }
                               }
                            }
                            b = false;
                            goto label_00dc ;
                         }
                      }
                   }
                }
                i2 = -1;
                goto label_00e4 ;
             }else if(PatchProxy.applyVoidOneRefs(uArrayList, tb, oz, "10")){
                ListIterator listIterator1 = uArrayList.listIterator(uArrayList.size());
                while (true) {
                   if (listIterator1.hasPrevious()) {
                      if (listIterator1.previous() instanceof i) {
                         i1 = listIterator1.nextIndex();
                      }
                   }
                   if (i1 < 0) {
                      int i3 = (s6.u() == 2 && !tb.v.E())? 0: uArrayList.size();
                      uArrayList.add(i3, new i());
                      tb.v.r().w0(new l(uArrayList, i3, i, true));
                      tb.v.g().w0(new d(13, true));
                      tb.v.g().w0(new d(9, i));
                      break ;
                   }
                }
             }
          }
       }
    label_01f9 :
       return;
    }
}
