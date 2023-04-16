package nod.c;
import im8.b;
import java.lang.Object;
import nod.a;
import java.lang.String;
import im8.e;
import hba.a;
import java.lang.IllegalArgumentException;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.util.Set;
import java.util.HashSet;

public final class c implements b	// class@001e9a
{
    public Set a;
    public Set b;

    public void c(){
       super();
    }
    public void a(Object p0,Object p1){
       String str = "TEXT";
       if (e.e(p1, str)) {
          a uoa = e.c(p1, str);
          if (uoa != null) {
             p0.e = uoa;
          }else {
             throw new IllegalArgumentException("mTextDraft 不能为空");
          }
       }
       if (e.e(p1, "WORKSPACE")) {
          p1 = e.c(p1, "WORKSPACE");
          if (p1 != null) {
             p0.d = p1;
          }else {
             throw new IllegalArgumentException("mWorkspaceDraft 不能为空");
          }
       }
       return;
    }
    public final Set b(){
       if (this.a == null) {
          HashSet hashSet = new HashSet();
          this.a = hashSet;
          hashSet.add("TEXT");
          this.a.add("WORKSPACE");
       }
       return this.a;
    }
    public void c(Object p0){
       p0.e = null;
       p0.d = null;
    }
    public final Set d(){
       if (this.b == null) {
          this.b = new HashSet();
       }
       return this.b;
    }
}
