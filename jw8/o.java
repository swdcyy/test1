package jw8.o;
import erd.o;
import y26.b$a;
import com.kuaishou.edit.draft.Workspace;
import java.io.File;
import java.lang.String;
import java.lang.Object;
import com.yxcorp.gifshow.encode.EncodeRequest$a;
import com.yxcorp.gifshow.encode.EncodeRequest;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.activity.preview.f;
import lnc.r5;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class o implements o	// class@0029c6
{
    public final b$a b;
    public final Workspace c;
    public final File d;
    public final String e;
    public final String f;

    public void o(b$a p0,Workspace p1,File p2,String p3,String p4){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public final Object apply(Object p0){
       o tb = this.b;
       o td = this.d;
       o te = this.e;
       o tf = this.f;
       p0 = p0.a();
       Object[] objArray = new Object[0];
       a.D().w("ReviewWorkspaceHelper", "encodeRequest: "+p0.toJson(), objArray);
       tb.z(f.l(this.c));
       String str = (td == null)? null: td.getAbsolutePath();
       tb.i(str);
       tb.O(te);
       tb.n(r5.b().c(p0));
       if (!TextUtils.x(tf) && new File(tf).exists()) {
          tb.i(tf);
       }
       return p0;
    }
}
