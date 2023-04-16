package com.yxcorp.gifshow.v3.editor.text.subtitle.b;
import im8.g;
import x59.w;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import com.kwai.framework.model.user.QCurrentUser;
import java.util.List;
import com.yxcorp.gifshow.v3.editor.text.i0;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import java.util.Map;
import huc.d;
import huc.c;
import nuc.a;
import com.yxcorp.gifshow.v3.editor.text.model.TextConfigParam;
import java.lang.RuntimeException;
import java.lang.Throwable;
import lnc.i1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.util.Collection;
import com.yxcorp.gifshow.v3.editor.text.subtitle.b$a;
import dvc.b;
import com.yxcorp.gifshow.v3.editor.text.subtitle.a;
import erd.g;
import crd.b;
import brd.t;
import crd.a;
import java.lang.Number;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import dvc.f;
import java.util.HashMap;

public class b extends w implements g	// class@001494
{
    public List g;
    public final PublishSubject h;
    public TextConfigParam i;
    public boolean j;

    public void b(boolean p0){
       ArrayList uArrayList;
       boolean b;
       super();
       this.g = new ArrayList();
       this.h = PublishSubject.g();
       this.j = p0;
       if (p0) {
          b tg = this.g;
          List list = i0.g(p0, QCurrentUser.me().isLogined(), 256);
          b tj = this.j;
          i0 oi0 = i0.class;
          if (PatchProxy.isSupport(oi0)) {
             uArrayList = PatchProxy.applyTwoRefs(list, Boolean.valueOf(tj), null, oi0, "8");
             if (uArrayList != PatchProxyResult.class) {
             }
          }
          Object[] objArray = new Object[0];
          a.D().w("EditTextManager", "getTextConfigParamList isKtvMode:"+tj, objArray);
          uArrayList = new ArrayList();
          int i = 0;
          while (i < list.size()) {
             c uoc = d.o().get(list.get(i));
             if (uoc == null) {
                a uoa = d.n(list.get(i));
                if (uoa != null) {
                   TextConfigParam textConfigPa = d.u(uoa);
                   if (textConfigPa != null) {
                      uArrayList.add(textConfigPa);
                   }
                }
                i1.c(new RuntimeException("getTextConfigParamList un expect textId:"+list.get(i)));
             }else {
                String str = list.get(i);
                b = (tj == null && PostExperimentUtils.t1())? true: false;
                uArrayList.add(uoc.b(str, b));
             }
             i = i + 1;
          }
          tg.addAll(uArrayList);
          if (!PatchProxy.applyVoid(null, this, b.class, "4")) {
             this.d = new b$a(this);
          }
          b uob = this.h.subscribe(new b(this), a.b);
          if (!PatchProxy.applyVoidOneRefs(uob, this, w.class, "2")) {
             this.b.c(uob);
          }
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.d = new b$a(this);
       return;
    }
    public int b(){
       b obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.i;
       if (obj == null) {
          return -1;
       }
       return this.g.indexOf(obj);
    }
    public void c(TextConfigParam p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.d();
       int i = 0;
       while (i < this.g.size()) {
          if (p0 != null && (this.g.get(i).j()).equals(p0.j())) {
             this.i = this.g.get(i);
          }
          i = i + 1;
       }
       this.d();
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       int i = this.g.indexOf(this.i);
       if (i >= 0) {
          this.d.l0(i);
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(b.class, new f());
       }else {
          obj.put(b.class, null);
       }
       return obj;
    }
}
