package a6a.a;
import qvb.n0;
import a6a.a$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.relation.select.model.SelectUsersConfigParams;
import java.util.List;
import java.util.ArrayList;
import com.yxcorp.gifshow.detail.relation.select.model.FeedSelectUsersResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import b6a.a;
import brd.t;
import wkd.b;
import z5a.c;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import a6a.a$b;
import erd.g;
import java.util.Iterator;
import java.lang.Iterable;
import com.yxcorp.gifshow.relation.select.model.SelectUsersResponse$FriendsListResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.model.ContactTargetItem;
import b6a.b;
import qvb.a;
import com.yxcorp.gifshow.detail.relation.select.model.LastestFriendGroup;
import qrd.l1;
import android.os.Build$VERSION;
import a6a.a$c;
import java.util.function.Predicate;

public class a extends n0	// class@00003f
{
    public SelectUsersConfigParams m;
    public String n;
    public final ArrayList o;
    public final ArrayList p;
    public boolean q;
    public final int r;
    public final int s;
    public final String t;
    public boolean u;
    public static final a$a v;

    static {
       a.v = new a$a(null);
    }
    public void a(int p0,int p1,String p2,boolean p3){
       a.p(p2, "extParams");
       super();
       this.r = p0;
       this.s = p1;
       this.t = p2;
       this.u = p3;
       SelectUsersConfigParams selectUsersC = new SelectUsersConfigParams(0, 0, null, 7, null);
       this.m = p0;
       this.o = new ArrayList();
       this.p = new ArrayList();
    }
    public boolean B1(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "2");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 != null){
          b = p0.hasMore();
       }else {
          b = false;
       }
       return b;
    }
    public boolean E1(){
       Object obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.q == null) {
          a.a.b(this.r);
       }
       return this.q;
    }
    public Object F1(){
       a a;
       Object[] objArray = null;
       FeedSelectUsersResponse uFeedSelectU = PatchProxy.apply(objArray, this, a.class, "6");
       if (uFeedSelectU != PatchProxyResult.class) {
       }else {
          a = a.a;
          FeedSelectUsersResponse uFeedSelectU1 = a.a(this.r);
          if (uFeedSelectU1 != null) {
             objArray = uFeedSelectU1.getMCursor();
          }
          this.n = objArray;
          uFeedSelectU = a.a(this.r);
       }
       return uFeedSelectU;
    }
    public t I1(){
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = b.a(-1086544299);
       a tr = this.r;
       a ts = this.s;
       if (!this.K()) {
          objArray = this.n;
       }
       t ot = obj.a(tr, ts, objArray, this.t).map(new e()).observeOn(d.c).doOnNext(new a$b(this));
       a.o(ot, "Singleton.get\(FeedRelati¡­rams = it.mConfig\n      }");
       return ot;
    }
    public void M1(Object p0,List p1){
       this.W1(p0, p1);
    }
    public final boolean V1(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 == null || p0.equals("LATEST_CONTACT") != b) {
          b = false;
       }
       return b;
    }
    public void W1(FeedSelectUsersResponse p0,List p1){
       ContactTargetItem uContactTarg;
       List items;
       Iterator iterator1;
       Object obj;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "3")) {
          return;
       }
       a.p(p0, "response");
       a.p(p1, "items");
       if (this.K()) {
          p1.clear();
       }
       this.p.clear();
       List mList = p0.getMList();
       if (mList != null) {
          Iterator iterator = mList.iterator();
          while (iterator.hasNext()) {
             SelectUsersResponse$FriendsListResponse uFriendsList = iterator.next();
             if (uFriendsList.isSection()) {
                this.o.add(uFriendsList);
                uContactTarg = CollectionsKt___CollectionsKt.e3(p1);
                if (uContactTarg != null) {
                   uContactTarg.mLastItem = true;
                }
             }
             if (uFriendsList.isUser()) {
                uContactTarg = b.a.a(uFriendsList);
                if (this.V1(uFriendsList.getSection()) && this.K()) {
                   this.p.add(uContactTarg);
                }
                String str = (this.o.isEmpty())? "": CollectionsKt___CollectionsKt.Y2(this.o).getSectionTitle();
                uContactTarg.mFirstLetter = str;
                items = this.getItems();
                a.o(items, "getItems\(\)");
                iterator1 = items.iterator();
                while (true) {
                   if (iterator1.hasNext()) {
                      obj = iterator1.next();
                      Object obj1 = obj;
                      obj1 = (a.g(obj1.mId, uContactTarg.mId) && a.g(obj1.mSection, uContactTarg.mSection))? 1: null;
                      if (!obj1) {
                         continue ;
                      }
                   }else {
                      obj = null;
                   }
                   if (obj == null) {
                      p1.add(uContactTarg);
                   }
                }
             }
          }
       }
       if (this.u != null && (this.K() && this.p.size() > 0)) {
          LastestFriendGroup lastestFrien = new LastestFriendGroup();
          lastestFrien.mSection = this.p.get(0).mSection;
          lastestFrien.mFirstLetter = this.p.get(0).mFirstLetter;
          lastestFrien.mType = this.p.get(0).mType;
          lastestFrien.mName = "LATEST_CONTACT";
          iterator1 = this.p.iterator();
          while (iterator1.hasNext()) {
             lastestFrien.addLastestContact(iterator1.next());
          }
          if (Build$VERSION.SDK_INT >= 24) {
             p1.removeIf(new a$c(this));
          }
          p1.add(0, lastestFrien);
       }
    label_012e :
       a.v.a(p1);
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       this.n = null;
       super.a();
       return;
    }
}
