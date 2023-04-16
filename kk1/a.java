package kk1.a;
import ug1.a1;
import com.kuaishou.live.jsbridge.AbstractLiveJsChannel;
import java.util.LinkedHashMap;
import f92.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import f92.a;
import ug1.z0;
import ik1.i0;
import lp3.c;
import java.util.Map;
import kotlin.jvm.internal.a;
import com.kuaishou.live.jsbridge.LiveJsSubscribeParams$Params;
import java.lang.CharSequence;
import android.text.TextUtils;
import fg6.a;
import kk1.b;
import com.google.gson.Gson;
import java.util.Collection;
import java.util.LinkedHashSet;
import com.yxcorp.gifshow.models.Gift;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.HashSet;
import trd.d1;
import kk1.c;
import com.kuaishou.live.core.show.gift.GiftMessage;
import lm1.f;
import lm1.d;

public class a extends AbstractLiveJsChannel implements a1	// class@002d5c
{
    public Map h;
    public i0 i;

    public void a(){
       super();
       this.h = new LinkedHashMap();
    }
    public void G4(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       this.o(p0);
       return;
    }
    public void S1(a p0){
       z0.a(this, p0);
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.i = this.i(i0.class);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       this.h.clear();
       a ti = this.i;
       if (ti == null) {
          a.S("liveSendGiftResultService");
       }
       ti.J8(this);
       return;
    }
    public void m(String p0,LiveJsSubscribeParams$Params p1){
       a ti;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.m(p0, p1);
       if (p1 != null && !TextUtils.isEmpty(p1.a())) {
          if (this.h.isEmpty()) {
             ti = this.i;
             if (ti == null) {
                a.S("liveSendGiftResultService");
             }
             ti.Nk(this);
          }
          b uob = a.a.h(p1.a(), b.class);
          uob = (uob != null)? uob.giftIds: null;
          ti = (uob == null || uob.isEmpty())? 1: null;
          if (!ti) {
             this.h.put(p0, uob);
          }else {
             this.h.put(p0, new LinkedHashSet());
          }
       }
       return;
    }
    public void n(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "subscribeId");
       super.n(p0);
       this.h.remove(p0);
       if (this.h.isEmpty()) {
          a ti = this.i;
          if (ti == null) {
             a.S("liveSendGiftResultService");
          }
          ti.J8(this);
       }
       return;
    }
    public final void o(b p0){
       Integer integer;
       Iterator iterator;
       Gson a;
       int i;
       Object obj2;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "7")) {
          return;
       }
       if (p0 != null) {
          b d = p0.d;
          if (d != null) {
             integer = Integer.valueOf(d.mId);
          label_0019 :
             if (p0 != null && (p0.e == 1 && integer != null)) {
                String str = String.valueOf(integer.intValue());
                ArrayList uArrayList = PatchProxy.applyOneRefs(str, this, uoa, "8");
                if (uArrayList != PatchProxyResult.class) {
                }else {
                   ArrayList uArrayList1 = new ArrayList();
                   iterator = this.h.keySet().iterator();
                   while (iterator.hasNext()) {
                      Object obj = iterator.next();
                      LinkedHashSet obj1 = obj;
                      LinkedHashSet linkedHashSe = this.h.get(obj1);
                      if (linkedHashSe == null || linkedHashSe.contains(str) != true) {
                         obj1 = this.h.get(obj1);
                         if (obj1 == null || obj1.isEmpty() != true) {
                            obj2 = null;
                         label_0077 :
                            if (obj2) {
                               uArrayList1.add(obj);
                            }
                         }
                      }
                      obj2 = 1;
                      goto label_0077 ;
                   }
                   uArrayList = uArrayList1;
                }
                iterator = uArrayList.iterator();
                while (iterator.hasNext()) {
                   String[] stringArray = new String[]{iterator.next()};
                   HashSet hashSet = d1.m(stringArray);
                   a = a.a;
                   String str1 = String.valueOf(integer.intValue());
                   b c = p0.c;
                   b b = p0.b;
                   GiftMessage mComboCount = (b != null)? b.mComboCount: null;
                   boolean b1 = (mComboCount > 1)? true: false;
                   b p = p0.p;
                   b = p0.q;
                   if (b != null) {
                      f uof = b.b();
                      if (uof != null) {
                         i = uof.i();
                      label_00c4 :
                         c uoc = new c(str1, c, b1, p, i);
                         this.c(hashSet, a.q(v12));
                      }
                   }
                   i = 0;
                   goto label_00c4 ;
                }
             }
             return;
          }
       }
       integer = null;
       goto label_0019 ;
    }
    public void o4(b p0){
       z0.c(this, p0);
    }
    public void t2(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       this.o(p0);
       return;
    }
}
