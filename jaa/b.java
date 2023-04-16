package jaa.b;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import jaa.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.TreeSet;
import jaa.a;
import java.util.Comparator;
import kaa.a;
import kaa.b;
import java.util.SortedSet;
import kaa.c;
import kaa.d;
import kaa.e;
import kaa.f;
import kaa.g;
import kaa.h;
import kaa.i;
import kaa.j;
import kaa.r;
import kaa.k;
import kaa.l;
import kaa.m;
import kaa.n;
import kaa.o;
import kaa.p;
import kaa.q;
import kaa.s;
import kaa.t;
import kaa.u;
import jaa.d;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.Integer;
import haa.f;
import java.lang.StringBuilder;
import q87.c;
import java.util.Iterator;
import kaa.w;
import com.kuaishou.edit.draft.Workspace$b;
import com.google.protobuf.GeneratedMessageLite$Builder;

public final class b	// class@00299e
{
    public static SortedSet a;

    public void b(){
       super();
    }
    public static c a(Workspace p0,File p1){
       Iterator iterator;
       w ow;
       Object[] objArray;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] obj = null;
       String obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, uob, "2");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = "1";
       if (!PatchProxy.applyVoid(obj, obj, uob, obj1) && b.a == null) {
          TreeSet treeSet = new TreeSet(a.b);
          b.a = treeSet;
          treeSet.add(new a());
          b.a.add(new b());
          b.a.add(new c());
          b.a.add(new d());
          b.a.add(new e());
          b.a.add(new f());
          b.a.add(new g());
          b.a.add(new h());
          b.a.add(new i());
          b.a.add(new j());
          b.a.add(new r());
          b.a.add(new k());
          b.a.add(new l());
          b.a.add(new m());
          b.a.add(new n());
          b.a.add(new o());
          b.a.add(new p());
          b.a.add(new q());
          b.a.add(new s());
          b.a.add(new t());
          b.a.add(new u());
       }
       c uoc = new c(p0, p1);
       String version = p0.getVersion();
       Object[] obj2 = PatchProxy.applyOneRefs(version, obj, d.class, obj1);
       if (obj2 != patchProxyRe) {
          obj = obj2;
       }else {
          Matcher matcher = d.e.matcher(version);
          String str = "Failed to parse version string ";
          if (!matcher.find() || matcher.groupCount() != 3) {
             obj2 = new Object[0];
             f.D().A("WorkspaceVersion", str+version, obj2);
          }else {
             obj = new d();
             try{
                obj2 = 1;
                obj.b = Integer.parseInt(matcher.group(obj2));
                obj.c = Integer.parseInt(matcher.group(2));
                obj.d = Integer.parseInt(matcher.group(3));
             }catch(java.lang.NumberFormatException e0){
                obj2 = new Object[0];
                f.D().A("WorkspaceVersion", str+version, obj2);
             }
          }
       }
    }
}
