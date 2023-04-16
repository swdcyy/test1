package com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager$d;
import com.kuaishou.gifshow.kuaishan.logic.feed.KSDataManager;
import com.kuaishou.gifshow.kuaishan.network.feed.KSFeedGroupInfo;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.CharSequence;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.kuaishan.model.KSFeedTemplateDetailInfo;
import com.yxcorp.utility.TextUtils;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import t90.k;

public final class KSDataManager$d	// class@001a17
{
    public final List a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public int e;
    public final KSDataManager f;

    public void KSDataManager$d(KSDataManager p0,KSFeedGroupInfo p1){
       a.p(p1, "groupInfo");
       this.f = p0;
       super();
       this.a = new ArrayList();
       KSFeedGroupInfo mId = p1.mId;
       a.o(mId, "groupInfo.mId");
       this.b = mId;
       mId = p1.mGroupName;
       if (mId != null) {
       }else {
          String str = "";
       }
       this.c = mId;
       ArrayList uArrayList = new ArrayList();
       this.d = uArrayList;
       this.e = -1;
       uArrayList.add("0");
       return;
    }
    public final void a(String p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, KSDataManager$d.class, "6")) {
          return;
       }
       a.p(p0, "cursor");
       a.p(p1, "templates");
       String str = ", group=";
       String str1 = "KSDataManager";
       if (!p1.isEmpty()) {
          String str2 = 1;
          StringBuilder str3 = (!p0.length())? 1: null;
          if (!str3) {
             Object[] objArray1 = new Object[0];
             e.D().w(str1, "append: cursor="+p0+", size="+p1.size()+str+this.b, objArray1);
             if (a.g(p0, this.c()) ^ str2) {
                this.d.add(p0);
             }
             if (this.a.isEmpty() ^ str2) {
                int i = -1;
                if (this.e == i) {
                   Iterator iterator = p1.iterator();
                   int i1 = 0;
                   while (iterator.hasNext()) {
                      if (TextUtils.n(iterator.next().mId, this.a.get(0).mId)) {
                         i = i1;
                         break ;
                      }
                      i1 = i1 + 1;
                   }
                   if (i >= 0) {
                      this.e = (this.a.size() + i) - str2;
                      p1.remove(i);
                   }
                }
             }
             this.a.addAll(p1);
             return;
          }
       }
       Object[] objArray = new Object[0];
       e.D().w(str1, "append: no data append cursor="+p0+str+this.b, objArray);
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, KSDataManager$d.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("KSDataManager", "fixSelectedPosition: mInsertedTemplateOriginalPosition : "+this.e, objArray);
       if (!TextUtils.n(this.b, this.f.d)) {
          return;
       }
       objArray = new Object[i];
       e.D().w("KSDataManager", "fixSelectedPosition: before fix: "+this.f.f, objArray);
       KSDataManager$d te = this.e;
       if (te == -1 || this.f.f <= te) {
          te = this.f;
          te.f = Math.max(i, (te.f - 1));
       }
       Object[] objArray1 = new Object[i];
       e.D().w("KSDataManager", "fixSelectedPosition: after fix: "+this.f.f, objArray1);
       return;
    }
    public final String c(){
       KSDataManager$d obj = PatchProxy.apply(null, this, KSDataManager$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d;
       Object obj1 = obj.get((obj.size() - 1));
       a.o(obj1, "mCursors[mCursors.size - 1]");
       return obj1;
    }
    public final String d(){
       return this.b;
    }
    public final String e(){
       return this.c;
    }
    public final KSFeedTemplateDetailInfo f(int p0){
       KSDataManager$d uod = KSDataManager$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       KSFeedTemplateDetailInfo kSFeedTempla = (p0 < 0 || p0 > this.a.size())? null: this.a.get(p0);
       return kSFeedTempla;
    }
    public final KSFeedTemplateDetailInfo g(String p0){
       KSFeedTemplateDetailInfo kSFeedTempla;
       Iterator obj = PatchProxy.applyOneRefs(p0, this, KSDataManager$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "templateId");
       obj = this.a.iterator();
       do {
          if (obj.hasNext()) {
          }else {
             kSFeedTempla = null;
             break ;
          }
          kSFeedTempla = obj.next();
       } while (a.g(kSFeedTempla.mId, p0));
       return kSFeedTempla;
    }
    public final List h(){
       return this.a;
    }
    public final void i(){
       if (PatchProxy.applyVoid(null, this, KSDataManager$d.class, "14")) {
          return;
       }
       this.d.clear();
       this.d.add("0");
       this.a.clear();
       return;
    }
    public final void j(String p0,List p1){
       KSDataManager$d uod = KSDataManager$d.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, uod, "8")) {
          return;
       }
       a.p(p0, "cursor");
       a.p(p1, "templates");
       Object[] objArray = new Object[0];
       e.D().w("KSDataManager", "refresh: cursor="+p0+", size: "+p1.size()+", group="+this.b, objArray);
       Object obj = PatchProxy.apply(null, this, uod, "9");
       boolean b = (obj != PatchProxyResult.class)? obj.booleanValue(): a.g("999", this.b);
       if (b) {
          if (!PatchProxy.applyVoidOneRefs(p1, this, uod, "10")) {
             uod = this.b;
             if (uod.hashCode() == 0xdd19 && uod.equals("999")) {
                k.a.c(this.a, p1);
             }
          }
       }else {
          this.i();
       }
       this.a(p0, p1);
       return;
    }
}
