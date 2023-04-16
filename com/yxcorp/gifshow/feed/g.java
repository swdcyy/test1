package com.yxcorp.gifshow.feed.g;
import java.lang.Object;
import kfa.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import wkd.b;
import com.kwai.framework.model.feed.BaseFeed;
import brd.t;
import kp.r1;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Integer;
import erd.o;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.util.ArrayList;
import java.util.Iterator;
import android.util.Pair;
import com.yxcorp.gifshow.feed.model.PhotoQuery;
import com.yxcorp.gifshow.feed.model.PhotoList;
import cjd.e;
import com.yxcorp.gifshow.feed.f;
import zea.p;

public class g	// class@000ff6
{

    public void g(){
       super();
    }
    public static b a(){
       Object obj = PatchProxy.apply(null, null, g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return b.a(-1491693047);
    }
    public static t b(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.e(p0.getId(), r1.I1(p0));
    }
    public static t c(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.e(p0.getPhotoId(), p0.getServerExpTag());
    }
    public static t d(QPhoto p0,int p1){
       g og = g.class;
       if (PatchProxy.isSupport(og)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, og, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.f(p0.getPhotoId(), p0.getServerExpTag(), p1);
    }
    public static t e(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.f(p0, p1, 0);
    }
    public static t f(String p0,String p1,int p2){
       if (PatchProxy.isSupport(g.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, g.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return g.i(p0, p1, p2).map(g.k(p0));
    }
    public static t g(List p0){
       t ot;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       g og = g.class;
       Object obj = PatchProxy.applyOneRefs(p0, null, og, "11");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 0;
       if (PatchProxy.isSupport(og)) {
          ot = PatchProxy.applyTwoRefs(p0, Integer.valueOf(i), null, og, "12");
          if (ot != patchProxyRe) {
          }else if(q.f(p0)){
             ot = t.empty();
          }else {
             ArrayList uArrayList = new ArrayList();
             Iterator iterator = p0.iterator();
             while (iterator.hasNext()) {
                Pair pair = iterator.next();
                uArrayList.add(new PhotoQuery(pair.first, pair.second));
             }
             ot = g.a().b(new PhotoList(uArrayList), null).map(new e());
          }
       }else {
          goto label_0026 ;
       }
       return ot;
    }
    public static t h(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, g.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return g.i(p0, p1, 0);
    }
    public static t i(String p0,String p1,int p2){
       b obj;
       if (PatchProxy.isSupport(g.class)) {
          obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, g.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = g.a();
       PhotoQuery[] photoQueryAr = new PhotoQuery[]{new PhotoQuery(p0, p1)};
       PhotoList photoList = new PhotoList(photoQueryAr);
       Integer integer = (p2)? Integer.valueOf(p2): null;
       return obj.b(photoList, integer).map(new e());
    }
    public static t j(List p0,int p1){
       b obj;
       g og = g.class;
       Integer integer = null;
       if (PatchProxy.isSupport(og)) {
          obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), integer, og, "15");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = g.a();
       PhotoList photoList = new PhotoList(p0);
       if (p1) {
          integer = Integer.valueOf(p1);
       }
       return obj.b(photoList, integer).map(new e()).map(f.b);
    }
    public static o k(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, g.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new p(p0);
    }
}
