package laa.m0;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.io.File;
import com.google.protobuf.GeneratedMessageLite;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public abstract class m0 extends c	// class@002d92
{
    public File k;

    public void m0(File p0,GeneratedMessageLite p1,File p2){
       super(p0, p1, null);
       this.k = p2;
       this.c = this;
    }
    public File f0(){
       return this.k;
    }
    public m0 g0(File p0){
       this.k = p0;
       return this;
    }
    public File s(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m0.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       File uFile = (TextUtils.x(p0))? null: new File(this.k, p0);
       return uFile;
    }
}
