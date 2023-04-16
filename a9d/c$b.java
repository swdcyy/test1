package a9d.c$b;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import a9d.c;
import com.yxcorp.plugin.search.entity.BubbleConfig;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.popup.bubble.a;
import a9d.f;
import java.util.Objects;
import f9d.a;
import java.lang.Long;
import java.lang.Boolean;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.lang.System;
import java.lang.StringBuilder;
import com.kwai.robust.PatchProxyResult;
import java.util.Set;
import yb6.d;
import java.util.HashSet;
import nfd.r3;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.Collections;
import fg6.a;
import com.yxcorp.plugin.search.utils.SearchUtils$1;
import java.lang.reflect.Type;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.lang.Throwable;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import java.util.Collection;
import ekd.q;
import java.util.Iterator;
import java.lang.Number;
import oe6.g;
import java.lang.Integer;
import o07.o;

public class c$b implements PopupInterface$h	// class@0000a5
{
    public final BubbleConfig b;
    public final c c;

    public void c$b(c p0,BubbleConfig p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void B(c p0){
       a a;
       SharedPreferences$Editor uEditor1;
       String str1;
       Object obj3;
       a uoa1;
       Iterator iterator;
       long l2;
       Object obj = this;
       c$b obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, c$b.class, "1")) {
          return;
       }
       obj.c.f(obj1, obj.b);
       c e = obj.c.e;
       if (e != null) {
          e.a(obj1, obj.b);
       }
       c d = obj.c.d;
       if (d != null) {
          String str = String.valueOf(obj.b.mRuleId);
          obj1 = obj.b;
          BubbleConfig mEndTime = obj1.mEndTime;
          BubbleConfig mEnableGloba = obj1.mEnableGlobalLimit;
          Objects.requireNonNull(d);
          a uoa = a.class;
          if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidThreeRefs(str, Long.valueOf(mEndTime), Boolean.valueOf(mEnableGloba), d, a.class, "5")) {
             SharedPreferences$Editor uEditor = d.a.edit();
             long l = System.currentTimeMillis();
             if (mEnableGloba != null) {
                uEditor.putLong(d.d, l);
                uEditor.putInt(d.e, (d.e() + 1));
             }
             uEditor.putLong(d.f+str, l);
             uEditor.putInt(d.g+str, (d.d(str) + 1));
             uEditor.putInt(d.h+str, (d.f(str) + 1));
             uEditor.putLong(d.i+str, mEndTime);
             HashSet hashSet = PatchProxy.applyOneRefs(str, d, uoa, "6");
             if (hashSet != PatchProxyResult.class) {
             }else {
                long l1 = d.a();
                a = d.a;
                Iterator obj2 = null;
                Set set = PatchProxy.applyTwoRefs(a, "KEY_HISTORY_RULE_ID_LIST", obj2, r3.class, "41");
                if (set != PatchProxyResult.class) {
                }else if(a == null || TextUtils.x("KEY_HISTORY_RULE_ID_LIST")){
                   set = Collections.emptySet();
                }else {
                   String str2 = a.getString("KEY_HISTORY_RULE_ID_LIST", obj2);
                   set = (TextUtils.x(str2))? Collections.emptySet(): a.a.i(str2, new SearchUtils$1().getType());
                }
             }
             HashSet hashSet1 = hashSet;
          label_01fc :
             hashSet1.add(str);
             uEditor.putString("KEY_HISTORY_RULE_ID_LIST", r3.C(hashSet1));
             g.a(uEditor);
          }
       }
       return;
    }
    public void H(c p0,int p1){
       c$b uob = c$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uob, "2")) {
          return;
       }
       c e = this.c.e;
       if (e != null) {
          e.b(p0, this.b);
       }
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
