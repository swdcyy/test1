package com.kuaishou.live.gzone.barrage.p$b;
import v37.a;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import java.util.List;
import com.kuaishou.live.gzone.barrage.LiveGzoneColorBarrageResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import b53.n0;
import java.lang.Runnable;
import ekd.k1;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.gzone.barrage.l;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import pm8.a;
import t02.a0;
import p91.m;
import com.kwai.live.gzone.barrage.LiveGzoneColorBarrageRight;
import kg1.g;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.StringBuilder;
import km8.b;
import oe6.g;
import java.lang.Boolean;
import jv1.b;

public class p$b implements a	// class@001c44
{
    public final p a;

    public void p$b(p p0){
       this.a = p0;
       super();
    }
    public List a(){
       p t = this.a.t;
       if (t != null) {
          return t.mColorBarrageRightList;
       }
       return null;
    }
    public void b(int p0){
       p$b uob = p$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "3")) {
          return;
       }
       if (!p0) {
          this.a.R8();
       }else {
          k1.s(new n0(this), this.a, (long)p0);
       }
       return;
    }
    public Pair c(){
       LiveGzoneColorBarrageRight mColorValue;
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, p$b.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a();
       if (q.f(obj)) {
          return objArray;
       }
       LinkedHashMap linkedHashMa = a.J(l.J);
       String str = this.a.s.Z2.d();
       if (linkedHashMa != null) {
          Integer integer = linkedHashMa.get(str);
          if (integer != null && integer.intValue() > 0) {
             int i = 0;
             while (true) {
                if (i < obj.size()) {
                   if (obj.get(i).mLevel == integer.intValue()) {
                      mColorValue = obj.get(i).mColorValue;
                   label_005d :
                      if (integer.intValue() <= this.a.s.r1.w8() && (this.a.s.r1.Qi().mStatus == 1 && !TextUtils.x(mColorValue))) {
                         objArray = new Pair(mColorValue, integer);
                         break ;
                      }
                   }else {
                      i = i + 1;
                   }
                }else {
                   mColorValue = objArray;
                   goto label_005d ;
                }
             }
          }
       }
       return objArray;
    }
    public void d(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, p$b.class, "2")) {
          return;
       }
       if (!TextUtils.x(p0) && !a.p()) {
          SharedPreferences$Editor uEditor = a.a.edit();
          uEditor.putBoolean(b.d("user")+"is_live_gzone_color_barrage_send", true);
          g.a(uEditor);
       }
       return;
    }
    public boolean e(){
       boolean b;
       p obj = PatchProxy.apply(null, this, p$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.a.s.x.H2()) {
          obj = this.a.t;
          if (obj != null && (obj.mHasColorBarrage != null && !q.f(obj.mColorBarrageRightList))) {
             b = true;
          label_0035 :
             return b;
          }
       }
       b = false;
       goto label_0035 ;
    }
}
