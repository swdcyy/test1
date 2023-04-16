package u79.a;
import h3.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u79.o;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import java.lang.Integer;
import java.util.Iterator;
import android.view.ViewGroup;
import android.view.View;
import java.lang.Number;
import android.content.Context;
import android.view.LayoutInflater;
import android.os.Bundle;
import ga9.b;
import java.lang.Boolean;

public abstract class a extends a	// class@003a07
{
    public final List d;
    public int e;

    public void a(){
       super();
       this.d = new ArrayList();
    }
    public abstract AbsPreviewItemViewBinder A(int p0);
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       o oo = this.C();
       if (oo != null) {
          Log.b("BaseMediaPreviewAdapter", "currentItemPlay: index="+oo.getIndex());
          oo.r();
          oo.w(false, false);
       }
       return;
    }
    public o C(){
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.e;
       if (obj < null || obj >= this.d.size()) {
          return objArray;
       }
       return this.d.get(this.e);
    }
    public o D(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.get(p0);
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       o oo = this.C();
       if (oo != null) {
          oo.n();
       }
       this.G();
       return;
    }
    public void F(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       o oo = this.C();
       if (oo != null) {
          oo.v();
       }
       return;
    }
    public final void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       o oo = this.C();
       if (oo != null) {
          Log.b("BaseMediaPreviewAdapter", "pauseCurrentPlay: index="+oo.getIndex());
          oo.i();
          oo.w(true, false);
       }
       return;
    }
    public void H(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       Log.b("BaseMediaPreviewAdapter", "releasePlayers: ");
       this.G();
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().c();
       }
       return;
    }
    public void I(int p0){
       o oo;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "10")) {
          return;
       }
       Log.b("BaseMediaPreviewAdapter", "setCurrentSelect\(\) called with: position = ["+p0+"]");
       if (p0 == this.e) {
          oo = this.C();
          if (oo != null) {
             oo.t();
          }
          return;
       }else {
          this.G();
          o oo1 = this.C();
          if (oo1 != null) {
             oo1.p();
          }
          this.e = p0;
          oo = this.C();
          if (oo != null) {
             oo.t();
          }
          return;
       }
    }
    public int getCurrentIndex(){
       return this.e;
    }
    public void h(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "2")) {
          return;
       }
       Log.b("BaseMediaPreviewAdapter", "destroyItem\(\) called with: position = ["+p1+"], object = ["+p2+"]");
       p0.removeView(p2.getView());
       p2.unbind();
       return;
    }
    public int j(){
       Object obj = PatchProxy.apply(null, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.d.size();
    }
    public int k(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       Log.b("BaseMediaPreviewAdapter", "getItemPosition\(\) called with: pObject = ["+p0+"]");
       return this.d.indexOf(p0);
    }
    public Object o(ViewGroup p0,int p1){
       o obj;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, uoa, "1");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = this.D(p1);
       if (obj.isPrepared()) {
          return obj;
       }else {
          View view = obj.o(p0);
          if (PatchProxy.isSupport(uoa)) {
             Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p1), this, uoa, "6");
             if (obj1 != patchProxyRe) {
                p1 = obj1.intValue();
             label_004b :
                AbsPreviewItemViewBinder uAbsPreviewI = this.A(p1);
                if (view == null) {
                   view = uAbsPreviewI.f(LayoutInflater.from(p0.getContext()), p0, null);
                }
                obj.h(uAbsPreviewI);
                obj.d(view);
                p0.addView(obj.getView());
                Log.b("BaseMediaPreviewAdapter", "instantiateItem: container child="+p0.getChildCount());
                return obj;
             }
          }
          p1 = this.d.get(p1).k();
          goto label_004b ;
       }
    }
    public boolean p(View p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p1.getView() == p0)? true: false;
       return b;
    }
    public void v(ViewGroup p0,int p1,Object p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, a.class, "3")) {
          return;
       }
       Log.b("BaseMediaPreviewAdapter", "setPrimaryItem\(\) called with: position = ["+p1+"]");
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       if (this.d.isEmpty()) {
          return;
       }
       Log.b("BaseMediaPreviewAdapter", "clearData\(\) called");
       Iterator iterator = this.d.iterator();
       while (iterator.hasNext()) {
          iterator.next().unbind();
       }
       this.d.clear();
       this.q();
       return;
    }
}
