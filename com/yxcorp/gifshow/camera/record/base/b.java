package com.yxcorp.gifshow.camera.record.base.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import oc9.w;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Map;
import java.util.List;
import com.yxcorp.gifshow.camera.record.base.b$a;
import com.yxcorp.gifshow.camera.record.base.b$b;
import o56.c;
import o56.a;
import java.security.InvalidParameterException;
import java.lang.StringBuilder;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
import x8c.a;
import q87.c;
import java.util.Collection;
import ekd.q;
import java.lang.Throwable;
import w46.b;
import java.util.Arrays;
import java.util.ArrayList;
import io.reactivex.subjects.PublishSubject;
import yb9.b;
import yb9.a;
import c35.c;
import tg9.b;
import tg9.g;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.camera.record.base.a;
import oc9.a;
import brd.t;
import oc9.b;
import java.lang.Runnable;
import ekd.k1;

public class b	// class@000da6
{
    public b a;
    public final Map b;
    public final Map c;
    public boolean d;
    public boolean e;
    public final BaseFragment f;
    public GifshowActivity g;
    public final w h;

    public void b(BaseFragment p0,w p1){
       super();
       this.b = new ConcurrentHashMap();
       this.c = new ConcurrentHashMap();
       this.e = true;
       this.f = p0;
       this.g = p0.getActivity();
       this.h = p1;
    }
    public GifshowActivity a(){
       return this.g;
    }
    public w b(){
       return this.h;
    }
    public Object c(Class p0){
       List obj = PatchProxy.applyOneRefs(p0, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get(p0);
       Object obj1 = null;
       int i = 0;
       if (obj == null || obj.isEmpty()) {
          Object[] objArray = new Object[i];
          a.D().w("CallerContext", p0.getSimpleName()+" no provider", objArray);
          return obj1;
       }else if(obj.size() == 1){
          return obj.get(i).getData();
       }else if(b$b.class.isAssignableFrom(p0) || !a.a().c()){
          CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             Object data = iterator.next().getData();
             if (data != null) {
                uCopyOnWrite.add(data);
             }
          }
          if (uCopyOnWrite.isEmpty()) {
             return obj1;
          }
          if (uCopyOnWrite.size() == 1) {
             return uCopyOnWrite.get(i);
          }
          return uCopyOnWrite.get(i).d(uCopyOnWrite);
       }else {
          throw new InvalidParameterException(p0.getSimpleName()+" 必须实现IMultiSourceData");
       }
    }
    public Object d(Object p0){
       InvalidParameterException obj = PatchProxy.applyOneRefs(p0, this, b.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (q.f(this.c.get(p0.getClass())) && this.e == null) {
          obj = new InvalidParameterException(p0.getClass().getName()+" getData不能在所有controller构造完前调用，否则会导致controller有顺序依赖");
          a.D().e("CallerContext", obj.getMessage(), obj);
          if (a.a().c()) {
             throw obj;
          }
       }
       Object obj1 = this.c(p0.getClass());
       if (obj1 != null) {
          p0 = obj1;
       }
       return p0;
    }
    public List e(Class p0){
       List obj = PatchProxy.applyOneRefs(p0, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c.get(p0);
       int i = 0;
       if (obj == null || obj.isEmpty()) {
          Object[] objArray = new Object[i];
          a.D().w("CallerContext", p0.getSimpleName()+" no provider", objArray);
          return new ArrayList();
       }else if(obj.size() == 1){
          Object[] objArray1 = new Object[]{obj.get(i).getData()};
          return Arrays.asList(objArray1);
       }else {
          CopyOnWriteArrayList uCopyOnWrite = new CopyOnWriteArrayList();
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             b$a uoa = iterator.next();
             if (uoa != null) {
                Object data = uoa.getData();
                if (data != null) {
                   uCopyOnWrite.add(data);
                }
             }
          }
          return uCopyOnWrite;
       }
    }
    public BaseFragment f(){
       return this.f;
    }
    public PublishSubject g(Class p0){
       PublishSubject obj = PatchProxy.applyOneRefs(p0, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.b.containsKey(p0)) {
          return this.b.get(p0);
       }
       _monitor_enter(this);
       obj = this.b.get(p0);
       if (obj == null) {
          obj = PublishSubject.g();
          this.b.put(p0, obj);
       }
       _monitor_exit(this);
       return obj;
    }
    public b h(){
       Object obj = PatchProxy.apply(null, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.a == null) {
          this.a = new a();
       }
       return this.a;
    }
    public c i(){
       b tf = this.f;
       if (tf instanceof c) {
       }else {
          tf = null;
       }
       return tf;
    }
    public b j(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d(g.c).b;
    }
    public boolean k(){
       return this.d;
    }
    public b l(Class p0,g p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.g(p0).subscribe(new a(p0, p1), new a(p0, p1));
    }
    public void m(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "5")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CallerContext", p0.getClass().getSimpleName()+": post", objArray);
       k1.o(new b(this, p0));
       return;
    }
    public synchronized void n(Class p0,b$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, b.class, "7")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("CallerContext", p0.getSimpleName()+" add provider:"+p1.getClass().getSimpleName(), objArray);
       List list = this.c.get(p0);
       if (list == null) {
          list = this.c.get(p0);
          if (list == null) {
             list = new CopyOnWriteArrayList();
             this.c.put(p0, list);
          }
       }
       if (!list.contains(p1)) {
          list.add(p1);
       }
       return;
    }
    public void o(b p0){
       this.a = p0;
    }
}
