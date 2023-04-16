package cg8.c$j;
import v2.q;
import cg8.c;
import androidx.room.RoomDatabase;
import java.lang.String;
import a3.f;
import java.lang.Object;
import gg8.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import a3.d;
import java.util.Objects;
import gg8.a$a;
import com.kwai.robust.PatchProxyResult;
import zi8.d0;

public class c$j extends q	// class@00040f
{
    public final c d;

    public void c$j(c p0,RoomDatabase p1){
       this.d = p0;
       super(p1);
    }
    public String d(){
       return "INSERT OR REPLACE INTO `BackupMiniAppPackageInfo` \(`appId`,`data`,`insertTime`\) VALUES \(?,?,?\)";
    }
    public void g(f p0,Object p1){
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c$j.class, str)) {
       }else {
          a a = p1.a;
          int i = 1;
          if (a == null) {
             p0.bindNull(i);
          }else {
             p0.bindString(i, a);
          }
          c f = this.d.f;
          a b = p1.b;
          Objects.requireNonNull(f);
          String str1 = PatchProxy.applyOneRefs(b, f, a$a.class, str);
          if (str1 != PatchProxyResult.class) {
          }else if(b != null){
             str1 = d0.j(b);
          }else {
             str1 = "";
          }
          int i1 = 2;
          if (str1 == null) {
             p0.bindNull(i1);
          }else {
             p0.bindString(i1, str1);
          }
          p0.bindLong(3, p1.c);
       }
       return;
    }
}
