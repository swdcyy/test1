package ap6.m3;
import java.util.concurrent.Callable;
import com.kwai.imsdk.group.g;
import java.util.List;
import java.lang.String;
import com.kwai.imsdk.internal.db.GroupLocation;
import java.lang.Object;
import dp6.b;
import java.util.Objects;
import java.util.ArrayList;
import bq6.y2;
import java.util.HashSet;
import java.util.Collection;
import lh0.a$c;
import java.util.Iterator;
import java.lang.CharSequence;
import ca7.u;
import rh0.a$c;
import java.lang.Long;
import com.kwai.chat.sdk.signal.f;
import com.kwai.chat.sdk.signal.IMClientAppInfo;
import com.kwai.chat.kwailink.data.ClientAppInfo;
import java.lang.Throwable;
import l85.b;
import lh0.a$r1;
import xp6.i;
import com.kwai.imsdk.internal.util.b;
import lh0.a$g0;
import com.kwai.imsdk.group.GroupLabel;
import java.lang.Integer;
import java.util.Arrays;
import qo6.a;
import com.kwai.chat.sdk.signal.KwaiSignalDispatcher;
import com.google.protobuf.nano.MessageNano;
import com.kwai.chat.kwailink.data.PacketData;
import java.lang.Exception;
import lh0.a$d;
import java.lang.Class;
import hp6.b;

public final class m3 implements Callable	// class@000352
{
    public final g b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final GroupLocation g;
    public final String h;
    public final int i;
    public final String j;
    public final List k;

    public void m3(g p0,List p1,String p2,String p3,String p4,GroupLocation p5,String p6,int p7,String p8,List p9){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = p6;
       this.i = p7;
       this.j = p8;
       this.k = p9;
    }
    public final Object call(){
       PacketData packetData;
       int i;
       m3 tc = this.c;
       m3 td = this.d;
       m3 te = this.e;
       m3 tf = this.f;
       m3 tg = this.g;
       m3 th = this.h;
       m3 ti = this.i;
       m3 tj = this.j;
       m3 tk = this.k;
       b uob = b.i(this.b.c);
       Objects.requireNonNull(uob);
       ArrayList uArrayList = new ArrayList();
       if (tc != null) {
          HashSet hashSet = new HashSet(tc);
          hashSet.remove(y2.c());
          uArrayList = new ArrayList(hashSet);
       }
       try{
          a$c uoc = new a$c();
          ArrayList uArrayList1 = new ArrayList();
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             String str = iterator.next();
             if (u.c(str)) {
                continue ;
             }
             a$c uoc1 = new a$c();
             uoc1.b = Long.parseLong(str);
             uoc1.a = f.e().b().a();
             uArrayList1.add(uoc1);
          }
          if (!u.c(td)) {
             uoc.h = td;
          }
          if (!u.c(te)) {
             uoc.b = te;
          }
          if (!u.c(tf)) {
             uoc.c = tf;
          }
          if (tg != null) {
             uoc.d = i.b(tg);
          }
          if (!u.c(th)) {
             uoc.e = th;
          }
          if (b.g(uArrayList1) > 0) {
             a$c[] uocArray = new a$c[b.g(uArrayList1)];
             uoc.a = uArrayList1.toArray(uocArray);
          }
          i = 0;
          if (!b.c(tk)) {
             a$g0[] og0Array = new a$g0[tk.size()];
             int i1 = 0;
             while (i1 < tk.size()) {
                if (tk.get(i1) != null) {
                   a$g0 og0 = new a$g0();
                   og0.a = u.a(tk.get(i1).getId());
                   og0Array[i1] = og0;
                }
                i1 = i1 + 1;
             }
             uoc.i = og0Array;
          }
          Integer[] integerArray = new Integer[]{Integer.valueOf(i),Integer.valueOf(3),Integer.valueOf(4)};
          if (Arrays.asList(integerArray).contains(Integer.valueOf(ti))) {
             uoc.f = ti;
             if (!u.c(tj)) {
                uoc.g = tj;
             }
             packetData = f.d(uob.a).sendSync("Group.Create", MessageNano.toByteArray(uoc), 0x2710);
          }else {
             packetData = new PacketData();
             packetData.x(1004);
             packetData.z("groupType is invalid");
          }
       }catch(java.lang.Exception e0){
          packetData = uob.g(e0);
       }
       return a.h(packetData, a$d.class);
    }
}
